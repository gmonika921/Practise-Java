package interfaceConcept;

public class Testhospital {

	public static void main(String[] args) {

    Fortishospital f1 = new Fortishospital();
    
    f1.cardioSerive();
    f1.emergencyService();
    f1.insuranceService();
    f1.medicalTraining();
    f1.pediaService();
    f1.physioService();
    USmedical.medNews();
    System.out.println(USmedical.med_fees);
    
    System.out.println("------------------Fortis=hospital--------------------");
    
//    we cannot create the object of interface, strictly not allowed..
//    Can we do top casting..
//    child class object can be referred by a parent interface reference variable
    
   USmedical u =  new Fortishospital();
   u.cardioSerive();
   u.emergencyService();
   u.pediaService();
   u.physioService();
   u.emergencyService();
   u.billing();
   System.out.println(u.med_fees);
   USmedical.medNews();
   
   
   System.out.println("----------------------USMedical-----------------------------");
   
//   Down casting at the compile time with Interface is not allowed
//   Down casting - No otherwise it will give class cast error
//   A parent interface object can be referred by a child class reference variable
//   
//      Fortishospital f2 =new USmedical(); Compile time down casting is not allowed because at compile time we need to
//      create the object of Interface object which is not allowed..
      
   
   
    
    
    
    

	}

}
