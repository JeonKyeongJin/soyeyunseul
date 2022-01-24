package org.comtudy21.ch05_5;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import org.comstudy21.ch05_5.MyFrame;

public class Ch05Ex01 extends MyFrame {
   
   Button okBtn = new Button("OK");
   
   public Ch05Ex01() {
      // MyFrame의 인자있는 생성자를 명시적으로 호출한다.
      this("test",500,300);
      setLayout(new GridBagLayout());
      this.add(okBtn);
      
      okBtn.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            System.out.println("버튼 클릭 됨");
            String message = JOptionPane.showInputDialog("즐거운 자바 개발!!");
            System.out.println("message => " + message);
            JOptionPane.showMessageDialog(null, message);
         }
      });
   }

   private void add(Button okBtn2) {
	
	
}

private void setLayout(GridBagLayout gridBagLayout) {
	
	
}

public Ch05Ex01(String title, int w, int h) {
      super(title, w, h);
   }

   public static void main(String[] args) {
      new Ch05Ex01();
      
   }
}