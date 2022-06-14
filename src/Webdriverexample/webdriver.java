package Webdriverexample;

public interface webdriver {

	
	public void findelement(String element);
	
	public void findelements(String elements);
	
	public void get(String url);
	
	public String gettitle();
	
	public String geturl();
	
	public void click(String ele);
	
	public void sendkeys(String ele, String values);
	
	public void quit();
}
