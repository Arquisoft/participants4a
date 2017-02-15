package persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hello.UserInfo;

public class ParticipantGatewayImpl implements ParticipantGateway{

	@Override
	public UserInfo findByNameAndPassword(String nombre, String password) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("participants");
		EntityManager em = emf.createEntityManager();
		UserInfo ui;
		try{
			ui = em.createNamedQuery("UserInfo.findByNameAndPassword",UserInfo.class).setParameter(1, nombre).setParameter(2, password).getSingleResult();
		}catch (Exception e) {
			throw new RuntimeException();
		}
		return ui;
	}

}
