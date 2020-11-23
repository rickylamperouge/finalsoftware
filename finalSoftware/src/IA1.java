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
		tabbedPane.addTab("New tab", null, panel, null);
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
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(72, 200, 415, 26);
		panel.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Mas de 5 horas a la semana.");
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(72, 272, 402, 21);
		panel.add(rdbtnNewRadioButton);
		
		JLabel lblIndicaEl = new JLabel("1. Indica el numero de horas a la semana que dedicas a trabajar en el curso en linea:");
		lblIndicaEl.setFont(new Font("Arial", Font.PLAIN, 12));
		lblIndicaEl.setBounds(72, 236, 515, 31);
		panel.add(lblIndicaEl);
		
		JRadioButton rdbtnDeA = new JRadioButton("De 3 a 5 horas a la semana.");
		rdbtnDeA.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnDeA.setBounds(72, 295, 402, 21);
		panel.add(rdbtnDeA);
		
		JRadioButton rdbtnDeA_1 = new JRadioButton("De 1 a 3 horas a la semana.");
		rdbtnDeA_1.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnDeA_1.setBounds(72, 318, 402, 21);
		panel.add(rdbtnDeA_1);
		
		JRadioButton rdbtnMenisDe = new JRadioButton("Menos de 1 hora a la semana.");
		rdbtnMenisDe.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnMenisDe.setBounds(72, 341, 402, 21);
		panel.add(rdbtnMenisDe);
		
		JLabel lblcuantasVeces = new JLabel("2. \u00BFCuantas veces te comunicas con tu profesor a traves de los medios provistos por la institucion?");
		lblcuantasVeces.setFont(new Font("Arial", Font.PLAIN, 12));
		lblcuantasVeces.setBounds(72, 385, 661, 26);
		panel.add(lblcuantasVeces);
		
		JRadioButton rdbtnTresVecesO = new JRadioButton("Tres veces, o mas, a la semana.");
		rdbtnTresVecesO.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnTresVecesO.setBounds(72, 417, 402, 21);
		panel.add(rdbtnTresVecesO);
		
		JRadioButton rdbtnUnaVezA = new JRadioButton("Una vez a al semana.");
		rdbtnUnaVezA.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnUnaVezA.setBounds(72, 440, 402, 21);
		panel.add(rdbtnUnaVezA);
		
		JRadioButton rdbtnUnaVezAl = new JRadioButton("Una vez al mes.");
		rdbtnUnaVezAl.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnUnaVezAl.setBounds(72, 463, 402, 21);
		panel.add(rdbtnUnaVezAl);
		
		JRadioButton rdbtnDeUnaA = new JRadioButton("De una a tres veces, durante el termino academico.");
		rdbtnDeUnaA.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnDeUnaA.setBounds(72, 488, 402, 21);
		panel.add(rdbtnDeUnaA);
		
		JRadioButton rdbtnNunca = new JRadioButton("Nunca.");
		rdbtnNunca.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnNunca.setBounds(72, 511, 402, 21);
		panel.add(rdbtnNunca);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
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
		
		JLabel lblNewLabel_1_1_2 = new JLabel("PARTE II. El prontuario del curso. Utiliza la calve para las preguntas 3 y 4:");
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
		lblElProfesor_1_1_1.setBounds(10, 397, 706, 31);
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
		tabbedPane.addTab("New tab", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_4, null);
	}
}
