package practise1103;

public class Switchcase {

	public static void main(String[] args) {
		
		String browsername = "chro  me";

    switch (browsername.trim().replace(" ", "")) {
	case "safari":
		System.out.println("Launching safari browser");
		
		break;
	case "chrome":
		System.out.println("Launching chrome browser");
		
		break;
	case "microsoft-edge":
		System.out.println("Launching microsoft-edge browser");
		
		break;
	case "ie":
		System.out.println("Launching ie browser");
		
		break;
	case "opera":
		System.out.println("Launching opera browser");
		
		break;

	default:
		System.out.println("Enter the valid browser name" +" " +browsername);
		break;
	}

	}

}
