package iostreams;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
		//Create a file object
		File file  = new File("jfs48.txt");
		
		//creating a physical file
		file.createNewFile();
		
		System.out.println(file.exists());
		
		//to create a directory
		File dir = new File("mydirectory");
		
		//creating a physical directory
		dir.mkdir();
		
		System.out.println(file.isFile());
		
		System.out.println(dir.isDirectory());
		
		
		
		
	}
	
	
	

}
