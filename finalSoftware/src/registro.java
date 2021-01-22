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
import java.awt.event.ActionEvent;

public class registro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		
		JLabel lblCodigoDelCurso = new JLabel("Codigo del Curso");
		lblCodigoDelCurso.setBounds(226, 135, 177, 14);
		contentPane.add(lblCodigoDelCurso);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(88, 172, 382, 20);
		contentPane.add(textField_1);
		
		JLabel lblFechaFormatommddyyyy = new JLabel("Fecha formato (mm/dd/yyyy)");
		lblFechaFormatommddyyyy.setBounds(226, 220, 177, 14);
		contentPane.add(lblFechaFormatommddyyyy);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(88, 257, 382, 20);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				String profesor = textField.getText();	
				String clase = textField_1.getText();
				String fecha = textField_2.getText();
				
			
				
				
				
				
			}
		});
		btnNewButton.setBounds(229, 314, 89, 23);
		contentPane.add(btnNewButton);
	}
}
