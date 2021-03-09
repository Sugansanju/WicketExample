package org.exams.project;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.model.Model;

public class Page1 extends Panels {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6256160869246108027L;
	public Page1() {
		final RequiredTextField<String> username = new RequiredTextField<String>("username", Model.of(""));
		final PasswordTextField password = new PasswordTextField("password", Model.of(""));
		password.setLabel(Model.of("Password"));
		Form<?> form = new Form<Void>("userForm") {
			private static final long serialVersionUID = 8302674460977938416L;
			protected void onSubmit() {
				setResponsePage(SuccessPage.class);
			}
		};

		add(form);
		form.add(username);
		form.add(password);
		getContentPanel().setVisible(false);
	} 
}
