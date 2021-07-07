package com.example.testInterface;

import com.example.modelInterfaces.Swimmer;
import com.example.modelInterfaces.Whale;

public class TestSwimmer {
	public static void main(String[] args) {
		Swimmer beluga;
		beluga = new Whale();
		beluga.swim();
		beluga.dive();
		
		System.out.println("There are "+Swimmer.NUMBER_OF_FEET_IN_A_LEAGUE+" in a League");
		
		int feetTraveled=80_000;
		System.out.println("If whales went: "+feetTraveled+" feet, they "+
		"would have gone "+Swimmer.convertFromFeetToLeagues(feetTraveled) + " leagues.");
	}
}
