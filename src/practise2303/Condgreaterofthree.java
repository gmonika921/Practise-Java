package practise2303;

public class Condgreaterofthree {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 100;
		int c = 100;
		
		if(a>b && a>c ) {
			System.out.println("a is greater");
		}
		
		else if (a==b && a==c) {
			System.out.println("a,b,c all are same");
		}
		
		else if (a==b) {
			System.out.println("a and b are same");
		}
		
		else if (b>a && b>c)
		{
			System.out.println("b is greater");
		}
		
		else {
			System.out.println("c is greater");
		}
	}

}
