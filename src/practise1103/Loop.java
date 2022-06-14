package practise1103;

public class Loop {

	public static void main(String[] args) {
		
		int i =1;
		
		while (i<10) {
			System.out.println("hello");
			i++;
		}
		
		System.out.println("-----------------------hello-------------------");
	
		int k =0;
		
 do { System.out.println("multiple of 3" +" " +k);
 k = k+2;
 k++;
	
} while (k<=100);
 
 System.out.println("--------------------multiple of 3 ----------------------");
 
 int p = 0;
 
 do {
 
 if (p%2 ==0) {
	 
	 System.out.println("multiple of 2" +" " +p);
	 
	 
 }
 p++;
	 
	
} while (p<=100);
 
 System.out.println("--------------multiple of 2----------------------");
 
 for (char c = 'a'; c<='z'; c++) {
	 System.out.println((int)c);
 }
 
for (char c1 = 'A';c1<='Z';c1++) {
	System.out.println((int)c1);
}

	}

}
