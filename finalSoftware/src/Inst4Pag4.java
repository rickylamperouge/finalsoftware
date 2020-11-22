import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JSpinner;

public class Inst4Pag4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inst4Pag4 frame = new Inst4Pag4();
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
	public Inst4Pag4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 918, 783);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel_1 = new JLabel("13. Mantiene un clima de respeto con los colegas y con los compa\u00F1eros de trabajo.");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 45, 770, 13);
		contentPane_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(108, 68, 526, 97);
		textField.getText();
		contentPane_1.add(textField);
		
		JLabel lblNewLabel_2 = new JLabel("Comentarios:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 68, 88, 13);
		contentPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Puntuacion:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(675, 68, 88, 13);
		contentPane_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("14. Mantiene un clima de respeto con los estudiantes. ");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 200, 770, 13);
		contentPane_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Comentarios:");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 223, 88, 13);
		contentPane_1.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(108, 223, 526, 97);
		textField_2.getText();
		contentPane_1.add(textField_2);
		
		JLabel lblNewLabel_6 = new JLabel("Puntuacion:");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(675, 223, 88, 13);
		contentPane_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("15. Contribuye al enriquecimiento de los recursos del Centro de Acceso a la\r\nInformaci\u00F3n.");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(10, 441, 770, 13);
		contentPane_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Comentarios:");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(10, 464, 88, 13);
		contentPane_1.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(108, 464, 526, 97);
		textField_4.getText();
		contentPane_1.add(textField_4);
		
		JLabel lblNewLabel_9 = new JLabel("Puntuacion:");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(675, 464, 88, 13);
		contentPane_1.add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.setBounds(365, 752, 113, 21);
		contentPane_1.add(btnNewButton);
		
		JLabel lblNewLabel_7_1 = new JLabel("16. Contribuye al mejoramiento y actualizaci\u00F3n de su disciplina o de la materia que\r\nense\u00F1a, a trav\u00E9s del dise\u00F1o de cursos nuevos, la preparaci\u00F3n de materiales\r\neducativos o de prontuarios, proyectos innovadores, entre otros.\r");
		lblNewLabel_7_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7_1.setBounds(10, 588, 970, 13);
		contentPane_1.add(lblNewLabel_7_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(108, 611, 526, 97);
		textField_6.getText();
		contentPane_1.add(textField_6);
		
		JLabel lblNewLabel_8_1 = new JLabel("Comentarios:");
		lblNewLabel_8_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_1.setBounds(10, 611, 88, 13);
		contentPane_1.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("Puntuacion:");
		lblNewLabel_9_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1.setBounds(675, 611, 88, 13);
		contentPane_1.add(lblNewLabel_9_1);
		
		JLabel lblIiTareasAcademicas = new JLabel("II. TAREAS ACADEMICAS");
		lblIiTareasAcademicas.setForeground(Color.BLACK);
		lblIiTareasAcademicas.setFont(new Font("Arial", Font.BOLD, 14));
		lblIiTareasAcademicas.setBounds(10, 346, 427, 31);
		contentPane_1.add(lblIiTareasAcademicas);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner.setBounds(773, 69, 30, 20);
		contentPane_1.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner_1.setBounds(773, 224, 30, 20);
		contentPane_1.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner_2.setBounds(773, 465, 30, 20);
		contentPane_1.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner_3.setBounds(773, 612, 30, 20);
		contentPane_1.add(spinner_3);
	}

}
