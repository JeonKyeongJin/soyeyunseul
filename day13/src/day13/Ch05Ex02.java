package day13;

import java.util.HashSet;
import java.util.Random;

public class Ch05Ex02 {
	// ���� ����ϴ� �÷���
	// set,map, list
	// Set - key�� ���� index�� ����. ������ ���� �ߺ��� ������ ���� X
	// Map - ��Ҹ� key�� value�� ������ ���´�.
	// list - insdex�� �ִ�.
	public static void main(String[] args) {
		Random rand = new Random();
		HashSet<Integer> lotto = new HashSet<Integer>();
		System.out.println("size => " + lotto.size());
		while (lotto.size() < 6) {
			lotto.add(1 + rand.nextInt());
		}
		System.out.println(lotto);
	}
}