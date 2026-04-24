package java8enhancements.constructorreferences;

public class Student {
	
	String name;
	
	Student(String name){
		this.name=name;
	}

	void  display() {
		System.out.println("Name "+name);
	}
	
	
	public static void main(String[] args) {
		//Lambda expression
		StudentFactory factory = name->new Student(name);
		Student s1 = factory.createStudent("Rohan");
		s1.display();
		
		//Constructor Reference
		StudentFactory factory1 = Student :: new; 
		Student s2= factory1.createStudent("Sushma");
		s2.display();
		
		
	}
}
