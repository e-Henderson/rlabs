package com.eddie.model;

public class Vehicle {
	private String name;
	private long serialNumber;
	//both data members are private, so they can only be accessed within
	//this class.
	
	//getters and setters. 
	/*
	 * these will be used in order to access the private data members. 
	 */
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	
	public long getSerialNumber() {return this.serialNumber;}
	public void setSerialNumber(long serialNumber) {this.serialNumber=
			serialNumber;}
	//these lines of code don't necessarily need to be broken up over 
	//multiple lines of code. They can be written in one line.
	
	public void move() {//default constructor
		System.out.println("Vehicle is moving...");
	}
	
	public void move(int spaces) {//parameterized constructor
		System.out.println("Vehicle moved " + spaces + " spaces");
	}
	
}
