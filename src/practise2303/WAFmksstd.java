package practise2303;

public class WAFmksstd {
	
	public int getStudentmks(String studentname) {
		
		System.out.println("Getting marks of the student " +studentname);
		
		
		int marks = -1;
		
		
		if (studentname.equals("Harsh")) {
			
			 marks = 90;
			
		}
		
		else if (studentname.equals("Harsha")) {
			
			 marks = 80;
			
		}
		
		else if (studentname.equals("Monika")) {
			
			 marks = 70;
			
		}
		
		else {
			System.out.println("Student name is not found..." +studentname);
		}
		
		
		return marks;
	}

	public static void main(String[] args) {
		
		WAFmksstd waf = new WAFmksstd();
		
		int y = waf.getStudentmks("Harshaa");
		
		System.out.println(y);
		
		

	}

}
