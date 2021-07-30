package vimalex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareObjects {
	//uses the comparator
	public static void main(String[] args) {
		User u1 = new User("Mike", 30);
		User u2 = new User("Kevin", 32);
		User u3 = new User("Barb", 25);
		
		//List
		List<User> users = new ArrayList<User>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
		
		//comparator
		//Collections.sort(users, new NameComparator());
		
		//comparable
		Collections.sort(users);
		
		for (User u : users) {
			System.out.println(u);
		}
	}
}


class NameComparator implements Comparator<User>{//Comparator is a built-in functional interface

	@Override
	public int compare(User o1, User o2) {//here is the method associated with that interface
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}

class User implements Comparable<User>{//Comparable is another built-in func. interface
	String name=null;
	int age =0;
	
	//constructor
	public User(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return "["+ this.name +","+ this.age +"]";
	}

	@Override
	public int compareTo(User otherObj) {//here is that specific method
		// TODO Auto-generated method stub
		return this.name.compareTo(otherObj.name);
	}
	
	
}