package org.comstudy21.notice.view;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.comstudy21.model.NoticeVo;
import org.comstudy21.notice.Run;

public class InsertView extends Noticeview {
	@Override
	public void display() {
		System.out.println("::::: 입력 :::::");
		// 이름,내용,날짜
		// Run.noticeVo 에 저장후 Controller로 이동
		System.out.print("이름 입력 ");
		String user = scan.next();
		System.out.print("내용 입력 ");
		String message = scan.next();
		System.out.print("날짜 ");
		String regDate = scan.next();

		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);

		Run.noticeVo = new NoticeVo(0, user, message, regDate);
		System.out.println("입력 완료!");
		// 작업 완료 후 자동으로 Controller로 이동.

	}
}
