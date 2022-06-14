package builderPattern;

public class Bookingapplication {
	
	public Bookingapplication login(String un, String pwd) {
		System.out.println("Login -" +" " +un +":" +pwd);
		return this;
		
	}
	
	public Bookingapplication carType(String cartype) {
		System.out.println("Car type is - " +" " +cartype);
		return this;
		
	}
	
	public Bookingapplication numberofpsger(int num) {
		System.out.println("Numer of passenger is -" +" " +num);
		return this;
		
	}
	
	public Bookingapplication startLocation(String StLoc) {
		System.out.println("start location is -" +" " +StLoc);
		return this;
		
	}
	
	public Bookingapplication EndLocation(String EndLoc) {
		System.out.println("End location is -" +" " +EndLoc);
		return this;
		
	}
	
	public Bookingapplication dopayment(int upi) {
		System.out.println("Payment method is -" +" " +upi);
		return this;
		
	}
	
	public Bookingapplication logout() {
		System.out.println("logout successfully..");
		return this;
		
	}

	public static void main(String[] args) {
		

	}

}
