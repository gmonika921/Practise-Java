package Webdriverexample;

public class Chromedriver implements webdriver {

	public Chromedriver() {
		System.out.println("launching chrome....");
	}

	@Override
	public void findelement(String element) {
		System.out.println("find element:" +element);
		
	}

	@Override
	public void findelements(String elements) {
		System.out.println("find elements:" +elements);
		
	}

	@Override
	public void get(String url) {
		System.out.println("url:" +url);
		
	}

	@Override
	public String gettitle() {
		
		return "Amazon";
		
	}

	@Override
	public String geturl() {
		 
		return "Amazon.co.uk";
		
	}

	@Override
	public void click(String ele) {
		System.out.println("click on element: " +ele);
		
	}

	@Override
	public void sendkeys(String ele, String values) {
		System.out.println("enter values in ele: " +ele + "value is :" +values);
		
	}

	@Override
	public void quit() {
		System.out.println("quit browser....");
		
	}

	
}
