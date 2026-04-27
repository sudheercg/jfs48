package iostreams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	// create a file
	// write text data to the file.

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("pledge.txt", false)) {
			// FileWriter fw = new FileWriter("pledge.txt");

			fw.write("India is my country");
			fw.write("\n");
			fw.write("I love my country");

			char[] charArray = { 'H', 'E', 'L', 'L', 'o' };
			fw.write("\n");
			fw.write(charArray);
			fw.flush();
			// fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
