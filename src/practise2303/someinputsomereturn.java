package practise2303;

public class someinputsomereturn {
	
	public int add(int a, int b) {
		System.out.println("The sum of a  and b");
		
		int c = a+b;
		return c;
	}

	public static void main(String[] args) {
		
		someinputsomereturn sm = new someinputsomereturn();
		int d = sm.add(10, 10);
		System.out.println(d);

	}

}
