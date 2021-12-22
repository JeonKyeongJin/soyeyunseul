package org.comstudy21.miniproj;

import java.util.Scanner;

import static java.lang.System.out;

class Student {
	public int no; // 번호
	public String name; // 이름
	public int kor, eng, mat;
	public int sum; // 국영수의 총점
	public double avg; // 국영수 총점의 평균
	public String grade; // 학점
	public int rank; // 등수

	public Student() {
		// 디폴트생성자 - 인자가 없다. 아무일도 하지 않는다.
	}

	public Student(int no, String name, int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

		// 총점, 평균, 학점을 만들어준다.
		this.sum = kor + eng + mat;
		this.avg = sum / 3;

		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
	}

	// 객체를 사용하면 toString()이 자동 호출 된다.

	@Override
	public String toString() {
		return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + sum + "\t" + avg + "\t" + grade + "\t"
				+ rank;
	}
}
// Student st1 = new Student();
// st1.name = "홍길동"
// Student st2 = new Student(1, "김길동", 60, 70, 80);

public class MainCls {
	public static final Scanner scan = new Scanner(System.in);

	public static final int MAX = 100;
	static Student[] sArr = new Student[MAX];
	static int top = 0; // 스텍 자료구조처럼.
	static int sequence = 1;

	// static 초기화 블럭
	static {
		sArr[top++] = new Student(sequence++, "KIM", 60, 60, 75);
		sArr[top++] = new Student(sequence++, "LEE", 90, 80, 80);
		sArr[top++] = new Student(sequence++, "PARK", 90, 100, 95);
	}

	public static int menu() {
		int no = 0;
		out.println("1.입력 2.출력 3.검색 4.수정 5.삭제 6.종료");
		out.print("선택>> ");
		try {
			no = scan.nextInt();
			// 예외처리 및 유효성 검사
		} catch (Exception e) {
			out.println("잘못 입력하였습니다!");
			scan.next();
			run();
		}
		return no;
	}

	public static void run() {
		switch (menu()) {
		case 1:
			input();
			break;
		case 2:
			output();
			break;
		case 3:
			search();
			break;
		case 4:
			modify();
			break;
		case 5:
			delete();
			break;
		case 6:
			end();
			break;
		default:
			out.println("--- 해당 사항 없습니다! ---");
		}
		System.out.println("------------------------------------");
	}

	private static void end() {
		System.out.println("::::: END :::::");
		System.out.println("프로그램 종료!");
		System.out.println("수고하셨습니다!");
		System.exit(0);
	}

	private static void delete() {
		System.out.println("::::: DELETE :::::");
		// 이름으로 검색 후 삭제
		out.println("삭제할 이름을 입력하세요");
		String name = scan.next();
		int i = 0;
		for (i = 0; i < top; i++) {
			if (name.equals(sArr[i].name)) {
				break;
			}
		}

		if (i == top) {
			out.println("검색 결과가 없습니다!");
			run();
		} else {
			for (; i <= top; i++) {
				sArr[i] = sArr[i + 1];
			}
			top--;
		}
		out.println("삭제되었습니다");
	}

	private static void modify() {
		System.out.println("::::: MODIFY :::::");
		// 이름으로 검색 후 수정
		out.println("이름을 입력하세요");
		String name = scan.next();
		int i = 0;
		for (i = 0; i < top; i++) {
			if (name.equals(sArr[i].name)) {
				out.println(sArr[i].toString());
				break;
			}
		}
		if (i == top) {
			out.println("검색 결과가 없습니다!");
			run();
		}

		out.println("수정할 항목을 입력하세요.");
		out.println("1.이름 2.국어 3.영어 4.수학");
		int num = scan.nextInt();
		switch (num) {
		case 1:
			out.println("수정할 이름을 입력하세요");
			name = scan.next();
			sArr[i].name = name;
			out.println("수정 완료!");
			break;
		case 2:
			out.println("수정할 점수를 입력하세요");
			num = scan.nextInt();
			sArr[i].kor = num;
			out.println("변경 완료!");
			break;
		case 3:
			out.println("수정할 점수를 입력하세요");
			num = scan.nextInt();
			sArr[i].eng = num;
			out.println("변경 완료!");
			break;
		case 4:
			out.println("수정할 점수를 입력하세요");
			num = scan.nextInt();
			sArr[i].mat = num;
			out.println("변경 완료!");
			break;
		default:
			out.println("잘못 입력하셨습니다");
			break;
		}
	}

	private static void search() {
		System.out.println("::::: SEARCH :::::");
		// 이름으로 검색
		out.println("이름을 입력 하세요");
		String name = scan.next();
		int i = 0;
		for (i = 0; i < top; i++) {
			if (name.equals(sArr[i].name)) {
				out.println(sArr[i].toString());
				break;
			}
		}
		if (i == top) {
			out.println("검색 결과가 없습니다!");
		}

	}

	private static void output() {
		System.out.println(":::::::::::::::::::::::::::: OUTPUT ::::::::::::::::::::::::::::");
		// 배열의 목록 출력
		// 번호, 성명, 국어, 영어, 수학, 총점, 평균, 학점, 등수, 등수를 기준으로 정렬
		for (int i = 0; i < top; i++) {
			sArr[i].rank = 1;
			for (int j = 0; j < top; j++) {
				if (sArr[i].avg < sArr[j].avg) {
					sArr[i].rank += 1;
				}
			}
		}
		for (int i = 0; i < top; i++) {
			for (int j = 0; j < top; j++) {
				if (sArr[i].rank < sArr[j].rank) {
					Student s = sArr[i];
					sArr[i] = sArr[j];
					sArr[j] = s;
				}
			}
		}

		for (Student std : sArr) {
			if (std == null)
				break;
			out.println(std);
		}
	}

	private static void input() {
		System.out.println("::::: INPUT :::::");
		// 성명, 국어, 영어, 수학를 배열에 입력 받는다.
		// 입력 받은 국영수 점수의 총점과 평균, 평균의 학점,
		// 입력 된 학생의 등수가 셋팅 된다.
		String name; // 이름
		int kor, eng, mat;

		out.println("번호 " + sequence + "번의 이름 : ");
		name = scan.next();
		out.println("국어 점수 : ");
		kor = scan.nextInt();
		out.println("영어 점수 : ");
		eng = scan.nextInt();
		out.println("수학 점수 : ");
		mat = scan.nextInt();

		sArr[top++] = new Student(sequence++, name, kor, eng, mat);
	}

	public static void main(String[] args) {
		out.println("::::: 성적 출력 프로그램 :::::");
		while (true) {
			run();
		}
	}
