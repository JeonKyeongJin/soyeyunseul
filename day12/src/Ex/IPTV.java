package Ex;

public class IPTV extends ColorTV {
	private String address;

	public IPTV(String address, int size, int Color) {
		super(size, Color);
		this.address = address;
	}

	public void printProperty() {
		System.out.println("���� IPTV�� " + address + "�ּ��� " + getSize() + "��ġ " + getColor() + "�÷� ");
	}

}
