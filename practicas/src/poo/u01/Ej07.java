package poo.u01;

public class Ej07 {

	public static void main(String[] args) {
		Motocicleta moto = new Motocicleta("ABC123");
		/*
		Motocicleta moto2 = new Motocicleta("ABC124");
		System.out.println(moto.getMatricula());
		System.out.println(moto.getVelocidad());
		moto.arrancar();
		System.out.println(moto.enMarcha());
		moto.acelerar();
		System.out.println(moto.getVelocidad());
		moto.acelerar();
		System.out.println(moto.getVelocidad());
		moto.acelerar();
		System.out.println(moto.getVelocidad());
		System.out.println(moto.toString());
		System.out.println(moto2.toString());
		*/
		System.out.println(moto.toString());
		moto.arrancar();
		System.out.println(moto.toString());	
		moto.acelerar();
		System.out.println(moto.toString());	
		moto.acelerar();
		System.out.println(moto.toString());
		moto.setVelocidad(129);
		System.out.println(moto.toString());
		moto.acelerar();
		System.out.println(moto.toString());
		moto.acelerar();
		System.out.println(moto.toString());
	}

}
