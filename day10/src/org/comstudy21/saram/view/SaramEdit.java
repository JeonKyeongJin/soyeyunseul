package org.comstudy21.saram.view;

import org.comstudy21.saram.R;

public class SaramEdit extends SaramView {
	@Override
	public void display() {
		System.out.println("::::: ��� ���� ���� :::::");
		if(R.saramVo == null) {
			System.out.println("�˻� ��� �����ϴ�!");
			return;
		}
		System.out.println(R.saramVo);
		System.out.print("�̸��� ���� �Ͻðڽ��ϱ�?(Y/N)");
		char yn = scan.next().charAt(0);
		if(yn == 'Y' || yn == 'y') {
			System.out.print("�� �̸�>> ");
			R.saramVo.setName(scan.next());
		}
		System.out.print("����ó�� ���� �Ͻðڽ��ϱ�?(Y/N)");
		yn = scan.next().charAt(0);
		if(yn == 'Y' || yn == 'y') {
			System.out.print("�� ����ó>> ");
			R.saramVo.setPhone(scan.next());
		}
		System.out.print("�̸����� ���� �Ͻðڽ��ϱ�?(Y/N)");
		yn = scan.next().charAt(0);
		if(yn == 'Y' || yn == 'y') {
			System.out.print("�� �̸���>> ");
			R.saramVo.setEmail(scan.next());
		}
	}
}
