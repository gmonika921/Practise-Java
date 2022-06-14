package assignmentsJava;

public class Stringmanipulation {

	public static void main(String[] args) {

		String s = "Welcome to Naveen Automation Labs ! ";
		
		System.out.println(s.charAt(1));
		System.out.println(s.indexOf('e'));
		System.out.println(s.indexOf('e', s.indexOf('e')+1));
		System.out.println(s.indexOf('e',(s.indexOf('e')+1+ s.indexOf('e')+1)));
		
		
	}
}
