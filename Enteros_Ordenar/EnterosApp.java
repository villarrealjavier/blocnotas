package Enteros_Ordenar;

import java.util.Arrays;

public class EnterosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entero[] enteros = new Entero[3];
		
		Entero e1 = new Entero(3);
		Entero e2 = new Entero(7);
		Entero e3 = new Entero(0);
		
		enteros[0]=e2;
		enteros[1]=e3;
		enteros[2]=e1;
		
		Comparable[] lista = new Comparable[3];
		lista[0]=(Comparable)e1;
		lista[1]=(Comparable)e3;
		lista[2]=(Comparable)e2;
		
		Arrays.sort(enteros);
		
		ArrayUtilidad.imprimirArray(enteros);
		
		
	}

}
