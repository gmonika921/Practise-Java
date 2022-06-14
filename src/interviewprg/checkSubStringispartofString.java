package interviewprg;

public class checkSubStringispartofString {

	public static void main(String[] args) {
		
	boolean b = isSubString("Monika Gupta is a smart and talented girl", "monika");
	System.out.println(b);
	System.out.println(isSubString2("Amay is gorgeous", "gorg"));

	}
	
	public static boolean isSubString(String main, String sub) {
		return main.matches("(.*)" +sub+ "(.*)");
	}
	
	public static boolean isSubString1(String main, String sub) {
		return main.contains(sub);
	}
	
	public static boolean isSubString2(String main, String sub) {
		return main.indexOf(sub)!=-1;
	}

}
