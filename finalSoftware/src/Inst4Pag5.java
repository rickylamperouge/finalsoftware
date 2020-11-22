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
import javax.swing.JSpinner;

public class Inst4Pag5 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inst4Pag5 frame = new Inst4Pag5();
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
	public Inst4Pag5() {
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
		
		JLabel lblNewLabel_1 = new JLabel("17. Est\u00E1 disponible para ense\u00F1ar cursos en diferentes modalidades de estudio (por\r\nejemplo, estudio independiente, contrato, cursos en l\u00EDnea, combinados, entre\r\notros).");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 45, 898, 13);
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
		
		JLabel lblNewLabel_4 = new JLabel("18. Trabaja con sus compa\u00F1eros en tareas de equipo cuando es necesario.");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 200, 467, 13);
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
		
		JLabel lblNewLabel_7 = new JLabel("19. Evidencia en sus cursos el uso de los resultados del \u201Cassessment\u201D de los cursos y\r\ndel programa para el mejoramiento de los logros en el aprendizaje de los\r\nestudiantes. ");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(10, 363, 898, 13);
		contentPane_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Comentarios:");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(10, 386, 88, 13);
		contentPane_1.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(108, 395, 526, 97);
		textField_4.getText();
		contentPane_1.add(textField_4);
		
		JLabel lblNewLabel_9 = new JLabel("Puntuacion:");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(675, 395, 88, 13);
		contentPane_1.add(lblNewLabel_9);
		
		JButton btnGuardarYSometer = new JButton("Guardar y Someter");
		btnGuardarYSometer.setBounds(364, 752, 173, 21);
		contentPane_1.add(btnGuardarYSometer);
		
		JLabel lblNewLabel_7_1 = new JLabel("20. Colabora con el fortalecimiento de los programas acad\u00E9micos, tales como\r\n\u201Cassessment\u201D o acreditaci\u00F3n de los programas acad\u00E9micos, revisi\u00F3n de los\r\nprontuarios, revisi\u00F3n curricular de los programas acad\u00E9micos, entre otras tareas");
		lblNewLabel_7_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7_1.setBounds(10, 527, 859, 13);
		contentPane_1.add(lblNewLabel_7_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(108, 550, 526, 97);
		textField_6.getText();
		contentPane_1.add(textField_6);
		
		JLabel lblNewLabel_8_1 = new JLabel("Comentarios:");
		lblNewLabel_8_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_1.setBounds(10, 550, 88, 13);
		contentPane_1.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("Puntuacion:");
		lblNewLabel_9_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1.setBounds(675, 550, 88, 13);
		contentPane_1.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("Promedio de la Evaluacion:");
		lblNewLabel_9_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1_1.setBounds(599, 658, 164, 13);
		contentPane_1.add(lblNewLabel_9_1_1);
		
		JLabel lblNewLabel_9_1_2 = new JLabel("Puntuacion total de la Evaluacion.");
		lblNewLabel_9_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1_2.setBounds(561, 682, 202, 13);
		contentPane_1.add(lblNewLabel_9_1_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(773, 655, 96, 19);
		textField_8.getText();
		contentPane_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(773, 679, 96, 19);
		textField_9.getText();
		contentPane_1.add(textField_9);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner.setBounds(773, 69, 30, 20);
		contentPane_1.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner_1.setBounds(773, 223, 30, 20);
		contentPane_1.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner_2.setBounds(773, 395, 30, 20);
		contentPane_1.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner_3.setBounds(773, 551, 30, 20);
		contentPane_1.add(spinner_3);
	}

}
