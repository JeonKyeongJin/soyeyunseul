package day13;

import java.util.StringTokenizer;

public class Example {

	public static void main(String[] args) {
		int sum = 0;
		StringTokenizer st = new StringTokenizer("a=3,b=5,c=6", ",=");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			int n = 0;
			try {
				n = Integer.parseInt(token);
			} catch (NumberFormatException e) {

			}
			sum += n;
		}
		System.out.println("гую╨ " + sum);
	}
}
