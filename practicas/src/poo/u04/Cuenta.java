package poo.u04;

import poo.u01.Persona;

public abstract class Cuenta {

	// private String dniTitular;
	private Persona titular;
	protected double saldo;
	//private double importe;

	public Cuenta(String dniTitular) {
		titular = new Persona(dniTitular);
		saldo = 0;
	}

	public Cuenta(String dniTitular, double saldo) {
		titular = new Persona(dniTitular);
		this.saldo = saldo;
	}

	public Cuenta(String dniTitular, String nombre, int edad, String genero, double saldo) {
		Persona aux = new Persona(dniTitular, nombre, edad, genero);
		if (aux.esMayorDeEdad())
			titular = aux;
		if (saldo >= 0)
			this.saldo = saldo;
	}

	public String toString() {
		// return "dniTitular= " + titular.getDni() + ", saldo= " + saldo;
		return titular.toString() + ", saldo= " + saldo;
	}

	/*
	 * depositar(double importe): se ingresa un importe a la cuenta, si el importe
	 * es negativo o cero, no se hará nada y el método devolverá false (error), caso
	 * contrario deberá retornar true (ok) y actualizar el saldo de la cuenta.
	 */

	public boolean depositar(double importe) {

		if (importe <= 0) {
			return false;

		} else {
			saldo = saldo + importe;
			return true;
		}

	}

	/*
	 * extraer(double importe): se retira una cantidad determinada de la cuenta. Si
	 * la resta entre el saldo actual y el importe a extraer da negativo, retornar
	 * false; caso contrario, retornar true y actualizar el saldo de la cuenta.
	 */

	public boolean extraer(double importe) {
		double resta = saldo - importe;
		if (resta < 0) {
			return false;
		} else {
			saldo = resta;
			return true;
		}
	}

	public String getDniTitular() {
		return titular.getDni();
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean esMayorDeEdad() {
		return titular.esMayorDeEdad();
	}
}
