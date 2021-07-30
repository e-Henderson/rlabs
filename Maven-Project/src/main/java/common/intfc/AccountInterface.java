package common.intfc;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import common.pojo.Account;

public interface AccountInterface {
	//this interface will be used with both the service(AccountManager) and the
	//dao(AccountDAO) 
	
	public List<Account> loginInfo() throws SQLException;
	public List<Account> loginInfo(int userId,String userPassword) throws SQLException;
	//must now create methods for (customer side):
	/*		creating account
	 * 		viewing the balance
	 * 		making a withdrawal/deposit
	 */
	//add the save, update and delete methods?
	public int addAccountLogin(Account account) throws Exception;
	public int addAccountInfo(Account account) throws Exception;
	
}
