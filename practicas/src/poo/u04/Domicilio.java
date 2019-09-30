package poo.u04;

public class Domicilio {
	private String calle;
	private int numero;
	private String localidad;
	private String provincia;
	private String cp;
	
	public Domicilio() {
	}
	public Domicilio(String calle, int num, String cp) {
		this.calle = calle;
		numero = num;
		this.cp = cp;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String toString() {
		return "Calle: " + calle + ", Número: " + numero + ", "
				+ "Código Postal: " + cp;
	}
}
