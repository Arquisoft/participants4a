package application.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import application.domain.User;

public class GestorDBJDBC {

	
	static ResultSet rs;
	static PreparedStatement ps;
	
	public static User findEmailAndPassword(String email, String password){
		Connection c=null;
		User user= new User();
		try {
			c=Jdbc.getConnection();
			String consulta= "Select from USUARIOS WHERE email=? and password = ?";
			ps=c.prepareStatement(consulta);
			ps.setString(0, email);
			ps.setString(1, password);
			rs= ps.executeQuery();
			
			while(rs.next()){
				user.setApellidos(rs.getString("apellidos"));
				user.setDireccion_postal(rs.getString("direccion_postal"));
				user.setEmail(email);
				user.setContraseña(password);
				user.setNacionalidad(rs.getString("nacionalidad"));
				user.setNombre(rs.getString("nombre"));
				user.setNumero_identificativo("numero_identificativo");
				user.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return user;
	}
	
	
}
