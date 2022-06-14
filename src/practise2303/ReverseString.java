package practise2303;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println(reverseString("Selenium"));
		System.out.println(reverseString("m"));
		System.out.println(reverseString(null));
		
		System.out.println(reverseString("malayalam"));
		System.out.println(reverseString("pop"));
		System.out.println(isPallindrome("malayalam"));
		
		}	
	
	public static boolean isPallindrome(String  str) {
		
		if(str.equals(reverseString(str))) {
			
			System.out.println("It's a pallindrom");
			
			return true;
			
		}
		
		else {
			return false;
		}
	}
	
		
		public static String reverseString(String str) {
			
			
			if (str == null) {
				System.out.println("it's a null");
				return null;
			}
			
			String rev = "";
			
			int len = str.length();
			
			if(len ==1) {
				System.out.println();
				return str;
			}
			
			for (int i = len-1; i>=0; i--) {
				rev = rev + str.charAt(i);
				
			}
			
			return rev;
			
			
		}
		
		

	}


