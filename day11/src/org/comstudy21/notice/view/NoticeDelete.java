package org.comstudy21.notice.view;

import org.comstudy21.notice.Run;

public class NoticeDelete extends Noticeview {
	@Override
	public void display() {
		System.out.println("::::: Notice �޸� ���� :::::");
		if (Run.noticeVo == null) {
			System.out.println("�˻� ����� �����ϴ�.");
			return;
		}
		System.out.println(Run.noticeVo);
		System.out.print("���� ���� �Ͻðڽ��ϱ�?");
		char yn = scan.next().charAt(0);
		if (yn == 'n') {
			Run.noticeVo = null;
		}
	}
}
