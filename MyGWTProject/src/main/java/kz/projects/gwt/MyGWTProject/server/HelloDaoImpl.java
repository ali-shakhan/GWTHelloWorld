package kz.projects.gwt.MyGWTProject.server;
import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class HelloDaoImpl extends HibernateDaoSupport implements HelloDao {

	public HelloWorld getHello() {
		List list = getHibernateTemplate().find("from HelloWorld");
		return (HelloWorld) list.get(0);
	}
}
