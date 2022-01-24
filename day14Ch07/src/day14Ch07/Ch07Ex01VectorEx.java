package day14Ch07;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

abstract class Ex {
	public abstract void run();

	public void start() {
		System.out.println("--- 예제실행 ---");
		run();
	}
}

class Ex01 extends Ex {
	@Override
	public void run() {
		System.out.println(">>> 정수 값만 다루는 제네릭 벡터 생성");
		Vector<Integer> v = new Vector<Integer>();

		System.out.println("v.size() => " + v.size());
		System.out.println("v.capacity() => " + v.capacity());

		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		System.out.println("add 후 v.size() => " + v.size());

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
		System.out.println(">>> Point 객체를 요소로만 가지는 벡터 생성");
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
		System.out.println(">> 문자열만 삽입 가능한 ArryList 컬렉션");
		ArrayList<String> a = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>> ");
			a.add(scan.next());
		}
		System.out.println("저장 완료!");
		int longIndex = 0; // index는 -1이 될수 없다.
		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.println(name + " ");
			if (name.length() > a.get(longIndex).length()) {
				longIndex = i;
			}
		}
		System.out.println();
		System.out.println("긴거 => " + a.get(longIndex));
	}
}

public class Ch07Ex01VectorEx {
	public Ch07Ex01VectorEx() {
		// 생성자는 필드를 초기화 한다.
		// 예제 구현 매소드 별도로 만든다.
		Ex ex = new Ex03();
		ex.start();
	}

	public static void main(String[] args) {
		// 메인에 직접 구현하기 보다는 객체에 구현 해 보자.
		// 생성자에서 시작 하도록 한다.
		new Ch07Ex01VectorEx();
	}

}
