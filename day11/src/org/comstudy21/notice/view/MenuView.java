package org.comstudy21.notice.view;

import org.comstudy21.notice.Run;

public class MenuView extends Noticeview {
	@Override
	public void display() {
		System.out.println("::::: MENU :::::");

		int no = 0;
		while (true) {
			try {
				System.out.println("1.�Է� 2.��� 3.�˻� 4.���� 5.���� 6.����");
				System.out.print("����: ");
				no = scan.nextInt();
				while (no > 6 || no < 1) {
					System.out.println("������ �Ѿ����ϴ�.");
					System.out.print("�ٽ� ����: ");
					no = scan.nextInt();
				}
				break;
			} catch (Exception e) {
				System.out.println("���ڸ� �Է� �ϼ���");
				scan.next();
				continue;
			}

		}
		Run.no = no;
	}

}
