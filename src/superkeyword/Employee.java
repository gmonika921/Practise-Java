package superkeyword;

public class Employee extends Company{
	
	int salary = 50;
	int holidays = 30;
	
	public void getSalary() {
		System.out.println(salary);
		System.out.println(super.salary);
	}
	
	public void getholidays() {
		System.out.println(super.holidays);
		System.out.println(super.salary);
		System.out.println(holidays);
		System.out.println(salary);
		
		
		
	}
	
	public Employee() {

		System.out.println("Emp....Cons...");

	}

	public Employee(int a) {
		
		super(10);

		System.out.println("Emp....Cons..." + a);

	}

	public Employee(int a, int b) {
		
		super(10,20);

		System.out.println("Emp....Cons..." + a + b);
	}

	public static void main(String[] args) {

	}

}
