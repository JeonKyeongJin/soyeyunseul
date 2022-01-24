package org.comstudy21.notice.view;

import org.comstudy21.model.NoticeVo;
import org.comstudy21.notice.Run;

public class NoticeListView extends Noticeview {
	@Override
	public void display() {
		System.out.println("::::: Notice 목록 :::::");
		// Run.noticeArr 출력
		for (NoticeVo notice : Run.noticeArr) {
			System.out.println(notice);
		}
	}

}
