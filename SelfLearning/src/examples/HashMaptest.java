package examples;

import java.util.HashMap;

public class HashMaptest {
	public static void main(String[] args) {
		 // create a HashMap
	    HashMap<String, Integer> prices = new HashMap<>();

	    // insert entries to the HashMap
	    prices.put("Shoes", 200);
	    prices.put("Bag", 300);
	    prices.put("Pant", 150);
	    System.out.println("Normal Price: " + prices);//prints it in reverse order first off
	    //but also prints it in array format.

	    System.out.print("Discounted Price: ");

	    //pass lambda expression to forEach()
	    prices.forEach((key, value) -> {//the forEach is iterating through the hash map and printing
	    	//the results, given the math expression in the value portion of the code

	      // decrease value by 10%
	      value = value - value * 10/100;
	      System.out.print(key + "=" + value + " ");
	    });
	}
}
