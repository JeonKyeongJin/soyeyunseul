package org.comstudy21.notice;

import org.comstudy21.controller.NoticeController;
import org.comstudy21.model.NoticeVo;
import org.comstudy21.notice.view.InsertView;
import org.comstudy21.notice.view.MenuView;
import org.comstudy21.notice.view.NoticeDelete;
import org.comstudy21.notice.view.NoticeDetail;
import org.comstudy21.notice.view.Noticeview;
import org.comstudy21.notice.view.NoticeSearch;
import org.comstudy21.notice.view.NoticeEdit;
import org.comstudy21.notice.view.NoticeListView;

public class Run {
	public static int no;

	public static NoticeVo noticeVo;
	public static NoticeVo[] noticeArr;

	public static final Noticeview searchByUser = new Noticeview();

	public static final Noticeview menuView = new MenuView();

	public static final Noticeview insertView = new InsertView();
	public static final Noticeview noticeDelete = new NoticeDelete();
	public static final Noticeview noticeSearch = new NoticeSearch();
	public static final Noticeview noticeEdit = new NoticeEdit();
	public static final Noticeview noticeListView = new NoticeListView();
	public static final Noticeview noticeDetail = new NoticeDetail();

	public static final NoticeController noticeController = new NoticeController();

}
