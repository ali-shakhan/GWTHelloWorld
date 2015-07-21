package kz.projects.gwt.MyGWTProject.server;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloBoImpl implements HelloBo{
	HelloDaoImpl helloDao;
	
	public HelloDaoImpl getHelloDao() {
		return helloDao;
	}

	public void setHelloDao(HelloDaoImpl helloDao) {
		this.helloDao = helloDao;
	}

	public HelloWorld getHello() {
		return helloDao.getHello();
	}
}
