package interfaceConcept;

public class Fortishospital implements USmedical, UKmedical, Indianmedical {
	
	

	public static void main(String[] args) {

	}

	@Override
	public void physioService() {

		System.out.println("FH - physio services");

	}

	@Override
	public void cardioSerive() {

		System.out.println("FH - cardio services");

	}

	@Override
	public void pediaService() {

		System.out.println("FH - pedia services");

	}

	@Override
	public void emergencyService() {

		System.out.println("FH - Emergency services");

	}

	public void insuranceService() {
		System.out.println("FH - Insurance services");
	}

	public void medicalTraining() {
		System.out.println("FH - medical training");

	}

	@Override
	public void ENTService() {
		System.out.println("FH - ENT Service");

	}

	@Override
	public void dentalSerive() {
		System.out.println("FH - dentalService");

	}

	@Override
	public void UltrasoundService() {
		System.out.println("FH - Ultrasound");

	}

	@Override
	public void orthoService() {
		System.out.println("FH - orthoService");

	}

	@Override
	public void oncologySerive() {
		System.out.println("FH - oncologyService");

	}
}
