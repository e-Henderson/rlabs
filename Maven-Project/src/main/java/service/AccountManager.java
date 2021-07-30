package service;

import java.sql.SQLException;
//import java.util.HashMap;
import java.util.List;

import common.intfc.AccountInterface;
import common.pojo.Account;
import dao.AccountDAO;

public class AccountManager implements AccountInterface{
	private AccountDAO aDao = new AccountDAO();
	@Override
	public List<Account> loginInfo() throws SQLException {
		return aDao.loginInfo();
	}

	@Override
	public List<Account> loginInfo(int userId, String userPassword) throws SQLException{//some forward thinking 
		return aDao.loginInfo(userId, userPassword);
	}

	@Override
	public int addAccountLogin(Account account) throws Exception {
		return aDao.addAccountLogin(account);
	}

	@Override
	public int addAccountInfo(Account account) throws Exception {
		return aDao.addAccountInfo(account);
	}
	
}
