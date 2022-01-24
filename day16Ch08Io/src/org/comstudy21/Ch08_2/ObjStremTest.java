package org.comstudy21.Ch08_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjStremTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// ObjectInputStream, ObjectOutputStream
		File file = new File("C:\\Users\\adoni\\saram.dat");
		FileOutputStream fos = new FileOutputStream(file);
		FileInputStream fis = new FileInputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ObjectInputStream ois = new ObjectInputStream(fis);

		Saram data1 = new Saram(1, "ȫ�浿", "hong@h.com");
		Saram data2 = new Saram(2, "��浿", "hong@h.com");
		Saram data3 = new Saram(3, "�ڱ浿", "hong@h.com");
		ArrayList<Saram> list = new ArrayList<Saram>();
		list.add(data1);
		list.add(data2);
		list.add(data3);

		oos.writeObject(list);
		System.out.println("��ü ���� �Ϸ�!");

		ArrayList<Saram> list2 = (ArrayList<Saram>) ois.readObject();
		System.out.println(list2);
	}
}
