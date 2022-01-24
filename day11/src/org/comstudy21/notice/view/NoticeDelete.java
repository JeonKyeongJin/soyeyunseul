package org.comstudy21.notice.view;

import org.comstudy21.notice.Run;

public class NoticeDelete extends Noticeview {
	@Override
	public void display() {
		System.out.println("::::: Notice 메모 삭제 :::::");
		if (Run.noticeVo == null) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
		System.out.println(Run.noticeVo);
		System.out.print("정말 삭제 하시겠습니까?");
		char yn = scan.next().charAt(0);
		if (yn == 'n') {
			Run.noticeVo = null;
		}
	}
}
