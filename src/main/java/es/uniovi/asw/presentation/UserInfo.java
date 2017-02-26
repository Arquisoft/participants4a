package es.uniovi.asw.presentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInfo {

	// Log
	// private static final Logger LOG =
	// LoggerFactory.getLogger(UserInfo.class);

	private final String email;
	private final String contrasena;

	public UserInfo(@JsonProperty("email") String email, @JsonProperty("contrasena") String contrsena) {
		this.email = email;
		this.contrasena = contrsena;
	}

	public String getEmail() {
		return email;
	}

	public String getContrasena() {
		return contrasena;
	}

}