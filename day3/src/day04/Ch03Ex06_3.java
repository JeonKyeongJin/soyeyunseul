package day04;

import java.util.Scanner;
import static java.lang.System.out;

public class Ch03Ex06_3 {
	
	public static void main(String[] args) {
		// 과제3 : 입력 월/일의 100일 후의 날짜 출력.
		
		Scanner scan = new Scanner(System.in);

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		  int month, day;
		  int day2 = 100;

		  System.out.println("월 입력 : ");
		  month = scan.nextInt();

		  System.out.println("일 입력 : ");
		  day = scan.nextInt();

		  day2 = day2 -(days[month-1] -day); 
		  
		  while (day2 > days[month%12]) {
		   if ((month%12) == 0) {
		    month = 1;
		   } else {
		    month++;
		   } // if-else : 다음 년도로 넘어갔을 경우 처리
		   
		   day = days[month - 1];
		   day2 = day2 - day;
		  } 
		  
		  month++;
		  
		  System.out.println("입력하신 날짜의 100일 뒤는 " + month + "월 " + day2 + "일 입니다.");
	}
}
		

	

		

		
		
		
