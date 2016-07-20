package test;

import org.junit.Test;
import com.tap.dao.UsersDao;
import com.tap.entity.Users;

public class test {

	@Test
	public void testDB(){
		Users user = new Users();
		user.setUserName("dasd");
		user.setPassword("asd");
		user.setMobile("123");
		user.setMail("123@123");
		
		UsersDao dao = new UsersDao();
		dao.insertUser(user);
	}
}
