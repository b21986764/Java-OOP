

//Chief subclass of FullTime class extends its methods

public class Chief extends FullTime  {
	//Constructor for Chief with super keyword to inherit FullTime
	public Chief(String name,String surname, String position, double severancePay, String registerNumber, int yearOfStart,int [] workArr) {
		super(name,surname,position,severancePay,registerNumber,yearOfStart,workArr);
		
	}
	//Public method to calculate Chief's salary and use it
	public double calculateSalary(int [] workArr) {
		
		int weekly = 0;
		double allMonth = 0;
		
		for (int hour : workArr) {
			
			if (hour <= 48) {
				weekly = 5*125 + (hour - 40)*15;
			}else {
				weekly = 5*125 + 8*15;
			}
			allMonth += weekly;
		}
		
		return allMonth + this .getSeverancePay();
		
	}
}

