package cine;

public abstract class Butaca {
	private int fila;
	private int num;
	private String estado; //L:Libre, O:Ocupado, X:Pasillo.
	protected boolean luz;
	
	public Butaca(int fila, int num) {
		this.fila = fila;
		this.num = num;
		this.estado = "L";
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getEstado() {
		return estado;
	}
	
	/*
	public void setEstado(String estado) {
		this.estado = estado;
	}
	*/
	
	public boolean ocupar() {
		if (estado.equals("L")) {
			this.estado = "O";
			return true;
		}
		return false;
	}

	public boolean liberar() {
		if (estado.equals("O")) {
			this.estado = "L";
			return true;
		}
		return false;
	}
	
	public void pasillo() {
		estado = "X";
	}
	
	public void encender() {
		luz = true;
	};
	
	@Override
	public String toString() {
		return "Butaca [fila=" + fila + ", num=" + num + ", estado=" + estado + "]";
	}

	
}
