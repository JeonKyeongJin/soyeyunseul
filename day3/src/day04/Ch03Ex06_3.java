package day04;

import java.util.Scanner;
import static java.lang.System.out;

public class Ch03Ex06_3 {
	
	public static void main(String[] args) {
		// ����3 : �Է� ��/���� 100�� ���� ��¥ ���.
		
		Scanner scan = new Scanner(System.in);

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		  int month, day;
		  int day2 = 100;

		  System.out.println("�� �Է� : ");
		  month = scan.nextInt();

		  System.out.println("�� �Է� : ");
		  day = scan.nextInt();

		  day2 = day2 -(days[month-1] -day); 
		  
		  while (day2 > days[month%12]) {
		   if ((month%12) == 0) {
		    month = 1;
		   } else {
		    month++;
		   } // if-else : ���� �⵵�� �Ѿ�� ��� ó��
		   
		   day = days[month - 1];
		   day2 = day2 - day;
		  } 
		  
		  month++;
		  
		  System.out.println("�Է��Ͻ� ��¥�� 100�� �ڴ� " + month + "�� " + day2 + "�� �Դϴ�.");
	}
}
		

	

		

		
		
		
