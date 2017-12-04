package GUI;

import java.awt.BorderLayout;
import java.awt.TextArea;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class panelMonitoredCrearNota extends JPanel {
	
	private JLabel lbTitulo, lbEmocion, lbMensaje;
	private JTextField txTitulo;
	private JComboBox<String> cbEmocion;
	private JTextArea txArea;
	private JButton btnCrearNota;
	
		
	public panelMonitoredCrearNota() {
		super();
		
		setBorder(BorderFactory.createTitledBorder("Crear Nota"));
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		lbTitulo = new JLabel("Titulo para la Nota");
		lbEmocion = new JLabel("¿Como te siente?");
		lbMensaje = new JLabel("Mensaje");
		
		txTitulo = new JTextField(10);
		
		cbEmocion = new JComboBox<String>();
		cbEmocion.addItem("Feliz");
		cbEmocion.addItem("Triste");
		cbEmocion.addItem("Enojado");
		
		txArea = new JTextArea(20,50);
		JScrollPane scrollPane = new JScrollPane(txArea); 
		
		
		btnCrearNota = new JButton("CREAR");
		
		add(lbTitulo);
		add(txTitulo);
		add(lbEmocion);
		add(cbEmocion);
		add(lbMensaje);		
		add(scrollPane);
		add(btnCrearNota);
		}
	
	public JLabel getLbTitulo() {
		return lbTitulo;
	}
	public void setLbTitulo(JLabel lbTitulo) {
		this.lbTitulo = lbTitulo;
	}
	public JLabel getLbEmocion() {
		return lbEmocion;
	}
	public void setLbEmocion(JLabel lbEmocion) {
		this.lbEmocion = lbEmocion;
	}
	public JLabel getLbMensaje() {
		return lbMensaje;
	}
	public void setLbMensaje(JLabel lbMensaje) {
		this.lbMensaje = lbMensaje;
	}
	public JTextField getTxTitulo() {
		return txTitulo;
	}
	public void setTxTitulo(JTextField txTitulo) {
		this.txTitulo = txTitulo;
	}
	public JComboBox<String> getCbEmocion() {
		return cbEmocion;
	}
	public void setCbEmocion(JComboBox<String> cbEmocion) {
		this.cbEmocion = cbEmocion;
	}
	public JTextArea getTxArea() {
		return txArea;
	}
	public void setTxArea(JTextArea txArea) {
		this.txArea = txArea;
	}
	public JButton getBtnCrearNota() {
		return btnCrearNota;
	}
	public void setBtnCrearNota(JButton btnCrearNota) {
		this.btnCrearNota = btnCrearNota;
	}
	
	
	

}
