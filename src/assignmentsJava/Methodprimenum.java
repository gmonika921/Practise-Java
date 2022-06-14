package assignmentsJava;

public class Methodprimenum {
	
	public void primnum(int num2) {
		
		if (num2%2!=0) {
			System.out.println("It's a prime number" +" " +num2);
		}
		
		else {
			
			System.out.println("It's not a prime number" +" " +num2);
		}
		
	}

	public static void main(String[] args) {
		
		Methodprimenum prime = new Methodprimenum();
		
		prime.primnum(11);
		
	}

}
