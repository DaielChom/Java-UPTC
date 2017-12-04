package GUI;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class panelMonitorUsuarios extends JPanel {
	
	
	private JTable jtUsuarios;
	private DefaultTableModel mdUsuarios;
	private JScrollPane jsUsuarios;
	
		
	public panelMonitorUsuarios() {
		super();
		
		setBorder(BorderFactory.createTitledBorder("Usuarios"));
		
		String [] columna = new String[] {"Nombre", "Correo"};
		mdUsuarios = new DefaultTableModel(columna, 10);
		jtUsuarios = new JTable(mdUsuarios);
		jsUsuarios= new JScrollPane(jtUsuarios);
		
		add(jsUsuarios);
	}

	public JTable getJtUsuarios() {
		return jtUsuarios;
	}
	public void setJtUsuarios(JTable jtUsuarios) {
		this.jtUsuarios = jtUsuarios;
	}
	public DefaultTableModel getMdUsuarios() {
		return mdUsuarios;
	}
	public void setMdUsuarios(DefaultTableModel mdUsuarios) {
		this.mdUsuarios = mdUsuarios;
	}
	public JScrollPane getJsUsuarios() {
		return jsUsuarios;
	}
	public void setJsUsuarios(JScrollPane jsUsuarios) {
		this.jsUsuarios = jsUsuarios;
	}
	
	

}
