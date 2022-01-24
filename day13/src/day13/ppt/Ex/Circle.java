package day13.ppt.Ex;

public class Circle {
	private int x, y, r;

	Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle(" + x + "," + y + ")¹ÝÁö¸§" + r;

	}

	@Override
	public boolean equals(Object obj) {
		Circle c = (Circle) obj;
		if (x == c.x && y == c.y)
			return true;
		else
			return false;

	}

}
