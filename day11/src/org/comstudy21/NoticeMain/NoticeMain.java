package org.comstudy21.NoticeMain;

import org.comstudy21.controller.NoticeController;
import org.comstudy21.notice.Run;

public class NoticeMain {

	public static void main(String[] args) {
		System.out.println("----------- 메모 관리 프로그램 -----------");
		NoticeController nc = new NoticeController();

		nc.action();
	}

}
