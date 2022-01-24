package Ch08Ex01;

//public class Circle {
//int radius; // ���� ������ �ʵ�
//String name; // ���� �̸� �ʵ�

//public Circle() {} // ���� ������

//public double getArea() { // ���� ���� ��� �޼ҵ�
//return 3.14 * radius * radius;

//}

//public static void main(String[] args) {
//Circle pizza;
//pizza = new Circle(); // Circle ��ü ����
//pizza.radius = 10; // ������ �������� 10���� ����
//pizza.name = "�ڹ�����"; // ������ �̸� ����
//double area = pizza.getArea(); // ������ ���� �˾Ƴ���
//System.out.println(pizza.name + "�� ������ " + area);

//Circle donut = new Circle(); // Circle ��ü ����
//donut.radius = 2; // ������ �������� 2�� ����
//donut.name = "�ڹٵ���";// ������ �̸� ����
//area = donut.getArea(); // ������ ���� �˾Ƴ���
//System.out.println(donut.name + "�� ������ " + area);

//}

//}
import java.util.Scanner;

class Circle {
	private double x, y;
	private int radius;

	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	String show() {
		return "(" + x + "," + y + ")" + radius;
	}

	double area() {
		return radius * radius * 3.14;
	}
}

public class Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircleManager[] c = new CircleManager[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("x, y, radius>> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new CircleManager(x, y, radius); // Circle ��ü ����
		}
		double maxArea = 0;
		int index = 0;
		for (int i = 0; i < c.length; i++) {
			double x = c[i].area();
			if (maxArea < x) {
				maxArea = x;
				index = i;
			}
		}
		System.out.print("������ ���� ū ��: " + c[index].show());

		sc.close();
	}

}
