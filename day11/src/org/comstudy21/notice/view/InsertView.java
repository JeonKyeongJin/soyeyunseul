package org.comstudy21.notice.view;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.comstudy21.model.NoticeVo;
import org.comstudy21.notice.Run;

public class InsertView extends Noticeview {
	@Override
	public void display() {
		System.out.println("::::: �Է� :::::");
		// �̸�,����,��¥
		// Run.noticeVo �� ������ Controller�� �̵�
		System.out.print("�̸� �Է� ");
		String user = scan.next();
		System.out.print("���� �Է� ");
		String message = scan.next();
		System.out.print("��¥ ");
		String regDate = scan.next();

		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);

		Run.noticeVo = new NoticeVo(0, user, message, regDate);
		System.out.println("�Է� �Ϸ�!");
		// �۾� �Ϸ� �� �ڵ����� Controller�� �̵�.

	}
}
