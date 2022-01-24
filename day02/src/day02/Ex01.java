package day02;

import java.io.IOException;
public class Ex01 {

	static int getNum() {
		int num = 0;
		int ch = 0;
		try {
			while((ch=System.in.read())!='\n') {
				if(ch>='0' && ch<='9') {
					num = num*10 + ch - '0';
				}
			}
	} catch (IOException e) { }
		return num;
	}	
		static int input(String s) {
			System.out.print(s);
			return getNum();
		}
		
		public static void main(String[] args) {
		//숫자 3개를 입력 받아서 큰수, 중간, 작은수를 출력하는 프로그램을 만든다.
			int a, b ,c;
			int max=0, mid=0, min=0;
			
			a = input("정수 입력 a>>");
			b = input("정수 입력 b>>");
			c = input("정수 입력 c>>");
			
			
			// 의사코드
			// 1. 두개의 숫자를 비교해서 큰것은 max, 작은것은 min에 입력
			// 3. 나머지 한개의 숫자를 max와 비교해서 max 보다 크면 max치환
			// 3. 만약 max 보다 작다면 그것을 min과 비교해서 min 보다 작다면 min 치환
			// 4. 나머지 숫자가 max 보다도 크지 않고 min 보다도 작지않다면 그것이 mid
			
		if(a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		if(c > max) {
			mid = max;
			max = c;
		} else if(c<min) {
			mid = min;
			min = c;
		} else {
			mid = c;
		}
	
		System.out.printf("%d, %d, %d\n",max ,mid, min);

	}
}