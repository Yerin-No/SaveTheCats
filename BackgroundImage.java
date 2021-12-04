import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class BackgroundImage extends JFrame{
	ImageIcon i = new ImageIcon("C:\\\\Users\\\\yerin\\\\OneDrive\\\\���� ȭ��\\\\first.JPG");
	Image im = i.getImage();
	MyPanel frm = new MyPanel();
	public BackgroundImage() {
		this.setTitle("���̵��� ���ض�");
        add(frm);
        setSize(1000,1000);
		frm.setBounds(250,450,500,150);
		frm.setLayout(new FlowLayout());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

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
	         super("���̵��� ���ض�");
	         JPanel play = new JPanel();
//	         play.setBackground(Color.blue);
	         setSize(1000,1000);
	         
	         add(play);
	         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         setVisible(true);
	      }
	   }
	
    class MyPanel extends JPanel{
            
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(im,0,0,getWidth(),getHeight(),this);
    		
        }
    }

	public static void main(String[] args) {
        new BackgroundImage();
	}
}
