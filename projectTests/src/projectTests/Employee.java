package projectTests;

public class Employee {
	//class employee with private variables and constructor
	private String name;
	private int salary;
	
	public Employee() {}//no-args constructor
	
	public Employee(String name, int salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public String getName() {return this.name;}
	public int getSalary() {return this.salary;}
}
