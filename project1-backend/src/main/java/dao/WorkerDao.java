package dao;

import java.util.List;

import javax.transaction.SystemException;

import common.model.Workers;

public interface WorkerDao {
	//method to create our worker object
	public void create(Workers worker);
	//method to list the workers
	public List<Workers> findAll();
	//method to find the workers by some parameter
	//since I'm doing login, this method should return the
	//specific employee by login 
	public Workers findByLogin(String username, String password);//should be found by this information
	//method to delete the id, say in event of worker leaving company
	public void delete(int id);
}
