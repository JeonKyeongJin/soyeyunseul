package org.caomstudy21.levelup;

import static java.lang.System.out;

import java.util.Scanner;

public class LevelUPEx001 {

	public static void main01(String[] args) {
		//  ����� ���α׷� 
		// - �� �Ǵ� ������ �ݺ��ѹ��� �Ѱ��� ���
		//
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		
		// ����� �ڵ�
		for (int i = 0; i < 5; i++) {

	        for (int j = 4; j > i; j--) { 
	            System.out.print(" ");

	        }

	        for (int k = 1; k <= i*2+1; k++) {

	            System.out.print("*"); 

	                                    

	                                }

	        System.out.println();

	    }
		
		
		
		
		// ���� § �ڵ�
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < 9 - i; j++) {
				System.out.print(j < i ? " " : "*");
			}
			System.out.println();
		}
	}


		public static void main02(String[] args) {
			// *********
			//  *******
			//   *****
			//    ***
			//     *
		
			// ����� �ڵ� 1
			for(int i=0; i<5; i++) {
				for(int j=0; j<i; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<9-i*2; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
			
			//���� § �ڵ�
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 9 - i; j++) {
						System.out.print(j < i ? " " : "*");
				}
				System.out.println("");
	    }
	}
	

		
		public static void main03(String[] args) {
			//		*
			//     ***
			//    *****
			//   *******
			//  *********
			//   *******
			//    *****
			//     ***
			//      *
			
			// ����� �ڵ� 1
			int end = 1;
			for(int i=0; i<9; i++) {
				for(int j=0; j<5-end; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<end*2-1; j++) {
					System.out.print("*");
				}
				System.out.println();
				end = i<4 ? end+1 : end-1;
			}
		
			
			// ����� �ڵ� 2
			int end = 4;
			for(int i=0; i<9; i++) {
				for(int j=0; j<9-end; j++) {
					System.out.print(j<end ? " " : "*");
				}
				System.out.println();
				
				end = i<4 ? end-1: end+1;
			}
			
			
			
			// ���� § �ڵ�
			for(int i=0; i<5; i++) {
				
			}
			
			for (int i = 0; i < 5; i++) {
				 
	            for (int j = i; j < 5; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j < i; j++) {
	                System.out.print("*");
	            }
	            for (int j = 0; j < i - 1; j++) {
	                System.out.print("*");
	            }
	 
	            System.out.println();
	        }
	 
	        for (int i = 0; i < 5; i++) {
	 
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }
	 
	            for (int j = i; j < 5; j++) {
	                System.out.print("*");
	            }
	            for (int j = i + 1; j < 5; j++) {
	                System.out.print("*");
	            }
	 
	            System.out.println();
	        }
		}

		public static void main04(String[] args) {
			//	*********
			//   *******
			//	  *****
			//	   ***
			//	    *
			//     ***
			//    *****
			//   *******
			//  *********
			
			// ���� § �ڵ�
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 9 - i; j++) {
					System.out.print(j < i ? " " : "*");
				}
				System.out.println("");
			}

			for (int i = 4; i >= 0; i--) {
				for (int j = 0; j < 9 - i; j++) {
					System.out.print(j < i ? " " : "*");
				}
				System.out.println();
			}
		}		
	public static void main05(String[] args) {
		//  *********
		//	**** ****
		//	***   ***
		//	**     **
		//	*       *
		//	**     **
		//	***   ***
		//	**** ****
		//	*********
		
		// ����� �ڵ�
		int end = 5;
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++ ) {
				//System.out.print(j<end || j>8-end?"*":"");
				System.out.print(j>=end && j<9-end ? " ":"*");
			}
				System.out.println();
				end =i<4 ? end-1 : end +1;
		}
		
	}

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
			//  *********
			//	**** ****
			//	***   ***
			//	**     **
			//	*       *
			//	**     **
			//	***   ***
			//	**** ****
			//	*********
		
		int size;
		while (true) {
			System.out.print("ũ���Է�(Ȧ����)>>> ");
			size = scan.nextInt();
			break;
		} catch (Exception e) {
			System.out.println("���ڸ� �Է� �ϼ���!");
			scan.next();
			continue;
		// ��ȿ�� �˻� : 5�̻� 15���� ���� ���, Ȧ���� �Է� ������.
		
			while(size%2==0 || size <5 || size >15) {
				try {
				if(size <5 || size >15) {
					System.out.println("5�̻� 15���� ���� �Է��ϼ���!");
					System.out.print("ũ���Է�(Ȧ����)>>>");
					size = scan.nextInt();
					continue;
		}
				System.out.println("Ȧ���� �Է� �ϼ���!");
				System.out.print("ũ���Է�(Ȧ����)>>>");
				size = scan.nextInt();
		} catch (Exception e) {
			System.out.println("���ڸ� �Է� �ϼ���!");
			scan.next();
			size = 0;
			continue;
		}
	}	
		
		
		int end = size/2 +1;
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++ ) {
				
				System.out.print(j>=end && j<size-end ? " ":"*");
			}
			System.out.println();
			end =i<size ? end-1 : end +1;
			
		}
		
	}
}
}
	
		
		
		
		