package day04;

import static java.lang.System.out;

import java.util.Scanner;

public class Ch03Ex05_1 {

	public static void main(String[] args) {
		// -1을 입력하면 그만~ 아니면 계속 반복
		// 크기 >>5
		// *****
		// **  *
		// * * *
		// *  **
		// *****
		//
		// *****
		// ** **
		// *   *
		// ** ** 
		// *****
		
		// 배열과 반복을 연습하는 주말과제
		
		Scanner scan = new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		
		
		int end = 3;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++ ) {
				
				System.out.print(j>=end && j<5-end ? " ":"*");
			}
				System.out.println();
				end =i<2? end-1 : end +1;
		}
		System.out.println();
	
	
	}

}
