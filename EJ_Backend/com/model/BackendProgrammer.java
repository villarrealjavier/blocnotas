package EJ_Backend.com.model;

import java.time.LocalDateTime;

public class BackendProgrammer extends Candidate implements Backend {
	//CONSTRUCTOR
	public BackendProgrammer(LocalDateTime dateOfBirth,LocalDateTime startDate,String dni,String name,String surname,ContractType ct) {
		super(dateOfBirth, startDate, dni, name,surname,ct);
	}
	
	public BackendProgrammer() {
		super();
	}
	
	//METHODS
	@Override
	public Double createWebAPIandDBConnectionCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double maintenanceCost() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Double computeGrossSalary() {
		// TODO Auto-generated method stub
		return null;
	}

}
