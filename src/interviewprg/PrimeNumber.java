package interviewprg;

public class PrimeNumber {

	public static void main(String[] args) {
		
//		System.out.println(isPrimeNumber(0));
//		System.out.println(isPrimeNumber(5));
//		System.out.println(isPrimeNumber(2));
//		System.out.println(isPrimeNumber(1));
		
		getPrimeNumber(21);
	}

	
	public static boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for (int i =2; i<num ; i++) {
			if(num % 2==0) {
				return false;
			}
				
		}
		return true;
		
	}




	public static void getPrimeNumber(int num) {
		
		for (int i =2 ; i<=num; i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i +" ");
			}
		}
	}
}









