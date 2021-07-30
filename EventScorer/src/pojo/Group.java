package pojo;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private String name;
	private double score;
	List<Member> members= new ArrayList<Member>();//creates a list of Members 
	
	public Group(String name) {
		super();
		this.name=name;
	}
	
	//getters and setters for name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//getters and setters for score
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	
	//getters, setters and addder for members
	public List<Member> getMembers(){//uses the List and Member object to return the members
		return members;
	}
	
	public void setMembers(List<Member> members) {
		this.members=members;
	}
	
	public void addMember(Member member) {//adds the members 
		this.members.add(member);
	}
	
	
}
//look at the Map<> thing. That's how you get the string, int relationship
