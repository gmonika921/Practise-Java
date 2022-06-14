package practise2303;

public class Deadcode {

	public static void main(String[] args) {

// the yellow line is a dead code which means the statement will not get executed because the if is true always
//		in order to remove this dead code, use flag and then assign
//		if (true) {
//			System.out.println("hello selenium");
//		}
//		
//		else {
//			System.out.println("bye selenium");
//		}

		boolean flag = true;
		
		if (flag) {
			System.out.println("hello selenium");
		}
		
		else {
			System.out.println("bye selenium");
		}

	}

}
