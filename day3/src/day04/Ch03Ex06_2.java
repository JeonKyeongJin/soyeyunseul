package day04;

import java.util.Scanner;

public class Ch03Ex06_2 {
	
	public static void main(String[] args) {
		// ����2 : 0��0�Ϻ��� 1���� ���� ��¥�� 00���Դϴ�.
		// (365 - total ���� ����)
		
		Scanner scan = new Scanner(System.in);
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int month = 0;
		int day = 0;
		int total = 0;
		
		System.out.println("�� �Է� : ");
		  month = scan.nextInt();

		  System.out.println("�� �Է� : ");
		  day = scan.nextInt();
		  
		  for(int i = month;i<12;i++) {
				total += days[i];
			}
			total += days[month-1]-day;
			System.out.printf("%d�� %d�Ϻ��� �� �� ���� ��¥�� %d �Դϴ�.\n",month,day,total);
		



	}
}


