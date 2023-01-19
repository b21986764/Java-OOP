//import lines to read file

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReadFromFile {
	
	public static String[] readFile (String path) {
		//Finding size, creating array and adding lines to array
		try {
			int i = 0;
			int length = Files.readAllLines(Paths.get(  path)).size();
			String[] results = new String [length];
			
			for (String line : Files.readAllLines(Paths.get(path))) {
				results[i++] = line;
				}
			return results;
		//Exception, if line not found	
		}catch (IOException e) {
			e.printStackTrace();
			return null;
		}
			
	}


}
