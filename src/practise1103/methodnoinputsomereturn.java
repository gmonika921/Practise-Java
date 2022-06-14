package practise1103;

public class methodnoinputsomereturn {
	
	public int addition(int a, int b) {
		System.out.println("Addition of two number is " );
		
		int z = a+b;
		return z;
		
		
	}

	public static void main(String[] args) {
		
		methodnoinputsomereturn m1 = new methodnoinputsomereturn();
		int y = m1.addition(200, 900);
		System.out.println(y);
		
		

	}

}
