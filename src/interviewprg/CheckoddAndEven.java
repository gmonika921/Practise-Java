package interviewprg;

import java.util.Scanner;

public class CheckoddAndEven {

	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Enter the number");
		
		Scanner in = new Scanner(System.in);
		
		num = in.nextInt();
		
		if (num  ==0) {
			System.out.println("It's a zero and it can't be define as even or odd");
			
		}
		
		else if (num%2 == 0) {
			System.out.println("The number is an even number :" +num);
		}
		
		else {
			System.out.println("It's an odd number");
		}
		

	}

}
