package graficos;
import java.awt.Frame;

import javax.swing.*;
public class CreandoMarcos {

	public static void main(String[] args) {
		
		miMarco ventana=new miMarco();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
}
class miMarco extends JFrame{
	
	
	public miMarco() {
		
		setBounds(500,300,550,250);
		
		setTitle("Mi ventana");
		
		//setResizable(false);
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		//setSize(500,300);
		
		//setLocation(500,300);
	}
	
}