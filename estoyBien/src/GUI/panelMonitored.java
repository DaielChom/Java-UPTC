package GUI;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panelMonitored extends JPanel{
	
	private panelMonitoredTitulo titulo;
	private panelMonitoredCrearNota creaNotas;
	private panelMonitoredListarNotas listaNotas;
	private panelMonitoredBoton botones;
	private JPanel pnl;
	
	public panelMonitored() {
		super();
		
		titulo = new panelMonitoredTitulo();
		creaNotas = new panelMonitoredCrearNota();
		listaNotas = new panelMonitoredListarNotas();
		botones = new panelMonitoredBoton();
		
		pnl = new JPanel();
		pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
		setLayout(new BorderLayout());
		
		add(titulo, BorderLayout.NORTH);
		add(creaNotas, BorderLayout.WEST);
		pnl.add(listaNotas);
		pnl.add(botones);
		add(pnl, BorderLayout.EAST);
	}

	public panelMonitoredTitulo getTitulo() {
		return titulo;
	}

	public void setTitulo(panelMonitoredTitulo titulo) {
		this.titulo = titulo;
	}

	public panelMonitoredCrearNota getCreaNotas() {
		return creaNotas;
	}

	public void setCreaNotas(panelMonitoredCrearNota creaNotas) {
		this.creaNotas = creaNotas;
	}

	public panelMonitoredListarNotas getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(panelMonitoredListarNotas listaNotas) {
		this.listaNotas = listaNotas;
	}

	public panelMonitoredBoton getBotones() {
		return botones;
	}

	public void setBotones(panelMonitoredBoton botones) {
		this.botones = botones;
	}
	
	
	
	

	

	
	
	

}
