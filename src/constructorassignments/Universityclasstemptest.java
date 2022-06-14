package constructorassignments;

import java.util.ArrayList;

public class Universityclasstemptest {

	public static void main(String[] args) {

    ArrayList<String> cl = new ArrayList<String>();
    cl.add("MBA");
    cl.add("Engineering");
    cl.add("BBA");
    cl.add("phd");
    
    Universityclasstemp u1 = new Universityclasstemp("Gandhiji university");
    Universityclasstemp u2 = new Universityclasstemp("Kings college", "London", 1980, cl);
    
    System.out.println(cl);
    
  ArrayList<String> u = u2.getcourses();
  
  System.out.println(u);
  
  System.out.println(u2.getcountry());
  System.out.println(u1.getcountry());
  System.out.println(u1.getcourses());
  System.out.println(u1.getestablishedDate());
  u1.setName("London college");
  System.out.println(u1.getName());
  u1.setCourses(cl);
  cl.add("masters");
  cl.add("civil engineering");
  System.out.println(cl);
  
  
  
   
    
    
    

	}

}
