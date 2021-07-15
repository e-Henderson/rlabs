package groupsort;

public class Member {
	//contains members of group and their scores 
	private String firstName;
	private int score;
	
	public Member(String firstName, int score) {//parameterized constructor 
		this.firstName=firstName;
		this.score=score;
	}
	
	//getters and setters
	public String getFirstName() {
		return this.firstName;
	}
	
	public int getScore() {
		return this.score;
	}
}
