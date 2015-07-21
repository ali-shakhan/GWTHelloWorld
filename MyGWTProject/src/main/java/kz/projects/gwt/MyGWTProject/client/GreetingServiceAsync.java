package kz.projects.gwt.MyGWTProject.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GreetingServiceAsync {
  void greetServer(AsyncCallback<String> callback);
}
