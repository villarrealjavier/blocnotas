package Notas.model;

import java.time.LocalDateTime;

public class NotaAlarma extends Notas implements Activable{
	private LocalDateTime fechaAlarma;
	private static final int MINUTOS_REPETIR_POR_DEFECTO=9;
	private int minutosRepetir;
	private boolean activado=false;
	
	
	public NotaAlarma(String texto, LocalDateTime fechaAlarma, boolean activado) {
		super(texto);
		this.fechaAlarma=fechaAlarma;
		this.activado=activado;
		
	}
	//GETTERS AND SETTERS
	public static int getMinutosRepetirPorDefecto() {
		return MINUTOS_REPETIR_POR_DEFECTO;
	}
	public void setFechaAlarma(LocalDateTime fechaAlarma) {
		this.fechaAlarma = fechaAlarma;
	}
	
	//methods
	
	public boolean isActivado() {
		if (this.activado==true) {
			return true;
		}else {
			return false;
		}
		
	}
	//TO STRING
	@Override
	public String toString() {
		return "NotaAlarma [fechaAlarma=" + fechaAlarma + ", minutosRepetir=" + minutosRepetir + ", activado="
				+ activado + "]";
	}
	@Override
	public void activate() {
		if (this.activado==false) {
			this.activado=true;
		}
		
	}
	@Override
	public void desactivar() {
		if (this.activado==true) {
			this.activado=false;
		}
		
	}
	
}
