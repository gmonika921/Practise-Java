package practise2303;

public class Conditionalswitchcase {

	public static void main(String[] args) {
		
//		In switch case we use break and break is used in loop and switch case only.
//		Switch case is used for Strings and integer (char,byte, short, long and int)
//		We can't use any decimal values in switch case that is double and float is not allowed.
//		Switch case don't execute cases line by line, it directly jumps on respective case, so performance is faster
//		as compare to if-else...
//		But in here we can't compare the integer like we do in switch case.
//		Real use case of switch case is 
//		1. Browser definition 2. Executing scripts in different environment (dev, qat, uat and prod)
//		3. selecting from drop down 4. Asking petrol prices or population or covid cases in different states.
//		4. Employee salary 5. Locator strategy
//		Based on switch (key). here based on key, different case will be executed.
		
		
		String browser = " SAFARI ";
		switch (browser.trim().toLowerCase()) {
		case "chrome":
			System.out.println("Launching chrome");
			
			break;
			
		case "firefox":
			System.out.println("Launching firefox");
			
			break;
			
		case "safari":
			System.out.println("Launching safari");
			
			break;
			
		case "IE":
			System.out.println("Launching IE");
			
			break;

		default:
			
			System.out.println("Browser name is not found" +" " +browser);
			break;
		}
		
		

	}

}
