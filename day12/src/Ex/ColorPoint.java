package Ex;

public class ColorPoint extends Point {
	private String color = "BLACK";
	
	public ColorPoint() {
		super(0,0);
	}
	ColorPoint(int x, int y) {
		super(x,y);
		color = "BLACK";
	}
	protected void setXY(int x, int y) {
		move(x,y) ;
	}
	protected void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return color +"»öÀÇ  " + "(" + getX() + ", "+getY() + ")" ;
	}

}
