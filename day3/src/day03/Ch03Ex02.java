package day03;

import java.util.Scanner;

public class Ch03Ex02 {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main01(String[] args) {
		// �������� ������ �Է��Ѵ�. �������� -1�� �Է��Ѵ�.
		// -1�� �Է� �Ǳ� ������ ���ڸ� ��� �Է� �޴� ���α׷�.
		// �Է¹��� ���� �� -1�� ������ ���ڵ��� ����� ����Ѵ�.
		// avg = ����/count
		int total = 0;
		int count = 0;
		double avg = 0.0;
		
		
		System.out.println("-1�� �Է� �ɶ����� ���������� ���� �Է� �ޱ�.");
		System.out.print("�Է� >> ");
		int number = scan.nextInt();
		while(number != -1); {
			count++;
			total += number;
			number = scan.nextInt();
		}
		
		System.out.println("�Է� ��!");
		
		avg = (double)total / (double)count;
		System.out.printf("������ ������ %d���̸� ����� %.1f�Դϴ�.\n", count,avg);
	}
	
	public static void main(String[] args) {
		// �ܾ �Է� �޴� ���α׷� ����.
		// "��"�� �Է� �ɶ����� �ܾ ��� �Է� �޴´�.
		// �Է� �� ��� �߿��� ���� �� �ܾ ����� ���α׷��� while���� �̿��ؼ� �����϶�.
		String newWord = "";
		
		System.out.println("�ܾ �����ؼ� �Է��϶�. (����� ���Է�)");
		System.out.print("�Է� >>");
		String word = scan.next();
		while(!word.equals("��")) {
			if(word.length() > newWord.length()) {
				newWord = word;
			}
			word = scan.next();
		}
		
		System.out.println("�Է¿Ϸ�!");
		System.out.println(newWord);
	}

}
