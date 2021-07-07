package com.example.abstractclasses;

public class Developer extends Person{
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	/*
	 * since these getters and setters were defined in the abstract Person class, 
	 * we can call them by the extends keyword and then implement them in the
	 * Developer class itself. Therefore, we have access to the name variable in 
	 * Person.
	 */
}
