package poo.u05;

import java.util.ArrayList;

public class Pila implements IColeccion {
	private ArrayList<Object> pila;
	
	public Pila() {
		pila = new ArrayList<Object>();
	}

	@Override
	public boolean estaVacia() {
		return pila.isEmpty();
	}

	@Override
	public Object extraer() {
		int idElem = pila.size()-1;
		Object obj = pila.remove(idElem);
		return obj;
	}

	@Override
	public boolean agregar(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
