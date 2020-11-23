import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class menu1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu1 frame = new menu1();
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
	public menu1() {
		setForeground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione una opcion:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(150, 10, 205, 41);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Instrumento 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBounds(118, 61, 266, 21);
		contentPane.add(btnNewButton);
		
		JButton btnInstrumentoa = new JButton("Instrumento 1-A");
		btnInstrumentoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInstrumentoa.setForeground(Color.DARK_GRAY);
		btnInstrumentoa.setFont(new Font("Arial", Font.BOLD, 12));
		btnInstrumentoa.setBounds(118, 92, 266, 21);
		contentPane.add(btnInstrumentoa);
		
		JButton btnInstrumento = new JButton("Instrumento 2");
		btnInstrumento.setForeground(Color.DARK_GRAY);
		btnInstrumento.setFont(new Font("Arial", Font.BOLD, 12));
		btnInstrumento.setBounds(118, 123, 266, 21);
		contentPane.add(btnInstrumento);
		
		JButton btnInstrumento_1 = new JButton("Instrumento 3");
		btnInstrumento_1.setForeground(Color.DARK_GRAY);
		btnInstrumento_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnInstrumento_1.setBounds(118, 154, 266, 21);
		contentPane.add(btnInstrumento_1);
		
		JButton btnInstrumentoa_1 = new JButton("Instrumento 3-A");
		btnInstrumentoa_1.setForeground(Color.DARK_GRAY);
		btnInstrumentoa_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnInstrumentoa_1.setBounds(118, 185, 266, 21);
		contentPane.add(btnInstrumentoa_1);
		
		JButton btnInstrumento_2 = new JButton("Instrumento 4");
		btnInstrumento_2.setForeground(Color.DARK_GRAY);
		btnInstrumento_2.setFont(new Font("Arial", Font.BOLD, 12));
		btnInstrumento_2.setBounds(118, 216, 266, 21);
		contentPane.add(btnInstrumento_2);
	}
}
