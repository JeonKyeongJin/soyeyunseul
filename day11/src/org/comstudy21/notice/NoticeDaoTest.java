package org.comstudy21.notice;

import org.comstudy21.model.NoticeDao;
import org.comstudy21.model.NoticeVo;

public class NoticeDaoTest {
	public static NoticeDao dao = new NoticeDao();

	public static void main01(String[] args) {
		System.out.printf(null);
	}

	public static void test_delete(String[] args) {
		dao.delete(new NoticeVo(2, null, null, null));
		test_selectAll(null);
	}

	public static void test_update(String[] args) {
		NoticeVo vo = dao.selectByNo(3);
		vo.setUser("¿±ΩΩ¿Ã");
		vo.setMessage("π∞");
		vo.setRegDate("2020-08-18");
		dao.update(vo);

		NoticeVo notice = dao.selectOne(new NoticeVo(0, "¿±ΩΩ¿Ã", null, null));
		System.out.println(notice);

	}

	public static void test_selectByNo(String[] args) {
		NoticeVo notice = dao.selectByNo(3);
		System.out.println(notice);
	}

	public static void test_selectOne(String[] args) {
		NoticeVo vo = new NoticeVo(0, "º“øπ", null, null);
		NoticeVo notice = dao.selectOne(vo);
		System.out.println(notice);
	}

	public static void test_selectAll(String[] args) {
		NoticeVo[] noticeArr = dao.selectAll();
		for (NoticeVo notice : noticeArr) {
			System.out.println(notice);
		}

	}

}
