package constructorassignments;

import java.util.Arrays;

public class Browsertest {
	
//	Create a browser class, this class will have 3 private variable like Sting name , double version & String [] plugin.
//	Create a constructor which will take name , version & plugin. 
//	Create getters & setters.
//	now create a test class & get values of name , version & plugin. 
//	You can try updating values of name , version & Plugin using setters.

	public static void main(String[] args) {
			
			String plugin[] = new String[3];
			
			plugin[0] = "Chromepath";
			plugin[1] = "CSS path";
			plugin[2] = "xpath";
		
		Browserclass b1 = new Browserclass("chrome", 45-90, plugin);
		
		System.out.println(b1.getBrowsername());
		System.out.println(b1.getVersion());
		System.out.println(b1.getPlugin());
		System.out.println(Arrays.toString(plugin));
		
		b1.setBrowsername("opera");
		b1.setPlugin(args);
//		b1.setVersion(80.8); // because we made the set browser setter method to private so nobody can changed it
		System.out.println(b1.getBrowsername());
		System.out.println(b1.getVersion());
		System.out.println(b1.getPlugin());
		System.out.println(Arrays.toString(plugin));
		
		String p1[] = b1.getPlugin();
		
		for (String e: p1) {
			System.out.println(e);
		}
		b1.setPlugin(plugin);
		plugin[0] = "firebug";
		plugin[1] = "firepath";
		plugin[2] = "fireway";
		
		System.out.println(Arrays.toString(plugin));
		
		String h1[] = b1.getPlugin();
		
		for (String e: h1) {
			System.out.println(e);
		}
		
		System.out.println(b1.getBrowsername());
		
		b1.setBrowsername("firefox");
		System.out.println(b1.getBrowsername());
		

	}

}
