package practise2303;

public class WAFbrowserlaunch {
	
	public boolean browser(String browsername) {
		
		boolean flag = false;
		
		switch (browsername.toLowerCase()) {
		case "chrome":
			System.out.println("Launching browser :" +browsername);
			flag = true;
			break;
			
		case "safari":
			System.out.println("Launching browser :" +browsername);
			flag = true;
			break;
			
		case "firefox":
			System.out.println("Launching browser :" +browsername);
			flag = true;
			break;
			
		case "Microsoft edge":
			System.out.println("Launching browser :" +browsername);
			flag = true;
			break;

		default:
			
			System.out.println("Browsername is not found :" +browsername);
			break;
		}
		
		
		return flag;
	}

	public static void main(String[] args) {
		
		WAFbrowserlaunch bl = new WAFbrowserlaunch();
		
		boolean b = bl.browser("CHROME");
		
		System.out.println(b);

	}

}
