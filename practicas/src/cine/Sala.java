package cine;

public class Sala implements ISala4d {
	private int num;
	private int pasillo; // columna del pasillo
	private Butaca[][] butacas;

	public Sala(int filas, int asientos, int num, int pasillo) {
		this.num = num;
		butacas = new Butaca[filas][asientos];
		this.pasillo = pasillo;
		inicializarSala();
	}

	private void inicializarSala() {
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				butacas[i][j] = new Butaca(i,j);
				if (j == pasillo)
					butacas[i][j].pasillo();
			}
		}
	}
	
	public String toString() {
		String str = "";
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				str = str + butacas[i][j].getEstado() + " ";
			}
			str = str + "\n";
		}
		return str;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPasillo() {
		return pasillo;
	}

	public void setPasillo(int pasillo) {
		this.pasillo = pasillo;
	}

	//@Override
	public void ocupar(int a,int b) {
		butacas[a][b].ocupar();
	}
	
	public String numeroButaca(){
		String srt="";
		for (int i = 0; i < butacas.length; i++) {
			
			for (int j = 0; j < butacas[i].length; j++) {
				if (butacas[i][j].getEstado().contentEquals("O")) {
					srt="Fila= "+i+" Columna= "+j;
				}
				
			}
		}
			return srt;
	}

	@Override
	public void asignarSector4D(int butacaSupIzqFila, int butacaSupIzqCol, int butacaInfDerFila, int butacaInfDerCol) {
	
		
	}
		
		
	
	
	
}
