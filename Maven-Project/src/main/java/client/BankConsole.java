package client;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import common.pojo.Account;
import service.AccountManager;

public class BankConsole {
	private AccountManager am = new AccountManager();
	private static Scanner scan = new Scanner(System.in);
	public void startMenu() {
		boolean exit = false;
		//TODO: start putting the logger stuff in asap
		//TODO: try reworking the menu so that the login does not pop up while in the current menu
		/*Thinking of having two do/while loops or something nested that can only work if the login is successful. 
		 * so...if login is successful, go to menu
		 * 		else if the login is not successful, send error
		 * 
		 * 
		 */
		do {
			menu();//prints menu options
			System.out.println("Choose an option: ");
			String opt = scan.next();
			
			switch(opt) {
			case "1"://login stuff
				login();//changed to login() 
				break;
			case "2"://create account
				createAccount(scan);//TODO: test this feature asap
				break;
			case "3"://view balance of account
				System.out.println("Feature not available.");
				break;
			case "4"://make withdrawal/deposit
				System.out.println("Feature not available.");
				break;
			case "5":
				System.out.println("Feature not available.");
				break;
			case "6":
				exit=true;
				break;
			default:
				break;
			}
		}while(!exit);
		//scan.close();
		System.out.println("You have exited the application.");
		
	}
	//somewhere here a start method should be implemented 
	//TODO: implement menu method
	private void menu() {
		System.out.println("1. Login");
		System.out.println("2. Create Account");
		System.out.println("3. View Balance of Account");
		System.out.println("4. Withdrawal/Deposit");
		System.out.println("6. Quit Application");
		//System.out.println("6. Transfer Funds");
	}
	
	private String getInput(String prompt, Scanner scan) {
		System.out.println(prompt);
		return scan.next();
	}
	//TODO: add the login method that will use a scanner object
	private void loginInfo() {//TODO: this is calling the database
		//TODO: will need to delete this method once the other is implemented 
		try {
			List<Account> login = am.loginInfo();
			printInfo(login);
		} catch (Exception e) {
			System.err.println("System Error: "+e.getMessage());
		}
	}
	
	//TODO:add the loginInfo method with parameters
	private void login() {
		//call the Account constructor that is specific to these parameters
		System.out.println("Enter user id: ");
		int id = scan.nextInt();
		System.out.println("Enter password: ");
		String pass = scan.next();
		//Account acc = new Account (id, pass);//might not need because of the method declared 
		try {
			List<Account> login = am.loginInfo(id, pass);//gonna be class not package
			//System.out.println("Login successful.");
		}catch(Exception e) {
			System.err.println("Login Error: " + e.getMessage());
		}
		
	}
	
	//TODO: add view customer method
	
	//TODO: add view account method 
	
	//TODO: add create account method
	private void createAccount(Scanner scan) {//has to be a way to optimize this 
		String newId = getInput("Enter a numeric user id: ", scan);
		String newPass = getInput("Enter a password: ", scan);
		Account newLogin = new Account(Integer.parseInt(newId), newPass);
		
		String first_name= getInput("Enter first name: ", scan);
		String last_name = getInput("Enter last name: ", scan);
		Account acctInfo = new Account(Integer.parseInt(newId), first_name,last_name);
		try {
			am.addAccountLogin(newLogin);
			am.addAccountInfo(acctInfo);
			System.out.println("Your information has been saved. ");
		}catch (Exception e) {
			System.out.println("Sys. Error: Unable to add: " + e.getMessage());
		}
	}
	
	//TODO: add make withdrawal method
	
	//TODO: add transfer funds method
	
	//TODO:Might need to create multiple print methods or just rework this one for the other methods
	private void printInfo(List<Account> login) {
		System.out.println("User Id | User Password ");
		for (Account a : login) {
			System.out.println(a.getUserId() + "|" + a.getUserPassword());
		}
	}
	
}

