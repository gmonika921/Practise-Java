package constructorassignments;

public class Employeeclass {
	
//	Create Employee class
//	define class vars with private: name, age, salary, isActive, Gender
//	create getter and setter for each class private vars
//	create getEmployeeInfo() method in Employee class which will return al the values of employee
//	Test this feature:
//	create EmployeeTest class 
//	In main() method, create the object of Employee class
//	set the values using set method
//	call getEmployeeInfo() method and print all the employee values on the console.
	
	private String name;
	private int age;
	private double salary;
	private boolean IsActive;
	private char gender;
	
	public void getemployeeinfo() {
		System.out.println("Name of an employee is " +" " +name);
		System.out.println("Age of an employee is " +" " +age);
		System.out.println("Salary of an employee is" +" " +salary);
		System.out.println("Is employee active " +" " +IsActive);
		System.out.println("Employee is " +" " +gender);
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public boolean isIsActive() {
		return IsActive;
	}



	public void setIsActive(boolean isActive) {
		IsActive = isActive;
	}



	public char getGender() {
		return gender;
	}



	public void setGender(char gender) {
		this.gender = gender;
	}



	public static void main(String[] args) {
		

	}

}
