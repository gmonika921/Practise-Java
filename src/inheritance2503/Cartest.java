package inheritance2503;

public class Cartest {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.milage();
		b.highspeed();
		b.autoparking();
		b.stop();
		BMW.petrol();
		b.engine();
		System.out.println(b.age);
		System.out.println(b.wheels);
		
		
		
		
		Car c = new BMW(); // Top/up casting
		Car.petrol();
		c.start();
		c.engine();
		
		Honda h = new Honda();
		h.parking();
		
		Vehicle v = new Vehicle();
		v.engine();
		
		Vehicle v1 = new Honda();
		v1.engine();
		
		Vehicle v2 = new Car();
		v2.engine();
		
		
//		BMW b1 = (BMW) new Car(); // Class cast exception-- Down casting gives error during run time
//		
//		b1.autoparking();
//		
		
	}

}
