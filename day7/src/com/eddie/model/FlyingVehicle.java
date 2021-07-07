package com.eddie.model;

public class FlyingVehicle extends Vehicle{
	//again private data members
	
	private short wings;
	private Engine engine;
	
	//define new constructor
	public FlyingVehicle(short wings, Engine engine) {
		this.wings=wings;
		this.engine=engine;
	}
	//define a new default constructor
	public FlyingVehicle() {}
	
	//get and set
	public short getWings() {return this.wings;}
	public void setWings(short wings) {this.wings=wings;}
	
	public Engine getEngine() {return this.engine;}
	public void setEngine(Engine engine) {this.engine=engine;}
	
	public void fly() {//default construct
		System.out.println("FlyingVehicle is flying...");
	}
	
	public void refuel() {
		System.out.println("FlyingVehicle is refueling.");
	}
	
	public void liftOff() {
		System.out.println("FlyingVehicle is lifting off..");
	}
	
	public void land() {
		System.out.println("FlyingVehicle is landing...");
	}
}
