package interviewprg;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int n, reverse;
		reverse = 0;
		
		System.out.println("Enter an integer to make it reverse ");
		
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		
		while (n!=0) {
			reverse = reverse*10 + n%10;// 0*10 + 1234%10 =4  4*10+3 =43 43*10+12%10 = 430+2=432  432*10+1%10 = 4321
			n = n/10; // 1234/10 = 123  123/10 =12  12/10=1  1/10 
		}
		
		System.out.println("Reverse of an entered number is :" +reverse);

	}
	
//	Using String buffer class
	
//	StringBuffer sf = new StringBuffer(String.valueOf(n));
//	StringBuffer rev = sf.reverse();
//	System.out.println(rev);
	
//	Using StringBuilder class
		
//		StringBuilder sb = new StringBuilder();
//		sb.append(n);
//		StringBuilder rev =sb.reverse();
//		System.out.println(rev);

}

