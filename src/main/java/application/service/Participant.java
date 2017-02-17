package application.service;

import application.domain.Request;
import application.domain.User;
import application.exception.BusinessException;

public class Participant implements GetParticipantInfo, ChangeInfo {

	private GestorBD gbd;

	public Participant(GestorBD gestor) {
		this.gbd = gestor;
	}

	@Override
	public void updateInfo(String email, String password, String newPassword) {
		User user = this.gbd.findByEmailAndPassword(email, password);
		user.setContraseña(newPassword);
		this.gbd.save(user);
	}

	@Override
	public Request getParticipant(String email, String password) throws BusinessException {

		User user = this.gbd.findByEmailAndPassword(email, password);
		if (user == null)
			throw new BusinessException("No existe un usuario con dichas credenciales");
		else
			return new Request(user);
	}

}
