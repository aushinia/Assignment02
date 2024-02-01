package order02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class order02_UI_login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField acc_Input;
	private JTextField pwd_Input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					order02_UI_login frame = new order02_UI_login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public order02_UI_login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("登入採購系統");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel.setBounds(116, 34, 179, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Account");
		lblNewLabel_1.setBounds(49, 113, 72, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(49, 157, 72, 15);
		contentPane.add(lblNewLabel_2);
		
		acc_Input = new JTextField();
		acc_Input.setBounds(116, 107, 220, 21);
		contentPane.add(acc_Input);
		acc_Input.setColumns(10);
		
		pwd_Input = new JTextField();
		pwd_Input.setColumns(10);
		pwd_Input.setBounds(116, 154, 220, 21);
		contentPane.add(pwd_Input);
		
		JLabel lblNewLabel_3 = new JLabel("Default Account: guest");
		lblNewLabel_3.setBounds(116, 182, 201, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Default Password: guest");
		lblNewLabel_4.setBounds(116, 203, 179, 15);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String user=acc_Input.getText();
				String pass=pwd_Input.getText();	
				
				if(user.equals("guest") && pass.equals("guest"))
				{
					order02_UI_order oUI =new order02_UI_order();
					oUI.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "登入失敗,請重新輸入");
				}
				
			}
		});
		
		btnNewButton.setBounds(104, 228, 87, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				acc_Input.setText("");
				pwd_Input.setText("");}
		});
		btnNewButton_1.setBounds(238, 228, 87, 23);
		contentPane.add(btnNewButton_1);
	}
}
