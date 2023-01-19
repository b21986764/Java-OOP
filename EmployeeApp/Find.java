

public class Find {
	//Method to take personnel and monitoring strings and sending them to write file 
	public static void personnelFind(String[] personnelArr,String[] monitoringArr) {
		
		int j = personnelArr.length;
		//Taking personnel as name,surname,registernumber,position,yearofstart
		for ( int i = 0; i < j; i++) {
			
			String[] personnel = personnelArr[i].split("\t");
			
			String [] namesurname = personnel[0].split(" ");
			String name = namesurname[0];
			String surname = namesurname[1];
			String registerNumber = personnel[1];
			String position = personnel[2];
			int yearOfStart = Integer.parseInt(personnel[3]); 
			//Finding severancePay and saving each hour of weeks' work
			double severancePay = findSeverancePay(yearOfStart);
			
			int [] workArr = new int[4];
			String[] monitoring = monitoringArr[i].split("\t");
			for (int k = 0; k<4; k++) {
				workArr[k] = Integer.parseInt(monitoring[k+1]);
			}
			
			char pos = registerNumber.charAt(0);
			
			switch (pos) {
			//Creating objects with constructors and finding their salaries
			//Sending personnel and salaries to write files 
				case 'R' :
					ResearchAssistants ra = new ResearchAssistants(name,surname,position,severancePay,registerNumber,yearOfStart,workArr);
					double salary = ra.calculateSalary(workArr);
					WriteToFile.writeRa(ra, salary);
					
					break;
				case 'W' :
					Worker worker1 = new Worker(name,surname,position,severancePay,registerNumber,yearOfStart,workArr);
					double salary1 = worker1.calculateSalary(workArr);
					WriteToFile.writeWorker(worker1, salary1);
					break;
				case 'C' :
					Chief chief1 = new Chief(name,surname,position,severancePay,registerNumber,yearOfStart,workArr);
					double salary2 = chief1.calculateSalary(workArr);
					WriteToFile.writeChief(chief1, salary2);
					break;
				case 'P' :
					PartTime partTime1 = new PartTime(name,surname,position,severancePay,registerNumber,yearOfStart,workArr);
					double salary3 = partTime1.calculateSalary(workArr);
					WriteToFile.writePartTime(partTime1, salary3);
					break;
				case 'O' :
					Officer officer = new Officer(name,surname,position,severancePay,registerNumber,yearOfStart,workArr);
					double salary4 = officer.calculateSalary(workArr);
					WriteToFile.writeOff(officer, salary4);
					break;
					
				case 'S' :
					Security sec1 = new Security(name,surname,position,severancePay,registerNumber,yearOfStart,workArr);
					double salary5 = sec1.calculateSalary(workArr);
					WriteToFile.writeSec(sec1, salary5);
					break;
				case 'F' :
					FacultyMembers facMem1 = new FacultyMembers(name,surname,position,severancePay,registerNumber,yearOfStart,workArr);
					double salary6 = facMem1.calculateSalary(workArr);
					WriteToFile.writeFacMem(facMem1, salary6);
					break;
					
			}
			
		}

	}
	//Method to calculate severance pay of each personnel
	public static double findSeverancePay(int yearOfStart) {
		
		return (2020-yearOfStart)*20*0.8;
		
	}

}
