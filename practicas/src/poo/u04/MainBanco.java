package poo.u04;

public class MainBanco {

	public static void main(String[] args) {
		Cuenta c1 = new CuentaClassic("28000111", 1000);
/*		System.out.println(c1);
		c1.depositar(100);
		System.out.println(c1);
		c1.extraer(1200);
		System.out.println(c1);
		c1.extraer(200);
		System.out.println(c1);
*/
		Cuenta c2 = new CuentaClassic("28000222", "Juan", 20, "M", 150);
		
		Banco santa = new Banco("Santander");
		
		Cuenta c3 = new CuentaGold("28000333", "Pedro", 50, "M", 100);
		c2.extraer(3000);
		c3.extraer(3000);
		
		santa.agregarCuenta(c1);
		santa.agregarCuenta(c2);
		santa.agregarCuenta(c3);

		System.out.println(santa);
		
}

}
