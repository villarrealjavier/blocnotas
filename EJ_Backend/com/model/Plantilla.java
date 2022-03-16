package EJ_Backend.com.model;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Plantilla {
	private Candidate[] trabajadores;
	public Plantilla() {
		int posicion=0;
		trabajadores = new Candidate[11];
		Candidate  c1 = new WebDesigner(LocalDateTime.now(), LocalDateTime.now(), "334455G", "Juliqui", "Gonzalez", ContractType.PARTIAL);
		c1.setCt(ContractType.PARTIAL);
		trabajadores[posicion++]=c1;
		
		Candidate  c2 = new WebDesigner(
				LocalDateTime.of(2023, 02, 02, 02, 02),
				LocalDateTime.of(2021, 02, 02, 02, 02), null, null, null, null);
		c2.setCt(ContractType.FULLTIME);
		trabajadores[posicion++]=c2;
		
		Candidate  c3 = new WebDesigner(
				LocalDateTime.of(2023, 02, 02, 02, 02),
				LocalDateTime.of(2020, 02, 02, 02, 02), null, null, null, null);
		c2.setCt(ContractType.FULLTIME);
		trabajadores[posicion++]=c3;
		
		Candidate d1 = new BackendProgrammer();
		d1.setCt(ContractType.PARTIAL);
		trabajadores[posicion++]=d1;
		
		Candidate d2 = new BackendProgrammer();
		d2.setCt(ContractType.PARTIAL);
		trabajadores[posicion++]=d2;
		
		Candidate d3 = new BackendProgrammer();
		d3.setCt(ContractType.FULLTIME);
		trabajadores[posicion++]=d3;
		
		Candidate d4 = new BackendProgrammer();
		d4.setCt(ContractType.FULLTIME);
		trabajadores[posicion++]=d4;
		
		Candidate d5 = new BackendProgrammer();
		d5.setCt(ContractType.FULLTIME);
		trabajadores[posicion++]=d5;
		
		Candidate d6 = new BackendProgrammer();
		d6.setCt(ContractType.FULLTIME);
		trabajadores[posicion++]=d6;
		
		Candidate fll1 = new FullStackDeveloper();
		fll1.setCt(ContractType.FULLTIME);
		trabajadores[posicion++]=fll1;
		
		Candidate fll2 = new FullStackDeveloper();
		fll2.setCt(ContractType.FULLTIME);
		trabajadores[posicion++]=fll2;
		
		
	}
	public Candidate[] getTrabajadores() {
		return trabajadores;
	}
	
	public Candidate[] ordenarPlantilla() {
		Candidate[] trabajadores2 = new Candidate[11];
		int posicion=0;
			for (int i=0;i<trabajadores.length;i++) {
				if (trabajadores[i]!=null) {
					trabajadores2[posicion++]=trabajadores[i];
				}
				
				
				
			}
			Arrays.sort(trabajadores2);
		return trabajadores2;
	}
	
	public void setTrabajadores(Candidate[] trabajadores) {
		this.trabajadores = trabajadores;
	}
	public String getInformacion (String dni) {
		String resultado="No hay coincidencias";
		for (int i=0;i<trabajadores.length; i++) {
			if (dni.equals(getTrabajadores()[i].getDni())){
				resultado = "Hemos encontrado una coincidencia: \n" + getTrabajadores()[i].toString();
			}
		}
		return resultado;
	}
	
	public String imprimirArrayOrdenado() {
		StringBuilder sb = new StringBuilder();
		
		
		int noNulos=0;
		for (int i=0;i<trabajadores.length;i++) {
			if (trabajadores[i]!=null) {
				noNulos++;
			}
		}
		
		Candidate[] trabajadores2 = new Candidate[noNulos];
		int contador=0;
		for (int i=0; i<trabajadores.length;i++) {
			if (trabajadores[i]!=null) {
				trabajadores2[contador++]=trabajadores[i];
			}
		}
		Arrays.sort(trabajadores2);
		
		for (int i=0;i<trabajadores.length;i++) {
			if (trabajadores2[i]!=null) {
				sb.append(trabajadores2[i]+"\n");
			}
		}
		
		
				
		return sb.toString();		
				
			
	}

}
