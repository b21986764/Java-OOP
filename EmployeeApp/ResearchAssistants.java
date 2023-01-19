

//ResearchAssistants subclass of Academician class extends its methods

public class ResearchAssistants extends Academician {
	
	//Constructor for ResearchAssistants subclass with super keyword to inherit
	public ResearchAssistants(String name,String surname, String position, double severancePay, String registerNumber, int yearOfStart , int [] workArr) {
		super(name,surname,position,severancePay,registerNumber,yearOfStart,workArr);
	}
	
	//Public method to calculate ResearchAssistants' salary and use it
	public double calculateSalary(int [] workArr) {
		
		int baseSalary = Academician.getBasesalary();
		
		int ssBenefits = baseSalary*105/100;
		
		return baseSalary + ssBenefits + this.getSeverancePay() ;
		
	}
}


