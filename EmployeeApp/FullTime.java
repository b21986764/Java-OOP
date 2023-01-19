

//Subclass FullTime of superclass Employee extends its methods 

public class FullTime extends Employee {

	//Constructor for FullTime class with super keyword to inherit Employee
	public FullTime(String name,String surname, String position, double severancePay, String registerNumber, int yearOfStart,int [] workArr) {
		super(name,surname,position,severancePay,registerNumber,yearOfStart,workArr);
		
	}

}
