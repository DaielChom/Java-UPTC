package GUI;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class panelMonitoredTitulo extends JPanel {
	
	private JLabel lbTitulo;
	
	public panelMonitoredTitulo() {
		super();
		
		lbTitulo = new JLabel("Bienvenido Paciente");
		
		add(lbTitulo);
	}

	public JLabel getLbTitulo() {
		return lbTitulo;
	}

	public void setLbTitulo(JLabel lbTitulo) {
		this.lbTitulo = lbTitulo;
	}

	
	
}
