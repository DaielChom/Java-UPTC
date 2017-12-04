package GUI;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class panelMonitoredListarNotas extends JPanel {
	
	private JTable JtablaNotas;
    private DefaultTableModel mdNotas;
    private JScrollPane jsNotas;
    
	public panelMonitoredListarNotas() {
		super();
		
		setBorder(BorderFactory.createTitledBorder("Notas"));
		
		String [] columna = new String [] {"Titulo","Me siento","Mensaje"};
		mdNotas = new DefaultTableModel(columna,0);
		 JtablaNotas = new JTable(mdNotas);
		 JtablaNotas.setEnabled(false);
		 jsNotas = new JScrollPane(JtablaNotas);
		 
		 add(jsNotas);
	}

	public JTable getJtablaNotas() {
		return JtablaNotas;
	}

	public void setJtablaNotas(JTable jtablaNotas) {
		JtablaNotas = jtablaNotas;
	}

	public DefaultTableModel getMdNotas() {
		return mdNotas;
	}

	public void setMdNotas(DefaultTableModel mdNotas) {
		this.mdNotas = mdNotas;
	}

	public JScrollPane getJsNotas() {
		return jsNotas;
	}

	public void setJsNotas(JScrollPane jsNotas) {
		this.jsNotas = jsNotas;
	} 
    
	
    

}
