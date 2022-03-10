package Notas.main;

import java.time.LocalDateTime;
import java.util.Scanner;

import Notas.model.NotaAlarma;
import Notas.model.NotaAlarmaException;
import Notas.model.Notas;
import Notas.model.Bloc;

public class NotasMainApp {
	
	
	public static void main(String[] args) {
	//Notas n1 = new Notas(null);
	Notas n4 = new Notas("Hola", 2);
	Notas n5 = new Notas ("Hola", 2);
	//Notas n2 = new Notas("    ");
	NotaAlarma na1= new NotaAlarma("Hola", LocalDateTime.of(2022, 03, 11, 13, 0), false);
	na1.activate();
	//Notas n3 = new Notas("Hola me");
	Bloc bc1 = new Bloc("Bloc 1");
	Bloc bc2 = new Bloc("Bloc 2");
	
	System.out.println(bc1.equals(bc2));
	try {
		Notas[] blocNotas = new Notas[5];
		for (int i=0;i<blocNotas.length;i++) {
			blocNotas[i]= crearNota();
		}
		
	}catch (Exception lanzable) {
		throw new NotaAlarmaException("Se ha producido una excepcion inesperada",lanzable);
	}
	
	//System.out.println(n4.equals(n5));
	//System.out.println(n1.isEmpty());
	//System.out.println(n2.isEmpty());
	//System.out.println(n3.isEmpty());
	
	
	}
	public static Notas crearNota() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el texto para la nota");
		String texto = String.valueOf(sc.nextLine());
		
		return new Notas(texto);
	}
}
