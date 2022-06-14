package interviewprg;

import java.util.Scanner;

public class Add2Num {

	public static void main(String[] args) {
		
	int a ;
	int b ;
	int c ;
	
	System.out.println("Enter 2 numbers");
	
	Scanner in = new Scanner(System.in);
	
	a = in.nextInt();
	b = in.nextInt();
	
	c = a+b;
	
	System.out.println("The sum of two number is :" +c);
	
	

	}

}
