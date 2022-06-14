package interviewprg;

import java.math.BigInteger;
import java.util.Scanner;

public class FactBiggerNumber {

	public static void main(String[] args) {
		
		int a, c ;
		
		
		System.out.println("Input an integer");
		Scanner in = new Scanner(System.in);
		
		BigInteger inc = new BigInteger("1");
		BigInteger fact = new BigInteger("1");
		a = in.nextInt();
		
		for (c=1; c<=a; c++ ) {
			fact = fact.multiply(inc);
			inc = inc.add(BigInteger.ONE);
		}
		
		System.out.println("The factorial of number " +a +" is :" +fact);
		
		

		
		
		

	}

}
