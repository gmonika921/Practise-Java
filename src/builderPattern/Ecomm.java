package builderPattern;

public class Ecomm {
	
//	Builder pattern - It's a good design pattern, to achieve this we are going to use 
//	"this" keyword which means to return the current class object 
//	and we have to write current class name. 
//	Every method is written with return this keyword with class name. 
//	The advantage of using builder pattern is we can create n number of workflows. 
//	Where user just use 2 to 3 other methods. 
//	Builder pattern says every method returns the current class object. 
//	We can use this in action class. Inside builder pattern we use this keyword.

	
	public Ecomm dologin(String username, String password) {
		System.out.println("login- " +" "+username +":" +password);
		return this;
        
		
	}
	
	public Ecomm dosearch(String productname, int price, String colour) {
		System.out.println("Productname -" +" " +productname +price +colour);
		return this;
	}
	
	public Ecomm docart(String purchasedproductname) {
		System.out.println("Purchased item -" +" " +purchasedproductname);
		return this;
	}
	
	public Ecomm dopayment( String cc, int UPI, int OTP) {
		System.out.println("Credit card details- " +" " +cc +UPI +OTP);
		return this;
	}
	
	public Ecomm generateOrderid(int orderid) {
		System.out.println("Order ID is -" +" " +orderid);
		return this;
	
	}
	
	public Ecomm dologout() {
		System.out.println("logout successfully");
		return this;
	}

	public static void main(String[] args) {



	}

}
