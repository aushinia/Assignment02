package order02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import order02.Customer02;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;

import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class order02_UI_order extends JFrame {

	//private Customer02 createCustomer(String name, int lcd, int ram, int mouse, int payment, boolean member, boolean vip) {
	//return new Customer02(name, lcd, ram, mouse, payment, member, vip);}
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Lcd_input;
	private JTextField Ram_input;
	private JTextField Mouse_input;
	private JTextField Name_input;
	private JTextField Payment_input;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					order02_UI_order frame = new order02_UI_order();
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
	public order02_UI_order() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(82, 10, 256, 47);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Order Sheet");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblNewLabel.setBounds(0, 0, 256, 48);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel RAM_UI = new JLabel("RAM 1280元 / pcs");
		RAM_UI.setHorizontalAlignment(SwingConstants.CENTER);
		RAM_UI.setBounds(10, 148, 111, 23);
		contentPane.add(RAM_UI);

		Name_input = new JTextField();
		Name_input.setText("Please enter your name");
		Name_input.setColumns(10);
		Name_input.setBounds(120, 62, 136, 33);
		contentPane.add(Name_input);
		
		Lcd_input = new JTextField();
		Lcd_input.setText("Please enter amount");
		Lcd_input.setBounds(120, 105, 136, 33);
		contentPane.add(Lcd_input);
		Lcd_input.setColumns(10);
		
		JLabel LCD_UI = new JLabel("LCD 4999元 / pcs");
		LCD_UI.setHorizontalAlignment(SwingConstants.CENTER);
		LCD_UI.setBounds(10, 110, 111, 23);
		contentPane.add(LCD_UI);
		
		Ram_input = new JTextField();
		Ram_input.setText("Please enter amount");
		Ram_input.setColumns(10);
		Ram_input.setBounds(120, 143, 136, 33);
		contentPane.add(Ram_input);
		
		JLabel MOUSE_UI = new JLabel("MOUSE 799元 / pcs");
		MOUSE_UI.setHorizontalAlignment(SwingConstants.CENTER);
		MOUSE_UI.setBounds(10, 186, 111, 23);
		contentPane.add(MOUSE_UI);
		
		Mouse_input = new JTextField();
		Mouse_input.setText("Please enter amount");
		Mouse_input.setColumns(10);
		Mouse_input.setBounds(120, 181, 136, 33);
		contentPane.add(Mouse_input);
		
		JLabel lblNewLabel_1 = new JLabel("5% off for over 20,000");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(120, 224, 216, 19);
		contentPane.add(lblNewLabel_1);
		
		JTextPane order_Info = new JTextPane();
		order_Info.setBounds(30, 317, 379, 201);
		contentPane.add(order_Info);
		
		JLabel Name_UI = new JLabel("Customer Title");
		Name_UI.setHorizontalAlignment(SwingConstants.CENTER);
		Name_UI.setBounds(10, 67, 111, 23);
		contentPane.add(Name_UI);
		
		JCheckBox Member_input = new JCheckBox("member (5% off)");
		buttonGroup.add(Member_input);
		Member_input.setBounds(279, 143, 149, 23);
		contentPane.add(Member_input);
		
		JCheckBox VIPMember_input = new JCheckBox("VIP member(15% off)");
		buttonGroup.add(VIPMember_input);
		VIPMember_input.setBounds(279, 175, 136, 23);
		contentPane.add(VIPMember_input);
		
		Payment_input = new JTextField();
		Payment_input.setText("Please enter your payment");
		Payment_input.setBounds(40, 253, 179, 21);
		contentPane.add(Payment_input);
		Payment_input.setColumns(10);
		
		JButton Reset = new JButton("Reset");
		Reset.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				Name_input.setText("");
				Lcd_input.setText("");
				Ram_input.setText("");
				Mouse_input.setText("");
				Payment_input.setText("");
				Member_input.setSelected(false);
				VIPMember_input.setSelected(false);
				order_Info.setText("");
			}
		});
		Reset.setBounds(295, 67, 103, 23);
		contentPane.add(Reset);
		
		JButton Submit = new JButton("Get Quotation");
		Submit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String rawName = Name_input.getText();
				String trimmedName = rawName.replaceAll("^\\s+|\\s+$", "");
				
			if ((trimmedName.isBlank() || trimmedName.length() == 0) || Lcd_input.getText().isEmpty()|| Ram_input.getText().isEmpty()|| Mouse_input.getText().isEmpty()|| Mouse_input.getText().isEmpty())
				{//Unknown reason that even if name is empty the program is still executable, but not other fill-in blanks, really mysterious  
				order_Info.setText("輸入錯誤!!!\t不能留白");
				}
			
				if
				(Integer.parseInt(Lcd_input.getText()) >= 0 && Integer.parseInt(Ram_input.getText()) >= 0 && Integer.parseInt(Mouse_input.getText()) >= 0)				
				{
				//Customer02 c2 = createCustomer(
					try {
				String Name  = Name_input.getText();
				int Lcd = Integer.parseInt(Lcd_input.getText().trim());
				int Ram=Integer.parseInt(Ram_input.getText().trim());
			    int Mouse=Integer.parseInt(Mouse_input.getText().trim());
			    boolean Member=Member_input.isSelected();
			    boolean VIP = VIPMember_input.isSelected();
				
			Customer02 c = new Customer02 (Name,Lcd,Ram,Mouse,0,Member,VIP);
						order_Info.setText(c.show1());
					} catch (NumberFormatException ex) {
		                order_Info.setText("請輸入有效的數字");
			//int change = Integer.parseInt(Payment_input.getText()) - Integer.parseInt(getFinal_sum());
			}
				}else
			{
			order_Info.setText("數量不可小於0，請重新輸入");
			}
			}	
					
		});
		Submit.setBounds(40, 284, 129, 23);
		contentPane.add(Submit);
		
		JButton Pay = new JButton("Pay");
		Pay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String Name  = Name_input.getText();
				int Lcd = Integer.parseInt(Lcd_input.getText());
				int Ram=Integer.parseInt(Ram_input.getText());
			    int Mouse=Integer.parseInt(Mouse_input.getText());
			    int Payment=Integer.parseInt(Payment_input.getText());
			    boolean Member=Member_input.isSelected();
			    boolean VIP = VIPMember_input.isSelected();
			        
				Customer02 c2 = new Customer02 (Name,Lcd,Ram,Mouse,Payment,Member,VIP);
			    
			if (Payment >= c2.getFinal_sum()) {
                // Sufficient payment
                c2.setpayment(Payment);
                c2.setchange(Payment - c2.getFinal_sum());
                order_Info.setText(c2.show2());
            } else {
                // Not enough money
                order_Info.setText(c2.show3());
            }
			}
		});
		Pay.setBounds(230, 284, 87, 23);
		contentPane.add(Pay);
		
		JButton Print = new JButton("Print");
		Print.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					order_Info.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Print.setBounds(295, 95, 103, 23);
		contentPane.add(Print);
		
		JButton Exit = new JButton("Exit");
		Exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			dispose(); //can also be System.exit(0); or  page1.setVisible(false);  
			}
		});
		Exit.setBounds(251, 528, 87, 23);
		contentPane.add(Exit);
		
		JButton btnNewButton = new JButton("Back to Login");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			order02_UI_login olog =new order02_UI_login();
			olog.setVisible(true);
				dispose();
			
			}
		});
		btnNewButton.setBounds(58, 528, 111, 23);
		contentPane.add(btnNewButton);
		


	
	}
}