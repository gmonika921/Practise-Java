package exceptionhandling;

public class Throwkeyword {

	public static void main(String[] args) {

		try {
		throw new Exception ("My own exception");
	}
		
		catch (Exception e) {
			System.out.println("Throw new exception example is coming......");
			e.printStackTrace();
		}
		
		
		try {
			int r = 9/0;
		}
		
		catch (ArithmeticException e) {
			System.out.println("Trying if another try catch can fit in the same class");
			e.printStackTrace();
		}
		
		String Data = null;
		
		try {
		if (Data ==null) {
			throw new Exception ("DATA NOT FOUND EXCEPTION");
		}
		}
		
		catch (Exception e) {
			System.out.println("Null data exception is coming");
			e.printStackTrace();
		}
		
		finally {
			System.out.println("trying out finally block");
		}
		
		

}
}
