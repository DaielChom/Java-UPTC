package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionEventos implements ActionListener{
	
	public static final String INICIAR = "iniciar";
	public static final String REGISTRAR = "registrar";
	public static final String COMBOMONITOR = "comboMonitor";
	public static final String CREARGRUPO = "crearGrupo";
	public static final String ADDUSUARIO = "addusuario";
	public static final String BTNADDUSER = "btnaddusuario";
	public static final String BTNSALIR = "btnsalir";
	public static final String CREARNOTA = "crearnota";
	public static final String BTNSALIRMON = "btnsalirmon";
	
	private ventanaPrincipal ventanaPrincipal;
	
	public GestionEventos(ventanaPrincipal ventanaPrincipal) {
		   
		   this.ventanaPrincipal=ventanaPrincipal;
	   
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getActionCommand().equals(INICIAR)) {
			ventanaPrincipal.iniciarSesion();
		}
		
		if (e.getActionCommand().equals(REGISTRAR)) {
			ventanaPrincipal.registrarUsuario();
		}
		
		if (e.getActionCommand().equals(COMBOMONITOR)) {
			ventanaPrincipal.comboMonitor();
		}
		
		if (e.getActionCommand().equals(CREARGRUPO)) {
			ventanaPrincipal.crearGrupo();
		}
		
		if (e.getActionCommand().equals(ADDUSUARIO)) {
			ventanaPrincipal.addUsuario();
		}
		
		if (e.getActionCommand().equals(BTNADDUSER)) {
			ventanaPrincipal.btnAddUsuario();
		}
		
		if (e.getActionCommand().equals(BTNSALIR)) {
			ventanaPrincipal.btnSalir();
		}
		
		if (e.getActionCommand().equals(CREARNOTA)) {
			ventanaPrincipal.crearNota();
		}
		
		if (e.getActionCommand().equals(BTNSALIRMON)) {
			ventanaPrincipal.salirMon();
		}
	}

}
