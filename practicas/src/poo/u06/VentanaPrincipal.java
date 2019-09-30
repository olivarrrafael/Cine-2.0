package poo.u06;
import java.awt.Container;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

	private Container contenedor;
	
	public VentanaPrincipal() {
		
		contenedor=getContentPane();
		contenedor.setLayout(null);
		setTitle("Codo a Codo: Titulo de la ventana");
		setSize(400,200);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[]args) {
		
		VentanaPrincipal Ventana=new VentanaPrincipal();
		Ventana.setVisible(true);
		Toolkit.getDefaultToolkit().beep();
		
	}
}
