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


public class menu1 extends menuFinal {
	public static int promedio = 22;
	static int[] instrumentoI;
	static int[] instrumentoIA;
	static int[] instrumentoII;
	static int[] instrumentoIII;
	static int[] instrumentoIIIA;
	static int[] instrumentoIV;

	
	static String[] instrumentoIIItxt;
	static String[] instrumentoIIIAtxt;
	static String[] instrumentoIAtxt;
	static String[] instrumentoIVtxt;
	static double A = 0.25;
	static double B = 0.25;
	static double C = 0.25;
	static double D = 0.25;
	static int totalI = 0;
	static int totalIA = 0;
	static int totalI2 = 0;
	static int totalI3 = 0;
	static int totalI3A = 0;
	int totalI4 = 0;
	//Calidad docente a
	static double valenciaCalAI1 = 0;
	static double valenciaCalApromI1 = 0;
	static double puntuacionCalA = 0;
	static double valenciaCalAI3 = 0;
	static double valenciaCalApromI3 = 0;
	static double valenciaCalAI1A = 0;
	static double valenciaCalAI1Aprom = 0;
	//termina calidad docente a
	
	//Calidad docente b
	static double valenciaCalBI1 = 0;
	static double valenciaCalBpromI1 = 0;
	static double valenciaCalBI1A = 0;
	static double valenciaCalBI1Aprom = 0;
	static double valenciaCalBI3 = 0;
	static double valenciaCalBpromI3 = 0;
	static double puntuacionCalB = 0;
	
	//termina calidad docente b
	
	//Calidad docente c
	static double puntuacionCalC = 0;
	//termina calidad docente c
	//calidad docente d
	static double puntuacionCalD = 0;
	//termina calidad docente d
	
	//calidad docente e
	static double valenciaCalEI1 = 0;
	static double puntuacionCalE = 0;
	static double valenciaCalEpromI1 = 0;
	static double valenciaCalEI1A = 0;
	static double valenciaCalEI1Aprom = 0;
	static double valenciaCalEI3 = 0;
	static double valenciaCalEpromI3 = 0;
	//termina calidad docente e
	
	//calidad docente f
	static double valenciaCalFI1 = 0;
	static double valenciaCalFI1A = 0;
	static double valenciaCalFpromI1 = 0;
	static double valenciaCalFI1Aprom = 0;
	static double puntuacionCalF = 0;
	static double valenciaCalFI3 = 0;
	static double valenciaCalFpromI3 = 0;	
	static double valenciaCalFI4 = 0;
	static double valenciaCalFpromI4 = 0;
	
	//termina calidad docente f
	
	
	

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
				new I11().setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBounds(118, 61, 266, 21);
		contentPane.add(btnNewButton);
		
		JButton btnInstrumentoa = new JButton("Instrumento 1-A");
		btnInstrumentoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new I11A().setVisible(true);
				dispose();
			}
		});
		btnInstrumentoa.setForeground(Color.DARK_GRAY);
		btnInstrumentoa.setFont(new Font("Arial", Font.BOLD, 12));
		btnInstrumentoa.setBounds(118, 92, 266, 21);
		contentPane.add(btnInstrumentoa);
		
		JButton btnInstrumento = new JButton("Instrumento 2");
		btnInstrumento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new I22().setVisible(true);
				dispose();
			}
		});
		btnInstrumento.setForeground(Color.DARK_GRAY);
		btnInstrumento.setFont(new Font("Arial", Font.BOLD, 12));
		btnInstrumento.setBounds(118, 123, 266, 21);
		contentPane.add(btnInstrumento);
		
		JButton btnInstrumento_1 = new JButton("Instrumento 3");
		btnInstrumento_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new I33().setVisible(true);
				dispose();
			}
		});
		btnInstrumento_1.setForeground(Color.DARK_GRAY);
		btnInstrumento_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnInstrumento_1.setBounds(118, 154, 266, 21);
		contentPane.add(btnInstrumento_1);
		
		JButton btnInstrumentoa_1 = new JButton("Instrumento 3-A");
		btnInstrumentoa_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new I33A().setVisible(true);
				dispose();
				
			}
		});
		btnInstrumentoa_1.setForeground(Color.DARK_GRAY);
		btnInstrumentoa_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnInstrumentoa_1.setBounds(118, 185, 266, 21);
		contentPane.add(btnInstrumentoa_1);
		
		JButton btnInstrumento_2 = new JButton("Instrumento 4");
		btnInstrumento_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new I44().setVisible(true);
				dispose();
			}
		});
		btnInstrumento_2.setForeground(Color.DARK_GRAY);
		btnInstrumento_2.setFont(new Font("Arial", Font.BOLD, 12));
		btnInstrumento_2.setBounds(118, 216, 266, 21);
		contentPane.add(btnInstrumento_2);
		
	}
}
