package com.example.abstracttest;

import com.example.abstractclasses.Developer;
import com.example.abstractclasses.Person;

public class TestPerson {
	public static void main(String[] args) {
		//Person adam = new Person(); remember that abstract classes can't be instantiated
		Person adam = new Developer();
		/*
		 * here we created another Perosn object called adam but we instantiated it
		 * through the Developer class. Why?
		 * 
		 * Because the Developer class extends the abstract Person class where 
		 * the name variable lives. Through methods that were defined in the Developer
		 * class, the getters and setters, we can use those methods here to set the name
		 * "Adam" and then get that name to be able to print it to the screen. 
		 */
		
		adam.setName("Adam");
		System.out.println(adam.getName());
	}
}
