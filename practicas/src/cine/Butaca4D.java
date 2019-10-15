package cine;

public class Butaca4D extends Butaca implements IButaca4D {

	private boolean vibracion;
	
	public Butaca4D(int fila, int num) {
		super(fila, num);
		
	}

	@Override
	public void vibrar(int seg) {
	}
	
	@Override
	public void encender() {
	super.encender();
	this.vibrar(5);
	
	}
	
	
	
	
}
