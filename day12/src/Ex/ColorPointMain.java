package Ex;

public class ColorPointMain {

	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(0, 0); // (0,0) ��ġ�� BLACK �� ��
		System.out.println(zeroPoint.toString()+"�Դϴ�.");
		
		ColorPoint cp = new ColorPoint(10,10); // (10,10)��ġ�� BLACK�� ��
		cp.setXY(5,5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"�Դϴ�.");

	}

}
