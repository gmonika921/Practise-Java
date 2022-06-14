package practise1103;

public class WAFinputStNrmks {
	
	
	public int studentMarks (String Studentname) {
		
		System.out.println("Marks of student is" );
		
		int marks = -1;
		
		if (Studentname.equals("Harsh")) {
			marks = 90;
		}
		else if (Studentname.equals("Tom")) {
			marks = 60;
		}
		
		else {
			System.out.println("Student name is nlot found");
		}
		
		
		return marks;
	
	
	
	}

	public static void main(String[] args) {
		
		WAFinputStNrmks st = new WAFinputStNrmks();
		st.studentMarks("Harsha");
		

	}

}
