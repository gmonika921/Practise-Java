package assignmentsJava;

public class Methodevenoddnum {
	
	public void Evenoddnum(int num) {
		
		if (num%2 ==0) {
			
			System.out.println("It's an even " +" " +num);
		}
		
		
		else {
			System.out.println("Is odd number" +" " +num);
		}
		
	}

	public static void main(String[] args) {
		
		Methodevenoddnum EO = new Methodevenoddnum();
		
		EO.Evenoddnum(0);
		



	}

}
