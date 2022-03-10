package Herencias.java;

import java.util.Objects;

public abstract class Vehiculo {
	
	public abstract int numeroRuedas();
	public abstract int numAlas();
	
	
	
	private String motor;
	
	
	public Vehiculo() {
		
	}
	public Vehiculo(String motor) {
		this.motor=motor;
	}
	
	public void moverse() {
		System.out.println("Me estoy desplazando");
	}
	
	public void pararse() {
		System.out.println("Estoy parado");
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	@Override
	public int hashCode() {
		return Objects.hash(motor);
	}
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales=false;
		if (this == obj)
			sonIguales= true;
		else {
			Vehiculo other = (Vehiculo) obj;
			sonIguales= this.getMotor().equals(other.getMotor());
		}
		return sonIguales;
	}
	@Override
	public String toString() {
		return "Vehiculo con motor: " + motor;
	}
	
	

}


