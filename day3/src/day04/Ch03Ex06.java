package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Ch03Ex06 {

	public static void main_note(String[] args) {
		// 1���� �迭
		// �迭�̶�?
		
		// �ڹ��� �迭���� �߰�ȣ ���.
		// �迭�� Ÿ���� �迭Ÿ��.
		// �迭 ������Ʈ�̴�.
		
		// ��Ʈ�� �迭 Ÿ�� - Ư��Ÿ�Կ� ��������� ���̸� �迭 Ÿ�Եȴ�.
		// String[] a;
		
		// ��Ʈ �迭Ÿ��
		// int[] b;
		
		// char �� 2����Ʈ ������ ��� �迭�� ���������� ������ �����ϴ� 4����Ʈ �̴�.
		// �������� ��� �����̴�.
		// �迭�� ������Ʈ �̹Ƿ� ������ ���������� �ȴ�.
		// char c;
	}

	public static void main00(String[] args) {
		// �迭 ����� ���ÿ� �ʱ�ȭ �ϱ�
		// �迭�� ���ͷ�
		int[] arr = {10,20,30,40};	
		
		arr[1] = 5000;
		
		// �迭 ���
		System.out.println(Arrays.toString(arr));
		
		// �ݺ����� �̿��ؼ� �迭 ���
		// �迭�� ù��° ����� ÷�ڴ� 0�̰� 
		// �迭�� ������ ����� ÷�ڴ� �迭ũ�� -1�̴�.
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("arr[ arr.length-1] ===> " + arr[ arr.length-1]);
	}
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// �Լ��� ���ڷ� �迭�� ������ ���ÿ� ���� �Ҷ� ���.
		//main00(new String[]{"aa","bb","ccc"});
		
		// ��¥ �������� �ƴ� �迭 ������ ����
		int[] days;
		// �迭 ���� �Ŀ� �迭�� �����ϱ� - new ���ڸ� ����ؾ� �Ѵ�.
		days = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.printf("1���� %d�����Դϴ�.\n", days.length);
		
		System.out.print("�� �Է�>>> ");
		int month = scan.nextInt();
		
		int total = 0;
		// �Էµ� ���� ��¥�� ���ϱ������� ����϶�.
		// 1���� 365���Դϴ�. (days�� ��� ��¥�� total�� �����ؼ� �߷��Ѵ�.) 
		// days[1] ==== 2���� ��¥��
		// days[month-1]  ==== �Է¹��� ���� ��¥
		System.out.printf("%d���� %d�ϱ��� �ִ�.\n", month, days[month-1]);
		
		for(int i=0; i<days.length; i++) {
			total = total + days[i];
		}
		System.out.printf("1���� %d���Դϴ�.\n", total);
		
		
		
		// ��¥�Է�
		System.out.print("�� �Է�>>> ");
		int day = scan.nextInt();
		// ����: ��¥�Է� ��ȿ�� üũ ����.
		
		// 1��1�Ϻ��� �Է¹��� ��/�ϱ��� ������ �������ϴ�.
		total = day;
		for(int i=0; i<month-1; i++) {
			total += days[i];
		}
		System.out.printf("1�� 1�� ���� %d�� %d�ϱ����� %d���� ������.\n", month, day, total);
		
		// ����2 : 0��0�Ϻ��� 1���� ���� ��¥�� 00���Դϴ�.
		// (365 - total ���� ����)
		
		// ����3 : �Է� ��/���� 100�� ���� ��¥ ���.
		
		// ����4 : Ȯ�� �غ��� - 100�� ���� ��¥�� 200�� 300�� Ư�� ���� ����ǰ� �ϼ���.
	}

}		
