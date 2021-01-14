import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class registrar extends JFrame {

	private JPanel contentPane;
	private JTextField userRegi;
	private JTextField passwordRegi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrar frame = new registrar();
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
	public registrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registrar Nuevo Usuario");
		lblNewLabel.setBounds(146, 24, 131, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de Usuario");
		lblNewLabel_1.setBounds(10, 81, 112, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1_1.setBounds(10, 138, 112, 14);
		contentPane.add(lblNewLabel_1_1);
		
		userRegi = new JTextField();
		userRegi.setBounds(146, 78, 178, 20);
		contentPane.add(userRegi);
		userRegi.setColumns(10);
		
		passwordRegi = new JTextField();
		passwordRegi.setColumns(10);
		passwordRegi.setBounds(146, 135, 178, 20);
		contentPane.add(passwordRegi);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = userRegi.getText();
				String password = passwordRegi.getText();
try{
		        	
		            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");//Loading Driver
		            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://E://proyecto3.accdb");//Establishing Connection
		            System.out.println("Connected Successfully");
		            
		            PreparedStatement preparedStatement=connection.prepareStatement("insert into login(username,password) values(?,?)");
		            //Setting values for Each Parameter
		            //Linea 1
		            if(username != null && !username.isEmpty() && password != null && !password.isEmpty())
		            {
		        	preparedStatement.setString(1,username);
		            preparedStatement.setString(2,password);
		            preparedStatement.executeUpdate();
		            System.out.println("Registrado");
		            new menuFinal().setVisible(true);
					dispose();
		            }


		        }
		        catch(Exception e){
		            System.out.println("Error in connection");

		        }
				
				
				
				
			}
		});
		btnNewButton.setBounds(188, 192, 89, 23);
		contentPane.add(btnNewButton);
	}
}
