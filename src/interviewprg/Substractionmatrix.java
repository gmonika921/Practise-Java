package interviewprg;

import java.util.Arrays;
import java.util.Scanner;

public class Substractionmatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter the number of rows");
		
		int rows = sc.nextInt();
		
		System.out.println("please enter the number of columns");
		
		int cols = sc.nextInt();
		
//		2D array
		
		int matrix1[][] = new int[rows][cols];
		int matrix2[][] = new int[rows][cols];
		int subtract[][] = new int[rows][cols];
		
		System.out.println("please enter the matrix1 data");
		
		for (int i = 0; i<rows; i++) {
			for (int j =0; j<cols; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("please enter the matrix2 data");
		
		for (int i = 0; i<cols ; i++) {
			for (int j = 0; j<cols ; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		
//		print matrix
		
		System.out.println("enter the matrix1 data");
		
		for (int[] e: matrix1) {
			System.out.println(Arrays.toString(e));
		}
		
		System.out.println("enter the matrix2 data");
		
		for (int[] e: matrix2) {
			System.out.println(Arrays.toString(e));
		}
		
		
		System.out.println("The sum of two matrices is");
		
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols ; j++) {
				subtract[i][j] = matrix1[i][j] - matrix2 [i][j];
				System.out.print(subtract[i][j] +" ");
			}
			System.out.println();
		}
		

	}

}
