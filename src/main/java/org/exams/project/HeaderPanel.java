package org.exams.project;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;

public class HeaderPanel extends Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1493492563550968297L;

	public HeaderPanel(String id) {
		super(id);
		add(new BookmarkablePageLink<Object>("page1", Page1.class));
		add(new BookmarkablePageLink<Object>("page2", Page2.class));
	}

}
