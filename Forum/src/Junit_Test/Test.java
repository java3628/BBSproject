package Junit_Test;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.transaction.annotation.Transactional;

import Pojos.User;

@ContextConfiguration("/spring.xml")
public class Test extends AbstractTransactionalJUnit4SpringContextTests{

	    
	  @org.junit.Test
	  @Transactional
	  public void testAdd(){
		  
		  User A = new User();
		  A.setName("sara");
		  
	  }
	
}
