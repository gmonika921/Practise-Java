package practise2303;

public class Ojectinterchange {
	
	String name;

	public static void main(String[] args) {
		
		Ojectinterchange o = new Ojectinterchange();
		
		o.name = "Monika";
		
		Ojectinterchange o1 = new Ojectinterchange();
		
		o1.name = "Moni";
		
		Ojectinterchange o2 = new Ojectinterchange();
		
		o2.name = "Mon";
		
		System.out.println(o.name);
		System.out.println(o1.name);
		System.out.println(o2.name);
		
		System.out.println("after----interchange");
		
		o = o1 ; 
		o1 = o2;
		
		System.out.println(o.name); // Moni
		System.out.println(o1.name); // Mon
		System.out.println(o2.name); // Mon
		
		
		
		

	}

}
