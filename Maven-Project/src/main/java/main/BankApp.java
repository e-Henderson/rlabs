package main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import client.BankConsole;

public class BankApp {
	//private static final Logger log = LogManager.getLogger(BankApp.class);
	public static void main(String[] args) {
		//where everything, or at least the BankConsole will be called
		BankConsole bc =new BankConsole();
		//log.info("Starting ... ");
		bc.startMenu();
		//log.info("Ended.");
	}
	
}
