package Herencias.java;

public class Dron extends Aereo {
	
	public Dron() {
		super(2, "Flying");
	}
	public Dron(String motor) {
		
	}
	@Override
	public int numeroRuedas() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int numAlas() {
		// TODO Auto-generated method stub
		return 2;
	}
	
	}

