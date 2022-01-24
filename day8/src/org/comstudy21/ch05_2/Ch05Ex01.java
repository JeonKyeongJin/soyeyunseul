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
		// x ,y �� �θ� Ŭ������ �ѱ��
		set(x, y);
		this.z = z;

	}

	public void show3DPoint() {
		// �θ��� �޼ҵ� ȣ��
		showPoint();
		System.out.println(z);

	}

}

public class Ch05Ex01 {
	// PointŬ����, colorPointŬ����, Point3DŬ���� ���� �ǽ�.
	public static void main(String[] args) {
		Point p = new Point();
		p.set(10, 20);
		p.showPoint();

	}

}
