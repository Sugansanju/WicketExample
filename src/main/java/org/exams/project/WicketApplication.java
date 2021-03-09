package org.exams.project;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class WicketApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		// TODO Auto-generated method stub
		return Panels.class;
	}
	
	@Override
	protected void init() {
		super.init();
	}

}
