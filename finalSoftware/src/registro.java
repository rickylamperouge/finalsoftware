import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itextpdf.text.Document;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class registro extends menu1 {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registro frame = new registro();
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
	public registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre del Profesor");
		lblNewLabel.setBounds(226, 64, 177, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(88, 101, 382, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblFechaFormatommddyyyy = new JLabel("Fecha formato (mm/dd/yyyy)");
		lblFechaFormatommddyyyy.setBounds(226, 161, 177, 14);
		contentPane.add(lblFechaFormatommddyyyy);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(88, 205, 382, 20);
		contentPane.add(textField_2);
		

		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
				
				
				try{
					
					String profesor = textField.getText();	
					
					String fecha = textField_2.getText();
					String profesorTEMP = null;
					String claseTEMP = null;
					String fechaTEMP = null;
					int claseBOOL = 0;
					int profesorBOOL = 0;
					int fechaBOOL = 0;
					
					
					
		            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");//Loading Driver
		            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://E://proyecto3.accdb");//Establishing Connection
		            System.out.println("Connected Successfully");
		            Statement s = connection.createStatement();
		    		ResultSet rsRCB = s.executeQuery("Select * from valenciaRC where nombre = '" + profesor + "';");
		    		
		    		ResultSet rsRCD = s.executeQuery("Select * from valenciaRC where fecha = '" + fecha + "';");
		    		while(rsRCB.next())
		    		{
		    			   profesorTEMP = rsRCB.getString("nombre");
		    			   System.out.println(profesorTEMP);
		    			   if(profesorTEMP != null && !profesorTEMP.isEmpty())
		    			   {
		    				   profesorBOOL = 3;
		    				   System.out.println("Entro");
		    			   }
		    		}
		    		
		    		
		    		
		    		while(rsRCD.next())
		    		{
		    			   fechaTEMP = rsRCD.getString("fecha");
		    			   System.out.println(fechaTEMP);
		    			   if(fechaTEMP != null && !fechaTEMP.isEmpty())
		    			   {
		    				   fechaBOOL = 3;
		    				   System.out.println("Entro");
		    			   }
		    		}
		    		
		    		System.out.println(profesorBOOL);
		    		
		    		System.out.println(fechaBOOL);
		    		if(fechaBOOL >= 1 && profesorBOOL >= 1)
		    		{
		    			System.out.println("Ya existe Valencia de ese profesor para esa fecha");
		    			textField_1.setText("Ya existe Valencia de ese profesor para esa fecha");
		    		}
		    		else
		    		{
		    			new I11().setVisible(true);
		    			dispose();
		    		}
		    			
		    			   

		    		  
		    		


		        }catch(Exception e){
		            System.out.println("Error in connection Registro");
		        }
				
				

				
			
				
				
				
				
			}
		});
		btnNewButton.setBounds(226, 247, 89, 23);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(88, 294, 382, 20);
		contentPane.add(textField_1);
	}
}
