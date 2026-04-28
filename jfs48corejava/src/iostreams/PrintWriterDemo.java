package iostreams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	
	public static void main(String[] args) {
		try(PrintWriter pw = new PrintWriter(new FileWriter("pw.txt"))){
			
			   pw.print("Hello ");
			   pw.print("Codegnan");
			   
			   pw.println(100);
			   pw.println(true);
			   
			   pw.printf("Course: %s, Duration: %d",	 "Java",100);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	

}
