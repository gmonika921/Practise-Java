package practise1103;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist1203 {

	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("Butterscoth");
		s.add("Vanilla");
		s.add("Chocolate");
		s.add("Kulfi");
		
		System.out.println(s);
		s.remove(2);
		System.out.println(s);
		s.remove(0);
		System.out.println(s);
		s.add("choc bar");
		System.out.println(s);
		
		System.out.println(s.size());
		
		for (String e:s) {
			System.out.println(e);
			
		}
		System.out.println("highest index is" +" "+(s.size()-1));
		
		Collections.reverse(s);
		System.out.println(s);

	}

}
