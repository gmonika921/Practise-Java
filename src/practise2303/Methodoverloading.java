package practise2303;

public class Methodoverloading {
	
	public int test() {
		System.out.println("hi");
		return 100;
	}
		
	public void test(int a) {
		System.out.println("hi" +a );
		
	}
	
	public void test (int a, int b) {
		System.out.println("hello" +a +b);
	}
	
	public String test (String name) {
		System.out.println("Pop" +name);
		 return name;
	}
	
	

	public static void main(String[] args) {
		
		Methodoverloading mo = new Methodoverloading();
		
		mo.test("monika");

	}

}
