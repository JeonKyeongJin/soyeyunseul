package org.comstudy21.miniproj;

import java.util.Scanner;

import static java.lang.System.out;

class Student {
	public int no; // ��ȣ
	public String name; // �̸�
	public int kor, eng, mat;
	public int sum; // �������� ����
	public double avg; // ������ ������ ���
	public String grade; // ����
	public int rank; // ���

	public Student() {
		// ����Ʈ������ - ���ڰ� ����. �ƹ��ϵ� ���� �ʴ´�.
	}

	public Student(int no, String name, int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

		// ����, ���, ������ ������ش�.
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

	// ��ü�� ����ϸ� toString()�� �ڵ� ȣ�� �ȴ�.

	@Override
	public String toString() {
		return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + sum + "\t" + avg + "\t" + grade + "\t"
				+ rank;
	}
}
// Student st1 = new Student();
// st1.name = "ȫ�浿"
// Student st2 = new Student(1, "��浿", 60, 70, 80);

public class MainCls {
	public static final Scanner scan = new Scanner(System.in);

	public static final int MAX = 100;
	static Student[] sArr = new Student[MAX];
	static int top = 0; // ���� �ڷᱸ��ó��.
	static int sequence = 1;

	// static �ʱ�ȭ ��
	static {
		sArr[top++] = new Student(sequence++, "KIM", 60, 60, 75);
		sArr[top++] = new Student(sequence++, "LEE", 90, 80, 80);
		sArr[top++] = new Student(sequence++, "PARK", 90, 100, 95);
	}

	public static int menu() {
		int no = 0;
		out.println("1.�Է� 2.��� 3.�˻� 4.���� 5.���� 6.����");
		out.print("����>> ");
		try {
			no = scan.nextInt();
			// ����ó�� �� ��ȿ�� �˻�
		} catch (Exception e) {
			out.println("�߸� �Է��Ͽ����ϴ�!");
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
			out.println("--- �ش� ���� �����ϴ�! ---");
		}
		System.out.println("------------------------------------");
	}

	private static void end() {
		System.out.println("::::: END :::::");
		System.out.println("���α׷� ����!");
		System.out.println("�����ϼ̽��ϴ�!");
		System.exit(0);
	}

	private static void delete() {
		System.out.println("::::: DELETE :::::");
		// �̸����� �˻� �� ����
		out.println("������ �̸��� �Է��ϼ���");
		String name = scan.next();
		int i = 0;
		for (i = 0; i < top; i++) {
			if (name.equals(sArr[i].name)) {
				break;
			}
		}

		if (i == top) {
			out.println("�˻� ����� �����ϴ�!");
			run();
		} else {
			for (; i <= top; i++) {
				sArr[i] = sArr[i + 1];
			}
			top--;
		}
		out.println("�����Ǿ����ϴ�");
	}

	private static void modify() {
		System.out.println("::::: MODIFY :::::");
		// �̸����� �˻� �� ����
		out.println("�̸��� �Է��ϼ���");
		String name = scan.next();
		int i = 0;
		for (i = 0; i < top; i++) {
			if (name.equals(sArr[i].name)) {
				out.println(sArr[i].toString());
				break;
			}
		}
		if (i == top) {
			out.println("�˻� ����� �����ϴ�!");
			run();
		}

		out.println("������ �׸��� �Է��ϼ���.");
		out.println("1.�̸� 2.���� 3.���� 4.����");
		int num = scan.nextInt();
		switch (num) {
		case 1:
			out.println("������ �̸��� �Է��ϼ���");
			name = scan.next();
			sArr[i].name = name;
			out.println("���� �Ϸ�!");
			break;
		case 2:
			out.println("������ ������ �Է��ϼ���");
			num = scan.nextInt();
			sArr[i].kor = num;
			out.println("���� �Ϸ�!");
			break;
		case 3:
			out.println("������ ������ �Է��ϼ���");
			num = scan.nextInt();
			sArr[i].eng = num;
			out.println("���� �Ϸ�!");
			break;
		case 4:
			out.println("������ ������ �Է��ϼ���");
			num = scan.nextInt();
			sArr[i].mat = num;
			out.println("���� �Ϸ�!");
			break;
		default:
			out.println("�߸� �Է��ϼ̽��ϴ�");
			break;
		}
	}

	private static void search() {
		System.out.println("::::: SEARCH :::::");
		// �̸����� �˻�
		out.println("�̸��� �Է� �ϼ���");
		String name = scan.next();
		int i = 0;
		for (i = 0; i < top; i++) {
			if (name.equals(sArr[i].name)) {
				out.println(sArr[i].toString());
				break;
			}
		}
		if (i == top) {
			out.println("�˻� ����� �����ϴ�!");
		}

	}

	private static void output() {
		System.out.println(":::::::::::::::::::::::::::: OUTPUT ::::::::::::::::::::::::::::");
		// �迭�� ��� ���
		// ��ȣ, ����, ����, ����, ����, ����, ���, ����, ���, ����� �������� ����
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
		// ����, ����, ����, ���и� �迭�� �Է� �޴´�.
		// �Է� ���� ������ ������ ������ ���, ����� ����,
		// �Է� �� �л��� ����� ���� �ȴ�.
		String name; // �̸�
		int kor, eng, mat;

		out.println("��ȣ " + sequence + "���� �̸� : ");
		name = scan.next();
		out.println("���� ���� : ");
		kor = scan.nextInt();
		out.println("���� ���� : ");
		eng = scan.nextInt();
		out.println("���� ���� : ");
		mat = scan.nextInt();

		sArr[top++] = new Student(sequence++, name, kor, eng, mat);
	}

	public static void main(String[] args) {
		out.println("::::: ���� ��� ���α׷� :::::");
		while (true) {
			run();
		}
	}
