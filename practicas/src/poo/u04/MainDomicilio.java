package poo.u04;

import poo.u01.Persona;

public class MainDomicilio {

	public static void main(String[] args) {
		Domicilio d1 = new Domicilio("Cucha cucha", 123, "1000");
		// System.out.println(d1);
		
		Persona p1 = new Persona("Ramiro");
		Persona p2 = new Persona("Ramiro", 38, "Cucha cucha", 125, "1000");
		System.out.println(p2);
	}

}
