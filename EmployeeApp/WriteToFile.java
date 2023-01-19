
//importing class and methods for createFile
import java.io.FileOutputStream;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteToFile {
	//Creating output for each object taking object and their salaries as parameters
	//Sending to createFile with registernumber and found output
	public static void writeRa(ResearchAssistants ra,double salary) {
		
		String output = "Name: " + ra.getName()+"\n"+
				"Surname : "+ra.getSurname()+"\n"+
				"Registration Number : "+ra.getRegisterNumber()+"\n"+
				"Position : "+ra.getPosition()+"\n"+
				"Year of Start : "+ra.getYearOfStart()+"\n"+
				"Total Salary : "+String.format("%.2f", salary) + " TL";
				
		createFile(ra.getRegisterNumber() ,output);
		
	}
	public static void writeSec(Security sec,double salary) {
		String output = "Name: " + sec.getName()+"\n"+
				"Surname : "+sec.getSurname()+"\n"+
				"Registration Number : "+sec.getRegisterNumber()+"\n"+
				"Position : "+sec.getPosition()+"\n"+
				"Year of Start : "+sec.getYearOfStart()+"\n"+
				"Total Salary : "+String.format("%.2f", salary) + " TL";

		createFile(sec.getRegisterNumber() ,output);
		
	}
	public static void writeFacMem(FacultyMembers facMem,double salary) {
		String output = "Name: " + facMem.getName()+"\n"+
				"Surname : "+facMem.getSurname()+"\n"+
				"Registration Number : "+facMem.getRegisterNumber()+"\n"+
				"Position : "+facMem.getPosition()+"\n"+
				"Year of Start : "+facMem.getYearOfStart()+"\n"+
				"Total Salary : "+String.format("%.2f", salary) + " TL";

		createFile(facMem.getRegisterNumber() ,output);

		
	}
	public static void writeOff(Officer off ,double salary) {
		String output = "Name: " + off.getName()+"\n"+
				"Surname : "+off.getSurname()+"\n"+
				"Registration Number : "+off.getRegisterNumber()+"\n"+
				"Position : "+off.getPosition()+"\n"+
				"Year of Start : "+off.getYearOfStart()+"\n"+
				"Total Salary : "+String.format("%.2f", salary) + " TL";
		
		createFile(off.getRegisterNumber() ,output);
		
		
	}
	public static void writePartTime(PartTime partTime ,double salary) {
		String output = "Name: " + partTime.getName()+"\n"+
				"Surname : "+partTime.getSurname()+"\n"+
				"Registration Number : "+partTime.getRegisterNumber()+"\n"+
				"Position : "+partTime.getPosition()+"\n"+
				"Year of Start : "+partTime.getYearOfStart()+"\n"+
				"Total Salary : "+String.format("%.2f", salary) + " TL";

		createFile(partTime.getRegisterNumber() ,output);
		
	}
	public static void writeWorker(Worker worker ,double salary) {
		String output = "Name: " + worker.getName()+"\n"+
				"Surname : "+worker.getSurname()+"\n"+
				"Registration Number : "+worker.getRegisterNumber()+"\n"+
				"Position : "+worker.getPosition()+"\n"+
				"Year of Start : "+worker.getYearOfStart()+"\n"+
				"Total Salary : "+String.format("%.2f", salary) + " TL";

		createFile(worker.getRegisterNumber() ,output);

		
	}
	public static void writeChief(Chief chief ,double salary) {
		String output = "Name: " + chief.getName()+"\n"+
				"Surname : "+chief.getSurname()+"\n"+
				"Registration Number : "+chief.getRegisterNumber()+"\n"+
				"Position : "+chief.getPosition()+"\n"+
				"Year of Start : "+chief.getYearOfStart()+"\n"+
				"Total Salary : "+String.format("%.2f", salary) + " TL";

		createFile(chief.getRegisterNumber() ,output);
		
	}
	
	
	public static void createFile(String registerNumber ,String output) {
		//Try creating path and file if not catch IOException
		try {
            
            File statText = new File(registerNumber + ".txt");
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);    
            Writer w = new BufferedWriter(osw);
            w.write(output);
            w.close();
        } catch (IOException e) {
            System.err.println("Error");
        }
	}
}
