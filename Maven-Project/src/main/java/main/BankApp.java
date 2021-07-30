package main;

import client.BankConsole;

public class BankApp {
	public static void main(String[] args) {
		//where everything, or at least the BankConsole will be called
		BankConsole bc =new BankConsole();
		bc.startMenu();
	}
	
}
