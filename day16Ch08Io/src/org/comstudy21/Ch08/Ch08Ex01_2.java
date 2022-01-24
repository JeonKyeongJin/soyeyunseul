package org.comstudy21.Ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ch08Ex01_2 {

	public static String getLine() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static int getNum() {
		String s = getLine();
		StringBuffer s2 = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch > '0' && ch <= '9') {
				s2.append(ch);
			}
		}
		return Integer.parseInt(s2.toString());
	}

	public static void main(String[] args) {
		System.out.print("주소 입력 : ");
		String addr = getLine();
		System.out.print("나이 입력 : ");
		int age = getNum();

		System.out.println("입력된 주소는 " + addr);
		System.out.println("입력된 나이는 " + age);
	}

}
