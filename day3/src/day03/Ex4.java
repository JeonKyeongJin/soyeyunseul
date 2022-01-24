package day03;

import static java.lang.System.out;
import java.util.Scanner;

public class Ex4 {

	static Scanner scan = new Scanner(System.in);

	public static void main00(String[] args) {
		// 과제 1 : 3행 3열로 구구단 출력
		// 과제 2 : 시작단, 종료단 기능과 합체 하세요.
		
		
		for(int dan=2; dan<=9; dan+=3) {
			for(int i=0; i<3; i++) {
				if(dan+i != 10) System.out.printf(" ***%d***\t ", dan+i); 
				}
			System.out.println();
			
			System.out.println();
			for(int j=1; j<=9; j++) {
				for(int k=0; k<3; k++) {
				if(dan + k != 10) System.out.printf("%d * %d = %d\t", dan + k , j, (dan + k) * j);					
				}
				System.out.println();
			}
			System.out.println();
		}
	}

		static int getDan(String message) {
			System.out.printf(message);
			int dan = scan.nextInt();
			
			while(dan < 2 || dan > 9) {
				System.out.println("입력범위를 초과했습니다!");
				System.out.printf(message);
				dan = scan.nextInt();
				}
				return dan;
			}
		public static void main(String[] args) {
				
				int startDan = getDan("시작단 입력 >> ");
				int endDan = getDan("종료단 입력 >> ");
				
				if(startDan > endDan) {
					int temp = startDan;
					startDan = endDan;
					endDan = temp;
				}
				for(int dan = startDan; dan <= endDan; dan += 3) {
					for(int i = 0; i < 3; i++) {
						if(dan + i <= endDan) System.out.printf(" ***%d***  \t", dan + i);				
					}
					System.out.println();
					for(int j = 1; j <= 9; j++) {
						for(int k = 0; k < 3; k++) {
							if(dan + k <= endDan) System.out.printf("%d * %d = %d\t", dan + k , j, (dan + k) * j);				
						}
						System.out.println();
					}
					System.out.println();
	}
	
 }
}
			

	

		





