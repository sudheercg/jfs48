package iostreams.bytestreams;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		
		Employee employee = new Employee(100,"Raj",25,"Secret");
		
		//Create FileOutputStream (fos)  object
		//Pass the fos object to BufferedOutputStream(bos)
        //pass the bos to ObjectOutputStream constructor
		
		
		try(FileOutputStream fos = new FileOutputStream("employee.ser");
		    BufferedOutputStream bos = new BufferedOutputStream(fos);	
			ObjectOutputStream oos = new ObjectOutputStream(bos))
		{
			
			oos.writeObject(employee);
			System.out.println("Employee object serialized successfully");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
