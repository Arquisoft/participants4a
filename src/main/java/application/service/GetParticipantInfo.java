package application.service;

import application.domain.Request;
import application.exception.BusinessException;

public interface GetParticipantInfo {

	Request getParticipant(String email, String password) throws BusinessException;
}
