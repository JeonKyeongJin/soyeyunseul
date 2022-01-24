package day02;

import java.io.IOException;
import java.util.Scanner;

public class Ex02 {

	static Scanner scan = new Scanner(System.in);
	static int getNum() {
		int num = 0;
		int ch = 0;
		try {
			while((ch=System.in.read())!='\n') {
				if(ch>='0' && ch<='9') {
					num = num*10 + ch - '0';
				}
			}
		}catch (IOException e) { }
		return num;
		
	}
					
	
	public static int compare(int a, int b) {
		if(a==b) {
			return 0;
		} else if(a<b) {
			return 1;
		} else {
			return - 1;
		}
	}
	
	static void status(int cnt) {
		  // ���߰� ���°ǰ�? cnt�� �� �Ǿ ���°ǰ�?
		  //cnt�� 0�� �ƴϸ� ���߰� ���°� 0�̸� �׳� �ǰ�!
		if(cnt == 0) {
			System.out.println("��ȸ�� ��� �����ߴ�. �ǰ�!");
		} else {
			System.out.println("����!");
			
		}
	}
	
	static int getUserNum(int min, int max) {
		System.out.printf("����� �Է�(%d~%d����) >>",min, max);
		int userNum = getNum();
		while(userNum<min || userNum>max) {
			System.out.println("�Է� ������ ���� �����ϴ�!");
			System.out.printf("�ٽ� �Է�(%d~%d����) >>", min, max);
			userNum = getNum();
		}
		return userNum;
	}
	
	
	public static void game() {
		// ��ǻ�Ͱ� 1~100������ ������ ����(����) ����
		// ����ڰ� 5ȸ �ȿ� ���߱�
		int min = 1, max = 100;
		int cnt = 5;
		int sysNum = (int)(min + Math.random() * max);
		System.out.println("�ý����� ������ ���� �߽��ϴ�.("+sysNum+")");
		
		while(cnt>0) {
			// ����ڰ� �Է� �޾Ƽ� ���ϱ�
			System.out.println("���� �õ� Ƚ�� : " + cnt);
			int userNum = getNum();
			int result = compare(sysNum, userNum);
			if(result == 0) {
				break;
			}
			if(result == 1) {
				// �ʹ� ū���� -> max�� ���� ����
				System.out.println("�ʹ� ū �����Դϴ�!");
			max = userNum -1;
			} else {
				System.out.println("�ʹ� ���� �����Դϴ�!");
				min = userNum +1;
			}
			cnt--;
		} //end of while
		status(cnt);
	}
		
	
	public static void main(String[] args) {
		// ���� ���� ����(ī�� ���߱�)
		// ��õ� �����ϰ� ����
		// --- �Է� �� ���ڰ� �³�? Ʋ����? �Ǻ�
		// --- ������ ����, Ʋ���� �۴�/ũ�� �� ���
		
		while(true) {
			System.out.println("--- ���� ���� ---");
			game();
			System.out.println("��� �Ͻðڽ��ϱ�?(y/n) >> ");
			char isLoop = scan.next().charAt(0);
			while(!(isLoop == 'n' || isLoop == 'y')) {
				System.out.println("y�Ǵ� n�� �Է��ϼ���!");
				System.out.println("��� �Ͻðڽ��ϱ�?(y/n) >> ");
				isLoop = scan.next().charAt(0);
			}
			if(isLoop == 'n' || isLoop == 'N') {
				break;
		
			}
		}
	System.out.println("�����߽��ϴ�!!!");
	}

}
