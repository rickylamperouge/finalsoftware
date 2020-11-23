import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class I4 {

	private JFrame frame;
	private final JPanel contentPane = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final JPanel contentPane_1 = new JPanel();
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private final JPanel contentPane_1_1 = new JPanel();
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private final JPanel contentPane_1_3 = new JPanel();
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					I4 window = new I4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public I4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 932, 820);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 916, 781);
		frame.getContentPane().add(tabbedPane);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Pag. 1", null, tabbedPane_1, null);
		tabbedPane.addTab("Pag. 2", null, contentPane, null);
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JLabel lblNewLabel = new JLabel("I. RESPONSABILIDADES Y DEBERES COMO FACULTAD:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 10, 427, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1. Cumple con las horas de oficina segun establecidas.");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 88, 313, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Comentarios:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 128, 88, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Puntuacion:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(675, 126, 88, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("2. Presenta evidencia sobre las diferentes formas en la que cumple con la consejeria academica ofrecida a sus estudiantes, segun definida en el Manual de la Facultad.");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 265, 994, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Comentarios:");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 288, 88, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Puntuacion:");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(675, 289, 88, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("3. Informa al Director del Departamento sobre sus ausencias.");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(10, 425, 427, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Comentarios:");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(10, 448, 88, 13);
		contentPane.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(108, 126, 526, 97);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(108, 288, 526, 97);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(108, 448, 526, 97);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_9 = new JLabel("Puntuacion:");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(675, 448, 88, 13);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.setBounds(364, 701, 113, 21);
		contentPane.add(btnNewButton);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		
		spinner.setBounds(773, 126, 30, 20);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_1.setBounds(773, 289, 30, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_2.setBounds(773, 444, 30, 20);
		contentPane.add(spinner_2);
		tabbedPane.addTab("Pag. 3", null, contentPane_1, null);
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JLabel lblNewLabel_1_1 = new JLabel("4. Informa al Director del Departamento como repone sus ausencias.");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 45, 400, 13);
		contentPane_1.add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(108, 68, 526, 97);
		contentPane_1.add(textField_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Comentarios:");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(10, 68, 88, 13);
		contentPane_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Puntuacion:");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(675, 68, 88, 13);
		contentPane_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("5. Contribuye a las deliberaciones de las reuniones de su Departamento.");
		lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(10, 200, 467, 13);
		contentPane_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Comentarios:");
		lblNewLabel_5_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5_1.setBounds(10, 223, 88, 13);
		contentPane_1.add(lblNewLabel_5_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(108, 223, 526, 97);
		contentPane_1.add(textField_4);
		
		JLabel lblNewLabel_6_1 = new JLabel("Puntuacion:");
		lblNewLabel_6_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_1.setBounds(675, 223, 88, 13);
		contentPane_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("6. Colabora en las actividades que desarrolla el Departamento");
		lblNewLabel_7_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7_1.setBounds(10, 363, 427, 13);
		contentPane_1.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("Comentarios:");
		lblNewLabel_8_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_1.setBounds(10, 386, 88, 13);
		contentPane_1.add(lblNewLabel_8_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(108, 395, 526, 97);
		contentPane_1.add(textField_5);
		
		JLabel lblNewLabel_9_1 = new JLabel("Puntuacion:");
		lblNewLabel_9_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1.setBounds(675, 395, 88, 13);
		contentPane_1.add(lblNewLabel_9_1);
		
		JButton btnNewButton_1 = new JButton("Continuar");
		btnNewButton_1.setBounds(364, 701, 113, 21);
		contentPane_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("7. Cumple con las normas y procedimientos de la Instituci\u00F3n. Somete dentro del\r\ntiempo establecido por la Universidad y la unidad acad\u00E9mica, los siguientes\r\ndocumentos: el cotejo de listas, el informe de estudiantes que nunca han asistido,\r\nlas calificaciones finales, la remoci\u00F3n de incompletos, la notificaci\u00F3n de extramuros,\r\nlos horarios de clase, entre otros, y sigue el calendario acad\u00E9mico.");
		lblNewLabel_7_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7_1_1.setBounds(10, 527, 427, 13);
		contentPane_1.add(lblNewLabel_7_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(108, 550, 526, 97);
		contentPane_1.add(textField_6);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Comentarios:");
		lblNewLabel_8_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_1_1.setBounds(10, 550, 88, 13);
		contentPane_1.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("Puntuacion:");
		lblNewLabel_9_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1_1.setBounds(675, 550, 88, 13);
		contentPane_1.add(lblNewLabel_9_1_1);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_3.setBounds(773, 68, 30, 20);
		contentPane_1.add(spinner_3);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_1_1.setBounds(773, 223, 30, 20);
		contentPane_1.add(spinner_1_1);
		
		JSpinner spinner_2_1 = new JSpinner();
		spinner_2_1.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_2_1.setBounds(773, 395, 30, 20);
		contentPane_1.add(spinner_2_1);
		
		JSpinner spinner_3_1 = new JSpinner();
		spinner_3_1.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_3_1.setBounds(773, 550, 30, 20);
		contentPane_1.add(spinner_3_1);
		tabbedPane.addTab("Pag. 4", null, contentPane_1_1, null);
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JLabel lblNewLabel_1_2 = new JLabel("8. Atiende las indicaciones, memorandos y recomendaciones del personal gerencial\r\n(Director de Departamento, Decanos, y otros).");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 45, 770, 13);
		contentPane_1_1.add(lblNewLabel_1_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(108, 68, 526, 97);
		contentPane_1_1.add(textField_7);
		
		JLabel lblNewLabel_2_2 = new JLabel("Comentarios:");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(10, 68, 88, 13);
		contentPane_1_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Puntuacion:");
		lblNewLabel_3_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_2.setBounds(675, 68, 88, 13);
		contentPane_1_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("9. Est\u00E1 disponible para ofrecer cursos, seg\u00FAn las necesidades establecidas en el\r\nhorario de clases para la oferta acad\u00E9mica del t\u00E9rmino.");
		lblNewLabel_4_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4_2.setBounds(10, 200, 770, 13);
		contentPane_1_1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("Comentarios:");
		lblNewLabel_5_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5_2.setBounds(10, 223, 88, 13);
		contentPane_1_1.add(lblNewLabel_5_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(108, 223, 526, 97);
		contentPane_1_1.add(textField_8);
		
		JLabel lblNewLabel_6_2 = new JLabel("Puntuacion:");
		lblNewLabel_6_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_2.setBounds(675, 223, 88, 13);
		contentPane_1_1.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_7_2 = new JLabel("10. Participa en comit\u00E9s departamentales, de la unidad acad\u00E9mica, institucional o en\r\norganismos universitarios cuando as\u00ED se le solicita");
		lblNewLabel_7_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7_2.setBounds(10, 363, 770, 13);
		contentPane_1_1.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_8_2 = new JLabel("Comentarios:");
		lblNewLabel_8_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_2.setBounds(10, 386, 88, 13);
		contentPane_1_1.add(lblNewLabel_8_2);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(108, 395, 526, 97);
		contentPane_1_1.add(textField_9);
		
		JLabel lblNewLabel_9_2 = new JLabel("Puntuacion:");
		lblNewLabel_9_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_2.setBounds(675, 395, 88, 13);
		contentPane_1_1.add(lblNewLabel_9_2);
		
		JButton btnNewButton_2 = new JButton("Continuar");
		btnNewButton_2.setBounds(364, 701, 113, 21);
		contentPane_1_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_7_1_2 = new JLabel("11. Asiste a las convocatorias de facultad, tales como actividades de reconocimientos\r\nacad\u00E9micos a estudiantes, el Servicio de Graduaci\u00F3n, la Graduaci\u00F3n, entre otros.");
		lblNewLabel_7_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7_1_2.setBounds(10, 527, 970, 13);
		contentPane_1_1.add(lblNewLabel_7_1_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(108, 550, 526, 97);
		contentPane_1_1.add(textField_10);
		
		JLabel lblNewLabel_8_1_2 = new JLabel("Comentarios:");
		lblNewLabel_8_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_1_2.setBounds(10, 550, 88, 13);
		contentPane_1_1.add(lblNewLabel_8_1_2);
		
		JLabel lblNewLabel_9_1_2 = new JLabel("Puntuacion:");
		lblNewLabel_9_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1_2.setBounds(675, 550, 88, 13);
		contentPane_1_1.add(lblNewLabel_9_1_2);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_4.setBounds(773, 69, 30, 20);
		contentPane_1_1.add(spinner_4);
		
		JSpinner spinner_1_2 = new JSpinner();
		spinner_1_2.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_1_2.setBounds(773, 224, 30, 20);
		contentPane_1_1.add(spinner_1_2);
		
		JSpinner spinner_2_2 = new JSpinner();
		spinner_2_2.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_2_2.setBounds(773, 395, 30, 20);
		contentPane_1_1.add(spinner_2_2);
		
		JSpinner spinner_3_2 = new JSpinner();
		spinner_3_2.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_3_2.setBounds(773, 551, 30, 20);
		contentPane_1_1.add(spinner_3_2);
		
		JPanel contentPane_1_2 = new JPanel();
		tabbedPane.addTab("Pag. 5", null, contentPane_1_2, null);
		contentPane_1_2.setLayout(null);
		contentPane_1_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JLabel lblNewLabel_1_3 = new JLabel("13. Mantiene un clima de respeto con los colegas y con los compa\u00F1eros de trabajo.");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 45, 770, 13);
		contentPane_1_2.add(lblNewLabel_1_3);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(108, 68, 526, 97);
		contentPane_1_2.add(textField_11);
		
		JLabel lblNewLabel_2_3 = new JLabel("Comentarios:");
		lblNewLabel_2_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(10, 68, 88, 13);
		contentPane_1_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("Puntuacion:");
		lblNewLabel_3_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_3.setBounds(675, 68, 88, 13);
		contentPane_1_2.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("14. Mantiene un clima de respeto con los estudiantes. ");
		lblNewLabel_4_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4_3.setBounds(10, 200, 770, 13);
		contentPane_1_2.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_5_3 = new JLabel("Comentarios:");
		lblNewLabel_5_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5_3.setBounds(10, 223, 88, 13);
		contentPane_1_2.add(lblNewLabel_5_3);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(108, 223, 526, 97);
		contentPane_1_2.add(textField_12);
		
		JLabel lblNewLabel_6_3 = new JLabel("Puntuacion:");
		lblNewLabel_6_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_3.setBounds(675, 223, 88, 13);
		contentPane_1_2.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_7_3 = new JLabel("15. Contribuye al enriquecimiento de los recursos del Centro de Acceso a la\r\nInformaci\u00F3n.");
		lblNewLabel_7_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7_3.setBounds(10, 441, 770, 13);
		contentPane_1_2.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_8_3 = new JLabel("Comentarios:");
		lblNewLabel_8_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_3.setBounds(10, 464, 88, 13);
		contentPane_1_2.add(lblNewLabel_8_3);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(108, 464, 526, 97);
		contentPane_1_2.add(textField_13);
		
		JLabel lblNewLabel_9_3 = new JLabel("Puntuacion:");
		lblNewLabel_9_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_3.setBounds(675, 464, 88, 13);
		contentPane_1_2.add(lblNewLabel_9_3);
		
		JButton btnNewButton_3 = new JButton("Continuar");
		btnNewButton_3.setBounds(365, 752, 113, 21);
		contentPane_1_2.add(btnNewButton_3);
		
		JLabel lblNewLabel_7_1_3 = new JLabel("16. Contribuye al mejoramiento y actualizaci\u00F3n de su disciplina o de la materia que\r\nense\u00F1a, a trav\u00E9s del dise\u00F1o de cursos nuevos, la preparaci\u00F3n de materiales\r\neducativos o de prontuarios, proyectos innovadores, entre otros.\r");
		lblNewLabel_7_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7_1_3.setBounds(10, 588, 970, 13);
		contentPane_1_2.add(lblNewLabel_7_1_3);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(108, 611, 526, 97);
		contentPane_1_2.add(textField_14);
		
		JLabel lblNewLabel_8_1_3 = new JLabel("Comentarios:");
		lblNewLabel_8_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_1_3.setBounds(10, 611, 88, 13);
		contentPane_1_2.add(lblNewLabel_8_1_3);
		
		JLabel lblNewLabel_9_1_3 = new JLabel("Puntuacion:");
		lblNewLabel_9_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1_3.setBounds(675, 611, 88, 13);
		contentPane_1_2.add(lblNewLabel_9_1_3);
		
		JLabel lblIiTareasAcademicas = new JLabel("II. TAREAS ACADEMICAS");
		lblIiTareasAcademicas.setForeground(Color.BLACK);
		lblIiTareasAcademicas.setFont(new Font("Arial", Font.BOLD, 14));
		lblIiTareasAcademicas.setBounds(10, 346, 427, 31);
		contentPane_1_2.add(lblIiTareasAcademicas);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_5.setBounds(773, 69, 30, 20);
		contentPane_1_2.add(spinner_5);
		
		JSpinner spinner_1_3 = new JSpinner();
		spinner_1_3.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_1_3.setBounds(773, 224, 30, 20);
		contentPane_1_2.add(spinner_1_3);
		
		JSpinner spinner_2_3 = new JSpinner();
		spinner_2_3.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_2_3.setBounds(773, 465, 30, 20);
		contentPane_1_2.add(spinner_2_3);
		
		JSpinner spinner_3_3 = new JSpinner();
		spinner_3_3.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_3_3.setBounds(773, 612, 30, 20);
		contentPane_1_2.add(spinner_3_3);
		tabbedPane.addTab("Pag. 6", null, contentPane_1_3, null);
		contentPane_1_3.setLayout(null);
		contentPane_1_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JLabel lblNewLabel_1_4 = new JLabel("17. Est\u00E1 disponible para ense\u00F1ar cursos en diferentes modalidades de estudio (por\r\nejemplo, estudio independiente, contrato, cursos en l\u00EDnea, combinados, entre\r\notros).");
		lblNewLabel_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(10, 45, 898, 13);
		contentPane_1_3.add(lblNewLabel_1_4);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(108, 68, 526, 97);
		contentPane_1_3.add(textField_15);
		
		JLabel lblNewLabel_2_4 = new JLabel("Comentarios:");
		lblNewLabel_2_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_4.setBounds(10, 68, 88, 13);
		contentPane_1_3.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("Puntuacion:");
		lblNewLabel_3_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_4.setBounds(675, 68, 88, 13);
		contentPane_1_3.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_4_4 = new JLabel("18. Trabaja con sus compa\u00F1eros en tareas de equipo cuando es necesario.");
		lblNewLabel_4_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4_4.setBounds(10, 200, 467, 13);
		contentPane_1_3.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_5_4 = new JLabel("Comentarios:");
		lblNewLabel_5_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5_4.setBounds(10, 223, 88, 13);
		contentPane_1_3.add(lblNewLabel_5_4);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(108, 223, 526, 97);
		contentPane_1_3.add(textField_16);
		
		JLabel lblNewLabel_6_4 = new JLabel("Puntuacion:");
		lblNewLabel_6_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_4.setBounds(675, 223, 88, 13);
		contentPane_1_3.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_7_4 = new JLabel("19. Evidencia en sus cursos el uso de los resultados del \u201Cassessment\u201D de los cursos y\r\ndel programa para el mejoramiento de los logros en el aprendizaje de los\r\nestudiantes. ");
		lblNewLabel_7_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7_4.setBounds(10, 363, 898, 13);
		contentPane_1_3.add(lblNewLabel_7_4);
		
		JLabel lblNewLabel_8_4 = new JLabel("Comentarios:");
		lblNewLabel_8_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_4.setBounds(10, 386, 88, 13);
		contentPane_1_3.add(lblNewLabel_8_4);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(108, 395, 526, 97);
		contentPane_1_3.add(textField_17);
		
		JLabel lblNewLabel_9_4 = new JLabel("Puntuacion:");
		lblNewLabel_9_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_4.setBounds(675, 395, 88, 13);
		contentPane_1_3.add(lblNewLabel_9_4);
		
		JButton btnGuardarYSometer = new JButton("Guardar y Someter");
		btnGuardarYSometer.setBounds(364, 752, 173, 21);
		contentPane_1_3.add(btnGuardarYSometer);
		
		JLabel lblNewLabel_7_1_4 = new JLabel("20. Colabora con el fortalecimiento de los programas acad\u00E9micos, tales como\r\n\u201Cassessment\u201D o acreditaci\u00F3n de los programas acad\u00E9micos, revisi\u00F3n de los\r\nprontuarios, revisi\u00F3n curricular de los programas acad\u00E9micos, entre otras tareas");
		lblNewLabel_7_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7_1_4.setBounds(10, 527, 859, 13);
		contentPane_1_3.add(lblNewLabel_7_1_4);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(108, 550, 526, 97);
		contentPane_1_3.add(textField_18);
		
		JLabel lblNewLabel_8_1_4 = new JLabel("Comentarios:");
		lblNewLabel_8_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_1_4.setBounds(10, 550, 88, 13);
		contentPane_1_3.add(lblNewLabel_8_1_4);
		
		JLabel lblNewLabel_9_1_4 = new JLabel("Puntuacion:");
		lblNewLabel_9_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1_4.setBounds(675, 550, 88, 13);
		contentPane_1_3.add(lblNewLabel_9_1_4);
		
		JLabel lblNewLabel_9_1_1_1 = new JLabel("Promedio de la Evaluacion:");
		lblNewLabel_9_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1_1_1.setBounds(599, 658, 164, 13);
		contentPane_1_3.add(lblNewLabel_9_1_1_1);
		
		JLabel lblNewLabel_9_1_2_1 = new JLabel("Puntuacion total de la Evaluacion.");
		lblNewLabel_9_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1_2_1.setBounds(561, 682, 202, 13);
		contentPane_1_3.add(lblNewLabel_9_1_2_1);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(773, 655, 96, 19);
		contentPane_1_3.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(773, 679, 96, 19);
		contentPane_1_3.add(textField_20);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_6.setBounds(773, 69, 30, 20);
		contentPane_1_3.add(spinner_6);
		
		JSpinner spinner_1_4 = new JSpinner();
		spinner_1_4.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_1_4.setBounds(773, 223, 30, 20);
		contentPane_1_3.add(spinner_1_4);
		
		JSpinner spinner_2_4 = new JSpinner();
		spinner_2_4.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_2_4.setBounds(773, 395, 30, 20);
		contentPane_1_3.add(spinner_2_4);
		
		JSpinner spinner_3_4 = new JSpinner();
		spinner_3_4.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_3_4.setBounds(773, 551, 30, 20);
		contentPane_1_3.add(spinner_3_4);
	}

}
