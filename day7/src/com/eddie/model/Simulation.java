package com.eddie.model;

public class Simulation {
	public static void main(String[] args) {
		//we've created a new FlyingVehicle obj
		FlyingVehicle fv = new FlyingVehicle((short)4, new Engine());
		
		//now we can call specific parts of it
		fv.setName("SSV Normandy");
		System.out.println(fv.getName());
		
		//creating an Airplane obj
		Airplane boeing = new Airplane();
		boeing.move(15);
	}
}
