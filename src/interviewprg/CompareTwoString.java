package interviewprg;

import java.util.Scanner;

public class CompareTwoString {

	public static void main(String[] args) {
		
		String s1, s2;
		
		System.out.println("Enter the string to compare");
		
		Scanner in = new Scanner(System.in);
		
		s1 = in.nextLine();
		s2 = in.nextLine();
		
		if(s1.compareTo(s2)>0) {
			System.out.println("First string is greater than second :" +s1);
		}
			else if (s1.compareTo(s2)<0) 
		{
				System.out.println("Second String is greater than first :" +s2);
			}
			
			else {
				System.out.println("Both the strings are equal");
				
			}
		}
		

	}


