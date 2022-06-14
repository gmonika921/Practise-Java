package practise1103;

public class WAFstringinputbooleanreturn {
	
	public boolean environment (String browsername) {
	
		System.out.println("launching browser" +browsername);
		
		boolean flag = false;
		
		switch (browsername.trim()) {
		case "chrome":
			System.out.println("launching chrome broweser");
			
			flag = true;
			
		case "safari":
			System.out.println("launching safari broweser");
			
			flag = true;
			
		case "opera":
			System.out.println("launching opera broweser");
			
			flag = true;
			
			break;

		default:
			
			System.out.println("Please enter the valid browser" +" " +browsername);
			break;
		}
		
		return flag;
	}

	public static void main(String[] args) {
		
		WAFstringinputbooleanreturn SB = new WAFstringinputbooleanreturn();
		
		SB.environment(" opera ");
		
		

	}

}
