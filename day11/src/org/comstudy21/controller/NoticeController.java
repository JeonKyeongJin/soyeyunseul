package org.comstudy21.controller;

import org.comstudy21.model.NoticeDao;
import org.comstudy21.notice.Run;
import org.comstudy21.notice.ViewContainer;

public class NoticeController {
	private ViewContainer vc = new ViewContainer();
	private NoticeDao dao = new NoticeDao();

	public void action() {
		if (Run.no == 0) {
			vc.run(Run.menuView);
		}
		switch (Run.no) {
		case 1:
			vc.run(Run.insertView);
			dao.insert(Run.noticeVo);
			break;
		case 2:
			Run.noticeArr = dao.selectAll();
			vc.run(Run.noticeListView);
			break;
		case 3:
			vc.run(Run.noticeSearch);
			Run.noticeVo = dao.selectOne(Run.noticeVo);
			vc.run(Run.noticeDetail);
			break;
		case 4:
			vc.run(Run.noticeSearch);
			Run.noticeVo = dao.selectOne(Run.noticeVo);
			vc.run(Run.noticeEdit);
			if (Run.noticeVo != null) {
				dao.update(Run.noticeVo);
			}
			break;
		case 5:
			vc.run(Run.noticeSearch);
			Run.noticeVo = dao.selectOne(Run.noticeVo);
			vc.run(Run.noticeDelete);
			if (Run.noticeVo != null) {
				dao.delete(Run.noticeVo);
			}
			break;
		case 6:
			System.out.println("프로그램 종료");
			System.exit(0);
			break;
		default:
			System.out.println("해당 기능이 없습니다");

		}
		Run.no = 0;
		action();
	}

}
