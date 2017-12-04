package GUI;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class panelMonitor extends JPanel {
	
	private panelMonitorTitulo titulo;
	private panelMonitorActividades actividades;
	private panelMonitorBoton boton;
	private panelMonitorUsuarios usuarios;

	
	
	public panelMonitor() {
		
		super();
		titulo = new panelMonitorTitulo();
		actividades = new panelMonitorActividades();
		boton = new panelMonitorBoton();
		usuarios = new panelMonitorUsuarios();
		
	
		setLayout(new BorderLayout());
		setSize(800,400);
		this.add(titulo, BorderLayout.NORTH);
		this.add(actividades, BorderLayout.WEST);
		this.add(usuarios, BorderLayout.CENTER);
		this.add(boton,BorderLayout.EAST); 
		
	
	}

	public panelMonitorTitulo getTitulo() {
		return titulo;
	}

	public void setTitulo(panelMonitorTitulo titulo) {
		this.titulo = titulo;
	}

	public panelMonitorActividades getActividades() {
		return actividades;
	}

	public void setActividades(panelMonitorActividades actividades) {
		this.actividades = actividades;
	}

	public panelMonitorBoton getBoton() {
		return boton;
	}

	public void setBoton(panelMonitorBoton boton) {
		this.boton = boton;
	}

	public panelMonitorUsuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(panelMonitorUsuarios usuarios) {
		this.usuarios = usuarios;
	}
	
	
	
	

}
