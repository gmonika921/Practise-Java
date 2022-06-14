package inheritance2503;

public class BMW extends Car {
	
	int wheels = 5;
	
	
	
	public void autoparking() {
		System.out.println("BMW------autoparking");
	}
	@Override
	public void start() {
		System.out.println("BMW----start");
	}
	
	public static void petrol() {
		System.out.println("car-----petrol");
	}
	
	private static void gear() {
		System.out.println("BMW-----gear");
	}

	public static void main(String[] args) {

	}

}
