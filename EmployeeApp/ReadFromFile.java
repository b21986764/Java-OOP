//import required classes and methods to read file
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFromFile {
	
	public static String[] readFile (String path) {
		
		try {
			//Creating an array of string with length of lines
			int i = 0;
			int length = Files.readAllLines(Paths.get(path)).size();
			String[] results = new String [length];
			//Adding lines to string array
			for (String line : Files.readAllLines(Paths.get(path))) {
				results[i++] = line;
				}
			return results;
		//Catch IOException if not found
		}catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
