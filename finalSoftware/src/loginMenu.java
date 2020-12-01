



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;





	public class loginMenu implements ActionListener {
		
		
		

		public static void main(String[] args) {
			
			
			JPanel panel = new JPanel();
			JFrame frame = new JFrame();
			frame.setSize(350,200);
			//frame.setBounds(100, 100, 932, 820);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.getContentPane().add(panel);
			
			panel.setLayout(null);
			
			JLabel userLabel = new JLabel("Username");
			userLabel.setBounds(10, 20, 80, 25);
			panel.add(userLabel);
			
			JTextField userText = new JTextField(20);
			userText.setBounds(100, 20, 165, 25);
			panel.add(userText);
			
			JLabel passwordLabel = new JLabel("Password");
			passwordLabel.setBounds(10, 50, 80, 25);
			panel.add(passwordLabel);
			
			JTextField passwordText = new JTextField(20);
			passwordText.setBounds(100, 50, 165, 25); 
			panel.add(passwordText);
			
			JButton button= new JButton("Login");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				String username = userText.getText();
				String password = passwordText.getText();
					VerifyLogin(username , password);
				}
			});
			button.setBounds(10, 80, 80, 25);
			panel.add(button);
			
			JLabel success = new JLabel("");
			success.setBounds(10,110,300,25);
			//button.addActionListener(VerifyLogin());
			panel.add(success);
			//success.setText();
			
			frame.setVisible(true);
			
			
			
			
			
			
			
		
	}




	public static boolean VerifyLogin(String username, String password) {
			boolean isAuthenticated = false;
			
			
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
						
					while(inputBuffer.hasNext()) {
						String line = inputBuffer.nextLine();
						String [] values = line.split("\t");
						
							if(values[0].equals(username)) {
								if(values[1].equals(password)) {
									isAuthenticated = true;
								}
							}
						
					}
					
					System.out.println("Login Succesful");
					
				}catch (FileNotFoundException fe) {
					
					fe.printStackTrace();
					
				}
		input.close();
		return isAuthenticated;
	   }




	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("hi");
		
	}
	
	

	}


