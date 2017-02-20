package application.domain;

import java.util.Date;

public class Request {
	private String nombre;
	private String apellidos;
	private String email;
	private String password;
	private Date fecha_nacimiento;
	private String direccion_postal;
	private String nacionalidad;
	private String numero_identificativo;

	public Request(User user) {
		this.nombre = user.getNombre();
		this.apellidos = user.getApellidos();
		this.email = user.getEmail();
		this.password = user.getContraseña();
		this.direccion_postal = user.getDireccion_postal();
		this.fecha_nacimiento = user.getFecha_nacimiento();
		this.nacionalidad = user.getNacionalidad();
		this.numero_identificativo = user.getNumero_identificativo();
	}

	public Request() {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

}
