package Herencias.java;

import java.util.Scanner;

public class GestionVehiculosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		/*Terrestre[] garaje = new Terrestre[10];
		 * Vehiculo[] almacen;
		System.out.println("1. Terrestre");
		System.out.println("2. Aereo");
		
		int opcionTipoAlmacen= Integer.valueOf(sc.nextLine());
		
		if (opcionTipoAlmacen==1) {
			almacen = new Terrestre[10];
		}else if (opcionTipoAlmacen==2) {
			almacen = new Aereo[10];
		}
		
		Coche ferrari = new Coche();
		Coche panda = new Coche();
		Moto jogrr = new Moto();
		Moto dingo = new Moto();
		
		garaje[0]= ferrari;
		garaje[1]=panda;
		garaje[2]=jogrr;
		garaje[3]=dingo;
		
		Aereo[] aerodromo = new Aereo[5];
		Avion Airbus = new Avion();
		Avion Cargobob = new Avion();
		Dron droncito = new Dron();
		Dron dronce = new Dron();
		
		aerodromo[0]=Airbus;
		aerodromo[1]=Cargobob;
		aerodromo[2]=droncito;
		aerodromo[3]=dronce;
		
		System.out.println(aerodromo[0]);
		System.out.println(aerodromo[3]);*/
		Moto m1 = new Moto();
		System.out.println(m1.numeroRuedas());
		System.out.println(m1.numAlas());
		
		Coche c1 = new Coche();
		System.out.println(c1.numeroRuedas());
		System.out.println(c1.numAlas());
		
		Avion av1 = new Avion();
		System.out.println(av1.numAlas());
		System.out.println(av1.numeroRuedas());
		
		Dron d1 = new Dron();
		System.out.println(d1.numAlas());
		System.out.println(d1.numeroRuedas());
		
		boolean salir=false;
		while(salir==false) { 
		Vehiculo[] GarajeGlobal = new Vehiculo[10];
		System.out.println("Elige lo que desea introducir:");
		System.out.println("1. Terrestre");
		System.out.println("2. Aereo");
		System.out.println("3. Salir");
		int option=Integer.valueOf(sc.nextLine());
		
		
		if (option==1) {
			System.out.println("Que desea añadir:");
			System.out.println("1. Coche");
			System.out.println("2. Moto");
			int option2=Integer.valueOf(sc.nextLine());
				if (option2==1) {
					
					for (int i=0;i<GarajeGlobal.length;i++){
						System.out.println("Introduce el motor del coche:");
						GarajeGlobal[i] = new Coche(sc.nextLine());
					}
					 
				}else if (option2==1) {
					System.out.println("Introduce el motor de la moto:");
					for (int i=0;i<GarajeGlobal.length;i++){
						GarajeGlobal[i] = new Moto(sc.nextLine());
					}
		}else if (option==2) {
			System.out.println("Que desea añadir:");
			System.out.println("1. Avion");
			System.out.println("2. Dron");
		}int option3=Integer.valueOf(sc.nextLine());
			if (option3==1) {
				System.out.println("Introduce el motor del Avion:");
				for (int i=0;i<GarajeGlobal.length;i++) {
					GarajeGlobal[i] = new Avion(sc.nextLine());
				}
			}else if (option3==1) {
				for (int i=0;i<GarajeGlobal.length;i++) {
					System.out.println("Introduce el motor del Dron:");
					GarajeGlobal[i] = new Dron(sc.nextLine());
				}
		
		
			}else {
				salir=true;
			}
	}
		}
	}
}
