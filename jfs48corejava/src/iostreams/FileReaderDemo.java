package iostreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {

		try (FileReader reader = new FileReader("pledge.txt")) {

			int character;

			System.out.println("Reading the file.....");

			while ((character = reader.read()) != -1) {

				System.out.print((char) character);

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
