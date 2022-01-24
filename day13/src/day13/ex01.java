package day13;

import java.util.Random;

public class ex01 {

	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.print(r.nextInt(156) + 100);
			System.out.print(" ");
		}
	}
}
