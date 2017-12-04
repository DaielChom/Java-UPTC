package GUI;

import javax.swing.JButton;
import javax.swing.JPanel;

public class panelMonitoredBoton extends JPanel{
	
	private JButton btnSalir;

	public panelMonitoredBoton() {
		super();
		btnSalir = new JButton("Salir");
		add(btnSalir);
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}
	
	

}
