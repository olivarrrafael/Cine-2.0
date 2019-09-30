package poo.u01;

import poo.u04.Domicilio;

public class Persona {
	private String nombre;
	private String dni;
	private double altura;
	private int edad;
	private String genero;
	private Domicilio domicilio;

	public Persona(String dni) {
		this.dni = dni;
		domicilio = new Domicilio();
	}
	
	public Persona(String dni, String nombre, int edad, String genero) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		domicilio = new Domicilio();
	}
	
	public Persona(String nombre, int edad, String calle, int num, String cp) {
		this.nombre = nombre;
		this.edad = edad;
		domicilio = new Domicilio(calle, num, cp);
	}
	
	public Persona(String nombre, String dni, int edad, String calle, int num, String cp) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		domicilio = new Domicilio(calle, num, cp);
	}
	
	
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean esMayorDeEdad() {
		if (edad>=18)
			return true;
		return false;
	}

	public String toString() {
		return "Nombre: " + nombre + ", DNI: " + dni + ", Edad: " + edad + 
				", " + domicilio.toString();
	}
}
