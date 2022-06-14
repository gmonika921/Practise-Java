package abstractconcept25;

public class Loginpage extends Page {
	
	public Loginpage() {
		System.out.println("Loginpage.....cons");
	}
	
	public Loginpage(int a) {
		super(a);
		System.out.println("Loginpage.....cons" +a);
	}

	public static void main(String[] args) {

	}

	@Override
	public void title() {

		System.out.println("lp.....title");
	}

	@Override
	public void url() {
		
		System.out.println("lp.....url");	
	}

	@Override
	public void header() {
		System.out.println("lp.....header");
		
	}
	
	public void dologin() {
		System.out.println("login to app");
	}
	
	
	public void timeout() {
		System.out.println("lp timeout is .....10sec");
	}
	

}
