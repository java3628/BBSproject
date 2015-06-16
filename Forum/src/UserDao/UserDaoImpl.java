package UserDao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import Pojos.User;

public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(user);
	}

}
