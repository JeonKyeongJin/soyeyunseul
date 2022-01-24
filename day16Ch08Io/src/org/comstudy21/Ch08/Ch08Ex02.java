package org.comstudy21.Ch08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Ch08Ex02 {
	
	// 객체를 파일에 저장하고 객체로 읽어온다.
	// 자바는 객체지향 언어 이므로 객체 저장이 더 효과적이다.
	// 객체 직렬화 - 객체를 저장하고 읽을때 필요한 개념.
	// 만약 객체를 집에 비유한다면... 

	public static void main(String[] args) throws IOException {
		// UTF로 기록하고
		File file = new File("C:\\Users\\adoni\\test2.txt");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("저장 할 문장을 입력 하세요.");
		String ins = null;
		StringBuffer stringData = new StringBuffer();
		while ((ins = br.readLine()) != null) {
			if (ins.equals("그만"))
				break;
			stringData.append(ins);
			stringData.append("\n");
		}

		dos.writeUTF(stringData.toString());
		dos.close();

		// UTF 읽기 호출
		test_dis(null);
	}

	public static void test_dis(String[] args) throws IOException {
		// DataInputStream
		File file = new File("C:\\Users\\adoni\\test2.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(fis);

		String s = null;
		try {
			s = dis.readUTF(); // UTF로 기록된 데이터를 읽어온다.
			System.out.println(s);
		} catch (IOException e) {
			System.out.println("UTF 읽기 오류 발생");
		} finally {
			dis.close();
		}
	}

	public static void test09(String[] args) throws IOException {
		File file = new File("C:\\Users\\adoni");
		FileReader fr = new FileReader(file);
		
		char[] cbuf = new char[255];
		fr.read(cbuf);
		
		System.out.println(new String(cbuf).trim());
		
		fr.close();
	}

	public static void test08(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		File file = new File("C:\\Users\\adoni\\test2.txt");
		FileWriter fw = new FileWriter(file);

		String s = scan.nextLine();

		fw.write(s);

		fw.close();

	}

	public static void test07(String[] args) throws IOException {
		File file = new File("C:\\Users\\adoni\\test2.txt");
		FileWriter fw = new FileWriter(file);

		// 키보드로 데이터를 입력 받아서 fw를 이용해서 data2.txt 파일에 기록하기
		String s = "Hello world! 안녕하세요.";
		fw.write(s);

		fw.close();
	}

	public static void test06(String[] args) throws IOException {
		File file = new File("C:\\Users\\adoni\\test.txt");
		FileReader fr = new FileReader(file);

		BufferedReader br = new BufferedReader(fr);

		String s = null;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
	}

	public static void test05(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\adoni\\test.txt");
		Scanner scan = new Scanner(file);

		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}

	}

	public static void test04(String[] args) throws IOException {
		// File
		File file = new File("C:\\Users\\adoni\\test.txt");
		if (file.exists()) {
			System.out.println(">>>있다");
			if (file.isDirectory()) {
				String[] fileList = file.list();
				for (String filename : fileList) {
					System.out.println(filename);
				}
			} else {
				if (file.delete()) {
					System.out.println(">>>파일이 삭제 됨");
				}
			}
		} else {
			System.out.println(">>>없다");
			if (file.createNewFile()) {
				System.out.println(">>>파일이 생성 되었습니다.");
			}
		}
	}

	public static void test03(String[] args) throws IOException {
		// 파일에서 데이터 읽어오기
		// InputStream is = System.in;
		File file = new File("C:\\Users\\adoni\\test.txt");
		FileInputStream is = new FileInputStream(file);
		int data = 0;
		while ((data = is.read()) != -1) {
			System.out.write(data);
		}
		is.close();
		System.out.println("파일 읽기 완료!");
	}

	public static void test02(String[] args) throws IOException {
		// OutputStream os = System.out;

		FileOutputStream os = new FileOutputStream("C:\\Users\\adoni\\test.txt");
		InputStream is = System.in;

		// int data = is.read(); // 아스키코드 a(97), A(65), 0(48), \n(13)
		// System.out.println(data);
		System.out.println("데이터를 입력 해 보세요. 끝내려면 (Ctrl + z) : ");
		int data = 0;
		while ((data = is.read()) != -1) { // EOF 일떄까지 (Ctrl + z)
			os.write(data);

		}
		os.close();
		System.out.println("입력 종료! ");
	}

	public static void test01(String[] args) throws IOException {
		OutputStream os = System.out; // 업캐스팅
		byte[] by = new byte[225];

		System.out.print("문자 입력 << ");
		System.in.read(by);

		String s = new String(by).trim();
		System.out.println(s);

		os.write(s.getBytes());

	}
}
