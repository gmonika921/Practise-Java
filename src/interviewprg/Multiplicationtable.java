package interviewprg;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		
		int number, multiplier;
		
		System.out.println("Enter the number");
		
		Scanner sc = new Scanner(System.in);
		
		number = sc.nextInt();
		
		for (multiplier=1; multiplier<=10 ; multiplier++) {
			System.out.printf("%d * %d = %d" , number , multiplier , (number*multiplier));
			System.out.println();
		}
		

	}

}
