package org.comstudy21.ch03;

public class Ch03Ex25 {

	private static void printArr(int[][] arr) {
		// 행렬로 출력한다.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] == 0 ? "\t" : arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	

	public static void main01(String[] args) {
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25

		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				arr[i][j] = num++;
			}

		}
		printArr(arr);

	}

	public static void main02(String[] args) {
		// 1
		// 2 3
		// 4 5 6
		// 7 8 9 10
		// 11 12 13 14 15

		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (j = 0; j < i + 1; j++) {
				arr[i][j] = num++;
			}

		}
		printArr(arr);

	}

	public static void main03(String[] args) {
		// 1 2 3 4 5
		// 6 7 8 9
		// 10 11 12
		// 13 14 15 16
		// 17 18 19 20 21

		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			int start = i < 2 ? i : 4 - i;
			for (int j = start; j < arr[i].length; j++) {
				arr[i][j] = num;
			}
		}
		printArr(arr);
	}

	public static void main04(String[] args) {
		// 1   2   3   4   5
		// 	   6   7   8   9
		// 		   10  11  12
		// 	   13  14  15  16
		// 17  18  19  20  21

		int num = 1;
		for (int i = 0; i <arr.length; i++) {
			int start = i<= 2 ? :4-i;
			for (int j = start; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
			
		}
		print Arr(arr);

	}

	public static void main(String[] args) {
		//  ---- 과제 ----
		//  1	2	3	4	5
		//		6	7	8
		//			9
		//		10  11  12
		//  13	14	15	16	17
		
		int num = 1;
		for(int i=0; i<arr.length; i++;) {
			int start = i<=2?i:4-1;
			int end = i<=2?5-i:i;
			for(int j=start, j<end; j++) {
				arr[i][j] = num++;
			
		
	}
		printArr(arr);
}
		
		
		
		
		
		// ---- 보너스 게임 ---- 
		//  1	2	3	4	5
		//  16	17	18	19	6
		//  15	24	25	20	7
		//  14	23	22	21	8
		//  13	12	11	10	9
	}
}