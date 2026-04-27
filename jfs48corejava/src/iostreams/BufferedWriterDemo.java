package iostreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	
	public static void main(String[] args) {
		
	 try(
			FileWriter writer = new FileWriter("output.txt");
			 BufferedWriter bw = new BufferedWriter(writer); 
	){
		 
		 bw.write("Hello Codegnan");
		 bw.newLine();
		 bw.write("Buffered Writer example");
		 bw.flush();
		 
		 
	 } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		
	}

}
