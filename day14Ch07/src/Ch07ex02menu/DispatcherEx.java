package Ch07ex02menu;

import java.util.HashMap;
import java.util.Scanner;

class Menu {
	public static int no;
	public static Scanner scan = new Scanner(System.in);

	public static void dispaly(String[] items) {
		for (int i = 0; i < items.length; i++) {
			System.out.print(i + 1 + "." + items[i] + " ");
		}
		System.out.print("\n���� : ");
		no = scan.nextInt();
		while (no < 1 || no > items.length) {
			System.out.println("�Է� ������ �ʰ��߽��ϴ�!!");
			System.out.print("�ٽ� ���� : ");
			no = scan.nextInt();
		}
	}
}

abstract class Controller {
	public abstract void run();
}

class BoardController extends Controller {
	public void run() {
		System.out.println(":::: BOARD ::::");
		String[] menuItems = new String[] { "�Է�", "���", "�󼼺���", "����", "����" };
		Menu.dispaly(menuItems);
		System.out.print(Menu.no + " => ");
		System.out.println(menuItems[Menu.no - 1]);
	}
}

class GalleryController extends Controller {
	public void run() {
		System.out.println(":::: GALLERY ::::");
		String[] menuItems = new String[] { "�������", "�������", "��������" };
		Menu.dispaly(menuItems);
		System.out.print(Menu.no + " => ");
		System.out.println(menuItems[Menu.no - 1]);
	}
}

class AddressController extends Controller {
	public void run() {
		System.out.println(":::: ADDRESS ::::");
		String[] menuItems = new String[] { "�ּҵ��", "�ּҰ˻�", "�ּһ���" };
		Menu.dispaly(menuItems);
		System.out.print(Menu.no + " => ");
		System.out.println(menuItems[Menu.no - 1]);
	}
}

class EndController extends Controller {
	public void run() {
		System.out.println(":::: END ::::");
		String[] menuItems = new String[] { "����������", "�׳�����", "���" };
		Menu.dispaly(menuItems);
		System.out.print(Menu.no + " => ");
		System.out.println(menuItems[Menu.no - 1]);
		if (Menu.no != 3)
			System.exit(0);
	}
}

public class DispatcherEx {
	private HashMap<String, Controller> map = new HashMap<String, Controller>();
	String[] menuItems = new String[] { "�Խ���", "������", "�ּҷ�", "����" };
	{
		map.put(menuItems[0], new BoardController());
		map.put(menuItems[1], new GalleryController());
		map.put(menuItems[2], new AddressController());
		map.put(menuItems[3], new EndController());
	}

	public DispatcherEx() {
		action();
	}

	private void action() {
		// �޴� �����ش�.
		Menu.dispaly(menuItems);
		map.get(menuItems[Menu.no - 1]).run(); // ���� �� Cotroller�� ���� �ȴ�.
		// ���ȣ��
		action();
	}

	public static void main(String[] args) {
		new DispatcherEx();
	}
}