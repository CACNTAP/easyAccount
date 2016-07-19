package test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.tap.dao.DBSession;

public class test {

	@Test
	public void testDB(){
		SqlSession session = DBSession.newInstance();
		
		System.out.println(session);
	}
}
