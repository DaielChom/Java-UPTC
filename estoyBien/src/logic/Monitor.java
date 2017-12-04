package logic;

import java.util.ArrayList;

public class Monitor extends User {
	
	private ArrayList<Grupo> grupos;

	public Monitor(String nombre, String correo, String contrasena) {
		super(nombre, correo, contrasena, Role.MONITOR);
		this.grupos = new ArrayList<Grupo>();
	}

	
	
	public Monitor() {
		super();
	}



	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(ArrayList<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	public void agregarGrupo(Grupo grupo) {
		this.grupos.add(grupo);
	}

	public Grupo buscarGrupo(String nombre) {
		for (Grupo grupo : grupos) {
			if(grupo.getNombre().equals(nombre)) {
				return grupo;
			}
		}
		return null;
	}


	@Override
	public String toString() {
		return "Monitor [grupos=" + grupos + ", getId()=" + getId() + ", getName()=" + getName() + ", getEmail()="
				+ getEmail() + ", getPassword()=" + getPassword() + ", getRole()=" + getRole() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
