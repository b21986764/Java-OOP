
//Subclass Officer of superclass Personnel extends its methods 
public class Officer extends Personnel {
	//Additional private fields
	private static final int baseSalary = 2600;
	private int ssBenefits;
	private int overWorkSalary;
	
	//Constructor of Officer class with super keyword to inherit Personnel
	public Officer(String name,String surname, String position, double severancePay, String registerNumber, int yearOfStart,int [] workArr) {
		super(name,surname,position,severancePay,registerNumber,yearOfStart,workArr);

	}
	//Getters and setters for additional fields
	public int getOverWorkSalary() {
		return overWorkSalary;
	}
	public void setOverWorkSalary(int overWorkSalary) {
		this.overWorkSalary = overWorkSalary;
	}
	public int getSsBenefits() {
		return ssBenefits;
	}
	public void setSsBenefits(int ssBenefits) {
		this.ssBenefits = ssBenefits;
	}
	public static int getBasesalary() {
		return baseSalary;
	}
	//Public method to calculate Officer's salary and use it
	public double calculateSalary(int [] workArr) {
		
		int baseSalary = Academician.getBasesalary();
		int overWorkSalary = 0;
		int weekly;
		int ssBenefits = baseSalary*65/100;
		
		for (int hour : workArr) {
			
			if (hour<=50) {
				 weekly = (hour-40)*20;
			}else {
				 weekly = 10*20;
			}
			overWorkSalary+=weekly;
		}
		setOverWorkSalary(overWorkSalary);

		return  baseSalary + ssBenefits + getOverWorkSalary() + this.getSeverancePay() ;
	}
}
	


