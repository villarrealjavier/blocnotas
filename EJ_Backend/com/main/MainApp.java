package EJ_Backend.com.main;

import EJ_Backend.com.model.Plantilla;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plantilla plantilla = new Plantilla();
		/*System.out.println("Hola");
		
		
		BackendProgrammer backend1 = new BackendProgrammer();
		BackendProgrammer backend2 = new BackendProgrammer();
		
		
		LocalDateTime fechaAnterior = LocalDateTime.of(2002, 02, 02, 02, 02);
		LocalDateTime fechaPosterior = LocalDateTime.of(2003, 03, 01, 01, 01);
		
		backend1.setStartDate(fechaAnterior);
		backend2.setStartDate(fechaPosterior);
		
		System.out.println(backend1.compareTo(backend2));*/
		
		//System.out.println(plantilla.getInformacion("334455G"));
		//System.out.println(plantilla.ordenarPlantilla());
		System.out.println(plantilla.imprimirArrayOrdenado());
		//System.out.println(consultarInformacion("334454G",plantilla));
		
	}
	/*public static String consultarInformacion(String dni, Plantilla plantilla) {
		String resultado=" No contiene el dni";
		Candidate paco=null;
		for (int i=0; i < plantilla.getTamano(); i++) {
			if (dni.equals(plantilla.getTrabajadores()[i].getDni())){
				resultado="Contiene el dni";
				paco=plantilla.getTrabajadores()[i];
			}
		}
		
		return "El candidato es "+ paco+ "." + resultado;
	}*/
	

}
