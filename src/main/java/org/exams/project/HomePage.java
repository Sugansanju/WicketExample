package org.exams.project;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;

public class HomePage extends WebPage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2179143238439554558L;

	public HomePage() {
		add(new Link<Void>("mylink") {

					/**
			 * 
			 */
			private static final long serialVersionUID = -5665311958898939580L;

					@Override
					public void onClick() {
						setResponsePage(Panels.class);
					}
		        });
	}	
}
