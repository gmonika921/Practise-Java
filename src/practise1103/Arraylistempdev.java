package practise1103;

import java.util.ArrayList;

public class Arraylistempdev {
	
	public ArrayList<String> empdevlist (String empname){
		
		ArrayList<String> devlist = new ArrayList<String>();
		
		if (empname.equals("Binod")) {
			devlist.add("iphone");
			devlist.add("Macbook-pro");
		}
		
		else if (empname.equals("Ram")) {
			devlist.add("Samsung");

		}
		
		else {
			System.out.println("emp name not found");
		}
		
	
		return devlist;
	}

	public static void main(String[] args) {
		
		
		Arraylistempdev empdev = new Arraylistempdev();
		
		ArrayList<String> D = empdev.empdevlist("Ram");
		System.out.println(D);
		

	}

}
