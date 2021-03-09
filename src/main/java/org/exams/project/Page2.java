package org.exams.project;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.model.Model;
public class Page2 extends Panels {
	private static final long serialVersionUID = -7590400150050501847L;
	public Page2() {
		final RequiredTextField<String> contact = new RequiredTextField<String>("contact", Model.of(""));
		final RequiredTextField<String> username = new RequiredTextField<String>("username", Model.of(""));
		final RequiredTextField<String> firstname=new RequiredTextField<String>("firstname",Model.of(""));
		final RequiredTextField<String> lastname=new RequiredTextField<String>("lastname",Model.of(""));
		Form<?> form = new Form<Void>("signUpForm") {
			private static final long serialVersionUID = 8302674460977938416L;
			protected void onSubmit() {
				setResponsePage(SuccessPage.class);
			}
		};
		add(form);
		form.add(contact);
		form.add(username);
		form.add(firstname);
		form.add(lastname);
		getContentPanel().setVisible(false);
	}
}
