package assignmentsJava;

public class Productoftwonumber {
	
	public int multiply (int n1, int n2) {
		
		System.out.println("Multiplication of two number is ");
		
		int m = n1*n2;
		return m;
	}
	
	

	public static void main(String[] args) {
		
		Productoftwonumber mul = new Productoftwonumber();
		
		int multiply = mul.multiply(22, 2);
		
		System.out.println(multiply);
		

	}

}
