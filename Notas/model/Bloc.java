package Notas.model;


import java.util.Objects;

public class Bloc {
	private static final int NUMERO_NOTAS_MAXIMA=100;
	private int numNota;
	private String nombre;
	private Notas[] Notas = new Notas[NUMERO_NOTAS_MAXIMA];
	
	public Bloc() {
		
	}
	
	public Bloc(String nombre) {
		this.nombre=nombre;
		
	}
	
	
	
	//methods
	public void addNota(Notas nota) {
		if (numNota<NUMERO_NOTAS_MAXIMA) {
			this.Notas[numNota]= nota;
			numNota++;
		}
	}
	public void addNota (int posicion, Notas nota) {
		if (posicion<NUMERO_NOTAS_MAXIMA) {
			this.Notas[numNota]=nota;
		
		}
	}
	
	
	public String getNota(int numNota) {
		
		return null;
		}
	
	public void updateNota(int posicion,String texto) {
		if (posicion<NUMERO_NOTAS_MAXIMA && this.Notas[posicion]!=null) {
			this.Notas[posicion].setTexto(texto);
		}else {
			throw new NotaAlarmaException("No se ha podido actualizar");
		}
		
		
		
	}
	
	public void activa(int posicion) {
		if (posicion < NUMERO_NOTAS_MAXIMA 
				&& this.Notas[posicion-1] instanceof NotaAlarma 
				&& this.Notas[posicion-1]!=null){
				NotaAlarma notaActivar = (NotaAlarma)this.Notas[posicion-1];
				notaActivar.activate();
		}else {
			throw new NotaAlarmaException("No se ha podido activar la alarma");
		}
		
	}
	public void desactiva (int posicion) {
		if (posicion < NUMERO_NOTAS_MAXIMA 
				&& this.Notas[posicion-1] instanceof NotaAlarma 
				&& this.Notas[posicion-1]!=null){
				NotaAlarma notaActivar = (NotaAlarma)this.Notas[posicion-1];
				notaActivar.desactivar();
		}else {
			throw new NotaAlarmaException("No se ha podido desactivar la alarma");
		}
	}
		
	
	public String ordenaBloc() {
		return nombre;
		
	}
	
	
	//getters and setters
	public int getNumNotas() {
		return numNota;
	}

	public static int getNumeroNotasMaxima() {
		return NUMERO_NOTAS_MAXIMA;
	}
	public void setNumNotas(int numNotas) {
		this.numNota = numNotas;
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
		return Objects.hash(nombre, numNota);
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
