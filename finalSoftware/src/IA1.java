import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class IA1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IA1 window = new IA1();
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
	public IA1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 932, 820);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Pagina 1", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Instrumento I-A");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(369, 21, 196, 40);
		panel.add(lblNewLabel);
		
		JLabel lblEvaluacionDeFacultad = new JLabel("Evaluacion de Facultad por los Estudiantes");
		lblEvaluacionDeFacultad.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEvaluacionDeFacultad.setBounds(282, 101, 305, 40);
		panel.add(lblEvaluacionDeFacultad);
		
		JLabel lblEnLosCursos = new JLabel("en los Cursos que se Ofrecen en Linea");
		lblEnLosCursos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEnLosCursos.setBounds(292, 137, 305, 40);
		panel.add(lblEnLosCursos);
		
		JLabel lblNewLabel_1 = new JLabel("PARTE I. Perfil del estudiante. Contestes las siguientes preguntas.");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(72, 200, 493, 26);
		panel.add(lblNewLabel_1);
		
		JLabel lblIndicaEl = new JLabel("1. Indica el numero de horas a la semana que dedicas a trabajar en el curso en linea:");
		lblIndicaEl.setFont(new Font("Arial", Font.PLAIN, 12));
		lblIndicaEl.setBounds(72, 236, 515, 31);
		panel.add(lblIndicaEl);
		
		JLabel lblcuantasVeces = new JLabel("2. \u00BFCuantas veces te comunicas con tu profesor a traves de los medios provistos por la institucion?");
		lblcuantasVeces.setFont(new Font("Arial", Font.PLAIN, 12));
		lblcuantasVeces.setBounds(72, 385, 661, 26);
		panel.add(lblcuantasVeces);
		
		JLabel lblMasDe = new JLabel("1. Mas de 5 horas a la semana.");
		lblMasDe.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMasDe.setBounds(82, 264, 240, 21);
		panel.add(lblMasDe);
		
		JLabel lblDeA = new JLabel("2. De 3 a 5 horas a la semana.");
		lblDeA.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDeA.setBounds(82, 295, 240, 21);
		panel.add(lblDeA);
		
		JLabel lblMenosDe = new JLabel("3. Menos de 1 hora a la semana.");
		lblMenosDe.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMenosDe.setBounds(82, 326, 240, 21);
		panel.add(lblMenosDe);
		
		JLabel lblDe = new JLabel("4. De 1 a 3 horas a la semana.");
		lblDe.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDe.setBounds(82, 357, 240, 21);
		panel.add(lblDe);
		
		JLabel lblMasDe_1 = new JLabel("1. Tres veces, o mas, a la semana.");
		lblMasDe_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMasDe_1.setBounds(82, 421, 240, 21);
		panel.add(lblMasDe_1);
		
		JLabel lblMasDe_2 = new JLabel("2. Una vez a la semana.");
		lblMasDe_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMasDe_2.setBounds(82, 452, 240, 21);
		panel.add(lblMasDe_2);
		
		JLabel lblMasDe_3 = new JLabel("3. Una vez al mes.");
		lblMasDe_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMasDe_3.setBounds(82, 483, 240, 21);
		panel.add(lblMasDe_3);
		
		JLabel lblMasDe_4 = new JLabel("4. De una a tres veces, durante el termino academico.");
		lblMasDe_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMasDe_4.setBounds(82, 514, 333, 21);
		panel.add(lblMasDe_4);
		
		JLabel lblNunca = new JLabel("5. Nunca.");
		lblNunca.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNunca.setBounds(82, 545, 240, 21);
		panel.add(lblNunca);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(703, 242, 30, 20);
		panel.add(spinner_4);
		
		JSpinner spinner_4_1 = new JSpinner();
		spinner_4_1.setBounds(703, 389, 30, 20);
		panel.add(spinner_4_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Pagina 2", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("PARTE II. El prontuario del curso. Utiliza la calve para las preguntas 3 y 4:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 10, 528, 26);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("(3) Lo hizo\t\t(2) No lo hizo\t\t(1) Desconozco porque no estuve al inicio del curso");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(10, 44, 477, 14);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblDuranteLa = new JLabel("3. Durante la primera semana del cuso, el profesor pone a mi disposicion el prontuario.");
		lblDuranteLa.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDuranteLa.setBounds(10, 85, 528, 31);
		panel_1.add(lblDuranteLa);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		spinner.setBounds(804, 91, 30, 20);
		panel_1.add(spinner);
		
		JLabel lblElProfesor = new JLabel("4. El profesor aclarar mis dudas con respecto al contenido del prontuario.");
		lblElProfesor.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor.setBounds(10, 126, 528, 31);
		panel_1.add(lblElProfesor);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		spinner_1.setBounds(804, 132, 30, 20);
		panel_1.add(spinner_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("PARTE III. Desarrollo de las clases en linea. Conteste las preguntas 5-13.");
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_2.setBounds(10, 194, 528, 26);
		panel_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("(4) Totalmente de acuerdo (si)");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(10, 230, 477, 14);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("(3) Parcialmente de acuerdo(mayormente si)");
		lblNewLabel_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_2.setBounds(10, 241, 477, 14);
		panel_1.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("(2) Parcialmente en desacuerdo (mayormente no)");
		lblNewLabel_1_1_1_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_3.setBounds(10, 254, 477, 14);
		panel_1.add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("(1) Totalmente en desacuerdo (no).");
		lblNewLabel_1_1_1_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_4.setBounds(10, 265, 477, 14);
		panel_1.add(lblNewLabel_1_1_1_4);
		
		JLabel lblNewLabel_1_1_1_5 = new JLabel("(N/A) No aplica");
		lblNewLabel_1_1_1_5.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_5.setBounds(10, 278, 477, 14);
		panel_1.add(lblNewLabel_1_1_1_5);
		
		JLabel lblElProfesor_1 = new JLabel("5. El profesor demuestra conocer el material de la clase.");
		lblElProfesor_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1.setBounds(10, 315, 528, 31);
		panel_1.add(lblElProfesor_1);
		
		JLabel lblElProfesor_1_1 = new JLabel("6. El profesor me hace pensar y reflexionar sobre los temas dle curso.");
		lblElProfesor_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_1.setBounds(10, 356, 528, 31);
		panel_1.add(lblElProfesor_1_1);
		
		JLabel lblElProfesor_1_1_1 = new JLabel("7. La forma en que el profesor presenta el contenido del curso en linea, contribuye a aumentar mi entendimineto de esta materia.");
		lblElProfesor_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_1_1.setBounds(10, 397, 751, 31);
		panel_1.add(lblElProfesor_1_1_1);
		
		JLabel lblElProfesor_1_1_2 = new JLabel("8. Haste el presente, se han logrado los objetivos del curso conforme al prontuario.");
		lblElProfesor_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_1_2.setBounds(10, 438, 528, 31);
		panel_1.add(lblElProfesor_1_1_2);
		
		JLabel lblElProfesor_1_1_2_1 = new JLabel("9. El profesor enriqece la clase con recursos audiovisuales, referencias o enlaces al internet.");
		lblElProfesor_1_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_1_2_1.setBounds(10, 520, 528, 31);
		panel_1.add(lblElProfesor_1_1_2_1);
		
		JLabel lblElProfesor_1_1_2_1_1 = new JLabel("10. El profesor atiende y discute con respeto mis plantemientos.");
		lblElProfesor_1_1_2_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_1_2_1_1.setBounds(10, 479, 557, 31);
		panel_1.add(lblElProfesor_1_1_2_1_1);
		
		JLabel lblElProfesor_1_1_2_1_2 = new JLabel("11. El profesor relaciona las ideas y temas presentados en el curso con situaciones del diario vivir.");
		lblElProfesor_1_1_2_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_1_2_1_2.setBounds(10, 561, 557, 31);
		panel_1.add(lblElProfesor_1_1_2_1_2);
		
		JLabel lblElProfesor_1_1_2_1_2_1 = new JLabel("12. El profesor promueve que participe en los foros de discusion o en otras situaciones de interaccion.");
		lblElProfesor_1_1_2_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_1_2_1_2_1.setBounds(10, 602, 616, 31);
		panel_1.add(lblElProfesor_1_1_2_1_2_1);
		
		JLabel lblElProfesor_1_1_2_1_2_2 = new JLabel("13. El profesor muestra interes por mi aprovechamiento academico.");
		lblElProfesor_1_1_2_1_2_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_1_2_1_2_2.setBounds(10, 643, 557, 31);
		panel_1.add(lblElProfesor_1_1_2_1_2_2);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(804, 321, 30, 20);
		panel_1.add(spinner_2);
		
		JSpinner spinner_2_1 = new JSpinner();
		spinner_2_1.setBounds(804, 362, 30, 20);
		panel_1.add(spinner_2_1);
		
		JSpinner spinner_2_2 = new JSpinner();
		spinner_2_2.setBounds(804, 403, 30, 20);
		panel_1.add(spinner_2_2);
		
		JSpinner spinner_2_3 = new JSpinner();
		spinner_2_3.setBounds(804, 444, 30, 20);
		panel_1.add(spinner_2_3);
		
		JSpinner spinner_2_4 = new JSpinner();
		spinner_2_4.setBounds(804, 485, 30, 20);
		panel_1.add(spinner_2_4);
		
		JSpinner spinner_2_5 = new JSpinner();
		spinner_2_5.setBounds(804, 526, 30, 20);
		panel_1.add(spinner_2_5);
		
		JSpinner spinner_2_6 = new JSpinner();
		spinner_2_6.setBounds(804, 567, 30, 20);
		panel_1.add(spinner_2_6);
		
		JSpinner spinner_2_7 = new JSpinner();
		spinner_2_7.setBounds(804, 608, 30, 20);
		panel_1.add(spinner_2_7);
		
		JSpinner spinner_2_8 = new JSpinner();
		spinner_2_8.setBounds(804, 649, 30, 20);
		panel_1.add(spinner_2_8);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Pagina 3", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("PARTE IV. Gerencia del procesos de ense\u00F1anza aprendizaje. Conteste las");
		lblNewLabel_1_1_2_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_2_1.setBounds(10, 10, 528, 26);
		panel_2.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("(4) Totalmente de acuerdo (si)");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_1.setBounds(10, 75, 477, 14);
		panel_2.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("(3) Parcialmente de acuerdo(mayormente si)");
		lblNewLabel_1_1_1_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_2_1.setBounds(10, 99, 477, 14);
		panel_2.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_3_1 = new JLabel("(2) Parcialmente en desacuerdo (mayormente no)");
		lblNewLabel_1_1_1_3_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_3_1.setBounds(10, 123, 477, 14);
		panel_2.add(lblNewLabel_1_1_1_3_1);
		
		JLabel lblNewLabel_1_1_1_4_1 = new JLabel("(1) Totalmente en desacuerdo (no).");
		lblNewLabel_1_1_1_4_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_4_1.setBounds(10, 147, 477, 14);
		panel_2.add(lblNewLabel_1_1_1_4_1);
		
		JLabel lblNewLabel_1_1_1_5_1 = new JLabel("(N/A) No aplica");
		lblNewLabel_1_1_1_5_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_5_1.setBounds(10, 171, 477, 14);
		panel_2.add(lblNewLabel_1_1_1_5_1);
		
		JLabel lblElProfesor_1_2 = new JLabel("14. El profesor aclara mis dudas sobre la estructura y organizacion del curso.");
		lblElProfesor_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_2.setBounds(10, 213, 528, 31);
		panel_2.add(lblElProfesor_1_2);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Preguntas 14-24 tomando en consideracion la siguente premisa.");
		lblNewLabel_1_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_2_1_1.setBounds(10, 34, 528, 26);
		panel_2.add(lblNewLabel_1_1_2_1_1);
		
		JLabel lblElProfesor_1_2_1 = new JLabel("15. El prodesor esta disponible para contestar mis preguntas en el horario anunciado.");
		lblElProfesor_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_2_1.setBounds(10, 254, 528, 31);
		panel_2.add(lblElProfesor_1_2_1);
		
		JLabel lblElProfesor_1_2_1_1 = new JLabel("16. Los examenes y trabajos responden al contenido del curso.");
		lblElProfesor_1_2_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_2_1_1.setBounds(10, 295, 528, 31);
		panel_2.add(lblElProfesor_1_2_1_1);
		
		JLabel lblElProfesor_1_2_1_1_1 = new JLabel("17. El profesor utiliza dirveso metodos para evaluar el aprendizaje.");
		lblElProfesor_1_2_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_2_1_1_1.setBounds(10, 336, 528, 31);
		panel_2.add(lblElProfesor_1_2_1_1_1);
		
		JLabel lblElProfesor_1_2_1_1_1_1 = new JLabel("18. El profesor corrige los ex\u00E1menes y trabajos, seg\u00FAn los criterios establecidos en el prontuario.");
		lblElProfesor_1_2_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_2_1_1_1_1.setBounds(10, 377, 553, 31);
		panel_2.add(lblElProfesor_1_2_1_1_1_1);
		
		JLabel lblElProfesor_1_2_1_1_1_1_1 = new JLabel("19. El profesor informa los resultados de los ex\u00E1menes y\r\ntrabajos corregidos, preferiblemente en o antes de\r\ndos semanas.");
		lblElProfesor_1_2_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_2_1_1_1_1_1.setBounds(10, 418, 681, 31);
		panel_2.add(lblElProfesor_1_2_1_1_1_1_1);
		
		JLabel lblElProfesor_1_2_1_1_1_1_2 = new JLabel("20.  El profesor discute los resultados de mis\r\nevaluaciones, en su defecto, hace anotaciones o\r\ncomentarios en los espacios ");
		lblElProfesor_1_2_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_2_1_1_1_1_2.setBounds(10, 459, 681, 31);
		panel_2.add(lblElProfesor_1_2_1_1_1_1_2);
		
		JLabel lblElProfesor_1_2_1_1_1_2 = new JLabel("provistos en los diferentes tipos de actividades.");
		lblElProfesor_1_2_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_2_1_1_1_2.setBounds(35, 482, 528, 31);
		panel_2.add(lblElProfesor_1_2_1_1_1_2);
		
		JLabel lblElProfesor_1_2_1_1_1_1_1_1 = new JLabel("21.  El profesor exhorta a los estudiantes a comunicarse\r\ncon \u00E9l, en caso de que surjan dudas relacionadas con los");
		lblElProfesor_1_2_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_2_1_1_1_1_1_1.setBounds(10, 523, 681, 31);
		panel_2.add(lblElProfesor_1_2_1_1_1_1_1_1);
		
		JLabel lblElProfesor_1_2_1_1_1_2_1 = new JLabel("temas del curso y sus evaluaciones.");
		lblElProfesor_1_2_1_1_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_2_1_1_1_2_1.setBounds(35, 544, 528, 31);
		panel_2.add(lblElProfesor_1_2_1_1_1_2_1);
		
		JLabel lblElProfesor_1_2_1_1_1_1_2_1 = new JLabel("22. El profesor provee oportunidades flexibles de interacci\u00F3n entre estudiante-estudiante y estudiante");
		lblElProfesor_1_2_1_1_1_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_2_1_1_1_1_2_1.setBounds(10, 585, 681, 31);
		panel_2.add(lblElProfesor_1_2_1_1_1_1_2_1);
		
		JLabel lblElProfesor_1_2_1_1_1_2_1_1 = new JLabel("profesor, usando los foros de discusi\u00F3n, los salones virtuales, entre otros.");
		lblElProfesor_1_2_1_1_1_2_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_2_1_1_1_2_1_1.setBounds(35, 606, 528, 31);
		panel_2.add(lblElProfesor_1_2_1_1_1_2_1_1);
		
		JLabel lblElProfesor_1_2_1_1_1_1_1_1_1 = new JLabel("23. El profesor actualiza el plan de trabajo en el\r\ncalendario de actividades.\r");
		lblElProfesor_1_2_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_2_1_1_1_1_1_1_1.setBounds(10, 647, 681, 31);
		panel_2.add(lblElProfesor_1_2_1_1_1_1_1_1_1);
		
		JLabel lblElProfesor_1_2_1_1_1_1_1_1_2 = new JLabel("24. El profesor procura que las diversas actividades del\r\ncurso se cumplan dentro del plazo establecido.");
		lblElProfesor_1_2_1_1_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElProfesor_1_2_1_1_1_1_1_1_2.setBounds(10, 688, 681, 31);
		panel_2.add(lblElProfesor_1_2_1_1_1_1_1_1_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(776, 219, 30, 20);
		panel_2.add(spinner_3);
		
		JSpinner spinner_3_1 = new JSpinner();
		spinner_3_1.setBounds(776, 260, 30, 20);
		panel_2.add(spinner_3_1);
		
		JSpinner spinner_3_2 = new JSpinner();
		spinner_3_2.setBounds(776, 301, 30, 20);
		panel_2.add(spinner_3_2);
		
		JSpinner spinner_3_3 = new JSpinner();
		spinner_3_3.setBounds(776, 342, 30, 20);
		panel_2.add(spinner_3_3);
		
		JSpinner spinner_3_4 = new JSpinner();
		spinner_3_4.setBounds(776, 383, 30, 20);
		panel_2.add(spinner_3_4);
		
		JSpinner spinner_3_5 = new JSpinner();
		spinner_3_5.setBounds(776, 424, 30, 20);
		panel_2.add(spinner_3_5);
		
		JSpinner spinner_3_6 = new JSpinner();
		spinner_3_6.setBounds(776, 465, 30, 20);
		panel_2.add(spinner_3_6);
		
		JSpinner spinner_3_7 = new JSpinner();
		spinner_3_7.setBounds(776, 529, 30, 20);
		panel_2.add(spinner_3_7);
		
		JSpinner spinner_3_8 = new JSpinner();
		spinner_3_8.setBounds(776, 591, 30, 20);
		panel_2.add(spinner_3_8);
		
		JSpinner spinner_3_9 = new JSpinner();
		spinner_3_9.setBounds(776, 653, 30, 20);
		panel_2.add(spinner_3_9);
		
		JSpinner spinner_3_10 = new JSpinner();
		spinner_3_10.setBounds(776, 694, 30, 20);
		panel_2.add(spinner_3_10);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Pagina 4", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_1_2_1_2 = new JLabel("PARTE V. Otras Apreciaciones del Estudiante. Conteste las siguientes preguntas.");
		lblNewLabel_1_1_2_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_2_1_2.setBounds(10, 10, 589, 26);
		panel_3.add(lblNewLabel_1_1_2_1_2);
		
		JLabel lblqueFue = new JLabel("25. \u00BFQue fue lo que mas te gusto del curso?");
		lblqueFue.setFont(new Font("Arial", Font.PLAIN, 12));
		lblqueFue.setBounds(10, 46, 268, 26);
		panel_3.add(lblqueFue);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 82, 589, 95);
		panel_3.add(textArea);
		
		JLabel lblqueFue_2 = new JLabel("26. \u00BFQue fue lo que menos te gusto del curso?");
		lblqueFue_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblqueFue_2.setBounds(10, 201, 290, 26);
		panel_3.add(lblqueFue_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 237, 589, 95);
		panel_3.add(textArea_1);
		
		JLabel lblqueFue_1_1 = new JLabel("27. \u00BFTomarias otro curso en linea con el mismo profesor o lo recomendarias a un compa\u00F1ero? Explica.");
		lblqueFue_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblqueFue_1_1.setBounds(10, 356, 589, 26);
		panel_3.add(lblqueFue_1_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBounds(10, 392, 589, 95);
		panel_3.add(textArea_1_1);
		
		JLabel lblqueFue_1_1_1 = new JLabel("28. \u00BFQue sugerencias harias para que el profesor mejore su ense\u00F1anza y participe mas en tu aprendizaje en esta modalidad?");
		lblqueFue_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblqueFue_1_1_1.setBounds(10, 512, 704, 26);
		panel_3.add(lblqueFue_1_1_1);
		
		JTextArea textArea_1_1_1 = new JTextArea();
		textArea_1_1_1.setBounds(10, 548, 589, 95);
		panel_3.add(textArea_1_1_1);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBounds(364, 713, 152, 33);
		panel_3.add(btnNewButton);
		
	}
}
