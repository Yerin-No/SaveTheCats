import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainView extends JFrame{
   JPanel frm = new JPanel();
   
   public MainView(){
      super("���̵��� ���ض�");   //Ÿ��Ʋ
      add(frm);
      setSize(1000,1000);   //â ũ�⼳��
            
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      
      //��ư ����
      JButton start = new JButton("���� ����");
      start.setBounds(250,450,500,50);
      frm.add(start);
      
      start.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new Part1();
            setVisible(false);
         }
      });
      
   }
   
   public class Part1 extends JFrame{
      Part1(){
         super("�����ϱ�");
         JPanel play = new JPanel();
//         play.setBackground(Color.blue);
         setSize(1000,1000);
         
         add(play);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
      }
   }
   public static void main(String[] args) {
//	   BackgroundImage bgi = new bgi();
//	   bgi.BackgroundImage();
      new MainView();

   }
}