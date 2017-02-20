package application.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import application.domain.User;
import application.exception.BusinessException;

public class Participant implements GetParticipantInfo {

	/*
	 * @Override public void updateInfo(String email, String password, String
	 * newPassword) { User user = this.gbd.findByEmailAndPassword(email,
	 * password); user.setContraseña(newPassword); this.gbd.save(user); }
	 */

	@Override
	public User getParticipant(String email, String password) throws BusinessException {

		List<User> participants = new ArrayList<User>();
		EntityManager manager = ManagerHibernateJPA.getManager();
		participants = manager.createNamedQuery("User.getParticipant", User.class).setParameter(1, email)
				.setParameter(2, password).getResultList();
		User user =  participants.get(0);

		if (user == null)
			throw new BusinessException("No existe un usuario con dichas credenciales");
		else
			return user;
	}

}
