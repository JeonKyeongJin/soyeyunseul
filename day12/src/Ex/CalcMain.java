package Ex;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" �� ���� �� �����ڸ� �Է� �ϼ���. ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		String z = sc.next();
		Add a = new Add();
		Sub b = new Sub();
		Mul c = new Mul();
		Div d = new Div();

		switch (z) {
		case "+":
			a.setValue(x, y);
			System.out.println(a.calculate());
			break;

		case "-":
			b.setValue(x, y);
			System.out.print(b.calculate());
			break;
		case "*":
			c.setValue(x, y);
			System.out.print(c.calculate());
			break;
		case "/":
			d.setValue(x, y);
			System.out.print(d.calculate());
		}

	}

}
