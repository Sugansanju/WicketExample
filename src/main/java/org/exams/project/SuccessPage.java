package org.exams.project;

import org.apache.wicket.markup.html.basic.Label;

public class SuccessPage extends Panels {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 789409667186596882L;

	public SuccessPage() {
		add(new Label("message","Congratulations !"));
		getContentPanel().setVisible(false);
	}	
}
