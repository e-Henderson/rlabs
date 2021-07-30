package examples;

import java.util.ArrayList;
import java.util.List;

interface Drawable {
	void draw();
}

public class LambdaEx {
	public static void main(String[] args) {
		int width =10;
		
		Drawable d2 = () -> {System.out.println("Drawing " + width);};//lambda's require two ; at the end
		d2.draw();//You have created a variable via the interface, d2, that you will call on for the draw method in Drawable
		/*
		 * You didn't need to implement Drawable in the class declaration because Java automatically assumes that
		 * the lambda expression points to it. In essence, the lambda expression acts as a function that uses Drawable.
		 * 
		 * However, you don't need an interface to use the expression as seen below.
		 */
		List<String> lists = new ArrayList<String>();
		//add some names
		lists.add("Bojack");
		lists.add("Emil");
		lists.add("Luke Skywalker");
		lists.add("Ada Lovelace");
		
		//lambda expression follows below
		lists.forEach((n)->System.out.println("\n" + n));//.forEach is equivalent to a for loop,
		//enhanced or not 
		
	}
}
