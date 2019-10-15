package JuegoNumeros;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;
public class Arena {

	public static void main(String[] args) {
		
		//Creating players for the game.
		ArrayList mio=new ArrayList <Integer>(8);
		Jugadores j1=new Jugadores(28,"Rafael");
		Jugadores j2=new Jugadores(24,"Fatima");
		int cont=0;
		
		System.out.println("Player 1 in the next step choose your numers from 1 to 9");
		
		j1.inicializarTablero();
		
		System.out.println(j1.getTablero());
		
		System.out.println(j1.getTablero().get(4));
		
		
		System.out.println("Player 2 in the next step choose your numers from 1 to 9");
		
		j2.inicializarTablero();
		
		System.out.println(j2.getTablero());
		
		System.out.println("Player 1 try to gues the numbers choosen by Player 2");
		
		j1.adivina();
		
		System.out.println("Player 2 try to gues the numbers choosen by Player 1");
		
		j2.adivina();
		
		j2.battle(j1.getNumerosElegidos(),j2.getTablero());
		
		System.out.println(j2.getTablero());
		
		j1.battle(j2.getNumerosElegidos(),j1.getTablero());
		
		System.out.println(j1.getTablero());
		
		int longitud1=j1.getTablero().size();
		int longitud2=j2.getTablero().size();

		if(longitud2<longitud1) {
			
			System.out.println("El ganador es el jugador 1 "+ j1.getNombre());
			
			if (longitud1<longitud2) {
				
				System.out.println("El ganador es el jugador 1 "+ j1.getNombre());
			}
			
			else 
				System.out.println("Es un empate");
		}
		
		
		
	}


}
