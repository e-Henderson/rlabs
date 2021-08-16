package dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import common.model.User;
import common.model.Workers;
import common.util.DBUtil;

public class UserDaoImpl implements UserDao{

	public void create(User user) {
		Session session = DBUtil.getInstance().getSession();//might be a problem
		
		Transaction tx = null;
		try {
			tx=session.beginTransaction();
			session.save(user);
			tx.commit();
			
		}catch(HibernateException h) {
			if (tx != null) {
				tx.rollback();
			}
			throw h;
		}
		session.close();
		
	}

	public User getUser(String username, String password) {
		Session session =DBUtil.getInstance().getSession();
		
		//below line shouldn't cause trouble
		Query query = session.createQuery("FROM common.model.User where username = :uname and password= :pswd");//is causing problems
		query.setString("uname", username);
		query.setString("pswd", password);
		
		User user = (User) query.uniqueResult();
		
		session.close();
		return user;
	}

}
