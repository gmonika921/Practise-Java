package interviewprg;

import java.util.Scanner;

public class NestedifelsewithPassandGrade {

	public static void main(String[] args) {
		
		int passingmarks = 40;
		int marksobtained;
		char Grade;
		
		System.out.println("Enter the marks");
		
		Scanner in = new Scanner(System.in);
		
		marksobtained = in.nextInt();
		
		if(marksobtained>=passingmarks) {
			if(marksobtained>=90) {
				System.out.println("you pass the exam with grade A :" +marksobtained);
			}
			
			else if(marksobtained>=75) {
				System.out.println("you pass the exam with grade B :" +marksobtained);
			}
			
			else if(marksobtained>=50){
				System.out.println("you pass the exam with grade C :" +marksobtained);
			}
			
			else {
				System.out.println("you pass the exam with grade D :" +marksobtained);
			}
		}
		
		else {
			System.out.println("fail");
		}
		

	}

}
