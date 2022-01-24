package Ex;

public class Point3D extends Point1 {

	private int z;

	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public String toString() {
		return "(" + getX() + " , " + getY() + " , " + z + ")";

	}

	void moveUp() {
		z++;
	}

	void moveDown() {
		z--;
	}

	void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}
}
