import java.awt.BorderLayout;
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
					VerifyLogin(username , password);
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
	}
	
	
	
	
	public static boolean VerifyLogin(String username, String password) {
		boolean isAuthenticated = false;
		boolean mensaje = true;
		
		
		Scanner input = new Scanner(System.in);
		//System.out.println("What is your username: ");
		//String username = input.nextLine();
		//.out.println("What is your password: ");
		//String password = input.nextLine();
	
	
		String pathway = "C:\\Users\\ricar\\git\\finalsoftware\\finalSoftware\\src\\login.txt"; 
		File file = new File(pathway);
		
			try {
				@SuppressWarnings("resource")
				Scanner inputBuffer = new Scanner(file);
					
				while(inputBuffer.hasNext() && !isAuthenticated) {
					String line = inputBuffer.nextLine();
					String [] values = line.split("\t");
					
						if(values[0].equals(username) && values[1].equals(password)) {
							isAuthenticated = true;		
							System.out.println("Login Successful");
							new menu1().setVisible(true);
							mensaje = false;
							
						}
						
							
							
						
					
				}
				//if(mensaje = true)
				//{
				//	System.out.println("Try again");
					
				//}
				
				
				
			}catch (FileNotFoundException fe) {
				
				fe.printStackTrace();
				
			}
	input.close();
	return isAuthenticated;
   }
}


