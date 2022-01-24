package org.comstudy21.notice.view;

import org.comstudy21.notice.Run;

public class NoticeEdit extends Noticeview {
	@Override
	public void display() {
		System.out.println("::::: Notice 정보 수정 :::::");
		if (Run.noticeVo == null) {
			System.out.println("검색 결과가 없습니다");
			return;
		}
		System.out.println(Run.noticeVo);
		System.out.print("이름을 수정 하시겠습니까?(Y/N)");
		char yn = scan.next().charAt(0);
		if (yn == 'Y' || yn == 'y') {
			System.out.print("새 이름> ");
			Run.noticeVo.setUser(scan.next());
		}
		System.out.print("메모를 수정 하시겠습니까?(Y/N)");
		yn = scan.next().charAt(0);
		if (yn == 'Y' || yn == 'y') {
			System.out.print("새 메모>");
			Run.noticeVo.setMessage(scan.next());
		}
		System.out.print("날짜를 수정 하시겠습니까?(Y/N)");
		yn = scan.next().charAt(0);
		if (yn == 'Y' || yn == 'y') {
			System.out.print("새 날짜> ");
			Run.noticeVo.setRegDate(scan.next());
		}

	}

}
