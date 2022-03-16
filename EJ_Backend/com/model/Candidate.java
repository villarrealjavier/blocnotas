package EJ_Backend.com.model;

import java.time.LocalDateTime;

public abstract class Candidate implements Comparable<Candidate>{
	private LocalDateTime dateOfBirth;
	private LocalDateTime startDate;
	private String dni;
	private String name;
	private String surname;
	private ContractType ct;
	private boolean inProject;
	
	//CONSTRUCTOR
	public Candidate() {
		
	}
	
	
	
	public Candidate(LocalDateTime dateOfBirth, LocalDateTime startDate, String dni, String name, String surname,
			ContractType ct) {
		super();
		this.dateOfBirth = dateOfBirth;
		this.startDate = startDate;
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.ct = ct;
		
	}



	//METHODS
	public abstract Double computeGrossSalary();
	
	
	
	
	
		
	
	
	//TO STRING
	@Override
	public String toString() {
		return "------------------------------------"+ "\n"
				+ "Candidato con fecha de Nacimiento: " + dateOfBirth + "\n"
				+ "Comenzó;" + startDate + "\n"
				+  "Dni:" + dni + "\n"
				+ "Nombre: " + name + "\n"
				+ "Apellido: " + surname + "\n"
				+ "Tipo de contrato: " + ct + "\n"
				+ ", inProject=" + inProject + "\n"
				+ "------------------------------------";
	}



	//GETTERS AND SETTERS
	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public ContractType getCt() {
		return ct;
	}

	public void setCt(ContractType ct) {
		this.ct = ct;
	}

	public boolean isInProject() {
		return inProject;
	}

	public void setInProject(boolean inProject) {
		this.inProject = inProject;
	}



	@Override
	public int compareTo(Candidate otro) {
		int resultado=0;
		if (otro!=null) {
			if(this.startDate!=null && otro.startDate!=null && this.startDate.isBefore(otro.startDate)) {
				resultado=-1;
			
			}else {
				resultado=1;
			}
		}
		
		return resultado;
	}
}
