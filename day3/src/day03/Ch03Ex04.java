package day03;
 

import java.util.Scanner;

public class Ch03Ex04 {

	public static void main01(String[] args) {
		// 구구단 출력 프로그램.
		int i,j;
			for(i=0; i<10; i++) {
				for(j=2; j<10; j++) {
					if(i==0) {
						System.out.print(j+"단\t");
					}else {
						System.out.print(j+"*"+i+"="+(j*i+"\t"));
					}
				}
				System.out.println();
					}
			}

	static Scanner scan = new Scanner(System.in);
	
	static int getDan(String message) {
		System.out.printf(message);
		int dan = scan.nextInt();
		// 유효성 검사
		while(dan<2 || dan>9) {
			System.out.println("입력범위를 초과했습니다!");
			System.out.print(message);
			dan = scan.nextInt();
		return dan;
	}
	
	public static void main024(String[] args {
		int startDan = 2; 
		int endDan = 9;
		
	    startDan = getDan("시작단 입력>>");
		endDan = getDan("종료단 입력>>");
		
		
		// 시작단이 종료단 보다 큰 숫자여도 정상 출력 되도록 완성하시오.
		// 치환하기
		if(startDan > endDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}
		
		
		
			}
		for(int dan=startDan; dan<=endDan; dan++) {
			System.out.printf("***%d***\n", dan);
			for(int cnt =1; cnt <=9; cnt +=1) {
				System.out.printf("%d*%d=%d\n", dan, cnt, dan * cnt);
			}
			
		}
		
		public static void main(String[] args) {
			
			for(int dan=2; dan<=9; dan+=3) {
				System.out.printf("***%d***\t", dan+0);
				System.out.printf("***%d***\t", dan+1);
				System.out.printf("***%d***\t", dan+2);
				System.out.println();
				
				
			}
		}
	
	
	}
	}
for(int i=2; i<10; i+=3) {
	for(int cnt=1; cnt<10; cnt++) {
		for(int dan=i; dan<i+3; dan++) {
			if(dan>9)
				break;


// ---- 코딩 못하는자의 특징 ----
// 1. 빨간 글자를 읽기 싫어한다.
// 2. 테스트 하지 않는다.
// 3. 생각을 안하고 습관적으로 코딩한다.
// 4. 영타가 느리다.
// 5. 선생님을 이유없이 싫어한다.