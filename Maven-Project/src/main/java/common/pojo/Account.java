package common.pojo;

public class Account {
	//login info
	private int userId;
	private String userPassword;
	//account info
	private int custId;//will be used for the customer database
	private int acctId;//account
	private String fname;//account//customer
	private String lname;//account/customer
	private double balance;//account 
	
	public Account() {
		super();
	}
	
	public Account(int userId, String userPassword) {//only asks for id and password for login
		//mirrors the database login table
		this.userId=userId;
		this.userPassword=userPassword;
	}
	
	public Account (int custId, String fname, String lname) {//for customer table
		this.custId=custId;
		this.fname=fname;
		this.lname=lname;
	}
	
	//TODO: place Account constructor with account info when needed
	//TODO: Do i even need this one? Or just get rid of it? 
	public Account(int userId, String userPassword, int custId, int acctId, String fname, String lname, double balance) {
		this.userId=userId;
		this.userPassword=userPassword;
		this.custId=custId;
		this.acctId=acctId;
		this.fname=fname;
		this.lname=lname;
		this.balance=balance;
	}
	
	//getters and setters
	public int getUserId() {
		return this.userId;
	}
	public void setUserId(int userId) {
		this.userId=userId;
	}
	
	public String getUserPassword() {
		return this.userPassword;
	}
	public void setUserPassword(String acctPassword) {
		this.userPassword=acctPassword;
	}
	
	//getters and setters for
	public int getCustId() {
		return this.custId;
	}
	public void setCustId (int custId) {
		this.custId=custId;
	}
	
	public int getAcctId() {
		return this.acctId;
	}
	public void setAcctId(int acctId) {
		this.acctId=acctId;
	}
	
	public String getFirstN() {
		return this.fname;
	}
	public void setFirstN(String fname) {
		this.fname=fname;
	}
	
	public String getLastN() {
		return this.lname;
	}
	public void setLastN(String lname) {
		this.lname=lname;
	}
	
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double balance) {
		this.balance=balance; 
	}
}
