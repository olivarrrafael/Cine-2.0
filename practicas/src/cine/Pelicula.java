package cine;
import java.util.*;
public class Pelicula {

	private String nombre;
	private String protagonista;
	private int fechaEstreno;
	private String genero;
	
	
	public Pelicula(String nombre) {
		
		this.nombre=nombre;
		genero="";
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", protagonista=" + protagonista + ", fechaEstreno=" + fechaEstreno
				+ ", genero=" + genero + "]";
	}
	

}
