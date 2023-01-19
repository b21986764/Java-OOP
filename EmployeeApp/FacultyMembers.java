
//FacultyMembers subclass of Academician class extends its methods
public class FacultyMembers extends Academician {
	
	//Faculty members have additional course fee
	private int addCourseFee;
	
	//Constructor for FacultyMembers with super keyword to inherit Academician
	public FacultyMembers(String name,String surname, String position, double severancePay, String registerNumber, int yearOfStart,int [] workArr) {
		super(name,surname,position,severancePay,registerNumber,yearOfStart,workArr);
		
	}

	//Getters and setters for additional fields
	public int getAddCourseFee() {
		return addCourseFee;
	}
	public void setAddCourseFee(int addCourseFee) {
		this.addCourseFee = addCourseFee;
	}

	//Public method to calculate FacultyMembers' salary and use it
	public double calculateSalary(int [] workArr) {
		int baseSalary = Academician.getBasesalary();
		int addCourseFee = 0;
		int weekly;
		int ssBenefits = baseSalary*135/100;
		for (int hour : workArr) {
			
			if (hour<=48) {
				 weekly = (hour-40)*20;
			}else {
				 weekly = 8*20;
			}
			addCourseFee+=weekly;
		}
		setAddCourseFee(addCourseFee);

		return baseSalary + ssBenefits + getAddCourseFee() + this.getSeverancePay() ;
		
		
	}

}
