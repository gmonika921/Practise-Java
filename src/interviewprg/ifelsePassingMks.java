package interviewprg;

import java.util.Scanner;

public class ifelsePassingMks {

	public static void main(String[] args) {
		
		int passingmarks = 40;
		int marksobtained;
		
		System.out.println("Enter the marks");
		
		Scanner in = new Scanner(System.in);
		
		marksobtained = in.nextInt();
		
		if(marksobtained >= passingmarks) {
			System.out.println("you passed the exam :" +marksobtained);
		}
		
		else {
			System.out.println("fail");
		}

	}

}
