package com.example.modelInterfaces;

public interface Swimmer {
	int NUMBER_OF_FEET_IN_A_LEAGUE = 18_228;//the underscore in the number is for
											//readability 
	
	void swim();
	/*Remember there is no implementation provided
	 * for interfaces. These methods are abstract.
	 */
	default void dive() {
		System.out.println("Diving");
	}//default here is letting the method exist but it doesn't have to actually be 
	//called in the whale class. It just exists here until called on. 
	
	static int convertFromFeetToLeagues(int feet) {
		return feet/NUMBER_OF_FEET_IN_A_LEAGUE;
	}
}
