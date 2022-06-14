package constructor1003;

public class Company {
	
	private String name;
	private String id;
	private String role;
	private double salary;
	private String location;
	
	
	

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getRole() {
		return role;
	}




	public void setRole(String role) {
		this.role = role;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	public Company(String name, String id, String role, double salary, String location) {
		super();
		this.name = name;
		this.id = id;
		this.role = role;
		this.salary = salary;
		this.location = location;
	}




	public Company(String name, String id, String role, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.role = role;
		this.salary = salary;
	}




	public Company(String name, String id, String role) {
		super();
		this.name = name;
		this.id = id;
		this.role = role;
	}




	public Company(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}




	public static void main(String[] args) {
		
		
		

	}

}
