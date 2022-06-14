package inteheritanceconcept;

public class Student extends College {
	
	public void games() {
		System.out.println("games");
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.accounts();
		s1.games();
		
		College c1 = new Student(); // Top/up casting
		c1.chemistry();
		
//		Student s2 = (Student) new College(); Down casting is not possible in java
		
		



	}

}
