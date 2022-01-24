package org.comstudy21.ch05_2;

class AAA {
	private int privateData;
	int defaultData; // 같은 패키지에서 접근 가능
	protected int protectedData; // 
	public int publicData;
		
	}
	
	class BBB extends AAA {
		public void set() {
			// private 멤버는 서브에서도 접근 불가능.
		    // privatData = 10;
			// 다른 패키지의 멤버는 접근 불가능
			
			// defaultData = 100;
			protectedData = 1000; // 상속되면 접근 가능
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
