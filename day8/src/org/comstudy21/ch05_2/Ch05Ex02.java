package org.comstudy21.ch05_2;

class AAA {
	private int privateData;
	int defaultData; // ���� ��Ű������ ���� ����
	protected int protectedData; // 
	public int publicData;
		
	}
	
	class BBB extends AAA {
		public void set() {
			// private ����� ���꿡���� ���� �Ұ���.
		    // privatData = 10;
			// �ٸ� ��Ű���� ����� ���� �Ұ���
			
			// defaultData = 100;
			protectedData = 1000; // ��ӵǸ� ���� ����
			publicData = 10000;
		}
	}

public class Ch05Ex02 extends Object {

	public static void main(String[] args) {
		AAA aaa = new AAA();
		
		
		// aaa.protectecdData = 120;
		aaa.publicData = 2500;
		
		System.out.println(aaa.toString());
		System.out.println(aaa.equals(null));
		

	}

}
