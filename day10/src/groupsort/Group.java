package groupsort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Group {
	/*
	 * Array List group that stores the groups
	 * 		prompt to ask how many groups are there?
	 * 		input is put into strings because prompt asks for commas to separate input
	 * 		
	 * 
	 * 		**can do a 2d array list**
	 * 				***maybe have an arraylist for each part? unsure***
	 * 		**maybe have a prompt that asks which people goes into which group**
	 * 
	 * 		another prompt to enter the first name of the individuals
	 * 		take that input and place in array list groups
	 */
	//static variables live here
	static Scanner scan =new Scanner(System.in);
	static private ArrayList<String> names = new ArrayList<String>();
	static private ArrayList<String> groupNames = new ArrayList<String>();
	
	public static void main(String[] args) {
		ArrayList<Member> members = new ArrayList<Member>();
		
		//int count=0;
		//do {
			//take inputs from prompt
			//place those into objects
			//add objects to Array List 
		//}while(//some condition)
		collectNames();
		//if input equals quit
				//return quit 
		
		//System.out.println("Enter group names: ");
		//String groupNames = scan.nextLine();
	}
	
	//****************************************************************************************//
	public static void collectNames() {//didn't know it could be void
		System.out.println("Enter first name and score, followed by a comma: ");
		String firstNameIn = scan.nextLine();
		String[] firstName = firstNameIn.split(",");
		for (String i : firstName) {//adds names to array list
		
			names.add(i);
	
		}
		System.out.println(names);
	}
	
	//want a method for the group name and size
	public static void collectGroups() { 
		//while loop handles the actual group names 
		System.out.println("Enter group names,separated by a comma (type 'done' when finished): ");
		String[] input = scan.nextLine().split(",");
		for (String j :input) {
			groupNames.add(j);
		}
		System.out.println(groupNames);
		
	}
	
}