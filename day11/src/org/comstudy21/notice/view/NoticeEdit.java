package org.comstudy21.notice.view;

import org.comstudy21.notice.Run;

public class NoticeEdit extends Noticeview {
	@Override
	public void display() {
		System.out.println("::::: Notice ���� ���� :::::");
		if (Run.noticeVo == null) {
			System.out.println("�˻� ����� �����ϴ�");
			return;
		}
		System.out.println(Run.noticeVo);
		System.out.print("�̸��� ���� �Ͻðڽ��ϱ�?(Y/N)");
		char yn = scan.next().charAt(0);
		if (yn == 'Y' || yn == 'y') {
			System.out.print("�� �̸�> ");
			Run.noticeVo.setUser(scan.next());
		}
		System.out.print("�޸� ���� �Ͻðڽ��ϱ�?(Y/N)");
		yn = scan.next().charAt(0);
		if (yn == 'Y' || yn == 'y') {
			System.out.print("�� �޸�>");
			Run.noticeVo.setMessage(scan.next());
		}
		System.out.print("��¥�� ���� �Ͻðڽ��ϱ�?(Y/N)");
		yn = scan.next().charAt(0);
		if (yn == 'Y' || yn == 'y') {
			System.out.print("�� ��¥> ");
			Run.noticeVo.setRegDate(scan.next());
		}

	}

}
