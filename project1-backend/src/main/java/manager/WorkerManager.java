package manager;

import java.util.List;

import common.model.Workers;
import dao.WorkerDao;
import dao.WorkerDaoImpl;
import dao.WorkerDaoImpl;

public class WorkerManager {
	private WorkerDao dao = new WorkerDaoImpl();
	
	public WorkerManager() {
	}
	
	public void create(Workers worker) {
		dao.create(worker);
	}
	
	public List<Workers> findAll(){
		return dao.findAll();
	}
	
	//he has a static main method, but I don't think i need it here
	
	public Workers findByLogin(String username, String password) {
		return dao.findByLogin(username, password);
	}
	
	public void delete(int id) {
		dao.delete(id);
	}
}
