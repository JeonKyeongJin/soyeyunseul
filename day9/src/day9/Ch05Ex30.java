package day9;

class 할배 {
	public void 나팔() {
		System.out.println("할배의 나팔 뽕!");
	}
}

class 아배 extends 할배 {
	public void 나팔() {
		System.out.println("아배의 나팔 삐리리!");
	}
}

class 손자 extends 아배 {
	public void 나팔() {
		System.out.println("손자의 나팔 뿡뿌!");
	}
}

public class Ch05Ex30 {

	public static void main(String[] args) {
		할배[] family = new 할배[5];
		family[0] = new 할배();
		family[1] = new 아배();
		family[2] = new 손자();
		family[3] = new 아배(); 
		family[4] = new 손자();

		for (할배 h : family) {
			h.나팔();
		}

	}

}
