package cine;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
public class Ticket {
	private static int numero;
	private Calendar horaDeCompra;
	private String pelicula;
	private double costo;
	private int horario;
	private int sala;
	private String butaca;
	public Ticket(int sala,String butaca,String pelicula,int horario,double costo) {
		horaDeCompra=new GregorianCalendar();
		numero=1;
		this.sala=sala;
		this.butaca=butaca;
		this.pelicula=pelicula;
		this.horario=horario;
		this.costo=costo;
		
	}

	public static int getNumero() {
		return numero;
	}

	public static void setNumero(int numero) {
		Ticket.numero = numero;
	}

	public Calendar getHoraDeCompra() {
		return horaDeCompra;
	}

	public void setHoraDeCompra(Calendar horaDeCompra) {
		this.horaDeCompra = horaDeCompra;
	}

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public String getButaca() {
		return butaca;
	}

	public void setButaca(String butaca) {
		this.butaca = butaca;
	}


}