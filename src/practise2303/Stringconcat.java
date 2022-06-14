package practise2303;

public class Stringconcat {

	public static void main(String[] args) {
		
//		it means adding two strings, String is a class and represented by double quotes, here we are performing addition 
//		between two strings...
		
		int a = 100;
		int b = 200;
		
		System.out.println("hello world" +a+b); // hello world100200
		System.out.println("hello world" +(a+b));//hello world300
		System.out.println(+a+b +"hello world"); //300hello world
		System.out.println('a' + 'b'); // ASCII value of a and b is 97+98
		
//		we should always store the mathematical calculation inside long and integer only because Java says the 
//		result might be bigger.

	}

}
