package GUI;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Login extends JDialog {
	
	// Se crean los elemntos que tendra la ventana.
	private JLabel lbTitulo, lbCorreo, lbPass, lbImage;
	private JTextField txCorreo, txPass;
	private JButton btRegustrar, btIniciar;
	private ventanaPrincipal ventanaPrincipal;
	private JPanel pnImage, pnCampos, pnBtn;
	private JRadioButton rbtPaciente, rbtMonitor;
	private ButtonGroup bgUser;
	// Constructor
	public Login(ventanaPrincipal ventanaPrincipal) {
		
		super();
		this.ventanaPrincipal = ventanaPrincipal;
		
		// Configuraciones de la ventana.
		setTitle("Estoy Bien - Iniciar");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(250,280);
		setLayout(new BorderLayout());
		//setResizable(false);
		
		// Inicializa Elemntos de la ventana
		pnImage = new JPanel();
		lbTitulo = new JLabel("Bienvenido");
		lbImage = new JLabel();
		lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("logo.png")));
		pnImage.setLayout(new BoxLayout(pnImage, BoxLayout.Y_AXIS));
		lbTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
		pnImage.add(lbTitulo);
		lbImage.setAlignmentX(Component.CENTER_ALIGNMENT);
		pnImage.add(lbImage);
		
		pnCampos = new JPanel();
		lbCorreo = new JLabel("Correo");
		lbPass = new JLabel("Contraseña");
		txCorreo = new JTextField(10);
		txPass = new JTextField(10);
		pnCampos.add(lbCorreo);
		pnCampos.add(txCorreo);
		pnCampos.add(lbPass);
		pnCampos.add(txPass);
		
		pnBtn = new JPanel();
		pnBtn.setLayout(new FlowLayout());
		
		btIniciar = new JButton("Iniciar");
		btIniciar.setActionCommand(GestionEventos.INICIAR);
		btIniciar.addActionListener(ventanaPrincipal.getEventos());
		
		btRegustrar = new JButton("Registrar");
		btRegustrar.setActionCommand(GestionEventos.REGISTRAR);
		btRegustrar.addActionListener(ventanaPrincipal.getEventos());
		
		pnBtn.add(btRegustrar);
		pnBtn.add(btIniciar);
		
		rbtMonitor = new JRadioButton("Monitor");
		rbtPaciente = new JRadioButton("Paciente");
		
		bgUser = new ButtonGroup();
		pnCampos.add(rbtMonitor);
		pnCampos.add(rbtPaciente);
		
		bgUser.add(rbtMonitor);
		bgUser.add(rbtPaciente);
		
		
		
		agregarElementos();
	}
	
	private void agregarElementos() {
		// TODO Auto-generated method stub
		add(pnImage, BorderLayout.NORTH);
		add(pnCampos,BorderLayout.CENTER);
		add(pnBtn, BorderLayout.SOUTH);
	}
	
	// GETTERS AND SETTERS

	public JLabel getLbTitulo() {
		return lbTitulo;
	}

	public void setLbTitulo(JLabel lbTitulo) {
		this.lbTitulo = lbTitulo;
	}

	public JLabel getLbCorreo() {
		return lbCorreo;
	}

	public void setLbCorreo(JLabel lbCorreo) {
		this.lbCorreo = lbCorreo;
	}

	public JLabel getLbPass() {
		return lbPass;
	}

	public void setLbPass(JLabel lbPass) {
		this.lbPass = lbPass;
	}

	public JLabel getLbImage() {
		return lbImage;
	}

	public void setLbImage(JLabel lbImage) {
		this.lbImage = lbImage;
	}

	public JTextField getTxCorreo() {
		return txCorreo;
	}

	public void setTxCorreo(JTextField txCorreo) {
		this.txCorreo = txCorreo;
	}

	public JTextField getTxPass() {
		return txPass;
	}

	public void setTxPass(JTextField txPass) {
		this.txPass = txPass;
	}

	public JButton getBtRegustrar() {
		return btRegustrar;
	}

	public void setBtRegustrar(JButton btRegustrar) {
		this.btRegustrar = btRegustrar;
	}

	public JButton getBtIniciar() {
		return btIniciar;
	}

	public void setBtIniciar(JButton btIniciar) {
		this.btIniciar = btIniciar;
	}

	public ventanaPrincipal getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(ventanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

	public JPanel getPnImage() {
		return pnImage;
	}

	public void setPnImage(JPanel pnImage) {
		this.pnImage = pnImage;
	}

	public JPanel getPnCampos() {
		return pnCampos;
	}

	public void setPnCampos(JPanel pnCampos) {
		this.pnCampos = pnCampos;
	}

	public JPanel getPnBtn() {
		return pnBtn;
	}

	public void setPnBtn(JPanel pnBtn) {
		this.pnBtn = pnBtn;
	}

	public JRadioButton getRbtPaciente() {
		return rbtPaciente;
	}

	public void setRbtPaciente(JRadioButton rbtPaciente) {
		this.rbtPaciente = rbtPaciente;
	}

	public JRadioButton getRbtMonitor() {
		return rbtMonitor;
	}

	public void setRbtMonitor(JRadioButton rbtMonitor) {
		this.rbtMonitor = rbtMonitor;
	}

	public ButtonGroup getBgUser() {
		return bgUser;
	}

	public void setBgUser(ButtonGroup bgUser) {
		this.bgUser = bgUser;
	}
	
	
	
	
	
	
	
	

}
