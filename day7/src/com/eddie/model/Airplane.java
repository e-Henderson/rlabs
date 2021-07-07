package com.eddie.model;

public class Airplane extends FlyingVehicle{
	

	private short wheels;
	private short propellers;
	
	//get and set
	public short getWheels() {return this.wheels;}
	public void setWheels(short wheels) {this.wheels=wheels;}
	
	public short getPropellers() {return this.propellers;}
	public void setPropellers(short propellers) {this.propellers=propellers;}
	
	public void turn() {
		System.out.println("Turning....");
	}

}
