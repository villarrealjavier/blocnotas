package Herencias.java;

public abstract class Terrestre extends Vehiculo {
	private int numRuedas=0;
	
	public abstract int numeroRuedas();
	public abstract int numAlas();
	
	public Terrestre() {
		
	}
	public Terrestre(int ruedas,String motor) {
		super(motor);
		this.numRuedas=ruedas;
		setMotor(motor);
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	public String toString() {
		return super.toString()+" Con " +"numero de ruedas: "+numRuedas; 
	}
	

}
