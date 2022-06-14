package interviewprg;

public class StringUpperCase {

	public static void main(String[] args) {
		
		String str = "MonikaGuptaJavaSeleniumClasses";
		
		int Count = 0;
		 for (int i =0; i<str.length(); i++)	{
			 if(str.charAt(i)>= 'A' && str.charAt(i)<='Z') {
				System.out.println(str.charAt(i));
				Count++;
			 }
		 }
		System.out.println("Count of uppercase is : " +Count);		

	}

}
