package interfaceConcept;

public interface USmedical {
	
	int med_fees = 20;
	
//	Interface don't have method body - A class which don't have method body is called abstract class 
//	A method inside Interface is always abstract class..
//	No business logic inside this method
	
	
	public void physioService();
	
	public void cardioSerive();
	
	public void pediaService();
	
	public void emergencyService();
	
	public static void medNews() {
		
	System.out.println("US----medNews");
	}
	
	default void billing () {
	System.out.println("US--- billing");
	}

}
