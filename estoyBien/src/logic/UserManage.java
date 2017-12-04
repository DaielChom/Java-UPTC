package logic;

import java.util.ArrayList;

public class UserManage {
	
	ArrayList<User> usuarios;

	public UserManage() {
		super();
		this.usuarios = new ArrayList<User>();
	}

	public ArrayList<User> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<User> usuarios) {
		this.usuarios = usuarios;
	}
	
	public void agregarUsuario(User user) {	
		
		
		this.usuarios.add(user);
	}
	
	public User buscarUsuario(String correo) {
		for (User user : usuarios) {
			if(user.getEmail().equals(correo)) {
				return user;
			}
		}
		return null;
	}
	
	public Monitor buscarMonitor(String correo) {
		for (User user : usuarios) {
			if(user.getEmail().equals(correo)) {
				return (Monitor) user;
			}
		}
		return null;
	}
	
	public Monitored buscarMonitored(String correo) {
		for (User user : usuarios) {
			if(user.getEmail().equals(correo)) {
				return (Monitored) user;
			}
		}
		return null;
	}
	
	public Monitored buscarMonitoredPorNombre(String nombre) {
		for (User user : usuarios) {
			if(user.getName().equals(nombre)) {
				return (Monitored) user;
			}
		}
		return null;
	}
	

}
