package Notas.model;


import java.util.Objects;
import java.util.Scanner;

public class Bloc extends Notas{
	private static final int NUMERO_NOTAS_MAXIMA=100;
	private int numNotas;
	private String nombre;
	
	public Bloc(String nombre) {
		this.nombre=nombre;
	}
	
	//methods
	public void updateNota(int numNotas,String nombre) {
		setNumNotas(numNotas);
		setNombre(nombre);
		
		
	}
	
	public void activa(int numNotas) {
		
	}
	public void desactiva (int numNotas) {
		
	}
	
	
	
	//getters and setters
	public int getNumNotas() {
		return numNotas;
	}

	public static int getNumeroNotasMaxima() {
		return NUMERO_NOTAS_MAXIMA;
	}
	public void setNumNotas(int numNotas) {
		this.numNotas = numNotas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//HASHCODE
	@Override
	public int hashCode() {
		return Objects.hash(nombre, numNotas);
	}
	
	//EQUALS
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales=false;
		Bloc other = (Bloc) obj;
		if (this.nombre.equalsIgnoreCase(other.getNombre()))
			sonIguales = true;
	
		
		return sonIguales;
	}
}
