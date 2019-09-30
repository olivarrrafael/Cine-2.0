package cine;
import java.util.*;
public class Pelicula {

	private String nombre;
	private String protagonista;
	private int fechaEstreno;
	private String genero;
	
	
	public Pelicula(String nombre,String protagonista,int fechaEstreno,String genero) {
		
		this.nombre=nombre;
		this.protagonista=protagonista;
		this.fechaEstreno=fechaEstreno;
		this.genero=genero;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getProtagonista() {
		return protagonista;
	}


	public void setProtagonista(String protagonista) {
		this.protagonista = protagonista;
	}


	public int getFechaEstreno() {
		return fechaEstreno;
	}


	public void setFechaEstreno(int fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", protagonista=" + protagonista + ", fechaEstreno=" + fechaEstreno
				+ ", genero=" + genero + "]";
	}
	

}
