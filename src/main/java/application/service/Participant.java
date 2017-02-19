package application.service;

import application.domain.Request;
import application.domain.User;
import application.exception.BusinessException;

public class Participant implements GetParticipantInfo, GestorBD {

	//private GestorBD gbd;

//	public Participant() {
//		this.gbd = gestor;
//	}
//
//	public Participant() {
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public void updateInfo(String email, String password, String newPassword) {
//		User user = this.gbd.findByEmailAndPassword(email, password);
//		user.setContraseña(newPassword);
//		this.gbd.save(user);
//	}

	@Override
	public User getParticipant(String email, String password) throws BusinessException {

		User participant = ManagerHibernateJPA.getManager().createNamedQuery("User.getParticipant",User.class).setParameter(1, email).
				setParameter(2, password).getSingleResult();
		return participant;
//		User user = this.gbd.findByEmailAndPassword(email, password);
//		if (user == null)
//			throw new BusinessException("No existe un usuario con dichas credenciales");
//		else
//			return user;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends User> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<User> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByEmailAndPassword(String email, String password) {
		
		User participant = ManagerHibernateJPA.getManager().createNamedQuery("User.findByEmailAndPassword",User.class).setParameter(1, email).
				setParameter(2, password).getSingleResult();
		return participant;
	}

}
