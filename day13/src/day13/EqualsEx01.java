package day13;

import java.util.ArrayList;
import java.util.Arrays;

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object obj) {
		Point p = (Point) obj;
		if (x == p.x && y == p.y)
			return true;
		else
			return false;
	} // end of equals

	public String toString() {
		return String.format("(%d,%d)", x, y);
	}
}

public class EqualsEx01 {

	public static void main(String[] args) {
		ArrayList<Point> pList = new ArrayList<Point>(); // �迭���� ���� index(����)
		pList.add(new Point(2,3));
		pList.add(new Point(4,5));
		pList.add(new Point(6,7));
		pList.add(new Point(8,9));
		pList.add(new Point(1,2));
		
		//System.out.println(pList);
		
		//System.out.println(pList.get(1));
		//pList.set(1, new Point(100,200));
		//System.out.println(pList.get(1));
		//System.out.println(pList);
		//System.out.println("size =>" + pList.size());
		
		// �÷����� ����� �迭�ν��� �����Ҽ� �ִ�.
		//Point[] arr = new Point[pList.size()];
		//pList.toArray(arr);
		//System.out.println(Arrays.toString(arr));
	
		// indexof() <-- ���� ��Ұ� �ִٸ� index ��ȯ, �ƴϸ� -1  ��ȯ
		// ArraysList���� ��ü�� ��ġ�� ã�� ���ؼ��� equals()�� ������ �ؾ��Ѵ�.
		// �ٸ� �÷��ǿ����� �˻��� ���� �Ϸ��� hachcode �� �������ؾ��Ѵ�.
		
		System.out.println(pList.indexOf(new Point(8, 9)));
		
	}
	
	public static void test(String[] args) {

		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);

		if (a == b) // false
			System.out.println("a==b");
		if (a.equals(b)) // true
			System.out.println("a is equal to b");
		if (a.equals(c)) // false
			System.out.println("a is equal to c");

	}

}
