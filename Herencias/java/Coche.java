package Herencias.java;

public class Coche extends Terrestre {
	
	
	public Coche() {
		
	}
	public Coche(String motor){
		super(4,motor);
	}
	@Override
	public int numeroRuedas() {
		// TODO Auto-generated method stub
		return 4;
	}
	@Override
	public int numAlas() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
