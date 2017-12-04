package GUI;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class panelMonitorActividades extends JPanel {
	
	
	private JTable jtactividades;
	private DefaultTableModel modelActividades;
	private JScrollPane jScrollActividades;
	
	
	

	public panelMonitorActividades() {
		super();
				
		setBorder(BorderFactory.createTitledBorder("Actividades"));
		
		String[] columna = new String[] {"Titulo","Sentimiento", "Mensaje"};
		
		modelActividades = new DefaultTableModel(columna, 20);
		jtactividades = new JTable(modelActividades);
		jScrollActividades = new JScrollPane(jtactividades);
		
		
		add(jScrollActividades);
	}




	public JTable getJtactividades() {
		return jtactividades;
	}




	public void setJtactividades(JTable jtactividades) {
		this.jtactividades = jtactividades;
	}




	public DefaultTableModel getModelActividades() {
		return modelActividades;
	}




	public void setModelActividades(DefaultTableModel modelActividades) {
		this.modelActividades = modelActividades;
	}




	public JScrollPane getjScrollActividades() {
		return jScrollActividades;
	}




	public void setjScrollActividades(JScrollPane jScrollActividades) {
		this.jScrollActividades = jScrollActividades;
	}


	
	
	

}
