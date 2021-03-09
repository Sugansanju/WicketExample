package org.exams.project;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.model.Model;

public class SecondPage extends WebPage {

	private static final long serialVersionUID = -5265501800218242728L;

	public SecondPage() {
//		        add(new FeedbackPanel("feedback"));
//		        add(new Label("loginStatus"));
//		       final TextField<String> username=new TextField<String>("username",Model.of(""));
//		       username.setRequired(true);
//		       
//		        final PasswordTextField password = new PasswordTextField("password",Model.of(""));
//		        password.setLabel(Model.of("Password")); 
//		        
//		        final PasswordTextField cpassword = new PasswordTextField("cpassword",Model.of(""));
//		        cpassword.setLabel(Model.of("Confirm Password"));
//		        
//		        Form<?> form = new Form<Void>("userForm") {
//		        	
//					private static final long serialVersionUID = 5635066861819673204L;
//
//					protected void onSubmit() {
//		                setResponsePage(SuccessPage.class);
//		            }
//		        };
//		        add(form);
//		        form.add(username);
//		        form.add(password);
//		        form.add(cpassword);
//		        form.add(new EqualPasswordInputValidator(password, cpassword));

		
//		  add (new Label("head","Sign In"));
		 
		final RequiredTextField<String> username = new RequiredTextField<String>("username", Model.of(""));
		final PasswordTextField password = new PasswordTextField("password", Model.of(""));
		password.setLabel(Model.of("Password"));

		Form<?> form = new Form<Void>("userForm") {
			/**
			 * 
			 */
			private static final long serialVersionUID = 8302674460977938416L;

			protected void onSubmit() {
				System.out.println("Call Submit ");
				setResponsePage(Panels.class);
			}
		};

		add(form);
		form.add(username);
		form.add(password);

	}
}
