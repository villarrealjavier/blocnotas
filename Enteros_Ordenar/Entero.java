package Enteros_Ordenar;

public class Entero implements Comparable<Entero>{
	private int valor;
	
	public Entero(int valor) {
		this.valor=valor;
		
	}

	@Override
	public int compareTo(Entero otro) {
		int resultado=0;
		
		if (this.getValor()>otro.getValor()) {
			resultado=1;
		}else if (this.getValor()<otro.getValor()) {
			resultado=-1;
		}
		return resultado;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Entero [valor=" + valor + "]";
	}


	
}
