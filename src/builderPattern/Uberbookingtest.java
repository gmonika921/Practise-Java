package builderPattern;

public class Uberbookingtest {

	public static void main(String[] args) {

      Bookingapplication b1 = new Bookingapplication();
      b1.login("Kapil@booking.com", "kapil1234")
          .carType("Honda")
            .startLocation("Mumbai")
             .EndLocation("Jaipur")
              .dopayment(47465)
               .logout();
      
      System.out.println("-------------------first booking completed-----------------");
      System.out.println();
      
      b1.login("Lolu@booking.com", "lolu12334")
         .carType("bmw")
          .logout();
      

	}

}
