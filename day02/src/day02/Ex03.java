package day02;

import static java.lang.System.out;

public class Ex03 {

	public static void main00(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10=55
		// while 문으로 구현하기
		final int MAX = 10;
		// 누적하는 변수는 0으로 초기화
		int sum = 0;  // 1부터 10까지 누적
		int num = 1; // 1부터 10까지 하니씩 증가 용도
		while (num<=MAX) {
			sum += num;
			System.out.print(num);
			System.out.print(num!=MAX ? "+" : "=");
			num++;
		}
		System.out.println(sum);
	}



	public static void main01(String[] args) {
		//1+2-3+4-5+6-7+8-9+10=7
		final int MAX = 10;
		final int MIN = 1;
		int sum = 0;  
		int num = MIN; 
		
		// 1. 1~10까지 출력 (num을 증가하면서 출력한다)
		while(num<=MAX) {
			out.print(num);
			if(num%2 == 1) {
				sum = num==MIN ? num : sum- num;
				out.print("+");
			} else {
				sum += num;
				out.print(num==	MAX?"=":"-");
			}
			num = num + 1;
			
		}
	System.out.println(sum);
	}
	
	public static void main02(String[] args) {
		final int MAX = 21;
		// 피보나치 수열 누적
		// 1 + 1 + 2 + 3 + 5 + 8 + 13 21 = 54
		int prev = 0; // 이전항
		int curr = 1; // 현재항
		int next = 0;
		int sum = 0;
		
		while(curr <= MAX) {
			// 누적하기
			sum += curr;
			System.out.print(curr);
			System.out.print(curr==MAX ? "=" : "+");
			
			// 치환해서 증가하기
			// 다음항은이전항 + 현재항 
			next = prev + curr;
			// 현재항은 이전항으로 치환
			prev = curr; 
			// 다음항은 현재항으로 치환(새로운 현재항)
			curr = next;
		}
		System.out.println(sum);
	}
	
	public static void main03(String[] args) {
		// 1 + 1 - 2 + 3 - 5 + 8 - 13 + 21 = 14
		int prev = 0; // 이전항
		int curr = 1; // 현재항
		int next = 0;
		int sum = 0;
		int total = 0;
		int count = 1;
		
		while(curr<=21) {
			System.out.print(curr);
			count += 1;
			
			if(count<9)
			if((count%2)==1) {
				System.out.print("-");
				} else {
					System.out.print("+");
				}
			if((count%2)==1) {
			total = total + curr;
				} else {
					total = total - curr;
				} //total +2
			
			next = prev + curr;
			prev = curr;
			curr = next;
		}
		
		System.out.println("=" + (total + 2));
	}
	
	public static void main(String[] args) {
		// 1 + 1 - 2 + 3 - 5 + 8 - 13 + 21 = 14
		int prev = 0; // 이전항
		int curr = 1; // 현재항
		int next = 0;
		int sum = 0;
		
		for(int i=0; i<8; i++) {
			if(i%2==0 && i>0) {
				next = prev + curr;
				prev = curr;
				sum = sum - curr;
		out.print("-" + curr);
		
		curr=next;
			} else if(i==0) {
				next = prev + curr;
				prev = curr;
				sum = sum + curr;
				
		out.print(curr);
		
		curr=next;
			} else {
				next = prev + curr;
				prev = curr;
				sum = sum + curr;
				
		out.print("+" + curr);
		
		curr = next;
			}
		}
	
		out.print("=" + sum);
	}
	
	
}