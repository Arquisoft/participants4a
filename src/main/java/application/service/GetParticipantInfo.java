package application.service;

import application.domain.User;
import application.exception.BusinessException;

public interface GetParticipantInfo {

	User getParticipant(String email, String password) throws BusinessException;
}
