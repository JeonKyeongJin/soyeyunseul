package Ex;

public class ColorTV extends TV {
	private int Color;
	public ColorTV(int size, int Color) {
		super(size);
		this.Color = Color;
	}
	
	protected int getColor() {
		return Color;
	}
	
	public void printProperty() {
		System.out.println(getSize() + "인치" + Color + "컬러");
	}

}
