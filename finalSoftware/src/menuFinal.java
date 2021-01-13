import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class menuFinal extends JFrame {
	

	private JPanel contentPane;
	private JTextField userText;
	private JTextField passwordText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuFinal frame = new menuFinal();
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
	public menuFinal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = userText.getText();
				String password = passwordText.getText();
				String usernameDB;
				String passwordDB;
				try{
		              Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");//Loading Driver
		              Connection connection = DriverManager.getConnection("jdbc:ucanaccess://E://proyecto2.accdb");//Establishing Connection
		              System.out.println("Connected Successfully");
		              Statement s = connection.createStatement();
		      		  ResultSet rs = s.executeQuery("Select username,password from login");
		      		  while(rs.next())
		      		  {
		      			  usernameDB = rs.getString("username");
		      			  passwordDB = rs.getString("password");
		      			  
		      			  if (username.equals(usernameDB) && password.equals(passwordDB))
		      			  {
		      				  System.out.println("Login Successful");
		      				  new menu1().setVisible(true);
		      				  dispose();
		      			  }
		      			  else
		      				  System.out.println("Wrong username or password");
		      		  }

		      		
		 
		          }catch(Exception e){
		              System.out.println("Error in connection");
		 
		          }
			}
		});
		btnNewButton.setBounds(166, 174, 89, 23);
		contentPane.add(btnNewButton);
		
		userText = new JTextField();
		userText.setBounds(166, 74, 190, 20);
		contentPane.add(userText);
		userText.setColumns(10);
		
		passwordText = new JTextField();
		passwordText.setBounds(166, 128, 190, 20);
		contentPane.add(passwordText);
		passwordText.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(28, 77, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(28, 131, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new registrar().setVisible(true);
				dispose();
			}
		});
		btnRegister.setBounds(267, 174, 89, 23);
		contentPane.add(btnRegister);
	}
}


