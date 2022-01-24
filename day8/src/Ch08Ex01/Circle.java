package Ch08Ex01;

//public class Circle {
//int radius; // 원의 반지름 필드
//String name; // 원의 이름 필드

//public Circle() {} // 원의 생성자

//public double getArea() { // 원의 면적 계산 메소드
//return 3.14 * radius * radius;

//}

//public static void main(String[] args) {
//Circle pizza;
//pizza = new Circle(); // Circle 객체 생성
//pizza.radius = 10; // 피자의 반지름을 10으로 설정
//pizza.name = "자바피자"; // 피자의 이름 설정
//double area = pizza.getArea(); // 피자의 면적 알아내기
//System.out.println(pizza.name + "의 면적은 " + area);

//Circle donut = new Circle(); // Circle 객체 생성
//donut.radius = 2; // 도넛의 반지름을 2로 설정
//donut.name = "자바도넛";// 도넛의 이름 설정
//area = donut.getArea(); // 도넛의 면적 알아내기
//System.out.println(donut.name + "의 면적은 " + area);

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
			c[i] = new CircleManager(x, y, radius); // Circle 객체 형성
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
		System.out.print("면적이 가장 큰 원: " + c[index].show());

		sc.close();
	}

}
