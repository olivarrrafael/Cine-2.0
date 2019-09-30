package poo.u01;

import javax.swing.JOptionPane;

public class Gato {
/* 
 * Crear la clase Gato en java, teniendo en 
 * cuenta que sus atributos son: nombre, raza, color y sus
	métodos: maullar(), caminar(), saltar(), jugar().
 */
	private String nombre;
	private String raza;
	private String color;
	
	public void maullar() {
		JOptionPane.showMessageDialog(null, "Miau...");
	}
	public void caminar() {
		JOptionPane.showMessageDialog(null, "Caminando...");
	}
	public void saltar() {
		JOptionPane.showMessageDialog(null, "Saltando...");
	}
}
