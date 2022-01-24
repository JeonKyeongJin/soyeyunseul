package org.caomstudy21.levelup;

import static java.lang.System.out;

public class LevelUpEx01 {

	public static void maint(String[] args) {
		// 별출력 프로그램 
		// - 별 또는 공백이 반복한번에 한개씩 출력
		//
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-1; j++) {
				out.print(" ");
				
			}
			for(int j=0; j<2*i+1; j++) {
		}
			out.print("*");
			
		}
		out.println();
	}
}
}


	public static void main01(String[] args) {
		//*			:0,1
		//**		:1,2
		//***		:2,3	
		//****		:3,4
		//*****		:4,5
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	}
	public static void main02(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
	public static void main03(String[] args) {
		// *		:0,1
		// **		:1,2
		// ***		:2,3	
		// ****		:3,4
		// *****	:4,5
		// ****		:1,4
		// ***		:2,3
		// **		:3,2
		// *		:4,1
		
		int end = 1;
		for (int i=0; i<9; i++) {
			for(int j=0; j<end; j++) {
				System.out.print("*");
			} 
			System.out.println();
			end = i<4 ?end+1 : end-1;
			}
			
		}
	
	public static void main04(String[] args) {
		// ^^^^*
		// ^^^**
		// ^^***
		// ^****
		// ^^^^^
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(j<4-i ? " " : "*");
			}
			System.out.println();
		}
	}	

	public static void main05(String[] args) {
		// *****		0:0
		// ^****		1:1
		// ^^***		2:2
		// ^^^**		3:3
		// ^^^^*		4:4
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(j<i ? " " : "*");
			}
		System.out.println();
	
	}
	}
	
	public static void main06(String[] args) {
		// ^^^^*	0:4
		// ^^^**	1:3
		// ^^***	2:2
		// ^****	3:1
		// *****	4:0
		// ^****	5:1
		// ^^***	6:2
		// ^^^**	7:3
		// ^^^^*	8:4
		
		int end = 4;
		for(int i=0; i<9; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(j<end ?" " : "*");
			}
			end = i<4 ? end-1 : end+1;
			System.out.println();
		}
		
	}
	
		
		
	public static void main(String[] args) {
		// *********
		//  *******
		//   *****
		//    ***
		//     *
	
	for(int i=0; i<6; i++) {
		for(int j=0; j<9-i; j++) {
	}
		System.out.print(j<i ? " " : "*");
	}
		System.out.println();
}
}



for(int i=0; i<5; i++) {
	for(int j=0; j<5; j++) {
		out.print(j<4-i ? " " : "*");
	}
	for(int j=0; j<i; j++) {	
	System.out.print('*');
}
	System.out.println();
}
}
 