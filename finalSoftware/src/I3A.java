import java.awt.EventQueue;

import javax.swing.text.*;
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
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class I3A {

	private JFrame frame;
	private final JPanel contentPane = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final JPanel contentPane_1 = new JPanel();
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private final JPanel contentPane_1_1 = new JPanel();
	private JTextField textField_10;
	private JTextField textField_11;
	private final JPanel contentPane_1_3 = new JPanel();
	private JTextField textField_15;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
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
					I3A window = new I3A();
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
	public I3A() {
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
		
		JLabel lblNewLabel = new JLabel("CRITERIO I.  DOMINIO DE LA DISCIPLINA Y SU RELACI\u00D3N CON OTRAS ESFERAS DEL\r\n CONOCIMIENTO\r");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 10, 857, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Comentarios:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 159, 88, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Puntuacion:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(664, 159, 88, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Comentarios:");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 401, 88, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Puntuacion:");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(664, 401, 88, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("Comentarios:");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(10, 629, 88, 13);
		contentPane.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(108, 159, 526, 97);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(108, 401, 526, 97);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(108, 629, 526, 97);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_9 = new JLabel("Puntuacion:");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(664, 633, 88, 13);
		contentPane.add(lblNewLabel_9);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		
		spinner.setBounds(772, 155, 30, 20);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_1.setBounds(772, 397, 30, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_2.setBounds(762, 629, 30, 20);
		contentPane.add(spinner_2);
		
		JTextArea txtrMedianteLaInteraccin = new JTextArea();
		txtrMedianteLaInteraccin.setEditable(false);
		txtrMedianteLaInteraccin.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrMedianteLaInteraccin.setText("1. Mediante la interacci\u00F3n con los estudiantes, el profesor demostr\u00F3 conocimiento suficiente\r\ndel tema evaluado.\r\n\r\nNota: El profesor puede mostrar evidencia de su conocimiento del tema evaluado y de\r\nla asignatura a trav\u00E9s de sus explicaciones en correos electr\u00F3nicos, orientaciones y\r\naclaraciones en foros de debates, comentarios en trabajos corregidos, comentarios y\r\nan\u00E1lisis de trabajos de asignaciones, trabajos o ejercicios de evaluaci\u00F3n, entre otros.");
		txtrMedianteLaInteraccin.setLineWrap(true);
		txtrMedianteLaInteraccin.setBounds(20, 41, 847, 107);
		contentPane.add(txtrMedianteLaInteraccin);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(20, 509, 847, 107);
		contentPane.add(scrollPane_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane_2);
		
		JTextArea txtrElProfesor = new JTextArea();
		txtrElProfesor.setEditable(false);
		txtrElProfesor.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrElProfesor.setText("3. El profesor resalt\u00F3 la utilidad del tema para otros cursos o \u00E1reas del conocimiento.\r\n\r\nNota: Se trata de la aplicaci\u00F3n \u00FAtil de los conocimientos adquiridos para otros temas o\r\n\u00E1reas de conocimiento. El profesor puede evidenciar esto mediante el contenido\r\ntem\u00E1tico, mensajes, foros de discusi\u00F3n, entre otros.\r");
		scrollPane_2.setViewportView(txtrElProfesor);
		
		JTextArea txtrMedianteLa = new JTextArea();
		txtrMedianteLa.setEditable(false);
		txtrMedianteLa.setBounds(20, 260, 847, 130);
		contentPane.add(txtrMedianteLa);
		txtrMedianteLa.setText("2. Mediante la interacci\u00F3n con los estudiantes, el profesor integr\u00F3 conceptos o experiencias\r\nde otras disciplinas para enriquecer el tema evaluado.\r\n\r\nNota: Se trata de mostrar la transversalidad del conocimiento, relacionando el tema con\r\notras \u00E1reas del conocimiento con ocasi\u00F3n de las interacciones con los estudiantes. El\r\nprofesor propuso, si a su juicio aplica al tema evaluado, para su an\u00E1lisis o consideraci\u00F3n:\r\nnoticias, acontecimientos, problemas o experiencias reales o simuladas relacionadas\r\ncon el tema evaluado. Esto puede tener lugar en el foro, en mensajes, actividades,\r\nasignaciones, enlaces a documentos, entre otros.\r");
		txtrMedianteLa.setLineWrap(true);
		txtrMedianteLa.setFont(new Font("Arial", Font.PLAIN, 12));
		tabbedPane.addTab("Pag. 3", null, contentPane_1, null);
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(108, 119, 526, 97);
		contentPane_1.add(textField_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Comentarios:");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(10, 119, 88, 13);
		contentPane_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Puntuacion:");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(675, 119, 88, 13);
		contentPane_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Comentarios:");
		lblNewLabel_5_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5_1.setBounds(10, 378, 88, 13);
		contentPane_1.add(lblNewLabel_5_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(108, 378, 526, 97);
		contentPane_1.add(textField_4);
		
		JLabel lblNewLabel_6_1 = new JLabel("Puntuacion:");
		lblNewLabel_6_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_1.setBounds(675, 378, 88, 13);
		contentPane_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("Comentarios:");
		lblNewLabel_8_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_1.setBounds(10, 594, 88, 13);
		contentPane_1.add(lblNewLabel_8_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(108, 594, 526, 97);
		contentPane_1.add(textField_5);
		
		JLabel lblNewLabel_9_1 = new JLabel("Puntuacion:");
		lblNewLabel_9_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1.setBounds(675, 594, 88, 13);
		contentPane_1.add(lblNewLabel_9_1);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_3.setBounds(773, 119, 30, 20);
		contentPane_1.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_4.setBounds(773, 378, 30, 20);
		contentPane_1.add(spinner_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_5.setBounds(773, 590, 30, 20);
		contentPane_1.add(spinner_5);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(28, 11, 816, 97);
		contentPane_1.add(scrollPane_3);
		
		JTextArea txtrElProfesor_1 = new JTextArea();
		txtrElProfesor_1.setEditable(false);
		txtrElProfesor_1.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrElProfesor_1.setText("4. El profesor facilit\u00F3 que los estudiantes relacionen el tema con sus experiencias\r\npersonales o el mundo del trabajo.\r\n\r\nNota: Siempre que aplique, el profesor promueve que los estudiantes aporten sus\r\nexperiencias, analicen situaciones reales o simuladas y las compartan con las ideas\r\ndesarrolladas y adquiridas en el aprendizaje.\r");
		txtrElProfesor_1.setLineWrap(true);
		scrollPane_3.setViewportView(txtrElProfesor_1);
		
		JTextArea txtrElProfesor_2 = new JTextArea();
		txtrElProfesor_2.setEditable(false);
		txtrElProfesor_2.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrElProfesor_2.setText("5. El profesor ejerci\u00F3 la docencia como un gu\u00EDa o facilitador de los estudiantes, mediante la\r\ncomunicaci\u00F3n e interacci\u00F3n con los mismos, as\u00ED como en las diversas actividades\r\ndocentes.\r\n\r\nNota: El profesor puede evidenciar esta funci\u00F3n mediante las diversas actividades\r\ndocentes y la frecuencia de sus interacciones en foros, mensajes, entre otros.\r");
		txtrElProfesor_2.setLineWrap(true);
		txtrElProfesor_2.setBounds(28, 270, 816, 97);
		contentPane_1.add(txtrElProfesor_2);
		
		JTextArea txtrEnSu = new JTextArea();
		txtrEnSu.setEditable(false);
		txtrEnSu.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrEnSu.setText("6. En su interacci\u00F3n con los estudiantes, el profesor utiliz\u00F3 un lenguaje que corresponde\r\ncon el nivel de los estudiantes en el curso.\r\n\r\nNota: Es un lenguaje \u00FAtil, propio de la disciplina y eficaz para comprender los conceptos.");
		txtrEnSu.setLineWrap(true);
		txtrEnSu.setBounds(28, 486, 816, 97);
		contentPane_1.add(txtrEnSu);
		
		JLabel lblCriterioIiGestin = new JLabel("CRITERIO II.  GESTI\u00D3N DE LA DOCENCIA\r");
		lblCriterioIiGestin.setForeground(Color.BLACK);
		lblCriterioIiGestin.setFont(new Font("Arial", Font.BOLD, 14));
		lblCriterioIiGestin.setBounds(10, 228, 857, 31);
		contentPane_1.add(lblCriterioIiGestin);
		tabbedPane.addTab("Pag. 4", null, contentPane_1_1, null);
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JLabel lblNewLabel_2_2 = new JLabel("Comentarios:");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(10, 119, 88, 13);
		contentPane_1_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Puntuacion:");
		lblNewLabel_3_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_2.setBounds(675, 123, 88, 13);
		contentPane_1_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("Puntuacion:");
		lblNewLabel_6_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_2.setBounds(675, 338, 88, 13);
		contentPane_1_1.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_8_2 = new JLabel("Comentarios:");
		lblNewLabel_8_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_2.setBounds(10, 338, 88, 13);
		contentPane_1_1.add(lblNewLabel_8_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(108, 119, 526, 97);
		contentPane_1_1.add(textField_10);
		
		JLabel lblNewLabel_8_1_2 = new JLabel("Comentarios:");
		lblNewLabel_8_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_1_2.setBounds(10, 550, 88, 13);
		contentPane_1_1.add(lblNewLabel_8_1_2);
		
		JLabel lblNewLabel_9_1_2 = new JLabel("Puntuacion:");
		lblNewLabel_9_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1_2.setBounds(675, 550, 88, 13);
		contentPane_1_1.add(lblNewLabel_9_1_2);
		
		JSpinner spinner_11 = new JSpinner();
		spinner_11.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_11.setBounds(767, 119, 30, 20);
		contentPane_1_1.add(spinner_11);
		
		JSpinner spinner_12 = new JSpinner();
		spinner_12.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_12.setBounds(767, 334, 30, 20);
		contentPane_1_1.add(spinner_12);
		
		JSpinner spinner_14 = new JSpinner();
		spinner_14.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_14.setBounds(773, 546, 30, 20);
		contentPane_1_1.add(spinner_14);
		
		JTextArea txtrElProfesor_3 = new JTextArea();
		txtrElProfesor_3.setEditable(false);
		txtrElProfesor_3.setText("7. El profesor promovi\u00F3 la comunicaci\u00F3n e interacci\u00F3n estudiante-estudiante.\r\n\r\nNota: Este criterio se pone de manifiesto porque el profesor puede:\r\n\u2022 Organizar actividades de comunicaci\u00F3n\r\n\u2022 Solicitar la participaci\u00F3n de los estudiantes inactivos\r\n\u2022 Animar los foros, debates y actividades similares\r\n\u2022 Provocar reacciones e interacciones de los estudiantes, entre otras.");
		txtrElProfesor_3.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrElProfesor_3.setLineWrap(true);
		txtrElProfesor_3.setBounds(27, 11, 770, 97);
		contentPane_1_1.add(txtrElProfesor_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 230, 770, 97);
		contentPane_1_1.add(scrollPane);
		
		JTextArea txtrElProfesor_3_1 = new JTextArea();
		txtrElProfesor_3_1.setEditable(false);
		txtrElProfesor_3_1.setText("8. El profesor foment\u00F3 la comunicaci\u00F3n e interacci\u00F3n estudiante-profesor.\r\n\r\nNota: Este criterio se pone de manifiesto porque el profesor podr\u00EDa:\r\n\u2022 Organizar actividades de comunicaci\u00F3n\r\n\u2022 Solicitar la participaci\u00F3n de los estudiantes inactivos\r\n\u2022 Animar los foros, debates y actividades similares\r\n\u2022 Propiciar y facilitar las comunicaciones de los estudiantes con el profesor\r\n\u2022 Provocar reacciones e interacciones con los estudiantes.\r");
		scrollPane.setViewportView(txtrElProfesor_3_1);
		txtrElProfesor_3_1.setLineWrap(true);
		txtrElProfesor_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(108, 338, 526, 97);
		contentPane_1_1.add(textField_6);
		
		JTextArea txtrElProfesor_3_2 = new JTextArea();
		txtrElProfesor_3_2.setEditable(false);
		txtrElProfesor_3_2.setText("9. El profesor planific\u00F3 la distribuci\u00F3n del tiempo de forma tal que los estudiantes pueden\r\ncumplir con los objetivos establecidos.\r\n\r\nNota: El profesor utiliza el calendario, o facilita a los estudiantes un plan de trabajo de\r\nacuerdo con el contenido tem\u00E1tico del curso.\r");
		txtrElProfesor_3_2.setLineWrap(true);
		txtrElProfesor_3_2.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrElProfesor_3_2.setBounds(27, 442, 770, 97);
		contentPane_1_1.add(txtrElProfesor_3_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(108, 546, 526, 97);
		contentPane_1_1.add(textField_7);
		
		JPanel contentPane_1_2 = new JPanel();
		tabbedPane.addTab("Pag. 5", null, contentPane_1_2, null);
		contentPane_1_2.setLayout(null);
		contentPane_1_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(104, 118, 526, 97);
		contentPane_1_2.add(textField_11);
		
		JLabel lblNewLabel_2_3 = new JLabel("Comentarios:");
		lblNewLabel_2_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(10, 118, 88, 13);
		contentPane_1_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("Puntuacion:");
		lblNewLabel_3_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_3.setBounds(675, 118, 88, 13);
		contentPane_1_2.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_9_3 = new JLabel("Puntuacion:");
		lblNewLabel_9_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_3.setBounds(675, 334, 88, 13);
		contentPane_1_2.add(lblNewLabel_9_3);
		
		JButton btnNewButton_3 = new JButton("Continuar");
		btnNewButton_3.setBounds(365, 752, 113, 21);
		contentPane_1_2.add(btnNewButton_3);
		
		JSpinner spinner_15 = new JSpinner();
		spinner_15.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_15.setBounds(773, 114, 30, 20);
		contentPane_1_2.add(spinner_15);
		
		JSpinner spinner_16 = new JSpinner();
		spinner_16.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_16.setBounds(773, 334, 30, 20);
		contentPane_1_2.add(spinner_16);
		
		JTextArea txtrElProfesor_3_3 = new JTextArea();
		txtrElProfesor_3_3.setEditable(false);
		txtrElProfesor_3_3.setText("10. El profesor inform\u00F3 a los estudiantes del tiempo estimado para responder a los mensajes, para informar sobre los resultados de los ex\u00E1menes, asignaciones y otros trabajos\r\ncorregidos; aunque el dise\u00F1o del curso pueda incluir algo sobre esto.\r\n\r\nNota: El profesor utiliza anuncios, el correo electr\u00F3nico y el prontuario para establecer\r\nlas fechas y cumplir con los plazos establecidos.");
		txtrElProfesor_3_3.setLineWrap(true);
		txtrElProfesor_3_3.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrElProfesor_3_3.setBounds(25, 11, 770, 97);
		contentPane_1_2.add(txtrElProfesor_3_3);
		
		JTextArea txtrElProfesor_3_3_1 = new JTextArea();
		txtrElProfesor_3_3_1.setEditable(false);
		txtrElProfesor_3_3_1.setText("11. El profesor inform\u00F3 a los estudiantes de los resultados de las actividades realizadas por\r\naquellos no m\u00E1s tarde de dos semanas de haber sido entregados durante el semestre o\r\nsu equivalente en los diversos t\u00E9rminos acad\u00E9micos. (Art\u00EDculo II del Reglamento General\r\nde Estudiantes).\r\n\r\nNota: El profesor puede mostrar que utiliza anuncios, el correo electr\u00F3nico o el registro\r\nde notas para establecer las fechas y cumplir con los plazos establecidos.\r");
		txtrElProfesor_3_3_1.setLineWrap(true);
		txtrElProfesor_3_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrElProfesor_3_3_1.setBounds(25, 226, 770, 97);
		contentPane_1_2.add(txtrElProfesor_3_3_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(104, 334, 526, 97);
		contentPane_1_2.add(textField_8);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Comentarios:");
		lblNewLabel_2_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_3_1.setBounds(10, 334, 88, 13);
		contentPane_1_2.add(lblNewLabel_2_3_1);
		
		JTextArea txtrElProfesor_3_3_1_1 = new JTextArea();
		txtrElProfesor_3_3_1_1.setEditable(false);
		txtrElProfesor_3_3_1_1.setText("12. El profesor respondi\u00F3 en el tiempo establecido, los mensajes, las preguntas y las\r\nconsultas de los estudiantes, que se recibieron mediante el correo electr\u00F3nico.\r\n\r\nNota: Con relaci\u00F3n a los plazos establecidos, el tiempo de respuesta no debe superar\r\ndos d\u00EDas laborables.");
		txtrElProfesor_3_3_1_1.setLineWrap(true);
		txtrElProfesor_3_3_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrElProfesor_3_3_1_1.setBounds(25, 442, 770, 97);
		contentPane_1_2.add(txtrElProfesor_3_3_1_1);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("Comentarios:");
		lblNewLabel_2_3_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_3_1_1.setBounds(10, 550, 88, 13);
		contentPane_1_2.add(lblNewLabel_2_3_1_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(104, 550, 526, 97);
		contentPane_1_2.add(textField_9);
		
		JLabel lblNewLabel_9_3_1 = new JLabel("Puntuacion:");
		lblNewLabel_9_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_3_1.setBounds(675, 550, 88, 13);
		contentPane_1_2.add(lblNewLabel_9_3_1);
		
		JSpinner spinner_16_1 = new JSpinner();
		spinner_16_1.setBounds(765, 550, 30, 20);
		contentPane_1_2.add(spinner_16_1);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Pag. 6", null, panel, null);
		panel.setLayout(null);
		
		JTextArea txtrElProfesor_3_3_2 = new JTextArea();
		txtrElProfesor_3_3_2.setEditable(false);
		txtrElProfesor_3_3_2.setText("13. El profesor utiliz\u00F3 las herramientas disponibles en la plataforma y present\u00F3 el contenido\r\ndel curso en forma organizada y coherente.\r\n\r\nNota: Este criterio se evaluar\u00E1 independientemente del dise\u00F1o del curso. El profesor\r\ntiene libertad acad\u00E9mica (Art\u00EDculo 4.1 de la Parte IV del Manual de la Facultad) para\r\nreorganizar el curso de acuerdo a su experiencia y para el beneficio del estudiante.");
		txtrElProfesor_3_3_2.setLineWrap(true);
		txtrElProfesor_3_3_2.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrElProfesor_3_3_2.setBounds(56, 11, 770, 97);
		panel.add(txtrElProfesor_3_3_2);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Comentarios:");
		lblNewLabel_2_3_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_3_2.setBounds(10, 119, 88, 13);
		panel.add(lblNewLabel_2_3_2);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(108, 119, 526, 97);
		panel.add(textField_12);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Puntuacion:");
		lblNewLabel_3_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_3_1.setBounds(659, 119, 88, 13);
		panel.add(lblNewLabel_3_3_1);
		
		JSpinner spinner_15_1 = new JSpinner();
		spinner_15_1.setBounds(757, 119, 30, 20);
		panel.add(spinner_15_1);
		
		JLabel lblNewLabel_2_3_2_1 = new JLabel("Comentarios:");
		lblNewLabel_2_3_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_3_2_1.setBounds(10, 335, 88, 13);
		panel.add(lblNewLabel_2_3_2_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(108, 335, 526, 97);
		panel.add(textField_13);
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("Puntuacion:");
		lblNewLabel_3_3_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_3_1_1.setBounds(659, 335, 88, 13);
		panel.add(lblNewLabel_3_3_1_1);
		
		JSpinner spinner_15_1_1 = new JSpinner();
		spinner_15_1_1.setBounds(757, 335, 30, 20);
		panel.add(spinner_15_1_1);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(56, 227, 770, 97);
		panel.add(scrollPane_4);
		
		JTextArea txtrElProfesor_3_3_2_1 = new JTextArea();
		txtrElProfesor_3_3_2_1.setEditable(false);
		scrollPane_4.setViewportView(txtrElProfesor_3_3_2_1);
		txtrElProfesor_3_3_2_1.setText("14. El profesor mantuvo un clima de confianza y respeto\r\n\r\nNota: En sus comunicaciones con los alumnos el profesor siempre es respetuoso,\r\namable y facilita las tareas de aprendizaje de los estudiantes. El profesor puede\r\nevidenciar esto con mensajes de correo electr\u00F3nico, mensajes en foros, debates,\r\ncorrecciones de trabajos, evaluaciones; en general, en todas sus comunicaciones con\r\nlos estudiantes. En caso de haber surgido situaciones de conflicto real o aparente, el\r\nprofesor pudo resolverlas en un clima de confianza, prudencia, serenidad y respeto.");
		txtrElProfesor_3_3_2_1.setLineWrap(true);
		txtrElProfesor_3_3_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel lblCriterioIiiPromocin = new JLabel("CRITERIO III. PROMOCI\u00D3N DEL INTER\u00C9S DEL ESTUDIANTE POR LA ASIGNATURA\r");
		lblCriterioIiiPromocin.setForeground(Color.BLACK);
		lblCriterioIiiPromocin.setFont(new Font("Arial", Font.BOLD, 14));
		lblCriterioIiiPromocin.setBounds(10, 443, 857, 31);
		panel.add(lblCriterioIiiPromocin);
		
		JTextArea txtrElProfesor_3_3_2_2 = new JTextArea();
		txtrElProfesor_3_3_2_2.setEditable(false);
		txtrElProfesor_3_3_2_2.setText("15. El profesor facilit\u00F3 la discusi\u00F3n para complementar, aclarar o enriquecer el tema.\r\n\r\nNota: El profesor promueve actividades de interacci\u00F3n sobre asuntos, experiencias o\r\nacontecimientos que ayuden al estudiante a interesarse por el tema.\r");
		txtrElProfesor_3_3_2_2.setLineWrap(true);
		txtrElProfesor_3_3_2_2.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrElProfesor_3_3_2_2.setBounds(56, 485, 770, 97);
		panel.add(txtrElProfesor_3_3_2_2);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(108, 593, 526, 97);
		panel.add(textField_14);
		
		JLabel lblNewLabel_2_3_2_1_1 = new JLabel("Comentarios:");
		lblNewLabel_2_3_2_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_3_2_1_1.setBounds(10, 593, 88, 13);
		panel.add(lblNewLabel_2_3_2_1_1);
		
		JLabel lblNewLabel_3_3_1_1_1 = new JLabel("Puntuacion:");
		lblNewLabel_3_3_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_3_1_1_1.setBounds(659, 593, 88, 13);
		panel.add(lblNewLabel_3_3_1_1_1);
		
		JSpinner spinner_15_1_1_1 = new JSpinner();
		spinner_15_1_1_1.setBounds(757, 593, 30, 20);
		panel.add(spinner_15_1_1_1);
		tabbedPane.addTab("Pag. 7", null, contentPane_1_3, null);
		contentPane_1_3.setLayout(null);
		contentPane_1_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(108, 119, 526, 97);
		contentPane_1_3.add(textField_15);
		
		JLabel lblNewLabel_2_4 = new JLabel("Comentarios:");
		lblNewLabel_2_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_4.setBounds(10, 119, 88, 13);
		contentPane_1_3.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("Puntuacion:");
		lblNewLabel_3_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_4.setBounds(675, 119, 88, 13);
		contentPane_1_3.add(lblNewLabel_3_4);
		
		JButton btnGuardarYSometer = new JButton("Guardar y Someter");
		btnGuardarYSometer.setBounds(364, 752, 173, 21);
		contentPane_1_3.add(btnGuardarYSometer);
		
		JSpinner spinner_19 = new JSpinner();
		spinner_19.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_19.setBounds(773, 119, 30, 20);
		contentPane_1_3.add(spinner_19);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(37, 11, 770, 97);
		contentPane_1_3.add(scrollPane_5);
		
		JTextArea txtrElProfesor_3_3_2_3 = new JTextArea();
		txtrElProfesor_3_3_2_3.setEditable(false);
		scrollPane_5.setViewportView(txtrElProfesor_3_3_2_3);
		txtrElProfesor_3_3_2_3.setText("16. El profesor promovi\u00F3 la b\u00FAsqueda de informaci\u00F3n o experiencias para enriquecer el\r\nconocimiento.\r\n\r\nNota: El profesor organiza foros, trabajos en equipo y otras actividades orientadas a la\r\nb\u00FAsqueda e investigaci\u00F3n de informaci\u00F3n por parte de los estudiantes en internet, Centro\r\nde Acceso a la Informaci\u00F3n (CAI) y cualquier otro recurso. Los estudiantes pueden\r\ndebatir sobre estas informaciones para fortalecer y aumentar sus conocimientos\r\nindividuales.\r");
		txtrElProfesor_3_3_2_3.setLineWrap(true);
		txtrElProfesor_3_3_2_3.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JTextArea txtrElProfesor_3_3_2_4 = new JTextArea();
		txtrElProfesor_3_3_2_4.setEditable(false);
		txtrElProfesor_3_3_2_4.setText("17. El profesor foment\u00F3 el pensamiento cr\u00EDtico.\r\n\r\nNota: El profesor utiliza las herramientas interactivas disponibles en la plataforma para\r\nfomentar el pensamiento cr\u00EDtico de los estudiantes.\r");
		txtrElProfesor_3_3_2_4.setLineWrap(true);
		txtrElProfesor_3_3_2_4.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrElProfesor_3_3_2_4.setBounds(37, 227, 770, 97);
		contentPane_1_3.add(txtrElProfesor_3_3_2_4);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Comentarios:");
		lblNewLabel_2_4_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_4_1.setBounds(10, 335, 88, 13);
		contentPane_1_3.add(lblNewLabel_2_4_1);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(108, 335, 526, 97);
		contentPane_1_3.add(textField_16);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Puntuacion:");
		lblNewLabel_3_4_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_4_1.setBounds(675, 335, 88, 13);
		contentPane_1_3.add(lblNewLabel_3_4_1);
		
		JSpinner spinner_19_1 = new JSpinner();
		spinner_19_1.setBounds(773, 335, 30, 20);
		contentPane_1_3.add(spinner_19_1);
		
		JLabel lblCriterioIvDesarrollo = new JLabel("CRITERIO IV. DESARROLLO Y USO DE M\u00C9TODOS Y ESTRATEGIAS DE ENSE\u00D1ANZA\r");
		lblCriterioIvDesarrollo.setForeground(Color.BLACK);
		lblCriterioIvDesarrollo.setFont(new Font("Arial", Font.BOLD, 14));
		lblCriterioIvDesarrollo.setBounds(10, 443, 857, 31);
		contentPane_1_3.add(lblCriterioIvDesarrollo);
		
		JTextArea txtrElProfesor_3_3_2_4_1 = new JTextArea();
		txtrElProfesor_3_3_2_4_1.setEditable(false);
		txtrElProfesor_3_3_2_4_1.setText("18. El profesor aport\u00F3 recursos de apoyo adicionales para enriquecer el tema evaluado.\r\n\r\nNota: Aparte de los materiales did\u00E1cticos recogidos en el dise\u00F1o del curso, el profesor\r\naporta alg\u00FAn recurso adicional para enriquecer el contenido de la unidad (art\u00EDculos,\r\nhiperv\u00EDnculos, v\u00EDdeos, gr\u00E1ficos, entre otros).");
		txtrElProfesor_3_3_2_4_1.setLineWrap(true);
		txtrElProfesor_3_3_2_4_1.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrElProfesor_3_3_2_4_1.setBounds(37, 485, 770, 97);
		contentPane_1_3.add(txtrElProfesor_3_3_2_4_1);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(108, 593, 526, 97);
		contentPane_1_3.add(textField_17);
		
		JLabel lblNewLabel_2_4_1_1 = new JLabel("Comentarios:");
		lblNewLabel_2_4_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_4_1_1.setBounds(10, 593, 88, 13);
		contentPane_1_3.add(lblNewLabel_2_4_1_1);
		
		JLabel lblNewLabel_3_4_1_1 = new JLabel("Puntuacion:");
		lblNewLabel_3_4_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_4_1_1.setBounds(675, 593, 88, 13);
		contentPane_1_3.add(lblNewLabel_3_4_1_1);
		
		JSpinner spinner_19_1_1 = new JSpinner();
		spinner_19_1_1.setBounds(773, 593, 30, 20);
		contentPane_1_3.add(spinner_19_1_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Pag. 8", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTextArea txtrElProfesor_3_3_2_4_1_1 = new JTextArea();
		txtrElProfesor_3_3_2_4_1_1.setText("19. El profesor utiliz\u00F3 diferentes recursos de ense\u00F1anza para facilitar el aprendizaje. Por\r\nejemplo: trabajo colaborativo, v\u00EDdeos, presentaciones, seminarios y conferencias a\r\ntrav\u00E9s de la web, entre otros.\r");
		txtrElProfesor_3_3_2_4_1_1.setLineWrap(true);
		txtrElProfesor_3_3_2_4_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrElProfesor_3_3_2_4_1_1.setEditable(false);
		txtrElProfesor_3_3_2_4_1_1.setBounds(60, 11, 770, 97);
		panel_1.add(txtrElProfesor_3_3_2_4_1_1);
		
		JLabel lblNewLabel_2_4_2 = new JLabel("Comentarios:");
		lblNewLabel_2_4_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_4_2.setBounds(10, 119, 88, 13);
		panel_1.add(lblNewLabel_2_4_2);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(108, 119, 526, 97);
		panel_1.add(textField_18);
		
		JLabel lblNewLabel_3_4_2 = new JLabel("Puntuacion:");
		lblNewLabel_3_4_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_4_2.setBounds(702, 119, 88, 13);
		panel_1.add(lblNewLabel_3_4_2);
		
		JSpinner spinner_19_2 = new JSpinner();
		spinner_19_2.setBounds(800, 119, 30, 20);
		panel_1.add(spinner_19_2);
		
		JLabel lblNewLabel_9_1_1_1 = new JLabel("Promedio de la Evaluacion:");
		lblNewLabel_9_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1_1_1.setBounds(572, 242, 164, 13);
		panel_1.add(lblNewLabel_9_1_1_1);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(734, 238, 96, 19);
		panel_1.add(textField_19);
		
		JLabel lblNewLabel_9_1_2_1 = new JLabel("Puntuacion total de la Evaluacion:");
		lblNewLabel_9_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1_2_1.setBounds(538, 265, 184, 13);
		panel_1.add(lblNewLabel_9_1_2_1);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(734, 266, 96, 19);
		panel_1.add(textField_20);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.setBounds(409, 654, 89, 23);
		panel_1.add(btnNewButton);
	}
}