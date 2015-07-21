package kz.projects.gwt.MyGWTProject.server;
import java.io.Serializable;


public class HelloWorld implements Serializable{
	Long ID;
	String text;
	
	public Long getID() {
		return this.ID;
	}
	
	public void setID(Long ID) {
		this.ID = ID;
	}
	
	public String getText() {
		return this.text;
	}
 
	public void setText(String text) {
		this.text = text;
	}
}
