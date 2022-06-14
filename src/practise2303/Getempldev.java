package practise2303;

import java.util.ArrayList;

public class Getempldev {
	
	public ArrayList<String> getEmpldevices (String Employeename){
		
		ArrayList<String> devices = new ArrayList<String>();
		
		if (Employeename.equals("Ravi")) {
			devices.add("iphone");
			devices.add("mac");
			devices.add("android phone");
			devices.add("samsung");
		}
		
		else if (Employeename.equals("Malvika")){
			
			devices.add("iphone-M");
			devices.add("mac-M");
			devices.add("android phone - M");
			devices.add("samsung - M");
			
		}
		
		else {
			System.out.println("Employee name not found :" +Employeename);
		}
		
		return devices;
	}

	public static void main(String[] args) {
		
		Getempldev gt = new Getempldev();
		
		ArrayList<String> s = gt.getEmpldevices("Ravi");
		
		System.out.println(s);
		
	}

}
