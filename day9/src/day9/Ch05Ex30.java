package day9;

class �ҹ� {
	public void ����() {
		System.out.println("�ҹ��� ���� ��!");
	}
}

class �ƹ� extends �ҹ� {
	public void ����() {
		System.out.println("�ƹ��� ���� �߸���!");
	}
}

class ���� extends �ƹ� {
	public void ����() {
		System.out.println("������ ���� �׻�!");
	}
}

public class Ch05Ex30 {

	public static void main(String[] args) {
		�ҹ�[] family = new �ҹ�[5];
		family[0] = new �ҹ�();
		family[1] = new �ƹ�();
		family[2] = new ����();
		family[3] = new �ƹ�(); 
		family[4] = new ����();

		for (�ҹ� h : family) {
			h.����();
		}

	}

}
