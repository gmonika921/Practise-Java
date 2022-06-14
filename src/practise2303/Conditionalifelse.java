package practise2303;

public class Conditionalifelse {

	public static void main(String[] args) {
		
//		we can compare here in if-else statement.
//		But here the performance is slow because scripts have to go line by line to execute the code.
//		But in switch-case we can go directly or we can jump to the respective case without checking each line
		
		String env = "PRoD";
		
		if (env.equalsIgnoreCase("dev")) {
			System.out.println("Executing scripts in dev");
		}
		
		else if (env.equalsIgnoreCase("qat")) {
			System.out.println("Executing scripts in qat");
		}
		
		else if (env.equalsIgnoreCase("xat")) {
			System.out.println("Executing scripts in xat");
		}
		
		else if (env.equalsIgnoreCase("prod")) {
			System.out.println("Executing scripts in prod");
		}
		
		else {
			System.out.println("please enter the valid env" +"" +env);
		}
		

	}

}
