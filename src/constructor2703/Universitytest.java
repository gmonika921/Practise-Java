package constructor2703;

import java.util.ArrayList;

public class Universitytest {

	public static void main(String[] args) {
		
		ArrayList<String> course = new ArrayList<String>();
		course.add("B.E");
		course.add("Btech");
		course.add("Masters");
		course.add("MBA");
		course.add("Phd");
		

		
		Universitytemplate u  = new Universitytemplate("Gandhiji uni", "London", 29-006-1987, course);
		
		System.out.println(u.getCountry());
		System.out.println(u.getEstablisheddate());
		System.out.println(u.getName());
		System.out.println(course);
		ArrayList<String> u1 = u.getCourselist();
		System.out.println(u1);
		
//		u.setName("Londonuni");
//		System.out.println(u.getName());
	
		
	}

}
