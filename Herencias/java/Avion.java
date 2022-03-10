package Herencias.java;

public class Avion extends Aereo {
	
	public Avion() {
		super(3, "Rynair");
	}
	public Avion(String motor) {
		
	}
	@Override
	public int numeroRuedas() {
		// TODO Auto-generated method stub
		return 2;
	}
	@Override
	public int numAlas() {
		// TODO Auto-generated method stub
		return 2;
	}
}
