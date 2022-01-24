package org.comstudy21.ch03;

import java.util.Arrays;

public class Ch03Ex22 {

	public static void main00(String[] args) {
		String[] names = { "��¡��", "�öѱ�", "�뱸", "����", "�ź���" };
		int[] price = { 9000, 3000, 5000, 6000, 20000 };

		for (int i = 0; i < names.length; i++) {
			System.out.printf("%s�� ������ %s ���Դϴ�.\n", names[i], price[i]);
		}

	}

	public static void main01(int[] args) {
		
		
		int[] arr = {10,20,30,40,50};
		
		// Arrays�� �̿��ؼ� ������� ����ϱ�
	    // �ݺ����� �̿��ؼ� arr�迭�� ��Ұ��� ��ġ�� reverse �Ѵ�.
	    // {50, 40, 30, 20, 10}
	    
	    
		for (int i=0; end=arr.length-1; i< arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[end-i];
			arr[end-i] = int temp;
			
				
			System.out.print(arr[i] + " ");
			
	    }
        
	}

	public static void test_rever(String[] args) {
		System.out.println(Arrays.toString(arr));
		reverse(arr); // �� ���� ���۷���
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main02(String[] args) {
		int[] arr = { 7, 3, 2, 8, 1, 6, 9, 4, 5 };
		
		// �������� �����ؼ� ����Ͻÿ�
		// ��������,���������� �����ϼ���.
		// ��������(å���� ����) ��������(����� ����)
		// {1, 2, 3, 4, 5, 6, 7, 8, 9}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

	}

	public static void main_lotto01(String[] args) {
		final int SIZE = 6;
		int[] lotto = new int[SIZE];

		for (int i = 0; i < SIZE; i++) {
			int num = (int) (1 + Math.random() * 45);
			// ���� ������ num�� ���� lotto�迭�� ����� ��Ҹ� ���Ѵ�.
			// --> num�� ���� ���� �̹� �ִٸ� ���� �ٽ� num�� �����Ѵ�.
			// �ٽ� ���� �ٽ� ������ num�� lotto�� ��Ҹ� ���Ѵ�. (��� �ݺ�)
			for (int j = 0; j < i; j++) {
				if (num == lotto[j]) {
					num = (int) (1 + Math.random() * 45);
					j = -1;
				}
			}
			lotto[i] = num;

			// ���� § �ڵ�
			// for (int j = 0; j < i; j++) {
			// if (lotto[i] == lotto[j]) {
			// i--;
			// continue;

			// �ζǹ�ȣ�� �ߺ� ���� �������� �����Ͻÿ�.
		}
		System.out.println(Arrays.toString(lotto));
	}

	public static void main_lotto02(String[] args) {
		final int SIZE = 6;
		int[] lotto = new int[SIZE];

		int cnt = 0;
		while (cnt < 6) {
			lotto[cnt] = (int) (1 + Math.random() * 45);
			boolean flag = true;
			for (int i = 0; i < cnt; i++) {
				if (lotto[cnt] == lotto[i]) {
					flag = false;
					break;
				}
			}
			if (flag)
				cnt++;
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}

	public static void main(String[] args) {
		final int MAX = 6;
		int[] lotto = new int[MAX];
		int[] valls = new int[45];

		int[] ball = new int[45];
		for (int i = 1; i <= 45; i++) {
			ball[i - 1] = i;
		}

		System.out.println("1~45������ ���� �غ�Ǿ���.");
		// 1. ball �� index�� �����ϰ� �����Ѵ�.
		// 2. �� ������ index ��ġ�� ��ȣ�� 0�� �ƴϸ� lotto �迭�� �߰��Ѵ�.
		// 3. �̾ƿ� index ��ġ�� ���� 0���� ����.
		// 4. index ��ġ�� ���� 0�̸� �ٸ� ������ index ����.(������ �ݺ�)

		for (int i = 0; i < lotto.length;) {
			int index = (int) (Math.random() * 45); // 0~44������ ���� �߻�
			if (ball[index] != 0) {
				lotto[i] = ball[index];
				ball[index] = 0;
				i++;
			}

		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));

	}
}