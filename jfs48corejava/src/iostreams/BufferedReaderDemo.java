package iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {

		try (FileReader reader = new FileReader("output.txt");
        	BufferedReader br = new BufferedReader(reader);

		) {
			String line; 
			while((line = br.readLine())!=null) {
				System.out.println(line);
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
