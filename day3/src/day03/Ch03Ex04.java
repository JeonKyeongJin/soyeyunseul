package day03;
 

import java.util.Scanner;

public class Ch03Ex04 {

	public static void main01(String[] args) {
		// ������ ��� ���α׷�.
		int i,j;
			for(i=0; i<10; i++) {
				for(j=2; j<10; j++) {
					if(i==0) {
						System.out.print(j+"��\t");
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
		// ��ȿ�� �˻�
		while(dan<2 || dan>9) {
			System.out.println("�Է¹����� �ʰ��߽��ϴ�!");
			System.out.print(message);
			dan = scan.nextInt();
		return dan;
	}
	
	public static void main024(String[] args {
		int startDan = 2; 
		int endDan = 9;
		
	    startDan = getDan("���۴� �Է�>>");
		endDan = getDan("����� �Է�>>");
		
		
		// ���۴��� ����� ���� ū ���ڿ��� ���� ��� �ǵ��� �ϼ��Ͻÿ�.
		// ġȯ�ϱ�
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


// ---- �ڵ� ���ϴ����� Ư¡ ----
// 1. ���� ���ڸ� �б� �Ⱦ��Ѵ�.
// 2. �׽�Ʈ ���� �ʴ´�.
// 3. ������ ���ϰ� ���������� �ڵ��Ѵ�.
// 4. ��Ÿ�� ������.
// 5. �������� �������� �Ⱦ��Ѵ�.