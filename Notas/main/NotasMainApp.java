package Notas.main;

import java.time.LocalDateTime;
import java.util.Scanner;

import Notas.model.Bloc;
import Notas.model.NotaAlarma;
import Notas.model.NotaAlarmaException;
import Notas.model.Notas;

public class NotasMainApp {
	/*String respuesta="";
	do {
		System.out.println("Desea salir de la aplicacion (S/N)");
		respuesta=sc.nextLine();
		
	}while (!("SN".contains(respuesta) || "sn".contains(respuesta)) 
			|| respuesta.lenght()!=1);*/
	private static final String MENU_PRINCIPAL="Menú para crear notas (4 para Salir)\n"
			+ "1. Crear nota \n"
			+ "2. Crear nota alarma \n"
			+ "3. Modificar nota \n"
			+ "4. Ordenar nota \n"
			+ "5. Ordenar nota \n"
			+ "6. Salir \n";
	private static void imprimirMenuPrincipal() {
		System.out.println(MENU_PRINCIPAL);
	}
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		/*Bloc[] b1 = new Bloc[3];
		
		for (int i=0; i<b1.length;i++) {
			crearNota();
			
			
		}*/
		
		
		
		imprimirMenuPrincipal();
		int opcion= Integer.valueOf(sc.nextLine());
		Bloc bloc1 = new Bloc();
		boolean salir=false;
		while (salir==false) {
			
			if (opcion==1) {
				
				Notas n = new Notas();
				n = crearNota();
				bloc1.addNota(n);
				
	
			}else if (opcion==2) {
				crearNotaAlarma();
			}else if (opcion==3) {
				System.out.println("Introduce el numero de nota que deseas modificar");
				int numNotaModificar=Integer.valueOf(sc.nextLine());
				System.out.println("Introduce el texto que deseas modificar");
				String textoModificado=sc.nextLine();
				bloc1.updateNota(numNotaModificar, textoModificado);
			} else if (opcion==4) {
				Notas[] notasOrdenadas = bloc1.ordenaBloc();
				for (int i=0;i<notasOrdenadas.length;i++) {
					System.out.println(notasOrdenadas[i]);
				}
				
			} else if (opcion==5) {
				System.out.println("Introduzca el numero");
				int numNota=Integer.valueOf(sc.nextLine());
				System.out.println(bloc1.getNota(numNota));
				
			}else if (opcion==6) {
				salir=true;
			}
			imprimirMenuPrincipal();
			opcion= Integer.valueOf(sc.nextLine());
		}
	}
		
	
		
		
		
		
	
	
	
	/*	
	//Notas n1 = new Notas(null);
	Notas n4 = new Notas("Hola", 2);
	Notas n5 = new Notas ("Hola", 2);
	//Notas n2 = new Notas("    ");
	NotaAlarma na1= new NotaAlarma("Hola", LocalDateTime.of(2022, 03, 11, 13, 0), false);
	na1.activate();
	//Notas n3 = new Notas("Hola me");
	Bloc bc1 = new Bloc("Bloc 1");
	Bloc bc2 = new Bloc("Bloc 2");
	
	bc1.desactiva(12);
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
	*/
	
	
	private static NotaAlarma crearNotaAlarma() {
		System.out.println("Introduzca el texto");
		String texto=sc.nextLine();
		

		
		System.out.println("Introduzca el dia para programar su nota alarma");
		int dia = Integer.valueOf(sc.nextLine());
		System.out.println("Introduzca el mes para programar su nota alarma");
		int mes = Integer.valueOf(sc.nextLine());
		System.out.println("Introduzca el año para programar su nota alarma");
		int year = Integer.valueOf(sc.nextLine());
		
		System.out.println("Introduzca la hora para programar su nota alarma");
		int hour = Integer.valueOf(sc.nextLine());
		System.out.println("Introduzca los minutos para programar su nota alarma");
		int min = Integer.valueOf(sc.nextLine());
		System.out.println("Introduzca los segundos para programar su nota alarma");
		int sec = Integer.valueOf(sc.nextLine());

		LocalDateTime fecha = LocalDateTime.of(year, mes, dia, hour, min, sec);
		NotaAlarma NA = new NotaAlarma(texto, fecha, true);
		return NA;
	}
	
	public static Notas crearNota() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el texto para la nota");
		String texto = String.valueOf(sc.nextLine());
		
		return new Notas(texto);
	}
}
