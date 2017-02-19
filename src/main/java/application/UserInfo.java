package application;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name="UserInfo")
@Table(name="USUARIOS")
public class UserInfo {
	// private static final Logger log =
	// LoggerFactory.getLogger(UserInfo.class);
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // JPA

	private final String email;
	private final String password;

	@JsonCreator
	public UserInfo(@JsonProperty("email") String email, @JsonProperty("password") String password) {
		// log.info("Creating user " + name + ". age: " + password);
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
}
