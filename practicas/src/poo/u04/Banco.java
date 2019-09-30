package poo.u04;

import java.util.ArrayList;

public class Banco {
	private String nombre;
	private ArrayList<Cuenta> cuentas;
	public final static float descubierto = 3000;
	
	public Banco(String nombre) {
		this.nombre = nombre;
		cuentas = new ArrayList<Cuenta>();
	}

	public boolean agregarCuenta(Cuenta c) {
		if (c.esMayorDeEdad()) {
			return cuentas.add(c);
		} else
			return false;
	}
	
	@Override
	public String toString() {
		String txt = "Banco: " + nombre + "\n";
		for (Cuenta cuenta : cuentas) {
			txt += cuenta.toString() + "\n";
		}
		return txt;
	}
	
	
}
