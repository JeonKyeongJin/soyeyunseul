package day04;

import java.util.Scanner;

public class Ch03Ex06_2 {
	
	public static void main(String[] args) {
		// 과제2 : 0월0일부터 1년의 남은 날짜는 00일입니다.
		// (365 - total 빼기 금지)
		
		Scanner scan = new Scanner(System.in);
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int month = 0;
		int day = 0;
		int total = 0;
		
		System.out.println("월 입력 : ");
		  month = scan.nextInt();

		  System.out.println("일 입력 : ");
		  day = scan.nextInt();
		  
		  for(int i = month;i<12;i++) {
				total += days[i];
			}
			total += days[month-1]-day;
			System.out.printf("%d월 %d일부터 올 해 남은 날짜는 %d 입니다.\n",month,day,total);
		



	}
}


