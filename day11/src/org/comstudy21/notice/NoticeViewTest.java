package org.comstudy21.notice;

public class NoticeViewTest {

	public static ViewContainer vc = new ViewContainer();

	public static void main(String[] args) {
		vc.run(Run.insertView);
		vc.run(Run.noticeDelete);
		vc.run(Run.noticeSearch);
		vc.run(Run.noticeEdit);
		vc.run(Run.noticeListView);

	}

}
