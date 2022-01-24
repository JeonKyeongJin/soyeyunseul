package org.comstudy21.Ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ch08Ex01 {

	   public static String getLine()  {
		      InputStreamReader isr = new InputStreamReader(System.in);
		      BufferedReader br = new BufferedReader(isr);

		      try {
		         return br.readLine();
		      } catch (IOException e) {
		         e.printStackTrace();
		      }
		      return null;   
		   }
		   
		   public static int getNum() {
		      String s = getLine();
		      StringBuffer s2 = new StringBuffer();
		      for(int i=0; i<s.length(); i++) {
		         char ch = s.charAt(i);
		         if(ch>'0' && ch<'9') {
		            s2.append(ch);
		         }
		      }
		      return Integer.parseInt(s2.toString());
		   }
		   
		   public static void main(String[] args) {
		      System.out.print("�ּ� �Է�: ");
		      String addr = getLine();
		      System.out.print("���� �Է�: ");
		      int age = getNum();
		      
		      System.out.println("�Էµ� �ּҴ� " + addr);
		      System.out.println("�Էµ� ���̴� " + age);
		   }

		   public static void main01(String[] args) {
		      Scanner scan = new Scanner("�츮���� true ���ѹα�\n ���� false ����\n ��� ���� ���");
		      
		      while(scan.hasNext()) {
		         if(scan.hasNextBoolean())
		            System.out.println(scan.nextBoolean());
		         else scan.next();
		      }
		   }

		}