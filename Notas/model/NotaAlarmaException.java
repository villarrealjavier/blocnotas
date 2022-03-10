package Notas.model;

public class NotaAlarmaException extends RuntimeException {
	public NotaAlarmaException() {
		
	}
	public NotaAlarmaException(String mensaje, Throwable exc,boolean a, boolean b) {
		super(mensaje,exc,a,b);
	}
	public NotaAlarmaException(String mensaje, Throwable lanzable) {
		super(mensaje,lanzable); 
	}
	public NotaAlarmaException(String mensaje) {
		super(mensaje);
	}
	public NotaAlarmaException(Throwable exc) {
		super(exc);
	}
}
