package interviewprg;

import java.util.Scanner;


public class howtogetinputusingscannerPrg2 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name = in.nextLine();
		
		System.out.println("Name is " +name);
		
		System.out.println("Enter integer");
		
		int a = in.nextShort();
		
		System.out.println("Integer is " +a);
		
		System.out.println("Enter float");
		
		float y = in.nextFloat();
		
		System.out.println("Float is " +y);
		
		
		
		
		
		
	

	}

}
