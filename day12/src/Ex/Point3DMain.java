package Ex;

public class Point3DMain {

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString()+ "�Դϴ�.");
		
		p.move(-5, 5); // ��ü p�� ���� �������� �̵����� ����
		System.out.println(p.toString()+ "�Դϴ�.");
		
		PositivePoint p2 = new PositivePoint();
		System.out.println(p2.toString()+ "�Դϴ�.");

	}

}
