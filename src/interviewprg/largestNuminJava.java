package interviewprg;

import java.util.Scanner;

public class largestNuminJava {

	public static void main(String[] args) {

		int x, y, z;
		
		System.out.println("Enter three numbers to compare");
		
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
		if(x>y && x>z) {
			System.out.println("X is the greatest of all");
		}
		else if (y>x && y>z) {
			System.out.println("Y is the greatest of all");
		}
		
		else if(z>x && z>y) {
			System.out.println("Z is the greatest of all");
		}
		else {
			System.out.println("Numbers are not distinct");
		}
	}

}
