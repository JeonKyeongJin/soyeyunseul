package org.comstudy21.notice.view;

import org.comstudy21.model.NoticeVo;
import org.comstudy21.notice.Run;

public class NoticeDetail extends Noticeview {
	@Override
	public void display() {
		System.out.println("----- Notice �󼼸�� -----");
		System.out.print(Run.noticeVo);
	}

}
