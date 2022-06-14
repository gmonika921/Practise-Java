package practise1103;

public class Ifelse1103 {
	

	public static void main(String[] args) {
		
		String name= "sid";
		
		
		if (name.equals("Monika")) {
			System.out.println("marks = 10");
		}
		
		else if (name.equals("Priyanka")) {
			System.out.println("marks = 20");
		}
		
		else if (name.equals("sid")) {
			System.out.println("marks = 80");
		}
		
		else {
			System.out.println("Name not found " +name);
		}

		
		System.out.println("--------------------if-else string -----------------------");
		
		double marks = 100.0;
		
		if (marks>90) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
			


	}

}
