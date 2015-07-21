package kz.projects.gwt.MyGWTProject.server;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("app-context.xml");

		HelloBo helloBo = (HelloBo) appContext.getBean("helloBo");

		HelloWorld hello = helloBo.getHello();

		System.out.println(hello.getText());
	}
}
