package day14Ch07;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

abstract class Ex {
	public abstract void run();

	public void start() {
		System.out.println("--- �������� ---");
		run();
	}
}

class Ex01 extends Ex {
	@Override
	public void run() {
		System.out.println(">>> ���� ���� �ٷ�� ���׸� ���� ����");
		Vector<Integer> v = new Vector<Integer>();

		System.out.println("v.size() => " + v.size());
		System.out.println("v.capacity() => " + v.capacity());

		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		System.out.println("add �� v.size() => " + v.size());

		System.out.println(v);
		for (Integer i : v) {
			System.out.print(i + "\t");
		}
		System.out.println();

		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
			sum += v.elementAt(i);
		}
		System.out.println("sum => " + sum);
	}
}

class Point {
	private int x, y;

	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}

class Ex02 extends Ex {
	public void run() {
		System.out.println(">>> Point ��ü�� ��ҷθ� ������ ���� ����");
		Vector<Point> v = new Vector<Point>();
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		int findIdx = v.indexOf(new Point(-5, 20)); // equals(), hashCode()
		System.out.println(findIdx);
		v.remove(1);
		System.out.println(v);
	}
}

class Ex03 extends Ex {
	public void run() {
		System.out.println(">> ���ڿ��� ���� ������ ArryList �÷���");
		ArrayList<String> a = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.print("�̸��� �Է��ϼ���>> ");
			a.add(scan.next());
		}
		System.out.println("���� �Ϸ�!");
		int longIndex = 0; // index�� -1�� �ɼ� ����.
		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.println(name + " ");
			if (name.length() > a.get(longIndex).length()) {
				longIndex = i;
			}
		}
		System.out.println();
		System.out.println("��� => " + a.get(longIndex));
	}
}

public class Ch07Ex01VectorEx {
	public Ch07Ex01VectorEx() {
		// �����ڴ� �ʵ带 �ʱ�ȭ �Ѵ�.
		// ���� ���� �żҵ� ������ �����.
		Ex ex = new Ex03();
		ex.start();
	}

	public static void main(String[] args) {
		// ���ο� ���� �����ϱ� ���ٴ� ��ü�� ���� �� ����.
		// �����ڿ��� ���� �ϵ��� �Ѵ�.
		new Ch07Ex01VectorEx();
	}

}
