import org.junit.Before;
import org.junit.Test;

import com.place.dao.UserDao;
import com.place.domain.UserDomain;

public class UserInsertTest {
	UserDomain user;
	@Before
	public void setUp() throws Exception {
		//user = new UserDomain("hyunjun", "0506", "hyun", "M");
		
	}

	@Test
	public void test() {
		UserDao uDao=new UserDao();
		try {
			uDao.selectUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
