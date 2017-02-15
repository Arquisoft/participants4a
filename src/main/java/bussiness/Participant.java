package bussiness;

import exceptions.BussinesException;
import hello.UserInfo;
import services.ServicesFactory;

public class Participant {
	
	public UserInfo getParticipant(String nombre, String password) throws BussinesException{
		
		UserInfo ui;
//		if(!validatePassword(nombre,password)){
//			throw new BussinessException();
//		}
		try{
			ui = ServicesFactory.getParticipantService().findByNameAndPassword(nombre, password);
		}catch(RuntimeException e){
			throw new BussinesException();
		}
		return ui;
	}
		
	}

