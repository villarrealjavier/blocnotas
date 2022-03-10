package Notas.model;

import java.time.LocalDateTime;
import java.util.Objects;

import Enteros_Ordenar.Entero;

public class Notas implements Comparable<Notas>{
	private static Integer codigoSiguiente=0;
	private Integer codigo;
	private String texto;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaUltimaModificacion;
	
	public Notas() {
		
	}
	
	public Notas(String texto) {
		this.texto=texto;
		this.codigo=codigoSiguiente;
		codigoSiguiente++;
	}
	public Notas (String texto, Integer codigo) {
		this.texto=texto;
		this.codigo=codigo;
	}
	
	//MODIFICADO
	public boolean isModificado() {
		if (fechaUltimaModificacion!=null) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean isEmpty() {
		boolean estaVacio=false;
		if (texto==null || texto.trim().isEmpty()) {
			estaVacio=true;
		}
		return estaVacio;
	}
	
	public boolean isCreadoAnterior(Notas nota) {
		if (this.getFechaCreacion().isBefore(nota.fechaCreacion)) {
			return true;
		}else {
			return false;
		}
		
		
	
	}
	public boolean isModificadoAnterior(Notas nota) {
		boolean isAnterior= false;
		if (this.getFechaUltimaModificacion()==null && nota.getFechaUltimaModificacion()==null) {
			isAnterior=false;
		}else if (this.isModificado() && nota.isModificado() ) {
			if (this.getFechaUltimaModificacion().isBefore(nota.getFechaUltimaModificacion())) {
				isAnterior=true;
			}
			
		}else if (this.isModificado()) {
			isAnterior=true;
			
		}
		
		return isAnterior;
	}
	
	

	//GETTERS AND SETTERS


	public Integer getCodigo() {
		return codigo;
	}



	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
		this.fechaUltimaModificacion=LocalDateTime.now();
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public LocalDateTime getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}

	public void setFechaUltimaModificacion(LocalDateTime fechaUltimaModificacion) {
		this.fechaUltimaModificacion = fechaUltimaModificacion;
	}
	//COMPARABLE TO
	@Override
	public int compareTo(Notas otro) {
		int resultado=0;
		if (this.codigo>otro.getCodigo()) {
			resultado=1;
		}else if (this.codigo<otro.getCodigo()) {
			resultado=-1;
		}else if (this.codigo==otro.codigo) {
			resultado=0;
		}
		return resultado;
	}
	//HASHCODE
	@Override
	public int hashCode() {
		return Objects.hash(codigo, codigoSiguiente, fechaCreacion, fechaUltimaModificacion, texto);
	}
	//EQUALS
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales=false;
		Notas other = (Notas) obj;
		if (this.texto.equalsIgnoreCase(other.texto) && this.fechaCreacion.equals(other.getFechaCreacion())) {
			sonIguales=true;
		}

		return sonIguales;
	}
	//TO STRING 
	@Override
	public String toString() {
		return "Notas [codigoSiguiente=" + codigoSiguiente + ", codigo=" + codigo + ", texto=" + texto
				+ ", fechaCreacion=" + fechaCreacion + ", fechaUltimaModificacion=" + fechaUltimaModificacion + "]";
	}
	
	
}
