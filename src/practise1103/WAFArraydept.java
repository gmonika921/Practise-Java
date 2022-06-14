package practise1103;

import java.util.Arrays;

public class WAFArraydept {
	
	public String[] deprtlist (String compName) {
		
		String d[] = new String[3];
		
		if(compName.equals("TCS")) {
			
			
			d[0] = "HR";
			d[1] = "IT";	
		}
		
		else if (compName.equals("IBM")) {
			
			d[0] = "HR-1";
			d[1] = "IT-1";	
			
		}
		
		else {
			System.out.println("Company name not found");
		}
		
		
		return d;
		
	}

	public static void main(String[] args) {
		
		WAFArraydept department = new WAFArraydept();
		
		String de[] = department.deprtlist("IBM");
		System.out.println(Arrays.toString(de));
		
		
		



	}

}
