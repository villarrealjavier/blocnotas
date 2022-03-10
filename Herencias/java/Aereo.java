package Herencias.java;

public abstract class Aereo extends Vehiculo{
	private int numAlas;
	
	public Aereo() {
		
	}
	
	public Aereo( int numAlas,String motor) {
		super(motor);
		this.numAlas=numAlas;
	}
	public int getNumAlas() {
		return numAlas;
	}
	public void setNumAlas(int numAlas) {
		this.numAlas = numAlas;
	}
	public String toString() {
		return super.toString()+" Con " +"numero de Alas: "+numAlas; 
	}
}
