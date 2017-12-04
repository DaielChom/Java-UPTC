package GUI;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.management.monitor.Monitor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import logic.Grupo;
import logic.Monitored;
import logic.Note;
import logic.Role;
import logic.User;
import logic.UserManage;

public class ventanaPrincipal extends JFrame {
	
	private UserManage manger;
	private GestionEventos eventos;
	private Login login; 
	private logic.Monitor sesionMonitor;
	private Monitored sesionMonitored;	
	private panelMonitor monitor;
	private panelMonitored monitored;
	private agregarUsuario addUser;
	
	
	public ventanaPrincipal() throws HeadlessException {
		super();
		eventos = new GestionEventos(this);
		manger = new UserManage();
		login = new Login(this);
		monitor = new panelMonitor();
		addUser = new agregarUsuario();
		
		setTitle("Estoy Bien");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1200,500);
		
		//sesionMonitor = new logic.Monitor();
		
		monitored = new panelMonitored();
		
		// DATOS AGREGADOS
		agregarDatos();
		
		
	}

	public static void main(String[] args) {
		
		ventanaPrincipal vent = new ventanaPrincipal();
		vent.getLogin().setVisible(true);
		
				
	}
	
	// Funcion para iniciar Sesion
	public void iniciarSesion() {
		// TODO Auto-generated method stub
		
		if(login.getTxCorreo().getText().isEmpty() || login.getTxPass().getText().isEmpty()) {
			JOptionPane.showMessageDialog(this,"Por favor llenar los campos");
		}
		else {
			
			String correo = login.getTxCorreo().getText();
			String pass = login.getTxPass().getText();
			
			User usuario = manger.buscarUsuario(correo);
			
			if(usuario!=null) {
				
				if(pass.equals(usuario.getPassword())) {
					
					login.getTxCorreo().setText("");
					login.getTxPass().setText("");
					login.setVisible(false);
					
					
					if(usuario.getRole().equals(Role.MONITORED)) {
						
						setSesionMonitored(manger.buscarMonitored(correo));
						
						monitored.getTitulo().getLbTitulo().setText("Bienvenido " + sesionMonitored.getName() );
						
						for(int i = 0; i<sesionMonitored.getNotes().size(); i++) {
							monitored.getListaNotas().getMdNotas().addRow(new Object[] {sesionMonitored.getNotes().get(i).getTitle(),sesionMonitored.getNotes().get(i).getEmotion(),sesionMonitored.getNotes().get(i).getMessage()});
						}
						
						monitored.getCreaNotas().getBtnCrearNota().setActionCommand(GestionEventos.CREARNOTA);
						monitored.getCreaNotas().getBtnCrearNota().addActionListener(getEventos());
						
						monitored.getBotones().getBtnSalir().setActionCommand(GestionEventos.BTNSALIRMON);
						monitored.getBotones().getBtnSalir().addActionListener(getEventos());
						
						this.add(monitored); 
						}
					
					
					
					if(usuario.getRole().equals(Role.MONITOR)) { 
						
						
						setSesionMonitor(manger.buscarMonitor(correo));
						
						monitor.getTitulo().getLbTitulo().setText("Bienvenido Usuario " + usuario.getName());
						monitor.getTitulo().getGrupos().addItemListener(new ItemListener() {
					        public void itemStateChanged(ItemEvent arg0) {
					        	comboMonitor();
					        }
					    });
						
						for(int i = 0; i<sesionMonitor.getGrupos().size(); i++ ) {
							monitor.getTitulo().getGrupos().insertItemAt(sesionMonitor.getGrupos().get(i).getNombre(),i);
						}
						
						
						monitor.getBoton().getBtnCrearGrupo().setActionCommand(GestionEventos.CREARGRUPO);
						monitor.getBoton().getBtnCrearGrupo().addActionListener(getEventos());
						
						monitor.getBoton().getBtnAddUsuario().setActionCommand(GestionEventos.ADDUSUARIO);
						monitor.getBoton().getBtnAddUsuario().addActionListener(getEventos());
						
						addUser.getBtnAceptar().setActionCommand(GestionEventos.BTNADDUSER);
						addUser.getBtnAceptar().addActionListener(getEventos());
						
						monitor.getBoton().getBtnSalir().setActionCommand(GestionEventos.BTNSALIR);
						monitor.getBoton().getBtnSalir().addActionListener(getEventos());
											
						this.add(monitor); 
						}
					
					this.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(this,"Cotraseña Incorrecta");
				}
			}
			else {
				JOptionPane.showMessageDialog(this, "El usuario no Existe");
			}
			
		}
		
		
		
	}

	// Funcion para Crear un nuevo usuario
	public void registrarUsuario() {
		
		if(login.getTxCorreo().getText().isEmpty() || login.getTxPass().getText().isEmpty() || (login.getRbtMonitor().isSelected()==false && login.getRbtPaciente().isSelected()==false )) {
			JOptionPane.showMessageDialog(this,"Por favor llenar los campos");
		}
		else {
			String correo = login.getTxCorreo().getText();
			String pass = login.getTxPass().getText();
			String nombre = JOptionPane.showInputDialog("Ingresar nombre del Usuario");
			
			if(login.getRbtMonitor().isSelected()) {
				logic.Monitor mon = new logic.Monitor(nombre, correo, pass);
				manger.agregarUsuario(mon);
				JOptionPane.showMessageDialog(this,"Usuario Registrado");
			}
			
			if(login.getRbtPaciente().isSelected()) {
				
				Monitored mon = new Monitored(nombre, correo, pass);
				manger.agregarUsuario(mon);
				JOptionPane.showMessageDialog(this,"Usuario Registrado");
			}
				
		}
		
	}
	
	// Funcion para Agregar Datos
	public void agregarDatos() {
		
		logic.Monitor primerMonitor = new logic.Monitor("daniel", "ge@gma.co", "1234");
		
		Monitored MonitoredUno = new Monitored("juan", "uno@gma.co", "1234");
		Monitored MonitoredDos = new Monitored("pedro", "dos@gma.co", "1234");
		Monitored MonitoredTres = new Monitored("ana", "tres@gma.co", "1234");
		Monitored MonitoredCuatro = new Monitored("maria", "cuatro@gma.co", "1234");
		
		Note notaUno = new Note("Nota 1", "Hoy Llovio", "FELIZ");
		Note notaDos = new Note("Nota 2", "Hoy hizo sol", "TRISTE");
		Note notaTres = new Note("Nota 3", "Hoy me encontre una moneda", "ALEGRE");
		Note notaCuatro = new Note("Nota 4", "Era pescado al almuerzo", "FELIZ");
		
		MonitoredUno.addNote(notaUno);
		MonitoredDos.addNote(notaDos);
		MonitoredTres.addNote(notaTres);
		MonitoredCuatro.addNote(notaCuatro);
		
		Grupo grupoUno = new Grupo("UIS");
		Grupo grupoDos = new Grupo("UNAB");
		
		grupoUno.agregarUsuario(MonitoredUno);
		grupoUno.agregarUsuario(MonitoredDos);		
		grupoDos.agregarUsuario(MonitoredTres);
		grupoDos.agregarUsuario(MonitoredCuatro);
		
		primerMonitor.agregarGrupo(grupoUno);
		primerMonitor.agregarGrupo(grupoDos);
		
		manger.agregarUsuario(primerMonitor);
		manger.agregarUsuario(MonitoredUno);
		manger.agregarUsuario(MonitoredDos);
		manger.agregarUsuario(MonitoredTres);
		manger.agregarUsuario(MonitoredCuatro);
			
		
	}
	
	public void comboMonitor() {
		
		llenarTablaUsuarios();
		llenarTablaActividades();
		
	} 
	
	public void llenarTablaUsuarios() {
		
		
		while(monitor.getUsuarios().getMdUsuarios().getRowCount()!=0) {
			monitor.getUsuarios().getMdUsuarios().removeRow(0);
		}
		
		
		String grupito = (String) monitor.getTitulo().getGrupos().getSelectedItem();
		
		ArrayList<Monitored> monitoreds = sesionMonitor.buscarGrupo(grupito).getUsuarios();
		int i =  0;
		for (Monitored monitored : monitoreds) {
			
			monitor.getUsuarios().getMdUsuarios().insertRow(i, new Object[] { monitored.getName(), monitored.getEmail()});
			i++;
		}
		
	}
	
	public void llenarTablaActividades() {
		
		while(monitor.getActividades().getModelActividades().getRowCount()!=0) {
			monitor.getActividades().getModelActividades().removeRow(0);
		}
		
		ArrayList<Note> notas = new ArrayList<>();
		String grupito = (String) monitor.getTitulo().getGrupos().getSelectedItem();
		for(int i = 0; i<sesionMonitor.getGrupos().size(); i++) {
			if(sesionMonitor.getGrupos().get(i).getNombre().equals(grupito)) {
				for(int j = 0; j<sesionMonitor.getGrupos().get(i).getUsuarios().size(); j++) {
					
					for(int k = 0; k<sesionMonitor.getGrupos().get(i).getUsuarios().get(j).getNotes().size(); k++) {
						
						String titulo = sesionMonitor.getGrupos().get(i).getUsuarios().get(j).getNotes().get(k).getTitle();
						String emocion = sesionMonitor.getGrupos().get(i).getUsuarios().get(j).getNotes().get(k).getEmotion();
						String mensaje = sesionMonitor.getGrupos().get(i).getUsuarios().get(j).getNotes().get(k).getMessage();
						
						monitor.getActividades().getModelActividades().insertRow(k, new Object[] { titulo, mensaje, emocion});
						
					}
					
				}
			}
			
			
		}
				
		
	}
	
	public void crearGrupo() {
		
		String nombreGrupo = JOptionPane.showInputDialog("Nombre del Grupo");
		Grupo grp = new Grupo(nombreGrupo);
		sesionMonitor.agregarGrupo(grp);
		
		
		while(monitor.getTitulo().getGrupos().getItemCount()!=0) {
			monitor.getTitulo().getGrupos().removeItemAt(0);
		}
		
		for(int i = 0; i<sesionMonitor.getGrupos().size(); i++ ) {
			monitor.getTitulo().getGrupos().insertItemAt(sesionMonitor.getGrupos().get(i).getNombre(),i);
		}
		
		
		
	}
	
	public void addUsuario() {
		
		int k =0;
		for(int i=0; i<manger.getUsuarios().size(); i++) {
			if(manger.getUsuarios().get(i).getRole()==Role.MONITORED) {
				addUser.getUsuarios().insertItemAt(manger.getUsuarios().get(i).getName(),k);
				k++;
			}
		}
		
		for(int i = 0; i<sesionMonitor.getGrupos().size(); i++) {
			addUser.getGrupos().insertItemAt(sesionMonitor.getGrupos().get(i).getNombre(), i);
		}
		
		
		addUser.setVisible(true);
		
		
	}

	public void btnAddUsuario() {
		
		//addUser.getUsuarios().getSelectedItem();
		String usuario = addUser.getUsuarios().getSelectedItem().toString();
		String grupo = addUser.getGrupos().getSelectedItem().toString();
		
		for(int i = 0; i<sesionMonitor.getGrupos().size(); i++) {
			if( sesionMonitor.getGrupos().get(i).getNombre().equals(grupo)) {
				Monitored moni = manger.buscarMonitoredPorNombre(usuario);
				sesionMonitor.getGrupos().get(i).agregarUsuario(moni);
			}
		}
		
		addUser.setVisible(false);
		
	}
		
	public void btnSalir() {
		
		setVisible(false);
		remove(monitor);
		login.setVisible(true);
		
		
	}
	
	public void crearNota() {
		
		System.out.println("Entro");
		String titulo = monitored.getCreaNotas().getTxTitulo().getText();
		String emocion = monitored.getCreaNotas().getCbEmocion().getSelectedItem().toString();
		String mensaje = monitored.getCreaNotas().getTxArea().getText();
		
		Note note = new Note(titulo, mensaje, emocion);
		
		sesionMonitored.addNote(note);
		
		monitored.getCreaNotas().getTxTitulo().setText("");
		monitored.getCreaNotas().getTxArea().setText("");
		
		for(int i = 0; i<monitored.getListaNotas().getMdNotas().getRowCount();i++) {
			monitored.getListaNotas().getMdNotas().removeRow(i);
		}
		
		
		for(int i = 0; i<sesionMonitored.getNotes().size(); i++) {
			monitored.getListaNotas().getMdNotas().addRow(new Object[] {sesionMonitored.getNotes().get(i).getTitle(),sesionMonitored.getNotes().get(i).getEmotion(),sesionMonitored.getNotes().get(i).getMessage()});
		}
		
		
	}
	
	public void salirMon() {
		setVisible(false);
		remove(monitored);
		login.setVisible(true);
	}
	// GETTERS AND SETTERS
	
	public UserManage getManger() {
		return manger;
	}

	public void setManger(UserManage manger) {
		this.manger = manger;
	}

	public GestionEventos getEventos() {
		return eventos;
	}

	public void setEventos(GestionEventos eventos) {
		this.eventos = eventos;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	


	public panelMonitor getMonitor() {
		return monitor;
	}

	public void setMonitor(panelMonitor monitor) {
		this.monitor = monitor;
	}

	public panelMonitored getMonitored() {
		return monitored;
	}

	public void setMonitored(panelMonitored monitored) {
		this.monitored = monitored;
	}

	public logic.Monitor getSesionMonitor() {
		return sesionMonitor;
	}

	public void setSesionMonitor(logic.Monitor sesionMonitor) {
		this.sesionMonitor = sesionMonitor;
	}

	public Monitored getSesionMonitored() {
		return sesionMonitored;
	}

	public void setSesionMonitored(Monitored sesionMonitored) {
		this.sesionMonitored = sesionMonitored;
	}

	public agregarUsuario getAddUser() {
		return addUser;
	}

	public void setAddUser(agregarUsuario addUser) {
		this.addUser = addUser;
	}
	
	
	

}
