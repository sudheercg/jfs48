package stringbuilder;

public class StringBuilderDemo {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Codegnan");
		
		sb.append("Hyderaad");
		
		sb.insert(5,"Java");
		
		sb.replace(6, 8, "Hel");
		
		sb.delete(2, 4);
		
		System.out.println(sb);
		
		
	}

}
