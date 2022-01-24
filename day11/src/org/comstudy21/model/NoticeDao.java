package org.comstudy21.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class NoticeDao {
	public static final int MAX = 100;
	private static final NoticeVo[] noticeArr = new NoticeVo[MAX];
	private static int top = 0;
	private static int noticeSeq = 1;

	// selectAll, selectOne, selectByNo, update, delete, insert 구현
	static {
		noticeArr[top++] = new NoticeVo(noticeSeq++, "혜진", "안녕", "2021-10-12");
		noticeArr[top++] = new NoticeVo(noticeSeq++, "소예", "아빠놀아줘", "2021-12-23");
		noticeArr[top++] = new NoticeVo(noticeSeq++, "윤슬", "까까", "2021-08-18");
	}

	public static String regDate() {
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);
		return formattedDate;
	}

	public static NoticeVo[] selectAll() {
		NoticeVo[] newArr = new NoticeVo[top];
		for (int i = 0; i < newArr.length; i++) {
			NoticeVo newNotice = new NoticeVo();
			newNotice.setNo(noticeArr[i].getNo());
			newNotice.setUser(noticeArr[i].getUser());
			newNotice.setMessage(noticeArr[i].getMessage());
			newNotice.setRegDate(noticeArr[i].getRegDate());
			newArr[i] = newNotice;

		}
//		System.out.println(Arrays.toString(newArr));
		return newArr;
	}

	public NoticeVo selectOne(NoticeVo vo) {
		for (int i = 0; i < top; i++) {
			if (noticeArr[i].getUser().equals(vo.getUser())) {
				NoticeVo newNotice = new NoticeVo();
				newNotice.setNo(noticeArr[i].getNo());
				newNotice.setUser(noticeArr[i].getUser());
				newNotice.setMessage(noticeArr[i].getMessage());
				newNotice.setRegDate(noticeArr[i].getRegDate());
				return newNotice;
			}
		}
		return null;

	}

	public NoticeVo selectByNo(int noticeSeq) {
		for (int i = 0; i < top; i++) {
			if (noticeSeq == noticeArr[i].getNo()) {
				NoticeVo newNotice = new NoticeVo();
				newNotice.setNo(noticeArr[i].getNo());
				newNotice.setUser(noticeArr[i].getUser());
				newNotice.setMessage(noticeArr[i].getMessage());
				newNotice.setRegDate(noticeArr[i].getRegDate());
				return newNotice;

			}
		}
		return null;
	}

	public void insert(NoticeVo vo) {
		if (top >= MAX) {
			System.out.println(">>> 더이상 입력 불가능!");
			return;
		}
		vo.setNo(noticeSeq++);
		noticeArr[top++] = vo;
	}

	public void update(NoticeVo vo) {
		if (vo == null)
			return;
		for (int i = 0; i < top; i++) {
			if (noticeArr[i].getNo() == vo.getNo()) {
				noticeArr[i] = vo;
			}
		}
	}

	public void delete(NoticeVo vo) {
		for (int i = 0; i < top; i++) {
			if (noticeArr[i].getNo() == vo.getNo()) {
				for (int j = i; j < top - 1; j++) {
					noticeArr[j] = noticeArr[j + 1];
				}
				noticeArr[top - 1] = null;
				top--;
			}
		}

	}
}
