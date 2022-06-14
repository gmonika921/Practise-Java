package assignmentsJava;

public class Circumferenceareaofcircle {
	
	public double area (int r) {
		
		System.out.println("area of a cirle");
		
		double area = 3.1415* r*r;
		
		return area;
	}
		
	public double cfer (int r1) {
	
	System.out.println("Circumference of a circle");
	
	double circum = 2*3.1415*r1;
	return circum;
	
	
	}

	public static void main(String[] args) {
		
		Circumferenceareaofcircle CA = new Circumferenceareaofcircle();
		
		double a = CA.area(2);
		
		System.out.println(a);
		
		double c=  CA.cfer(3);
		
		System.out.println(c);
		



	}

}
