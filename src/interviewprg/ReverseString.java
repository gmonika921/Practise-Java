package interviewprg;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Monika";
		
//Using for loop
//		int len = str.length();
//		String rev = "";
//		
//		for (int i = len-1; i>=0; i--) {
//			rev = rev+ str.charAt(i);
//		}
//		System.out.println(rev);
//	}
//	}
	
	
//	Using String buffer - Is mutable class but String is immutable
	
	StringBuffer sf = new StringBuffer(str);
	StringBuffer s = sf.reverse();
	System.out.println(sf);
	
	}
}
