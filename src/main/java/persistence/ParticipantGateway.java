package persistence;

import hello.UserInfo;

public interface ParticipantGateway {
	
	UserInfo findByNameAndPassword(String nombre, String password);

}
