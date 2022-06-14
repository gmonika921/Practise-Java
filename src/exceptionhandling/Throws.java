package exceptionhandling;

public class Throws {
	
	public void m1() {
		
		m2();
		
	}
	
	public void m2() {
		try {  m3();
	}
		
		catch (ArithmeticException e) {
			System.out.println("m3 is throwing exception and i am handling it in m2 method.... exception is coming");
			e.printStackTrace();
		}
	}
	
	public void m3() throws ArithmeticException {
		
		int a = 9/0;
		
	}

	public static void main(String[] args) {
		
		Throws obj = new Throws();
		obj.m1();
		
		System.out.println("bye");

	}

}
