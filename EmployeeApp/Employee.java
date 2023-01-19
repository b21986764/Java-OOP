
//Subclass Employee of superclass Personnel extends its methods 
public class Employee extends Personnel {
	
	//Constructor of Employee class with super keyword to inherit Personnel
	public Employee(String name,String surname, String position, double severancePay, String registerNumber, int yearOfStart,int [] workArr) {
		super(name,surname,position,severancePay,registerNumber,yearOfStart,workArr);
	}
}
