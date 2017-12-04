package GUI;

import javax.swing.JButton;
import javax.swing.JPanel;

public class panelMonitorBoton extends JPanel {
	
	private JButton btnCrearGrupo;
	private JButton btnSalir;
	private JButton btnAddUsuario;
		
	public panelMonitorBoton() {
		super();
		
		btnCrearGrupo = new JButton("Crear Grupo");
		btnSalir = new JButton("Salir");
		btnAddUsuario = new JButton("Añadir Usuarios");
		
		add(btnCrearGrupo);
		add(btnAddUsuario);
		add(btnSalir);
		
	}
	public JButton getBtnCrearGrupo() {
		return btnCrearGrupo;
	}
	public void setBtnCrearGrupo(JButton btnCrearGrupo) {
		this.btnCrearGrupo = btnCrearGrupo;
	}
	public JButton getBtnSalir() {
		return btnSalir;
	}
	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}
	public JButton getBtnAddUsuario() {
		return btnAddUsuario;
	}
	public void setBtnAddUsuario(JButton btnAddUsuario) {
		this.btnAddUsuario = btnAddUsuario;
	}
	
	
	
	

}
