package interviewprg;

import java.util.Scanner;

public class FactorialACFact {

	public static void main(String[] args) {

		int a, c, fact;
		fact = 1;

		System.out.println("Enter the number to find out the factorial ");

		Scanner in = new Scanner(System.in);

		a = in.nextInt();

		if (a < 0) {
			System.out.println("Number should be non-negative");
		} else {
			for (c = 1; c <= a; c++) {
				fact = fact * c;
			}
				System.out.println("The factorial of " +a + " is " +fact);
			}
		
	}

}
