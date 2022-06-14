package assignmentsJava;

public class Methodmaxminnum {
	

	public void maximum(int a,int b, int c) {
		
		
		if (a>b && a>c) {
			
			System.out.println("a is the greater number" +" " +a);
		}
		
		else if (b>a && b>c) {
			
			System.out.println("b is the greater number" +" "+b);
		}
		
		else {
			System.out.println("c is the greatest of all" +"  "+c);
		}
		
		
		
	}
	
	public void minimum (int a1, int b1, int c1) {
       
		
		if (a1<b1 && a1<c1) {
			
			System.out.println("a is smaller number"  +" "+a1) ;
		}
		
		else if (b1<a1 && b1<c1) {
			
			System.out.println("b is smaller number"  +" "+b1);
		}
		
		else {
			System.out.println("c is the smallest of all"  +" "+c1);
		}
		
		
	
	}

	public static void main(String[] args) {
		
		Methodmaxminnum mm = new Methodmaxminnum();
		
		mm.maximum(10, 20, 30);
		mm.minimum(10, 20, 30);
		
		

	}

}
