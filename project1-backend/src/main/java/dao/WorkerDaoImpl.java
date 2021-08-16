package dao;

import java.util.List;

import org.hibernate.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import common.model.Workers;
import common.util.DBUtil;

public class WorkerDaoImpl implements WorkerDao{
	
	public void create(Workers worker) {
		Session session = DBUtil.getInstance().getSession();//might be a problem
		
		Transaction tx = null;
		try {
			tx=session.beginTransaction();
			session.save(worker);
			tx.commit();
			
		}catch(HibernateException h) {
			if (tx != null) {
				tx.rollback();
			}
			throw h;
		}
		session.close();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Workers> findAll() {
		Session session =DBUtil.getInstance().getSession();
		
		Query query = session.createQuery("FROM common.model.Workers");//using the pojo here to ask database some things
		
		List<Workers> workers = query.list();
		
		session.close();
		
		return workers;
	}

	public Workers findByLogin(String username, String password) {
		Session session =DBUtil.getInstance().getSession();
		
		//below line shouldn't cause trouble
		Query query = session.createQuery("FROM common.model.Workers where username, password= :username, :password");
		query.setString("username", username);
		query.setString("password", password);
		
		Workers workers = (Workers) query.uniqueResult();
		
		session.close();
		return workers;
	}

	@SuppressWarnings({ "unused", "removal" })
	public void delete(int id) {
		Session session = DBUtil.getInstance().getSession();
		
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.delete(session.get(Workers.class, new Integer(id)));//might cause problem
			tx.commit();
			
		}catch(HibernateException h) {
			if(tx != null) {
				tx.rollback();
			}
			throw h;
		}
		
	}

}
