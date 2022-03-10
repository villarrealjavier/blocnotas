package Herencias.java;

public class Moto extends Terrestre {
	public Moto() {
		super(2, "gasolina");
	}
	public Moto(String motor) {
		super(2,motor);
	}
	@Override
	public int numeroRuedas() {
		// TODO Auto-generated method stub
		return 2;
	}
	@Override
	public int numAlas() {
		// TODO Auto-generated method stub
		return 0;
	}
}
