package practise2303;

import java.util.ArrayList;

public class Arraylistpractise {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Monika");
		ar.add("Neha");
		ar.add("barkha");
		ar.add("Bulbul");
		
		System.out.println(ar.contains("Monika"));
		System.out.println(ar.get(0));
		ar.remove(0);
		System.out.println(ar.get(0));
		System.out.println(ar);
		System.out.println(ar.size()-1);
		
		ArrayList<Object> employeeinfo = new ArrayList<Object>();
		employeeinfo.add("Monika");
		employeeinfo.add("London");
		employeeinfo.add(90.000);
		employeeinfo.add('f');
		employeeinfo.add(true);
		
		System.out.println(employeeinfo);
		
		
		

	}

}
