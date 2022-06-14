package assignmentsJava;

public class Methodsumoftwonumbers {
	
	public int add(int num1, int num2) {
		
		System.out.println("Sum of two number is");
		
		int z = num1+num2;
		
		return z;
		
	}

	public static void main(String[] args) {
		
		Methodsumoftwonumbers msum = new Methodsumoftwonumbers();
		
		int sum = msum.add(100, 800);
		
		
		System.out.println(sum);
		



	}

}
