package pojo;

public class Member {
	private String name;
	//private Group group;
	private double score;
	
	public Member (String name) {
		super();
		this.name=name;
	}

	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score=score;
	}
	
	public boolean equals(Object obj) {
		return this.getName().equals(()
	}
	
}
