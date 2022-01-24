package Ex;

public class TVMain {

	public static void main(String[] args) {
		IPTV ipTV = new IPTV("192.1.1.2", 32, 2048);
		ipTV.printProperty();

	}

}
