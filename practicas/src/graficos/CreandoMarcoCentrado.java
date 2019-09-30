package graficos;

import java.awt.*;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		MarcoCentrado miMarco=new MarcoCentrado();
		

	}
}
	class MarcoCentrado extends JFrame{
		
		public MarcoCentrado() {
			Toolkit mipantalla=Toolkit.getDefaultToolkit();
			Dimension tamanoPantalla=mipantalla.getScreenSize();
			
			int alturaPantalla=tamanoPantalla.height;
			int anchoPantalla=tamanoPantalla.width;
			
			setSize(anchoPantalla/2,alturaPantalla/2);
			
			setLocation(anchoPantalla/4,alturaPantalla/4);
			setTitle("Marco centrado");
			Image miIcono=mipantalla.getImage("/Portafolio/imagenes/codoacodo.jpg");
			setIconImage(miIcono);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
	}

