package GUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import logic.Grupo;

public class panelMonitorTitulo extends JPanel {

	private JLabel lbTitulo;
	private JComboBox<String> grupos;
	
	

	public panelMonitorTitulo() {
		super();
		
		this.grupos = new JComboBox<>();
		
		this.lbTitulo = new JLabel("Bienvenido Monitor: ");
		
		lbTitulo.setFont(new Font(lbTitulo.getFont().getFontName(), lbTitulo.getFont().getStyle(), 30));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
				
		add(lbTitulo);
		add(grupos);
	}

	public JLabel getLbTitulo() {
		return lbTitulo;
	}

	public void setLbTitulo(JLabel lbTitulo) {
		this.lbTitulo = lbTitulo;
	}

	public JComboBox<String> getGrupos() {
		return grupos;
	}

	public void setGrupos(JComboBox<String> grupos) {
		this.grupos = grupos;
	}

	

	
	
	

}
