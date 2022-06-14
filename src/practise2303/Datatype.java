package practise2303;

public class Datatype {

	public static void main(String[] args) {


		int w = 1090908900; //integer can store up to 10 digits...
		double salary = 34.7890867889096778856557; // can take up 14 decimal after point...
		float f = 33.78908678890967788f; // can take up to 6 decimal after point
		float f1 = (float) 66;
		byte b = -128; // -128 to 127
		short s = -23345; //-32,768 to +32,767
		char c = 'h';
		long l = 4547656779089007897l; // can store up to 19/18 digits... if we don't define by l then it is 10 digits
		boolean b1 = true;
		
//		Float															Double
//		Can store Up to 7 significant digits							Stores up to 15 significant digits
//		Occupies 4 bytes of memory (32 bits IEEE 754)					Occupies 8 bytes of memory (64-bits IEEE 754)
//		If more than 7 digits are present, value is rounded off			7-15 digits are stored as they are
//		
		
//		ASCII value, each char is an integer in java because of ASCII value
		
//		0 to 9 - 48 to 57
//		A to Z - 65 to 90
//		a to z - 97 to 122
		
		System.out.println("double....." +salary);
		System.out.println("float....." +f);
		System.out.println("byte...." +b);
		System.out.println("short...."  +s);
		System.out.println("char..."  +(int)c);
		System.out.println("float f1...." +f1);
		System.out.println("long...." +l);
		System.out.println("boolean...." +b1);
		System.out.println("int....." +w);

	}

}
