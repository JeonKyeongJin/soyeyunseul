package Ex;

public class PositivePoint extends Point1 {
	PositivePoint() {
		super(0, 0);
	}

	@Override
	protected void move(int x, int y) {
		if (x >= 0 && y >= 0) {
			super.move(x, y);
		}
	}

	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + ") ÀÇ Á¡";
	}
}