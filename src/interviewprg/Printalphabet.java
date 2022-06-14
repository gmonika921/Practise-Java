package interviewprg;

public class Printalphabet {

	public static void main(String[] args) {
		
		char ch;
		
		for (ch = 'a'; ch<='z' ; ch++) {
			System.out.println(ch +" : " +(int)ch);
		}
		System.out.println("===========================================================================");
		
		for (ch = 'A'; ch<='Z' ; ch++) {
			System.out.println(ch +" : " +(int)ch);
		}
		
		System.out.println("===========================================================================");

		
		for (ch = '1'; ch<='9' ; ch++) {
			System.out.println(ch +" : " +(int)ch);
		}



	}

}
