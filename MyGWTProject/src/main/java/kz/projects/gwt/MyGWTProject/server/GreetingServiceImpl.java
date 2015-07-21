package kz.projects.gwt.MyGWTProject.server;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import kz.projects.gwt.MyGWTProject.client.GreetingService;

@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {

	public String greetServer() {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("app-context.xml");

		HelloBo helloBo = (HelloBo) appContext.getBean("helloBo");

		HelloWorld hello = helloBo.getHello();

		return hello.getText();
	}
}
