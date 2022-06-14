package inteheritanceconcept;

public class College extends University{
	
	public void biology () {
		System.out.println("biology");
	}
	
	public void accounts() {
		System.out.println("accounts");
	}

	public static void main(String[] args) {
		
		College c3 = new College();
		c3.chemistry();
		
		University u = new College(); // Top/up casting
		u.english();



	}

}
