package poo.u04;

public class CuentaGold extends Cuenta {
	private float descubierto;

	public CuentaGold(String dniTitular) {
		super(dniTitular);
		descubierto = Banco.descubierto;
	}

	public CuentaGold(String dniTitular, double saldo) {
		super(dniTitular, saldo);
		descubierto = Banco.descubierto;
	}

	public CuentaGold(String dniTitular, String nombre, int edad, String genero, double saldo) {
		super(dniTitular, nombre, edad, genero, saldo);
		descubierto = Banco.descubierto;
	}

	public boolean extraer(double importe) {
		double resta = saldo+descubierto - importe;
		if (resta < 0) {
			return false;
		} else {
			saldo = saldo - importe;
			return true;
		}
	}
}
