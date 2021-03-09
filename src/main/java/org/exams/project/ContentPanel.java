package org.exams.project;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;

public class ContentPanel extends Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5815552372532715382L;

	public ContentPanel(String id) {
		super(id);
		final RequiredTextField<String> username = new RequiredTextField<String>("username", Model.of(""));
		final PasswordTextField password = new PasswordTextField("password", Model.of(""));
		password.setLabel(Model.of("Password"));
		Form<?> form = new Form<Void>("userForm") {
			private static final long serialVersionUID = 8302674460977938416L;

			protected void onSubmit() {
				System.out.println("Call Submit ");
				setResponsePage(SuccessPage.class);
			}
		};

		add(form);
		form.add(username);
		form.add(password);
		// TODO Auto-generated constructor stub
	}

}
