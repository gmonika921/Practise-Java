package builderPattern;

public class Amazonshopping {

	public static void main(String[] args) {
		Ecomm e1 = new Ecomm();
		e1.dologin("monika@amazon.com", "monika123")
		   .dosearch("iphone", 9000, "golden")
		    .docart("iphone")
		     .dopayment("5456579", 67889, 67867)
		      .generateOrderid(45476)
		       .dologout();
		System.out.println("------------------first---------------------");
		System.out.println();
		
		e1.dologin("sid@amazon.com", "sid1234")
		   .dologout();
		System.out.println("------------------second---------------------");
		System.out.println();
		
		e1.dopayment("67798700", 5768, 78698)
		   .generateOrderid(56587)
		    .dologout();
		System.out.println("------------------third---------------------");
		System.out.println();
		
		   
		   
		   
		
		
		
		
		
		
		
		
		
		   	}

}
