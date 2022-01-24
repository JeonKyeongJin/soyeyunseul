package Ch08Ex01;

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

public class CircleManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircleManager[] c = new CircleManager[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("x, y, radius>> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new CircleManager(); 
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
		System.out.print("면적이 가장 큰 원: "+c[index].show());
		



		sc.close();
	}

}


	
