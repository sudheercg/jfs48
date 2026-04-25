package iostreams;

import java.io.File;
import java.io.IOException;

public class IODemo {

	// create a directory
	// create 4 text files in that directory
	// list out the names of all the files in the directory

	public static void main(String[] args) throws IOException {

		File dir = new File("mynotes");

		if (!dir.exists()) {
			if (dir.mkdir()) {
				System.out.println("directory created: " + dir.getAbsolutePath());
			} else {
				System.out.println("Failed to create a directory");
			}
		} else {
			System.out.println("Directory already exists!" + dir.getAbsolutePath());
		}

		File file1 = new File(dir, "File1.txt");
		File file2 = new File(dir, "File2.txt");
		File file3 = new File(dir, "File3.txt");
		File file4 = new File(dir, "File4.txt");

		System.out.println("file1.txt created" + file1.createNewFile());
		System.out.println("file1.txt created" + file2.createNewFile());
		System.out.println("file1.txt created" + file3.createNewFile());
		System.out.println("file1.txt created" + file4.createNewFile());

		String[] fileNames = dir.list();

		if (fileNames == null || fileNames.length == 0) {
			System.out.println("Directory is empty");
		} else {
			System.out.println("Contents of the directory");
			for (String fileName : fileNames) {
				System.out.println(fileName);
			}
		}

	}
}