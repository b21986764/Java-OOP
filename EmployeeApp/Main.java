

public class Main {

	public static void main(String[] args) {
		//Reading files as string arrays of lines 
		//Invoking personnelFind method with these strings
		Find.personnelFind(ReadFromFile.readFile(args[0]),ReadFromFile.readFile(args[1]));
	}

}
