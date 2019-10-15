package JuegoNumeros;
import java.util.*;
import javax.swing.*;

public class Jugadores {
	
	private int edad;
	private String nombre;
	private int marcador;
	private ArrayList tablero;//
	private ArrayList numerosElegidos;
	Scanner sc=new Scanner(System.in);
	private static int cont1=5;
	private static int cont2=0;
	
	public Jugadores(int edad,String nombre) {
		this.edad=edad;
		this.nombre=nombre;
		marcador=0;
		tablero=new ArrayList <Integer>(9);
		numerosElegidos=new ArrayList <Integer>();
		
	}
	
	
	
	public void inicializarTablero() {
		
	 for (int i=0;i<5;i++) {
		 
		 System.out.print("Ingrese el numero: "+(i+1)+" de "+ cont1);
		 int numero=sc.nextInt();
		 tablero.add(numero);
	 }
	 
		
	}
	
	public void adivina() {
		
		 for (int i=0;i<5;i++) {
			 
			 System.out.print("Input your number: " +(i+1)+ " of "+ cont1);
			 int numero=sc.nextInt();
			 numerosElegidos.add(numero);
		 }
	 }
	
	public ArrayList<Integer> battle(ArrayList player1,ArrayList player2 ){
		
		for (int i = 0; i <player1.size();i++) {
			
			for (int j = 0; j < player2.size(); j++) {
				
				if(player1.get(i).equals(player2.get(j))) {
					
					player2.remove(j);
					j--; //Is necesary to decrease the counter to avoid an error in the index.
				}
				
			}
			
		}
		return player2;
		
	}
	
	

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMarcador() {
		return marcador;
	}

	public void setMarcador(int marcador) {
		this.marcador = marcador;
	}
	

	public ArrayList getTablero() {
		return tablero;
	}
	

	public ArrayList getNumerosElegidos() {
		return numerosElegidos;
	}



	@Override
	public String toString() {
		return "Jugadores [edad=" + edad + ", nombre=" + nombre + ", marcador=" + marcador + "]";
	}
	
	
	
}

