package services;


public class ServicesFactory {
	
	public static ParticipantService getParticipantService(){
		return new ParticipantService();
	}

}
