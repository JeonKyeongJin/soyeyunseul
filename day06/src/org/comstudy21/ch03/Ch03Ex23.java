package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex23 {

	static Scanner scan = new Scanner(System.in);

	public static void main01(String[] args) {
		int[] score = { 95, 70, 85, 90, 100, 45, 35, 85, 70, 75 };

		// 65를 입력 받아서 65가 있으면 true를, 아니면 false 출력.
		// 검색 할 점수 >> 65
		// 결과 65는 배열에 없습니다.
		// 1. 점수를 입력 받는다.
		// 2. 입력받은 점수가 배열에 있는가? 검색
		// 3. 있다면 count 한다.

		int ea = 0;
		int KeyNum = 0;

		System.out.print("검색 할 점수 >> ");
		KeyNum = scan.nextInt();
		for (int i = 0; i < score.length; i++) {
			if (KeyNum == score[i]) {
				ea++;
			}
		}
		// 4. 검색 종료 후 결과 출력.
		if (ea == 0) {
			System.out.printf("결과 : %d는 배열에 없습니다! ", KeyNum);
		} else {
			System.out.printf("결과 : %d는  배열에 있습니다! ", KeyNum, ea);
		}

	}

	public static void main02(String[] args) {
		// 배열에 점수를 입력 받아서 제일 큰 점수와 제일 작은 점수 출력
		int[] score = new int[5];
		int max = 0, min = 100;

		for (int i = 0; i < score.length; i++) {
			System.out.print("점수 입력" + i + " >> ");
			int grade = scan.nextInt();
			score[i] = grade;

			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}

			System.out.println(max);
			System.out.println(min);
		}
	}

	public static void main03(String[] args) {
		int[] score = { 65, 100, 75, 80, 35, 90 };
		int[] rank = new int[score.length];

		// 결과 : [5, 1, 4, 3, 6, 2]
		// 0. score 요서의 개수만큼 반복하면서...
		// 1. rank[i] 번째를 1로 시작한다.
		// 2 .score[i] 번쨰 보다큰 값의 요소가 있다면 lank[i]를 증가한다.
		// (같은 배열의 요소끼리 비교하기)
		// 해보기나 했어? - 정주영

		int size = score.length;
		for (int i = 0; i < size; i++) {
			rank[i] = 1;
			for (int j = 0; j < size; j++) {
				if (score[i] < score[j]) {
					rank[i]++;
				}

			}
		}
		for (int i = 0; i < score.length; i++) {

			System.out.printf("%d점은 %d 등 입니다.\n", score[i], rank[i]);
		}
	}

	public static void main(String[] args) {
		int[] score = { 95, 70, 85, 90, 100, 45, 35, 85, 70, 75 };

		// 점수 검색 : 70
		// 결과 : 70은 1번째 8번째에 있습니다.

		// 1. 검색어 입력 받기
		// 2. score의 요소만큼 반복
		// 3. 검색어와 같은 값이 있다면 위치 출력

		System.out.print("점수 검색 : ");
		int KeyWord = scan.nextInt();
		System.out.printf("결과 : %d 은 ", KeyWord);
		boolean flag = false;
		for (int i = 0; i < score.length; i++) {
			if (KeyWord == score[i]) {
				System.out.print(i + " 번째 ");
				flag = true;
			}
		}
		if (flag) {
			System.out.println("에 있습니다.");
		}
		System.out.println(" 없습니다.");

	}
}