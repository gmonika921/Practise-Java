package inteheritanceconcept;

public class BMW extends Car{
	
	public void autoparking() {
		System.out.println("auto-parking bmw.......");
	}
	@Override
	public void start() {
		System.out.println("bmw start.......");
	}
	

	public static void main(String[] args) {
		
		BMW b1 = new BMW();
		b1.autoparking();
		b1.start();
		b1.stop();
		Car c1 = new BMW(); // Top/up casting - Reference type check passed
//		BMW b2 = (BMW) new Car(); // Down casting - Reference type check failed, type class exception
//		b2.autoparking(); // Individual method of bmw is not allowed in car parent class 
		
		c1.start();
		c1.stop();
		
		



	}

}
