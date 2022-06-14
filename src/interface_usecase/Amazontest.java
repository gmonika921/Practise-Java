package interface_usecase;

public class Amazontest {

	public static void main(String[] args) {
		
//		top/up cast
		
//	Webdriver driver = new Chromedriver();
//		Webdriver driver1 = new Firefoxdriver();
//		Webdriver driver2 = new Safaridriver();
		
		String browsername = "Chromedriver";
		Webdriver driver = null;
		if (browsername.equalsIgnoreCase("Chromedriver")){
			 driver = new Chromedriver();
			
		}
		
		else if (browsername.equalsIgnoreCase("Safaridriver")) {
			 driver = new Safaridriver();
			
		}
		
		else if (browsername.equalsIgnoreCase("Firefoxdriver")) {
			 driver = new Firefoxdriver();
			
		}
		
		else {
			System.out.println("Driver is not found...." +browsername);
		}
		
		
		
		driver.geturl("amazon.co.uk");
		driver.findelement("email-id");
		driver.findelements("password");
		driver.sendkeys("gmonika921");
		driver.click();
		driver.quit();
		

	}

}
