package interface_usecase;

public class Chromedriver implements Webdriver {
	
	
	public void chromedriver() {
		
	System.out.println("Launchingh chrome driver");
		
	}
		

	@Override
	public void findelement(String name1) {
	 System.out.println("find element...." +name1);
		
	}

	@Override
	public void findelements(String name2) {
		System.out.println("find elements...." +name2);
		
	}

	@Override
	public String geturl(String url) {
		System.out.println("enter url..." +url );
		return url;
	}

	@Override
	public String sendkeys(String elename) {
		System.out.println("send element...." +elename);
		return elename;
	}

	@Override
	public void click() {
		System.out.println("click on element");	
		
	}

	@Override
	public void quit() {
		System.out.println("Quit the browser");
		
	}



	}


