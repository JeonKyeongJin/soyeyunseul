package org.comstudy21.ch05_2;

class Point {
	int x, y;

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.printf("(%d,%d)\n", x, y);
	}
}

class ColorPoint extends Point {
	private String color;

	public void setColor(String string) {
		this.color = color;
	}

	public void showColorPoint() {
		System.out.print(color);
		showPoint();

	}

}

class Point3D extends Point {
	private int z;

	public void set(int x, int y, int z) {
		// x ,y 는 부모 클래스로 넘기기
		set(x, y);
		this.z = z;

	}

	public void show3DPoint() {
		// 부모의 메소드 호출
		showPoint();
		System.out.println(z);

	}

}

public class Ch05Ex01 {
	// Point클래스, colorPoint클래스, Point3D클래스 구현 실습.
	public static void main(String[] args) {
		Point p = new Point();
		p.set(10, 20);
		p.showPoint();

	}

}
