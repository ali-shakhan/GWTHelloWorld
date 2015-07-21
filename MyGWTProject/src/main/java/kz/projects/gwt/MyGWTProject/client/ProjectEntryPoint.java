package kz.projects.gwt.MyGWTProject.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ProjectEntryPoint implements EntryPoint {
	private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

	public void onModuleLoad() {
		greetingService.greetServer(new AsyncCallback<String>() {
			public void onFailure(Throwable caught) {
				RootPanel.get().add(new Label("Error\n" + caught.getMessage()));
			}

			public void onSuccess(String result) {
				RootPanel.get().add(new Label(result));
			}
		});
	}
}
