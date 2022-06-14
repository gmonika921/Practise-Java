package practise1103;

public class Person {
	    int x;
		int y;
		
		public void getInfo(Person p) {
		 
			System.out.println(p.x);
			System.out.println(p.y);
			
		}
		
	
	
	

	public static void main(String[] args) {
		
		Person obj = new Person();
		obj.x = 10;
		obj.y = 20;
		
		obj.getInfo(obj);
		
		
		

	}

}
