package org.comstudy21.saram.view;

import org.comstudy21.saram.R;
import org.comstudy21.saram.model.SaramVo;

public class SaramListView extends SaramView {
	@Override
	public void display() {
		System.out.println("::::: ��� ��� :::::");
		// R.saramArr ���
		for(SaramVo saram : R.saramArr) {
			System.out.println(saram);
		}
	}
}
