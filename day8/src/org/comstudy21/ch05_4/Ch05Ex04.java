package org.comstudy21.ch05_4;

class ��� {
	private String name;
	// ��ӹ޴� Ŭ������ ���� ����Ʈ ������ ���� �� �ֱ�.
	public ���() {
		this.name = name;
		System.out.println(">>> 1. ��� ������ ȣ��!" + name);
	}
}

class �л� extends ��� {
	public �л�() {
		// �θ��� ����Ʈ ������(�Ű����� ���� ������) �ڵ����� ȣ���Ѵ�.
		// ���� �θ��� ����Ʈ �����ڰ� ���ٸ� ��������� �Ű����� �ִ� �����ڸ� ȣ�� �ؾ� �Ѵ�.
		super();
		System.out.println(">>> 2. �л��� ������ ȣ��!");
	}
}
class �ٷ��л� extends �л� {
	public �ٷ��л�() {
		System.out.println(">>> 3. �ٷ��л��� ������ ȣ��!");
	}
}

public class Ch05Ex04 {
	public static void main(String[] args) {
		�ٷ��л� studentworker = new �ٷ��л�();

	}

}
