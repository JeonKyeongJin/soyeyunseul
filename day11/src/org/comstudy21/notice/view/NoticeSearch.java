package org.comstudy21.notice.view;

import org.comstudy21.model.NoticeVo;
import org.comstudy21.notice.Run;

public class NoticeSearch extends Noticeview {
	@Override
	public void display() {
		System.out.println("::::: Notice ���� �˻� :::::");
		System.out.print("�̸� �˻�");
		String user = scan.next();
		Run.noticeVo = new NoticeVo(0, user, null, null);
	}
}
