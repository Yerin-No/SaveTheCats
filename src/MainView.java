import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainView extends JFrame{
   JPanel frm = new JPanel();
   
   public MainView(){
      super("냥이들을 구해라");   //타이틀
      add(frm);
      setSize(1000,1000);   //창 크기설정
            
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      
      //버튼 설정
      JButton start = new JButton("게임 시작");
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
         super("게임하기");
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