package org.comstudy21.ch03;

import java.util.Arrays;

public class Ch03Ex22 {

	public static void main00(String[] args) {
		String[] names = { "오징어", "꼴뚜기", "대구", "명태", "거북이" };
		int[] price = { 9000, 3000, 5000, 6000, 20000 };

		for (int i = 0; i < names.length; i++) {
			System.out.printf("%s의 가격은 %s 원입니다.\n", names[i], price[i]);
		}

	}

	public static void main01(int[] args) {
		
		
		int[] arr = {10,20,30,40,50};
		
		// Arrays를 이용해서 순서대로 출력하기
	    // 반복문을 이용해서 arr배열의 요소값을 위치를 reverse 한다.
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
		reverse(arr); // 콜 바이 레퍼런스
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main02(String[] args) {
		int[] arr = { 7, 3, 2, 8, 1, 6, 9, 4, 5 };
		
		// 오름차순 정렬해서 출력하시오
		// 삽입정렬,버블정렬을 공부하세요.
		// 삽입정렬(책꽂이 정렬) 버블정렬(물방울 정렬)
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
			// 새로 생성한 num의 값과 lotto배열에 저장된 요소를 비교한다.
			// --> num과 같은 값이 이미 있다면 새로 다시 num을 생성한다.
			// 다시 새로 다시 생성한 num과 lotto의 요소를 비교한다. (계속 반복)
			for (int j = 0; j < i; j++) {
				if (num == lotto[j]) {
					num = (int) (1 + Math.random() * 45);
					j = -1;
				}
			}
			lotto[i] = num;

			// 내가 짠 코드
			// for (int j = 0; j < i; j++) {
			// if (lotto[i] == lotto[j]) {
			// i--;
			// continue;

			// 로또번호가 중복 없이 나오도록 개선하시오.
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

		System.out.println("1~45까지의 공이 준비되었다.");
		// 1. ball 의 index를 랜덤하게 선택한다.
		// 2. 그 선택한 index 위치의 번호가 0이 아니면 lotto 배열에 추가한다.
		// 3. 뽑아온 index 위치의 값을 0으로 변경.
		// 4. index 위치의 값이 0이면 다른 랜덤한 index 선택.(끝까지 반복)

		for (int i = 0; i < lotto.length;) {
			int index = (int) (Math.random() * 45); // 0~44까지의 난수 발생
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