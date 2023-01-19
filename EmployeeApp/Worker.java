
//Worker subclass of FullTime class extends its methods
public class Worker extends FullTime {
	
	//Constructor of Worker class with super keyword to inherit FullTime
	public Worker(String name,String surname, String position, double severancePay, String registerNumber, int yearOfStart,int [] workArr) {
		super(name,surname,position,severancePay,registerNumber,yearOfStart,workArr);
		
	}
	//Public method to calculate Worker's salary and use it
	public double calculateSalary(int [] workArr) {
		
		int weekly = 0;
		double allMonth = 0;
		
		for (int hour : workArr) {
			
			if (hour <= 50) {
				weekly = 5*105 + (hour - 40)*11;
			}else {
				weekly = 5*105 + 10*11;
			}
			allMonth += weekly;
		}
		
		return  allMonth + this .getSeverancePay();
		
	}
		
}
