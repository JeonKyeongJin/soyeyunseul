package org.comstudy21.saram.view;

import org.comstudy21.saram.R;
import org.comstudy21.saram.model.SaramVo;

public class InsertView extends SaramView {
	@Override
	public void display() {
		System.out.println("::::: �Է� ��� :::::");
		// ����,��ȭ,�̸���
		// R.saramVo�� ���� �� Controller�� �̵�
		System.out.print("���� �Է�>> ");
		String name = scan.next();
		System.out.print("��ȭ �Է�>> ");
		String phone = scan.next();
		System.out.print("�̸���>> ");
		String email = scan.next();
		
		R.saramVo = new SaramVo(0, name, phone, email);
		System.out.println("�Է� �Ϸ�!");
		// �۾� �Ϸ� �� �ڵ����� Controller�� �̵�.
	}
}
