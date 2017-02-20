package application.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import application.domain.User;

public class GestorDBJDBC {

	
	static ResultSet rs;
	static PreparedStatement ps;
	
	public static User findEmailAndPassword(String email, String password) throws SQLException{
		Connection c=null;
		User user= new User();
		try {
			c=Jdbc.getConnection();
			String consulta= "Select from USUARIOS WHERE email=? and password = ?";
			ps=c.prepareStatement(consulta);
			ps.setString(1, email);
			ps.setString(2, password);
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
		finally{
			rs.close();
			ps.close();
			c.close();
		}
		
		
		return user;
	}
	
	public static void UpdateInfo(String email,String password, String newpassword) throws SQLException{
		Connection c= null;
		try {
			c=Jdbc.getConnection();
			String consulta= "Update Usuarios set contrasena=? where email=? and contrasena=?";
			ps=c.prepareStatement(consulta);
			ps.setString(1, newpassword);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			ps.close();
			c.close();
		}
	}
	
	
	
}
