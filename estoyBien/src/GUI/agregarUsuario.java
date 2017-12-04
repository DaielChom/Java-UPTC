package GUI;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class agregarUsuario extends JDialog{
	
	private JComboBox<String> usuarios, grupos;
	private JLabel lbUsuario, lbGrupo;
	private JButton btnAceptar;
	private JPanel pnl;
	
	public agregarUsuario() {
		super();
		
		usuarios = new JComboBox<String>();
		grupos = new JComboBox<>();
		lbUsuario = new JLabel("Agregar: ");
		lbGrupo = new JLabel("A: ");
		pnl = new JPanel();
		
		btnAceptar = new JButton("Agregar");
		
		setSize(300, 150);
		pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
		
		pnl.add(lbUsuario);
		pnl.add(usuarios);
		pnl.add(lbGrupo);
		pnl.add(grupos);
		pnl.add(btnAceptar);
		add(pnl);
	}
	
	public JComboBox<String> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(JComboBox<String> usuarios) {
		this.usuarios = usuarios;
	}
	public JComboBox<String> getGrupos() {
		return grupos;
	}
	public void setGrupos(JComboBox<String> grupos) {
		this.grupos = grupos;
	}
	public JLabel getLbUsuario() {
		return lbUsuario;
	}
	public void setLbUsuario(JLabel lbUsuario) {
		this.lbUsuario = lbUsuario;
	}
	public JLabel getLbGrupo() {
		return lbGrupo;
	}
	public void setLbGrupo(JLabel lbGrupo) {
		this.lbGrupo = lbGrupo;
	}
	public JButton getBtnAceptar() {
		return btnAceptar;
	}
	public void setBtnAceptar(JButton btnAceptar) {
		this.btnAceptar = btnAceptar;
	}
	
	

}
