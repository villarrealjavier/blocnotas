package EJ_Backend.com.model;

import java.time.LocalDateTime;

public class WebDesigner extends Candidate implements Frontend{
	//CONSTRUCTOR 
	public WebDesigner(LocalDateTime dateOfBirth,LocalDateTime startDate,String dni,String name,String surname,ContractType ct) {
		super(dateOfBirth, startDate, dni, name,surname,ct);
	}
	
	public WebDesigner() {
		super();
	}
	
	//METHODS
	@Override
	public Double computeGrossSalary() {
		// TODO Auto-generated method stub
		return null;
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
