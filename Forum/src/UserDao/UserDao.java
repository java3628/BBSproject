package UserDao;

import org.springframework.stereotype.Repository;

import Pojos.User;

@Repository
public interface UserDao {

	 void addUser(User user);
	 
}
