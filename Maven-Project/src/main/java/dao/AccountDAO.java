package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import common.intfc.AccountInterface;
import common.pojo.Account;
//import utilities.DAOUtil;


//TODO: Figure out the SQL driver error when the DBUtil class is called. The driver is there
//in the pom file, but for some reason it's not picking it up. 


public class AccountDAO implements AccountInterface{
	//TODO: Is own class but SQL driver issue crops up when DBUtil is used
	private static final String Conn_User = "postgres";
	private static final String Conn_Pass = "password";
	private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
	
	//the below is just the no-args method for proof of concept.
	@Override
	public List<Account> loginInfo() throws SQLException{
		List<Account> logIn = new ArrayList<Account>();
		try (Connection connect=DriverManager.getConnection(URL,Conn_User,Conn_Pass)){
			
			PreparedStatement pstmt= connect.prepareStatement("select * from bank.login l");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Account acct = new Account(rs.getInt(1),rs.getString(2));
				logIn.add(acct);
			}
		} catch (SQLException e) {e.printStackTrace();}
		
		return logIn;
	}

	@Override//Login method that is used in BankConsole 
	public List<Account> loginInfo(int userId, String userPassword) throws SQLException {
		List<Account> logIn = new ArrayList<Account>();
		
		try(Connection connect=DriverManager.getConnection(URL,Conn_User,Conn_Pass)){
			PreparedStatement pstmt = connect.prepareStatement("select user_id, userpass from bank.login l where user_id=? and userpass =?");

			pstmt.setInt(1, userId);
			pstmt.setString(2, userPassword);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Account acct = new Account(rs.getInt(1), rs.getString(2));
				logIn.add(acct);
				System.out.println("Login Successful.\n");
			}
			
		}catch(SQLException e) {e.printStackTrace();}
	
		return logIn;
	}

	@Override//Adds new login information for new user. Connected to createAccount in Console
	public int addAccountLogin(Account account) throws Exception {
		// TODO Auto-generated method stub
		Connection connect = DriverManager.getConnection(URL,Conn_User,Conn_Pass);
		
		PreparedStatement pstmt = connect.prepareStatement("insert into bank.login (user_id, userpass) values (?,?);");
		pstmt.setInt(1, account.getUserId());
		pstmt.setString(2, account.getUserPassword());
		
		int insert = pstmt.executeUpdate();
		return insert;	
	}

	@Override//Adds new account information for new user. Connected to createAccount in Console
	public int addAccountInfo(Account account) throws Exception {
		Connection connect = DriverManager.getConnection(URL,Conn_User,Conn_Pass);
		 
		PreparedStatement pstmt2 = connect.prepareStatement("insert into bank.customer (cust_id, firstn, lastn, balance) values (?,?,?,?);");//add balance
		pstmt2.setInt(1, account.getCustId());
		pstmt2.setString(2, account.getFirstN());
		pstmt2.setString(3, account.getLastN());
		pstmt2.setLong(4, (long) account.getBalance());//add a balance line 
		int insert2 = pstmt2.executeUpdate();
		return insert2;
	}

	@Override
	public void viewAcctInfo(int custId) throws SQLException {
		try(Connection connect = DriverManager.getConnection(URL,Conn_User,Conn_Pass)){
			PreparedStatement pstmt = connect.prepareStatement("select cust_id, firstn ,lastn, balance from bank.customer c2 where cust_id = ?");
			pstmt.setInt(1, custId);//where I'd use the login info if there
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Account acct = new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getLong(4));
				System.out.println(acct);
			}
			
		}catch(SQLException e) {e.printStackTrace();}
		
	}

	
}
