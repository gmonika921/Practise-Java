package exceptionhandling;

public class Trycatchblock {
	
	String name;

	public static void main(String[] args) {

		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		Trycatchblock obj = null;
		
		
		
		try   {  int i = 9/0;
		
//		obj.name = "Monk";
		
		System.out.println("hi");
		
		}
		
//		catch  (ArithmeticException e){
//			
//			System.out.println("Arithmetic exception is coming");
//			e.printStackTrace();
//			
//			
//		}
//		
//		catch  (NullPointerException e){
//			
//			System.out.println("NPE exception is coming");
//			e.printStackTrace();
//			
			
//		}
		
//		catch  (Exception e){
//			
//			System.out.println("Exception is coming");
//			e.printStackTrace();
//			
//			
//		}
//		
catch  (Throwable e){
			
			System.out.println("Throwable is coming");
			e.printStackTrace();
			
			
		}
		
		
		
		System.out.println("B");
		System.out.println("B");
		
	}

}
