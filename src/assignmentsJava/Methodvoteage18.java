package assignmentsJava;

public class Methodvoteage18 {
	
	public void votingrights(int age) {
		
		if (age>=18) {
			System.out.println("Person is allowed to vote");
		}
		
		else {
			System.out.println("Person is not eligible to vote because he/she is less than 18");
		}
	}

	public static void main(String[] args) {
		
		Methodvoteage18 vote = new Methodvoteage18();
		
		vote.votingrights(9);
		



	}

}
