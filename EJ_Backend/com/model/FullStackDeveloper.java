package EJ_Backend.com.model;

import java.time.LocalDateTime;

public class FullStackDeveloper extends Candidate implements Backend,Frontend{
	//CONSTRUCTOR
	public FullStackDeveloper(LocalDateTime dateOfBirth,LocalDateTime startDate,String dni,String name,String surname,ContractType ct) {
		super(dateOfBirth, startDate, dni, name,surname,ct);
	}
	public FullStackDeveloper() {
		super();
	}
	
	
	//METHODS
	@Override
	public Double createWebAPIandDBConnectionCost() {
		
		return 0.0;
	}
	@Override
	public Double computeGrossSalary() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Double maintenanceCost() {
		
		return 0.0;
	}


	@Override
	public Double computeWebDesignCost() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Double computeFEMaintenanceCost() {
		// TODO Auto-generated method stub
		return null;
	}
		
}
