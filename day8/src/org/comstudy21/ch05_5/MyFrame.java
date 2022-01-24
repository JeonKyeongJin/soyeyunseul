package org.comstudy21.ch05_5;

import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	// Frame�� ��ӹ���  MyFrame�� Frame �̴�. (IS-A����)
	 protected MyFrame(String title, int width, int height) {
		 // �μ��Ͻ� ����
		 setTitle(title);
		 super.setVisible(true);
		 this.setSize(width, height);
		 
		 Toolkit tk = getToolkit().getDefaultToolkit();
		 int sw = (int)(tk.getScreenSize().getWidth());
		 int sh = (int)(tk.getScreenSize().getHeight());
		 setLocation(sw/2 - this.getWidth()/2, sh/2 - this.getHeight()/2);
		 
		 this.addWindowListener(new WindowAdapter() {
			 @Override
			public void windowClosing(WindowEvent e) {
				// �������� �ݱ� ��ư�� Ŭ���ϸ� �߻��Ǵ� �̺�Ʈ �ڵ鷯
				MyFrame.this.dispose(); // ���ҽ� �����ϱ�
				System.exit(0); // ���α׷� ��������
				
			}
		 });
	 }

	public static void main(String[] args) {
		Frame frame = new MyFrame("������ ���� �ǽ�", 600,400); 
		// ����� �ν��Ͻ� �ܺ�
		
		
	}

}
