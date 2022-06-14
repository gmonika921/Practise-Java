package practise1103;

public class Methodover1603 {
	
	public void login() {
		System.out.println("method-1");
	}
	
	public void login(String un) {
		System.out.println("method-2");
	}
	
	public void login(String un, String pwd) {
		System.out.println("method-3");
	}
	
	public void login(String un, String pwd, int OTP) {
		System.out.println("method-3");
	}
	

	public static void main(String[] args) {
		
		Methodover1603 lp = new Methodover1603();
		lp.login();



	}

}
