package projectTests;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class CollectionItr {
	public static void main(String[] args) {
		//showcases the iterator
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Citrus");
		
		//iterator
		//Iterator<String> iter = fruits.iterator();//iterates over the list in Array List
		//while(iter.hasNext()) {
			//String fruit = iter.next();
			//System.out.println(fruit);
		//}
		fruits.forEach((element) -> {System.out.println(element);});//just prints the elements but in lambda notation
		//this does exact same thing but using lambda notation 
	}
}
