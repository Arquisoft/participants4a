package hello;

public class Request {
	
	String nombre;
	String password;
	
	public Request(String nombre, String password) {
		super();
		this.nombre = nombre;
		this.password = password;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setEmail(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	


}
