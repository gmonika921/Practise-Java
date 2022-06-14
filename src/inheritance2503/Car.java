package inheritance2503;

public class Car extends Vehicle{
	
	int age = 10;
	final static int wheels = 4;
	
	
	public void start() {
		int time = 90;
		System.out.println("Car----start");
	}
	
	public void stop() {
		System.out.println("Car------stop");
	}
	
	public void milage() {
		System.out.println("car-----milage");
	}
	
	public static void petrol() {
		System.out.println("car-----petrol");
	}
	
	private void gear() {
		System.out.println("car-----gear");
	}
	
	public final void highspeed() {
		System.out.println("car-----highspeed");
	}

	public static void main(String[] args) {

	}

}
