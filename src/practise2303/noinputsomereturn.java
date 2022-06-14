package practise2303;

public class noinputsomereturn {
	
	public String getname() {
		System.out.println("Name is");
		
		String name = "monika";
		return name;
		
		
	}

	public static void main(String[] args) {
		
		noinputsomereturn np1 = new noinputsomereturn();
		
		String n = np1.getname();
		System.out.println(n);
//		System.out.println(np1.getname());
		
		
		

	}

}
