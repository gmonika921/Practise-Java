package interviewprg;

import java.util.Scanner;

public class Swap2numberusing3rdVar {

	public static void main(String[] args) {
		
		int temp;
		int x; //10
		int y; //20
		
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		
		System.out.println("Before swapping the number is\nx = " +x+ "\ny = " +y );
		
		temp = x; //10
		
		x = y; //20
		
		y = temp; //10
		
		System.out.println("After swapping the number is \nx = " +x+ "\ny  = " +y);

	}

}
