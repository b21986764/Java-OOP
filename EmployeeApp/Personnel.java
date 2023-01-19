

public class Personnel {
	//Fields of top super class Personnnel to later use them also in subclasses
	private String name;
	private String position;
	private double severancePay;
	private String registerNumber;
	private int yearOfStart;
	private String surname;
	private int [] workArr;
	
	
	//Constructor of superclass Personnel with fields
	public Personnel(String name,String surname, String position, double severancePay, String registerNumber, int yearOfStart,int [] workArr) {
		
		this.name = name;
		this.position = position;
		this.severancePay = severancePay;
		this.registerNumber = registerNumber;
		this.yearOfStart = yearOfStart;
		this.surname = surname;

		this.workArr = workArr;
	}
	
	//Getters and setters for superclass Personnel to access and modify private fields
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}

	public int getYearOfStart() {
		return yearOfStart;
	}

	public void setYearOfStart(int yearOfStart) {
		this.yearOfStart = yearOfStart;
	}

	public void setSeverancePay(double severancePay) {
		this.severancePay = severancePay;
	}
	
	public double getSeverancePay() {
		
		return this.severancePay ;
	}

}
