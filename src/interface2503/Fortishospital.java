package interface2503;

public class Fortishospital extends Medical implements UKmedical,USmedical,Indianmedical {

	public static void main(String[] args) {

	}

	@Override
	public void ENTService() {
	System.out.println("FH -----ENTService");
		
	}

	@Override
	public void dentalService() {
    System.out.println("FH------dentalService");		
	}

	@Override
	public void ultrasoundService() {
    System.out.println("FH-------ultrasound");		
	}

	@Override
	public void orthoService() {
	System.out.println("FH------orthoservive");	
		
	}

	@Override
	public void oncologyService() {
	System.out.println("FH------oncologyservive");	
		
	}

	@Override
	public void physioService() {
	System.out.println("FH------physioservive");			
	}

	@Override
	public void cardioService() {
	System.out.println("FH------cardioservive");			
	}

	@Override
	public void pediaService() {
	System.out.println("FH------pediaservive");	
		
	}

	@Override
	public void emergencyService() {
    System.out.println("FH------emergencyservive");		
	}

	@Override
	public void orthoServicee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int orthoServicee(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void covidvaccine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void covidnews() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public  void mednews() {
		System.out.println("fh----mednews");
	}

}
