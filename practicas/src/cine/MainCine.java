package cine;

import javax.swing.JOptionPane;

public class MainCine {

	public static void main(String[] args) {
	
	
		Sala sala1 = new Sala(4, 4, 1, 1);
		
		sala1.ocupar(2, 2);
		
		JOptionPane.showMessageDialog(null,sala1);

		Ticket avengers=new Ticket(sala1.getNum(),sala1.numeroButaca(),"Avenger",10,250);
		
		
		JOptionPane.showMessageDialog(null,avengers.getHoraDeCompra());
	}

}
