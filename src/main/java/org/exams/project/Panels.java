package org.exams.project;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;

public class Panels extends WebPage {
	private static final long serialVersionUID = -7768500919334198857L;
	public static final String CONTENT_ID = "contentComponent";
	private Component headerPanel;
	 private Component contentPanel;
	public Panels() {
         add(headerPanel=new HeaderPanel("headerPanel"));
         add(contentPanel=new ContentPanel("contentPanel"));
         
       }
	public Component getHeaderPanel() {
		return headerPanel;
	}
	public void setHeaderPanel(Component headerPanel) {
		this.headerPanel = headerPanel;
	}
	public Component getContentPanel() {
		return contentPanel;
	}
	public void setContentPanel(Component contentPanel) {
		this.contentPanel = contentPanel;
	}

	
}
