package VAssistant;

import java.awt.EventQueue;

import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textUsername;
	private JPasswordField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setBackground(new Color(100, 149, 237));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(320, 180 , 620, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textUsername = new JTextField();
		textUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textUsername.setBounds(176, 211, 290, 34);
		contentPane.add(textUsername);
		textUsername.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","#Rdsrdsra210921");
					Statement stmt = con.createStatement();
					String sql = "Select * from registration where Username='"+textUsername.getText()+"' and Password='"+String.valueOf(textPassword.getPassword())+"'";
					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Login Successfully...");
						VAssistantGui vag = new VAssistantGui();
						vag.setVisible(true);
						dispose();
					}
					else
						JOptionPane.showMessageDialog(null, "Incorrect Username and Password...  If you are new user register yourself first or try again");
					con.close();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				RegistrationPage rp = new RegistrationPage();  //connection of registration page with login page using register button
//				rp.setVisible(true);
//				dispose();
//			}
//		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(181, 352, 130, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(255, 160, 122));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(338, 352, 128, 41);
		contentPane.add(btnNewButton_1);
		
		JLabel user = new JLabel("User");
		user.setHorizontalAlignment(SwingConstants.CENTER);
		user.setFont(new Font("Tahoma", Font.BOLD, 22));
		user.setBounds(27, 211, 130, 34);
		contentPane.add(user);
		
		JLabel pass = new JLabel("Password");
		pass.setHorizontalAlignment(SwingConstants.CENTER);
		pass.setFont(new Font("Tahoma", Font.BOLD, 22));
		pass.setBounds(47, 283, 108, 34);
		contentPane.add(pass);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Deo Singh\\Desktop\\Java Project\\userlogin2.jpg"));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(223, 101, 165, 88);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(560, 0, 60, 34);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("REGISTER");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationPage rp = new RegistrationPage();   //connection of registration page with login page on clicking button Register
				rp.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_2.setBounds(309, 429, 157, 34);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("New User ?");
		lblNewLabel_3.setForeground(new Color(25, 25, 112));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_3.setBounds(158, 429, 141, 34);
		contentPane.add(lblNewLabel_3);
		
		textPassword = new JPasswordField();
		textPassword.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textPassword.setBounds(176, 283, 290, 34);
		contentPane.add(textPassword);
		
		JLabel lblNewLabel_2 = new JLabel(".");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Rishabh Deo Singh\\Desktop\\Java Project\\login_background3.png"));
		lblNewLabel_2.setBounds(0, 0, 620, 550);
		contentPane.add(lblNewLabel_2);
		
		setUndecorated(true); //to remove the frame outline
	}
}
