package interviewprg;

import java.util.Scanner;

public class Swap2NumWithout3rdVar {

	public static void main(String[] args) {
		
		int x; //10
		int y; //20
		
		System.out.println("Enter x and y ");
		
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		
		
		
		System.out.println("Before swapping the number is  \nx = " +x+  "\ny = " +y);
		
		x = x + y; // 10+20 =  30
		
		y = x - y; // 30 - 20 = 10
		
		x = x - y; // 30 - 10 = 20
		
		System.out.println("After swapping the number is  \nx = " +x+  "\ny = " +y);


	}

}
