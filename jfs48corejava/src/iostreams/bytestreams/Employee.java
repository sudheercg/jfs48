package iostreams.bytestreams;

import java.io.Serializable;

public class Employee implements Serializable {
	
	int id;
	String name;
	int age; 
	transient String password; 
	
	public Employee(int id, String name, int age,String password) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.password=password;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", password=" + password + "]";
	}

	
	
	
	

}
