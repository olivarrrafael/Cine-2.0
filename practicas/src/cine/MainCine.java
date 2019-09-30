package cine;

import javax.swing.JOptionPane;

public class MainCine {

	public static void main(String[] args) {
	
	
		Sala sala1 = new Sala(4, 4, 1, 1);
		
		sala1.ocupar(2, 2);
		
		JOptionPane.showMessageDialog(null,sala1);

		Ticket avengers=new Ticket(sala1.getNum(),sala1.numeroButaca(),"Avenger",10,250);
		
		Pelicula peli=new Pelicula("Avengers");
		Pelicula peli2=new Pelicula("Dron");
		Pelicula peli3=new Pelicula("Spiderman");
		
		Cine c1=new Cine("Palermo");
		
		c1.agregarPelicula(peli);
		c1.agregarPelicula(peli2);
		c1.agregarPelicula(peli3);
		JOptionPane.showMessageDialog(null,c1.litarPeliculas());
		c1.eliminarPelicula(peli3);
		JOptionPane.showMessageDialog(null,c1.litarPeliculas());
	}

}
