package logic;

import java.util.ArrayList;

public class Grupo {
	
	private String nombre;
	private ArrayList<Monitored> monitoreds;
	
	public Grupo(String nombre) {
		super();
		this.nombre = nombre;
		this.monitoreds = new ArrayList<Monitored>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Monitored> getUsuarios() {
		return monitoreds;
	}

	public void setUsuarios(ArrayList<Monitored> monitoreds) {
		this.monitoreds = monitoreds;
	}
	
	public void agregarUsuario(Monitored monitored) {
		this.monitoreds.add(monitored);
	}

	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + ", monitoreds=" + monitoreds + "]";
	}
	
	

}
