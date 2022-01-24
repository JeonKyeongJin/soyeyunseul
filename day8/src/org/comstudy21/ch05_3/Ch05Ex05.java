package org.comstudy21.ch05_3;

class People {
	// �̸�, ����, ������ ����Ǵ� �ʵ�
	private String name;
	private int age;
	private String job;
	
	public People() {
		this("",0,"");
		

	}
	
	// People�� ������ (������ �����ε�) -- �Ű������� ���������̴�.
	public People(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	public void showInfo() {
		System.out.printf("People [����=%s, ����%d, ����=%s]\n",name,age,job);
	}
	public void setInfo(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
}
public class Ch05Ex05 {

	public static void main(String[] args) {
		People people1 = new People("ȫ�浿",23,"����");
		people1.showInfo();  // �ʵ��� ���� ���.
		
		People people2 = new People();
		people2.setInfo("�̼���",35,"�屺");
		people2.showInfo();
	}

}
