package dealshark;
//do we want to make this abstract? 
//would we need the interface if only for access to multiple things? Could definitely implement interafce here 
abstract public class Account implements AccountInterface{//once a concrete class is made, the interface methods should
	private String acctName;								//be called there.
	private String userName;//first and last name
	private String acctEmail;
	private String password;
	private int phoneNum;//would this be an int? probably
	private int userBirth;//stores birthday 	
	
}
