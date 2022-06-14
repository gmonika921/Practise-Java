package practise1103;

import java.util.Arrays;

public class Arrays1603 {
	

	public static void main(String[] args) {
		
		int a[] = new int[4];
		a[0] = 1;
		a[1] = 2;
//		a[3] = 4; by default the a[2] = 0
//		a[4] = 6;
		
		System.out.println(Arrays.toString(a));
		
		
		int counter = 0;
		for (int e :a) {
			System.out.println(+counter +":" +e);
			counter++;
		}
		
		char b[] = {'a', 'b', 'c', 'd'};
		 for (int i =0; i<=b.length-1; i++) {
			 System.out.println(+i +":" +b[i]);
		 }
		 
		 String c[] = new String[] {"Monika", "Barkha", "Bulbul"};
		 System.out.println(Arrays.toString(c));
		

	}

}
