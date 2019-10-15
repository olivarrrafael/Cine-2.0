package JuegoNumeros;

import java.util.ArrayList;

public class prueba {

	public static void main(String[] args) {
	
		ArrayList ju1=new ArrayList<Integer>();
		ArrayList ju2=new ArrayList<Integer>();
		ArrayList adivina=new ArrayList<Integer>();
		ju1.add(1);
		ju1.add(2);
		ju1.add(3);
		ju1.add(4);
		
		ju2.add(1);
		ju2.add(2);
		ju2.add(3);
		ju2.add(4);
		
		adivina.add(1);
		adivina.add(2);
		adivina.add(9);
		adivina.add(5);
		
		int iguales=0;
		for (int i = 0; i < adivina.size(); i++) {
			
			for (int j = 0; j < ju2.size(); j++) {
				
				if(adivina.get(i).equals(ju2.get(j))) {
					
					iguales++;
				}
				
			}
			
		}
		
		System.out.print(iguales);
		
	}

}
