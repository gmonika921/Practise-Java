package interface2503;

public class Hospitaltest {

	public static void main(String[] args) {

    Fortishospital fh = new Fortishospital();
    fh.cardioService();
    fh.dentalService();
    fh.ENTService();
    fh.emergencyService();
    fh.dentalService();
    fh.charges();
    fh.covidnews();
    Indianmedical.monikaServive();
    fh.mednews();
    
    
    System.out.println("----fh------------");
    System.out.println();
    
//    Top/up casting
    
    Indianmedical i = new Fortishospital();
    
    i.oncologyService();
    i.orthoService();
    i.covidnews();
    i.mednews();
    
    
    USmedical u = new Fortishospital();
    u.cardioService();
    u.emergencyService();
    u.pediaService();
    u.physioService();
    
    
    
    UKmedical uk = new Fortishospital();
    uk.dentalService();
    uk.ENTService();
    uk.ultrasoundService();
    
    
//    Fortishospital fh1 = new USmedical(); // Compile time error during down casting 
//    because we can't create object of an interface and since usmedical, ukmedical and indian medical is an interface 
    
    
    
    

	}

}
