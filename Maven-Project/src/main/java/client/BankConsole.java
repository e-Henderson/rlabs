package client;

//import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import common.pojo.Account;
import service.AccountManager;

public class BankConsole {
	private AccountManager am = new AccountManager();
	private static Scanner scan = new Scanner(System.in);
	
	public void startMenu() {//probably a way to split this method up. Too long. 
		boolean exit = false;//might need another boolean variable since there are two do/while
		//TODO: put in logger
		//TODO: place junit tests 
		do {
			loginMenu();
			String choice = scan.next();
			
			switch (choice) {
			case "1":
				login();
				break;
			case "2":
				createAccount(scan);
				break;
			case "3":
				exit=true;
				break;
			default:
				break;
			}
			do {
				System.out.println("Choose an option: ");
				menu();//prints menu options
				String opt = scan.next();
				
				switch(opt) {
				case "1"://view account
					System.out.println("Feature not available.");
					break;
				case "2"://withdraw/deposit
					System.out.println("Not available.");
					break;
				case "0":
					exit=true;
					break;
				default:
					break;
				}
			}while(!exit);
		}while(!exit);
		//scan.close();
		System.out.println("You have exited the application.");
		
	}
	private void loginMenu() {
		System.out.println("1. Login");
		System.out.println("2. Create Account");
	}
	
	//menu method
	private void menu() {
		System.out.println("1. View Balance of Account");
		System.out.println("2. Withdrawal/Deposit");
		System.out.println("0. Quit Application");
		//System.out.println("6. Transfer Funds");
	}
	
	private String getInput(String prompt, Scanner scan) {
		System.out.println(prompt);
		return scan.next();
	}
	
	//login method
	private void login() {
		//call the Account constructor that is specific to these parameters
		System.out.println("Enter user id: ");
		int id = scan.nextInt();
		System.out.println("Enter password: ");
		String pass = scan.next();
		
		try {
			@SuppressWarnings("unused")
			List<Account> login = am.loginInfo(id, pass);
		}catch(Exception e) {
			System.err.println("Login Error: " + e.getMessage());
		}
		
	} 
	
	//create account method
	private void createAccount(Scanner scan) {//has to be a way to optimize this 
		String newId = getInput("Enter a numeric user id: ", scan);
		String newPass = getInput("Enter a password: ", scan);
		Account newLogin = new Account(Integer.parseInt(newId), newPass);
		
		String first_name= getInput("Enter first name: ", scan);
		String last_name = getInput("Enter last name: ", scan);
		String balance = getInput("Enter starting balance: ", scan); 
		Account acctInfo = new Account(Integer.parseInt(newId), first_name,last_name,Float.parseFloat(balance));
		try {
			am.addAccountLogin(newLogin);
			am.addAccountInfo(acctInfo);
			System.out.println("Your information has been saved. ");
		}catch (Exception e) {
			System.out.println("Sys. Error: Unable to add: " + e.getMessage());
		}
	}
	//TODO: add view account method
	private void viewAccount() {}
	//TODO: add view customer method
	
	//TODO: add make withdrawal method
	
	//TODO: add transfer funds method
	
}

