package org.comstudy21.saram.view;

import org.comstudy21.saram.R;

public class SaramDelete extends SaramView {
	@Override
	public void display() {
		System.out.println("::::: ��� ���� ���� :::::");
		if(R.saramVo == null) {
			System.out.println("�˻� ����� �����ϴ�!");
			return;
		}
		System.out.println(R.saramVo);
		System.out.print("������ ���� �Ͻðڽ��ϱ����?[y/n]");
		char yn = scan.next().charAt(0);
		if(yn=='n') {
			R.saramVo = null;
		}
	}
}
