package Notas.model;


import java.util.Arrays;
import java.util.Objects;

public class Bloc {
	private static final int NUMERO_NOTAS_MAXIMA=100;
	private int numNota;
	private String nombre;
	private Notas[] notas = new Notas[NUMERO_NOTAS_MAXIMA];
	
	public Bloc() {
		
	}
	
	public Bloc(String nombre) {
		this.nombre=nombre;
		
	}
	
	
	
	//methods
	public void addNota(Notas nota) {
		if (numNota<NUMERO_NOTAS_MAXIMA) {
			this.notas[numNota]= nota;
			numNota++;
		}
	}
	public void addNota (int posicion, Notas nota) {
		if (posicion<NUMERO_NOTAS_MAXIMA) {
			this.notas[numNota]=nota;
		
		}
	}
	
	
	
	public String getNota(int numNota){
		String resultado="";
		if (numNota<NUMERO_NOTAS_MAXIMA && numNota>0) {
			resultado=this.notas[numNota-1].toString();
			
		
		}else {
			throw new BlocException("Se ha producido una Excepcion");
			
			
		}
		return resultado;
		}
		
		
	
	@Override
	public String toString() {
		return "Bloc [numNota=" + numNota + ", nombre=" + nombre + ", Notas=" + Arrays.toString(notas) + "]";
	}

	public void updateNota(int posicion,String texto) {
		if (posicion<NUMERO_NOTAS_MAXIMA && this.notas[posicion-1]!=null) {
			this.notas[posicion-1].setTexto(texto);
		}//else {
			//throw new NotaAlarmaException("No se ha podido actualizar");
		//}
		
		
		
	}
	
	public void activa(int posicion) {
		if (posicion < NUMERO_NOTAS_MAXIMA 
				&& this.notas[posicion-1] instanceof NotaAlarma 
				&& this.notas[posicion-1]!=null){
				NotaAlarma notaActivar = (NotaAlarma)this.notas[posicion-1];
				notaActivar.activate();
		}else {
			throw new NotaAlarmaException("No se ha podido activar la alarma");
		}
		
	}
	public void desactiva (int posicion) {
		if (posicion < NUMERO_NOTAS_MAXIMA 
				&& this.notas[posicion-1] instanceof NotaAlarma 
				&& this.notas[posicion-1]!=null){
				NotaAlarma notaActivar = (NotaAlarma)this.notas[posicion-1];
				notaActivar.desactivar();
		}else {
			throw new NotaAlarmaException("No se ha podido desactivar la alarma");
		}
	}
		
	
	public Notas[] ordenaBloc() {
		int contadorNotas=0;
		
		//CON ESTE BUCLE CALCULAMOS LA LONGITUD QUE TENDRÁ EL ARRAY, DE MANERA
		// QUE VEMOS EL NUMERO DE NOTAS NO NULA QUE TENDRÁ.
		for (int i=0;i<notas.length;i++) {
			if (notas[i]!=null) {
				contadorNotas++;
			}
		}
		Notas[] notasOrdenadas = new Notas[contadorNotas];
		int contador=0;
		for (int i=0;i<notas.length;i++) {
			if (this.notas[i]!=null) {
				notasOrdenadas[contador++]=this.notas[i];
			}
		}
		Arrays.sort(notasOrdenadas);
		return notasOrdenadas;
		
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
