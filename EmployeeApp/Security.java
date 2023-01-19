
//Subclass Security of superclass Personnel extends its methods 
public class Security extends Personnel {
	
	//Additional fields to Personnel class that Security have
	private static final int transMoney = 5;
	private static final int foodMoney = 10;
	

	//Constructor of Security class with super keyword to inherit Personnel
	public Security(String name,String surname, String position, double severancePay, String registerNumber, int yearOfStart,int [] workArr) {
		super(name,surname,position,severancePay,registerNumber,yearOfStart,workArr);
		
	}
	//Getters and setters for additional fields
	public static int getTransmoney() {
		return transMoney;
	}

	public static int getFoodmoney() {
		return foodMoney;
	}

	//Public method to calculate Security's salary and use it
	public double calculateSalary(int [] workArr) {
		double allMonth = 0;
		int weekly = 0;
		for (int hour : workArr) {
			
			if (hour < 30) {
				weekly = 0;
			}else if(30 <= hour && hour<= 54) {
				weekly = hour * 10 + (getTransmoney() + getFoodmoney())*6 ;
				
			}else {
				weekly = 54*10 + (getTransmoney() + getFoodmoney())*6 ;
				
			}
			allMonth += weekly;
		}
		
		return allMonth + this.getSeverancePay() ;
		
	}
}
