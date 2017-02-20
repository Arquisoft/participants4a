package application.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name = "USUARIOS")
public class User {

	// Log
	private static final Logger LOG = LoggerFactory.getLogger(User.class);

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellidos;

	// @Column(name = "e-mail")
	private String email;

	@Temporal(TemporalType.DATE)
	private Date fecha_nacimiento;
	private String direccion_postal;
	private String nacionalidad;
	private String numero_identificativo;

	@Column(name = "contrasena")
	private String password;

	public User() {
	}

	public User(String email, String password) {
		LOG.info("Creating user " + email + ". password: " + password);
		this.email = email;
		this.password = password;
	}

	public User(Long id, String nombre, String apellidos, String email, Date fecha_nacimiento, String direccion_postal,
			String nacionalidad, String numero_identificativo, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.fecha_nacimiento = fecha_nacimiento;
		this.direccion_postal = direccion_postal;
		this.nacionalidad = nacionalidad;
		this.numero_identificativo = numero_identificativo;
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getDireccion_postal() {
		return direccion_postal;
	}

	public void setDireccion_postal(String direccion_postal) {
		this.direccion_postal = direccion_postal;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNumero_identificativo() {
		return numero_identificativo;
	}

	public void setNumero_identificativo(String numero_identificativo) {
		this.numero_identificativo = numero_identificativo;
	}

	public String getContraseña() {
		return password;
	}

	public void setContraseña(String contraseña) {
		this.password = contraseña;
	}

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", fecha_nacimiento="
				+ fecha_nacimiento + ", direccion_postal=" + direccion_postal + ", nacionalidad=" + nacionalidad
				+ ", numero_identificativo=" + numero_identificativo + "]";
	}

}