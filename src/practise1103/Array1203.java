package practise1103;

import java.util.Arrays;

public class Array1203 {

	public static void main(String[] args) {
		
		int a[] = new int[4];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		
		System.out.println(a[3]);
		
		System.out.println("-------getting index values----------");
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("-------applied to string method----------");
		
		int counter = 0;
		 for (int e :a) {
			 System.out.println(counter +" " +e);
			 counter++;
		 }
		 
		 System.out.println("-------advanced loop----------");
		
		for (int i = 0; i<=a.length-1;i++) {
			
			System.out.println(i +" " +a[i]);
			
			
			
		}
		
		System.out.println("-------index based for loop----------");
		
		boolean p[] = new boolean[] {true, false, true};
		
		System.out.println(Arrays.toString(p));
		
		System.out.println("-------way to define an array----------");
		
	    char ch[] = {'1','2','a', 'b', 'A'};
	    
	    System.out.println(Arrays.toString(ch));
	    
	}
	    


	

}
