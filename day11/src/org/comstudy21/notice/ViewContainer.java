package org.comstudy21.notice;

import org.comstudy21.notice.view.Noticeview;

public class ViewContainer {
	public void run(Noticeview view) {
		System.out.println("--------------------------------------");
		view.display();
		System.out.println("--------------------------------------");

	}
}