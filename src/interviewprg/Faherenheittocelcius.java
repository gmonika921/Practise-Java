package interviewprg;

import java.util.Scanner;

public class Faherenheittocelcius {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter temp in Fahrenheit");
		
		float temp = in.nextFloat();
		 temp =( (temp - 32)* 5)/9 ;
		System.out.println("The conversion from f to c is " +temp);

	}

}
