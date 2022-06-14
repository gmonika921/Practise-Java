package practise2303;

public class Forloop {

	public static void main(String[] args) {
		
//		for loop is used when the number of iterations is fixed..
//		for (int i=0; i>=10;i++) -> Here in for loop, first it initialise the variable then check the condition 
//		if condition  is true then execute the statement and increase the respective variable then 
//		if the condition did not met then it exit the loop
//		otherwise the loop is on.
		
//		Double, byte, short, char, long and int all allowed in loop
//		Use case of for loop is 1. Suggestion list like for e.g. google search, amazon search and e-commerce site
//		2. drop down values - 10 values
//		3.Total number of links available on the page
		
//		Printing Even number
		
		System.out.println("Printing even number");
		
		for (int i =0; i<=100; i++) {
			
			if (i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println();
		
//		Printing odd number
		
		System.out.println("Printing odd number");
		
		for (int k = 1; k<=100; k = k+2) {
			System.out.println(k);
		}
		
		System.out.println();
		
//		Printing odd number by diff approach
		
		System.out.println("Printing odd number by diff approach");
		
		for (int l = 0; l <=100; l++) {
			if (l%2 !=0) {
				System.out.println(l);
			}
		}
		
		

	}

}
