

//Subclass PartTime of superclass Employee extends its methods 
public class PartTime extends Employee {
	//Constructor of PartTime class with super keyword to inherit Employee
	public PartTime(String name,String surname, String position, double severancePay, String registerNumber, int yearOfStart,int [] workArr) {
		super(name,surname,position,severancePay,registerNumber,yearOfStart,workArr);
	}
	//Public method to calculate PartTime's salary and use it
	public double calculateSalary(int [] workArr) {
		
		int weekly;
		double allMonth = 0;
		for (int hour : workArr) {
			
			if (hour<10) {
				weekly = 0;
			}else if(10<= hour && hour <= 20) {
				weekly = hour*18;
			}else {
				weekly = 20*18;
			}
			allMonth += weekly;
		}
		
		return  allMonth + this.getSeverancePay();
		
	}
}
