package Webdriverexample;

public class Drivertest {

	public static void main(String[] args) {

		
//		Chromedriver driver = new Chromedriver();
//		Firefoxdriver driver = new Firefoxdriver();
//		Safaridriver driver = new Safaridriver();

		
		String browser = "Safaridriver";
		webdriver driver = null;
		if (browser.equalsIgnoreCase("Chromedriver")){
			 driver = new Chromedriver();
		}
		
		else if (browser.equalsIgnoreCase("Safaridriver")) {
			driver = new Safaridriver();
			
		}
		
		else if (browser.equalsIgnoreCase("Firefoxdriver")) {
			driver = new Firefoxdriver();
			
		}
		else {
			System.out.println("please pass the right browser name" +browser);
		}
		
		
		driver.get("https:/www.amazon.co.uk");
		
		String title = driver.gettitle();
		System.out.println(title);
		
		String url = driver.geturl();
		System.out.println(url);
		
		driver.findelements("email-id");
		driver.sendkeys("email-id", "monikagupta@gmail.com");
		
		driver.findelement("login button");
		
		driver.click("login-btn");
		
		driver.quit();
		
	}

}
