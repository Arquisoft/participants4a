package application.service;

import org.springframework.data.repository.CrudRepository;

import application.domain.User;

public interface GestorBD extends CrudRepository<User, Long> {

	User findByEmailAndPassword(String email, String password);

}
