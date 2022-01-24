package Ex;

public class IPTV extends ColorTV {
	private String address;

	public IPTV(String address, int size, int Color) {
		super(size, Color);
		this.address = address;
	}

	public void printProperty() {
		System.out.println("나의 IPTV는 " + address + "주소의 " + getSize() + "인치 " + getColor() + "컬러 ");
	}

}
