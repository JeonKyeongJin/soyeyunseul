package org.coamstudy21.ch05;

//  1���� java ���Ͽ� ���� Ŭ���� ���� ����(��Ű�� ���)
// �� ���� �����ϴ� x,y ��ǥ�� �����ϴ� ��ü�� Ŭ����
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

// Point�� Ȯ���� ColorPoint Ŭ���� ����
// class ����Ŭ������ extends ����Ŭ������{}
// ����Ŭ������ ���뿡 ����Ŭ������ ������ ���� �ȴٴ� �ǹ�.
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
		set(x,y);
		this.z = z;
		
	}

	public void show3DPoint() {
		// �θ��� �޼ҵ� ȣ��
		showPoint();
		System.out.println(z);
		
	}
	
		
}


public class Ch05Ex01 {
	public static void main(String[] args) {
		// Point�� Ȯ���� Point3D Ŭ������ �����ϰ� ����ϱ�
		Point3D p3d = new Point3D();
		p3d.set(10,20,15); // x,y,z
		p3d.show3DPoint();
	}
	
	public static void main01(String[] args) {
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}
	public static void main00(String[] args) {
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();

	}

}
