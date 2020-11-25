import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class I44 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					I44 frame = new I44();
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
	public I44() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Pagina 1", null, panel, null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		tabbedPane.addTab("Pagina 2", null, contentPane_1, null);
		
		JLabel lblNewLabel = new JLabel("I. RESPONSABILIDADES Y DEBERES COMO FACULTAD:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 10, 427, 31);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1. Cumple con las horas de oficina segun establecidas.");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 88, 313, 13);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Comentarios:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 128, 88, 13);
		contentPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Puntuacion:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(675, 126, 88, 13);
		contentPane_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Comentarios:");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 308, 88, 13);
		contentPane_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Puntuacion:");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(675, 308, 88, 13);
		contentPane_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("3. Informa al Director del Departamento sobre sus ausencias.");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(10, 483, 427, 13);
		contentPane_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Comentarios:");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(10, 507, 88, 13);
		contentPane_1.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(108, 126, 526, 97);
		contentPane_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(108, 308, 526, 97);
		contentPane_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(108, 507, 526, 97);
		contentPane_1.add(textField_2);
		
		JLabel lblNewLabel_9 = new JLabel("Puntuacion:");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(675, 507, 88, 13);
		contentPane_1.add(lblNewLabel_9);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(773, 126, 30, 20);
		contentPane_1.add(spinner);
		
		JSpinner spinner2 = new JSpinner();
		spinner2.setBounds(773, 308, 30, 20);
		contentPane_1.add(spinner2);
		
		JSpinner spinner3 = new JSpinner();
		spinner3.setBounds(773, 503, 30, 20);
		contentPane_1.add(spinner3);
		
		JTextArea txtrPresentaEvidencia = new JTextArea();
		txtrPresentaEvidencia.setText("2. Presenta evidencia sobre las diferentes formas en la que cumple con la consejer\u00EDa\r\nacad\u00E9mica ofrecida a sus estudiantes, seg\u00FAn definida en el Manual de la Facultad.\r");
		txtrPresentaEvidencia.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrPresentaEvidencia.setBounds(10, 254, 891, 43);
		contentPane_1.add(txtrPresentaEvidencia);
		
		JPanel contentPane_1_1 = new JPanel();
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		tabbedPane.addTab("Pagina 3", null, contentPane_1_1, null);
		
		JLabel lblNewLabel_1_1 = new JLabel("4. Informa al Director del Departamento como repone sus ausencias.");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 45, 400, 13);
		contentPane_1_1.add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(108, 68, 526, 97);
		contentPane_1_1.add(textField_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Comentarios:");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(10, 68, 88, 13);
		contentPane_1_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Puntuacion:");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(675, 68, 88, 13);
		contentPane_1_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("5. Contribuye a las deliberaciones de las reuniones de su Departamento.");
		lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(10, 200, 467, 13);
		contentPane_1_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Comentarios:");
		lblNewLabel_5_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5_1.setBounds(10, 223, 88, 13);
		contentPane_1_1.add(lblNewLabel_5_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(108, 223, 526, 97);
		contentPane_1_1.add(textField_4);
		
		JLabel lblNewLabel_6_1 = new JLabel("Puntuacion:");
		lblNewLabel_6_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_1.setBounds(675, 223, 88, 13);
		contentPane_1_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("6. Colabora en las actividades que desarrolla el Departamento.");
		lblNewLabel_7_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7_1.setBounds(10, 363, 427, 13);
		contentPane_1_1.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("Comentarios:");
		lblNewLabel_8_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_1.setBounds(10, 386, 88, 13);
		contentPane_1_1.add(lblNewLabel_8_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(108, 395, 526, 97);
		contentPane_1_1.add(textField_5);
		
		JLabel lblNewLabel_9_1 = new JLabel("Puntuacion:");
		lblNewLabel_9_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1.setBounds(675, 395, 88, 13);
		contentPane_1_1.add(lblNewLabel_9_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(108, 593, 526, 97);
		contentPane_1_1.add(textField_6);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Comentarios:");
		lblNewLabel_8_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_1_1.setBounds(10, 593, 88, 13);
		contentPane_1_1.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("Puntuacion:");
		lblNewLabel_9_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1_1.setBounds(675, 593, 88, 13);
		contentPane_1_1.add(lblNewLabel_9_1_1);
		
		JSpinner spinner4 = new JSpinner();
		spinner4.setBounds(773, 68, 30, 20);
		contentPane_1_1.add(spinner4);
		
		JSpinner spinner5 = new JSpinner();
		spinner5.setBounds(773, 223, 30, 20);
		contentPane_1_1.add(spinner5);
		
		JSpinner spinner6 = new JSpinner();
		spinner6.setBounds(773, 395, 30, 20);
		contentPane_1_1.add(spinner6);
		
		JSpinner spinner7 = new JSpinner();
		spinner7.setBounds(773, 593, 30, 20);
		contentPane_1_1.add(spinner7);
		
		JTextArea txtrCumpleCon = new JTextArea();
		txtrCumpleCon.setText("7. Cumple con las normas y procedimientos de la Instituci\u00F3n. Somete dentro del\r\ntiempo establecido por la Universidad y la unidad acad\u00E9mica, los siguientes\r\ndocumentos: el cotejo de listas, el informe de estudiantes que nunca han asistido,\r\nlas calificaciones finales, la remoci\u00F3n de incompletos, la notificaci\u00F3n de extramuros,\r\nlos horarios de clase, entre otros, y sigue el calendario acad\u00E9mico.");
		txtrCumpleCon.setLineWrap(true);
		txtrCumpleCon.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrCumpleCon.setBounds(10, 498, 891, 84);
		contentPane_1_1.add(txtrCumpleCon);
		
		JPanel contentPane_1_1_1 = new JPanel();
		contentPane_1_1_1.setLayout(null);
		contentPane_1_1_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		tabbedPane.addTab("Pagina 4", null, contentPane_1_1_1, null);
		
		JLabel lblNewLabel_1_2 = new JLabel("8. Atiende las indicaciones, memorandos y recomendaciones del personal gerencial\r\n(Director de Departamento, Decanos, y otros).");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 45, 770, 13);
		contentPane_1_1_1.add(lblNewLabel_1_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(108, 68, 526, 97);
		contentPane_1_1_1.add(textField_7);
		
		JLabel lblNewLabel_2_2 = new JLabel("Comentarios:");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(10, 68, 88, 13);
		contentPane_1_1_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Puntuacion:");
		lblNewLabel_3_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_2.setBounds(675, 68, 88, 13);
		contentPane_1_1_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("9. Est\u00E1 disponible para ofrecer cursos, seg\u00FAn las necesidades establecidas en el\r\nhorario de clases para la oferta acad\u00E9mica del t\u00E9rmino.");
		lblNewLabel_4_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4_2.setBounds(10, 200, 770, 13);
		contentPane_1_1_1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("Comentarios:");
		lblNewLabel_5_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5_2.setBounds(10, 223, 88, 13);
		contentPane_1_1_1.add(lblNewLabel_5_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(108, 223, 526, 97);
		contentPane_1_1_1.add(textField_8);
		
		JLabel lblNewLabel_6_2 = new JLabel("Puntuacion:");
		lblNewLabel_6_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_2.setBounds(675, 223, 88, 13);
		contentPane_1_1_1.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_7_2 = new JLabel("10. Participa en comit\u00E9s departamentales, de la unidad acad\u00E9mica, institucional o en\r\norganismos universitarios cuando as\u00ED se le solicita.");
		lblNewLabel_7_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7_2.setBounds(10, 363, 770, 13);
		contentPane_1_1_1.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_8_2 = new JLabel("Comentarios:");
		lblNewLabel_8_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_2.setBounds(10, 386, 88, 13);
		contentPane_1_1_1.add(lblNewLabel_8_2);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(108, 395, 526, 97);
		contentPane_1_1_1.add(textField_9);
		
		JLabel lblNewLabel_9_2 = new JLabel("Puntuacion:");
		lblNewLabel_9_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_2.setBounds(675, 395, 88, 13);
		contentPane_1_1_1.add(lblNewLabel_9_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(108, 578, 526, 97);
		contentPane_1_1_1.add(textField_10);
		
		JLabel lblNewLabel_8_1_2 = new JLabel("Comentarios:");
		lblNewLabel_8_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_1_2.setBounds(10, 578, 88, 13);
		contentPane_1_1_1.add(lblNewLabel_8_1_2);
		
		JLabel lblNewLabel_9_1_2 = new JLabel("Puntuacion:");
		lblNewLabel_9_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1_2.setBounds(675, 578, 88, 13);
		contentPane_1_1_1.add(lblNewLabel_9_1_2);
		
		JSpinner spinner8 = new JSpinner();
		spinner8.setBounds(773, 69, 30, 20);
		contentPane_1_1_1.add(spinner8);
		
		JSpinner spinner9 = new JSpinner();
		spinner9.setBounds(773, 224, 30, 20);
		contentPane_1_1_1.add(spinner9);
		
		JSpinner spinner10 = new JSpinner();
		spinner10.setBounds(773, 395, 30, 20);
		contentPane_1_1_1.add(spinner10);
		
		JSpinner spinner11 = new JSpinner();
		spinner11.setBounds(773, 578, 30, 20);
		contentPane_1_1_1.add(spinner11);
		
		JTextArea txtrAsisteA = new JTextArea();
		txtrAsisteA.setText("11. Asiste a las convocatorias de facultad, tales como actividades de reconocimientos\r\nacad\u00E9micos a estudiantes, el Servicio de Graduaci\u00F3n, la Graduaci\u00F3n, entre otros. ");
		txtrAsisteA.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrAsisteA.setBounds(10, 501, 891, 46);
		contentPane_1_1_1.add(txtrAsisteA);
		
		JPanel contentPane_1_2 = new JPanel();
		contentPane_1_2.setLayout(null);
		contentPane_1_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		tabbedPane.addTab("Pagina 5", null, contentPane_1_2, null);
		
		JLabel lblNewLabel_1_3 = new JLabel("13. Mantiene un clima de respeto con los colegas y con los compa\u00F1eros de trabajo.");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 157, 770, 13);
		contentPane_1_2.add(lblNewLabel_1_3);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(108, 181, 526, 97);
		contentPane_1_2.add(textField_11);
		
		JLabel lblNewLabel_2_3 = new JLabel("Comentarios:");
		lblNewLabel_2_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(10, 181, 88, 13);
		contentPane_1_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("Puntuacion:");
		lblNewLabel_3_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_3.setBounds(675, 181, 88, 13);
		contentPane_1_2.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("14. Mantiene un clima de respeto con los estudiantes. ");
		lblNewLabel_4_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4_3.setBounds(10, 289, 770, 13);
		contentPane_1_2.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_5_3 = new JLabel("Comentarios:");
		lblNewLabel_5_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5_3.setBounds(10, 313, 88, 13);
		contentPane_1_2.add(lblNewLabel_5_3);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(108, 313, 526, 97);
		contentPane_1_2.add(textField_12);
		
		JLabel lblNewLabel_6_3 = new JLabel("Puntuacion:");
		lblNewLabel_6_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_3.setBounds(675, 313, 88, 13);
		contentPane_1_2.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_7_3 = new JLabel("15. Contribuye al enriquecimiento de los recursos del Centro de Acceso a la\r\nInformaci\u00F3n.");
		lblNewLabel_7_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7_3.setBounds(10, 463, 770, 13);
		contentPane_1_2.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_8_3 = new JLabel("Comentarios:");
		lblNewLabel_8_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_3.setBounds(10, 487, 88, 13);
		contentPane_1_2.add(lblNewLabel_8_3);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(108, 487, 526, 97);
		contentPane_1_2.add(textField_13);
		
		JLabel lblNewLabel_9_3 = new JLabel("Puntuacion:");
		lblNewLabel_9_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_3.setBounds(675, 487, 88, 13);
		contentPane_1_2.add(lblNewLabel_9_3);
		
		JButton btnNewButton_3 = new JButton("Continuar");
		btnNewButton_3.setBounds(365, 752, 113, 21);
		contentPane_1_2.add(btnNewButton_3);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(108, 644, 526, 97);
		contentPane_1_2.add(textField_14);
		
		JLabel lblNewLabel_8_1_3 = new JLabel("Comentarios:");
		lblNewLabel_8_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_1_3.setBounds(10, 644, 88, 13);
		contentPane_1_2.add(lblNewLabel_8_1_3);
		
		JLabel lblNewLabel_9_1_3 = new JLabel("Puntuacion:");
		lblNewLabel_9_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1_3.setBounds(675, 644, 88, 13);
		contentPane_1_2.add(lblNewLabel_9_1_3);
		
		JLabel lblIiTareasAcademicas = new JLabel("II. TAREAS ACADEMICAS");
		lblIiTareasAcademicas.setForeground(Color.BLACK);
		lblIiTareasAcademicas.setFont(new Font("Arial", Font.BOLD, 14));
		lblIiTareasAcademicas.setBounds(10, 421, 427, 31);
		contentPane_1_2.add(lblIiTareasAcademicas);
		
		JSpinner spinner13 = new JSpinner();
		spinner13.setBounds(773, 181, 30, 20);
		contentPane_1_2.add(spinner13);
		
		JSpinner spinner14 = new JSpinner();
		spinner14.setBounds(773, 309, 30, 20);
		contentPane_1_2.add(spinner14);
		
		JSpinner spinner15 = new JSpinner();
		spinner15.setBounds(773, 483, 30, 20);
		contentPane_1_2.add(spinner15);
		
		JSpinner spinner16 = new JSpinner();
		spinner16.setBounds(773, 644, 30, 20);
		contentPane_1_2.add(spinner16);
		
		JTextArea txtrContribuyeAl = new JTextArea();
		txtrContribuyeAl.setText("16. Contribuye al mejoramiento y actualizaci\u00F3n de su disciplina o de la materia que ense\u00F1a, a trav\u00E9s del dise\u00F1o de cursos nuevos, la preparaci\u00F3n de materiales  \r\neducativos o de prontuarios, proyectos innovadores, entre otros.\r");
		txtrContribuyeAl.setLineWrap(true);
		txtrContribuyeAl.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrContribuyeAl.setBounds(10, 595, 891, 38);
		contentPane_1_2.add(txtrContribuyeAl);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(108, 55, 526, 97);
		contentPane_1_2.add(textField_15);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Comentarios:");
		lblNewLabel_2_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_3_1.setBounds(10, 55, 88, 13);
		contentPane_1_2.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Puntuacion:");
		lblNewLabel_3_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_3_1.setBounds(675, 55, 88, 13);
		contentPane_1_2.add(lblNewLabel_3_3_1);
		
		JSpinner spinner12 = new JSpinner();
		spinner12.setBounds(773, 55, 30, 20);
		contentPane_1_2.add(spinner12);
		
		JTextArea txtrAsisteA_1 = new JTextArea();
		txtrAsisteA_1.setText("12. Asiste a actividades de desarrollo profesional como congresos, seminarios, cursos\r\nde educaci\u00F3n continuada, entre otros.");
		txtrAsisteA_1.setLineWrap(true);
		txtrAsisteA_1.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrAsisteA_1.setEditable(false);
		txtrAsisteA_1.setBounds(10, 11, 891, 31);
		contentPane_1_2.add(txtrAsisteA_1);
		
		JPanel contentPane_1_3 = new JPanel();
		contentPane_1_3.setLayout(null);
		contentPane_1_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		tabbedPane.addTab("Pagina 6", null, contentPane_1_3, null);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(108, 68, 526, 97);
		contentPane_1_3.add(textField_16);
		
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
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(108, 223, 526, 97);
		contentPane_1_3.add(textField_17);
		
		JLabel lblNewLabel_6_4 = new JLabel("Puntuacion:");
		lblNewLabel_6_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_4.setBounds(675, 223, 88, 13);
		contentPane_1_3.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_8_4 = new JLabel("Comentarios:");
		lblNewLabel_8_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_4.setBounds(10, 386, 88, 13);
		contentPane_1_3.add(lblNewLabel_8_4);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(108, 395, 526, 97);
		contentPane_1_3.add(textField_18);
		
		JLabel lblNewLabel_9_4 = new JLabel("Puntuacion:");
		lblNewLabel_9_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_4.setBounds(675, 395, 88, 13);
		contentPane_1_3.add(lblNewLabel_9_4);
		
		JButton btnGuardarYSometer = new JButton("Guardar y Someter");
		btnGuardarYSometer.setBounds(364, 752, 173, 21);
		contentPane_1_3.add(btnGuardarYSometer);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(108, 550, 526, 97);
		contentPane_1_3.add(textField_19);
		
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
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(773, 655, 96, 19);
		contentPane_1_3.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(773, 679, 96, 19);
		contentPane_1_3.add(textField_21);
		
		JSpinner spinner17 = new JSpinner();
		spinner17.setBounds(773, 69, 30, 20);
		contentPane_1_3.add(spinner17);
		
		JSpinner spinner18 = new JSpinner();
		spinner18.setBounds(773, 223, 30, 20);
		contentPane_1_3.add(spinner18);
		
		JSpinner spinner19 = new JSpinner();
		spinner19.setBounds(773, 395, 30, 20);
		contentPane_1_3.add(spinner19);
		
		JSpinner spinner20 = new JSpinner();
		spinner20.setBounds(773, 551, 30, 20);
		contentPane_1_3.add(spinner20);
		
		JTextArea txtrEstDisponible = new JTextArea();
		txtrEstDisponible.setText("17. Est\u00E1 disponible para ense\u00F1ar cursos en diferentes modalidades de estudio (por\r\nejemplo, estudio independiente, contrato, cursos en l\u00EDnea, combinados, entre\r\notros).");
		txtrEstDisponible.setLineWrap(true);
		txtrEstDisponible.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrEstDisponible.setEditable(false);
		txtrEstDisponible.setBounds(10, 11, 891, 48);
		contentPane_1_3.add(txtrEstDisponible);
		
		JTextArea txtrEvidenciaEn = new JTextArea();
		txtrEvidenciaEn.setText("19. Evidencia en sus cursos el uso de los resultados del \u201Cassessment\u201D de los cursos y\r\ndel programa para el mejoramiento de los logros en el aprendizaje de los\r\nestudiantes. ");
		txtrEvidenciaEn.setLineWrap(true);
		txtrEvidenciaEn.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrEvidenciaEn.setEditable(false);
		txtrEvidenciaEn.setBounds(10, 327, 891, 48);
		contentPane_1_3.add(txtrEvidenciaEn);
		
		JTextArea txtrColaboraCon = new JTextArea();
		txtrColaboraCon.setText("20. Colabora con el fortalecimiento de los programas acad\u00E9micos, tales como\r\n\u201Cassessment\u201D o acreditaci\u00F3n de los programas acad\u00E9micos, revisi\u00F3n de los\r\nprontuarios, revisi\u00F3n curricular de los programas acad\u00E9micos, entre otras tareas");
		txtrColaboraCon.setLineWrap(true);
		txtrColaboraCon.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrColaboraCon.setEditable(false);
		txtrColaboraCon.setBounds(10, 503, 891, 42);
		contentPane_1_3.add(txtrColaboraCon);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int[] instrumentoIV;
				instrumentoIV = new int[30];
				instrumentoIV[0] = (int) spinner.getValue();
				instrumentoIV[1] = (int) spinner2.getValue();
				instrumentoIV[2] = (int) spinner3.getValue();
				instrumentoIV[3] = (int) spinner4.getValue();
				instrumentoIV[4] = (int) spinner5.getValue();
				instrumentoIV[5] = (int) spinner6.getValue();
				instrumentoIV[6] = (int) spinner7.getValue();
				instrumentoIV[7] = (int) spinner8.getValue();
				instrumentoIV[8] = (int) spinner9.getValue();
				instrumentoIV[9] = (int) spinner10.getValue();
				instrumentoIV[10] = (int) spinner11.getValue();		
				instrumentoIV[11] = (int) spinner12.getValue();
				instrumentoIV[12] = (int) spinner13.getValue();
				instrumentoIV[13] = (int) spinner14.getValue();
				instrumentoIV[14] = (int) spinner15.getValue();
				instrumentoIV[15] = (int) spinner16.getValue();
				instrumentoIV[16] = (int) spinner17.getValue();
				instrumentoIV[17] = (int) spinner18.getValue();
				instrumentoIV[18] = (int) spinner19.getValue();
				instrumentoIV[19] = (int) spinner20.getValue();
				
				int totalI4 = 0;
				for(int i = 0; i < 26;i++)
				{
					totalI4 = instrumentoIV[i] + totalI4;
				}
				System.out.println(totalI4);	
			}
		});
		btnNewButton.setBounds(364, 695, 89, 23);
		contentPane_1_3.add(btnNewButton);
		
		
		
	}

}
