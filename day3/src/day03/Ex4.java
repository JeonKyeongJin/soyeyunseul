package day03;

import static java.lang.System.out;
import java.util.Scanner;

public class Ex4 {

	static Scanner scan = new Scanner(System.in);

	public static void main00(String[] args) {
		// ���� 1 : 3�� 3���� ������ ���
		// ���� 2 : ���۴�, ����� ��ɰ� ��ü �ϼ���.
		
		
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
				System.out.println("�Է¹����� �ʰ��߽��ϴ�!");
				System.out.printf(message);
				dan = scan.nextInt();
				}
				return dan;
			}
		public static void main(String[] args) {
				
				int startDan = getDan("���۴� �Է� >> ");
				int endDan = getDan("����� �Է� >> ");
				
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
			

	

		





