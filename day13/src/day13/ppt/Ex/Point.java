package day13.ppt.Ex;

class MyPoint {
	private int a, b;

	MyPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public String toString() {
		return "Point(" + a + "," + b + ")";
	}
}

public class Point {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		if (p.equals(q))
			System.out.println("���� ��");
		else
			System.out.println("�ٸ� ��");

	}

}
