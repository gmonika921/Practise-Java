package interviewprg;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows");

		int rows = sc.nextInt();

		System.out.println("Enter the number of columns");

		int cols = sc.nextInt();
		
		//2D array - created the space for matrix to enter the values
		int data[][] = new int[rows][cols];
		
		System.out.println("Please enter the matrix data");
		
		for (int i = 0; i<rows ; i++) {
			for (int j =0; j<cols; j++) {
				data [i][j] = sc.nextInt();
			}
				
		}
		
		//Print the matrix
		
//		for (int i = 0; i<rows ; i++) {
//			for (int j = 0; j< cols; j++) {
//				System.out.print(data[i][j] + " ");
//			}
//			System.out.println();
//		}

		for (int[] e : data) {
			System.out.println(Arrays.toString(e));
		}
		
//		System.out.println(Arrays.deepToString(data));
		
		
		
		

	}

}
