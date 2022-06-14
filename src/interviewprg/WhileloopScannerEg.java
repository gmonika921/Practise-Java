package interviewprg;

import java.util.Scanner;

public class WhileloopScannerEg {

	public static void main(String[] args) {
		
		int n;
		Scanner in = new Scanner(System.in);
		
		while((n=in.nextInt()) != 0) {
			System.out.println("You entered " +n);
			System.out.println("Enter an integer");
		}
		System.out.println("Out of loop");

	}

}
