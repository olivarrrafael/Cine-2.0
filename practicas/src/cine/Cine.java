package cine;

import java.util.ArrayList;
import java.util.Iterator;

public class Cine {
	private ArrayList <Pelicula>cartelera;
	private ArrayList salas;
	private ArrayList reservas;
	private ArrayList usuarios;
	private String nombre;
	private boolean estado;

	public Cine(String nombre) {
		this.nombre=nombre;
		cartelera=new ArrayList<Pelicula>();
		salas=new ArrayList<Sala>();
		usuarios=new ArrayList<Usuario>();
	}
	
	public boolean eliminarPelicula(Pelicula peli) {
	
		cartelera.remove(peli);
	
	return false;
	
}

public boolean eliminarPelicula(int a) {
	cartelera.remove(a);
	
	return false;
}

public boolean agregarPelicula(Pelicula peli) {
	
	cartelera.add(peli);
	return false;
	
}
public boolean agregarPelicula(String nombre) {
	return false;
	
}
public String litarPeliculas() {
	String srt="";
	Pelicula peli;
	for (int i = 0; i < cartelera.size(); i++) {
		peli= cartelera.get(i);
		srt=srt+peli.getNombre()+"\n ";
	} 
	return srt;
}

}
