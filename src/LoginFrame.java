import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
public class LoginFrame extends JFrame {
	JPanel frm = new JPanel();
	private JPanel contentPane;
	private JTextField UserId, UserPw;
	private JButton loginBtn, joinBtn;

	public LoginFrame(){
		super("���̵��� ���ض�");
		add(frm);
		setSize(1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�α��� ȭ��
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 100, 10, 30));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		UserId = new JTextField();
		UserId.setBounds(300, 400, 200, 50);
		contentPane.add(UserId);
		UserId.setText("���̵�");
		UserId.setSize(400,50);
		UserId.setColumns(10);
		
		UserPw = new JTextField();
		UserPw.setColumns(10);
		UserPw.setBounds(300, 450, 200, 50);
		UserPw.setSize(400,50);
		UserPw.setText("��й�ȣ");
		contentPane.add(UserPw);

		
		loginBtn = new JButton("�α���");
		loginBtn.setBounds(300, 500, 200, 29);
		contentPane.add(loginBtn);
		
		joinBtn = new JButton("ȸ������");
		joinBtn.setBounds(229, 154, 104, 29);
		contentPane.add(joinBtn);
		
		
		
		setVisible(true);



	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginFrame();
	}

}