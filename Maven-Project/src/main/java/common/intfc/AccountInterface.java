package common.intfc;

import java.sql.SQLException;
import java.util.List;

import common.pojo.Account;

public interface AccountInterface {
	
	public List<Account> loginInfo() throws SQLException;
	public List<Account> loginInfo(int userId,String userPassword) throws SQLException;
	public void viewAcctInfo(int custId)throws SQLException;
	//must now create methods for (customer side):
	/*
	 * 		viewing the balance
	 * 		making a withdrawal/deposit
	 */
	
	public int addAccountLogin(Account account) throws Exception;//create account
	public int addAccountInfo(Account account) throws Exception;//create account
	
}
