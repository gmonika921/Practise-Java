package practise2303;

public class Nestedloop {

	public static void main(String[] args) {
		
//		00 01 02 03 04 05 ....09
//		10 11 12 13 14 15 ....19
//		20 21 22 23 24 25.....29
//		90 91 92 93 94 95.....99
		
		for (int i =0; i<=9; i++ ) {
			
			for (int j =0; j<=9 ; j++) {
				
				for (int k=0; k<=9 ; k++)
				 
				System.out.print(i +""+j +"" +k  +" ");
				System.out.println();
			}
		}

	}

}
