package projectTests;

public class Obj {
	protected String name;
	protected int age;
	
	public Obj() {}//no-args
	
	public Obj (String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {return this.name;}
	public int getAge() {return this.age;}
}
