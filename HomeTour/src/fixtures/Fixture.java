package fixtures;

public class Fixture {//needs to be an abstract class
/*
 * String name: title for fixture
 * String shortDescription: one-sentence description of the fixture
 * 
 * String longDescription: paragraph long description of the fixture
 */
	public String name;
	public String shortDescription;
	public String longDescription;
	
	//need a way to have access to these things, so I need an abstract method
	public Fixture(String name, String shortDescription, String longDescription) {
		this.name=name;
		this.shortDescription=shortDescription;
		this.longDescription=longDescription;
	}
	//need getters and setters for these variables 
	public String getName() {return this.name;}
	public void setName(String name) {this.name=name;}
	
	public String getShortDes() {return this.shortDescription;}
	public void setShortDes(String shortDescription) {this.shortDescription=
			shortDescription;}
	
	public String getLongDes() {return this.longDescription;}
	public void setLongDes(String longDescription) {this.longDescription =
			longDescription;}
	}
