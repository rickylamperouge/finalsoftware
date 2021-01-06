import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class valenciaAUX extends JFrame {

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
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					valenciaAUX frame = new valenciaAUX();
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
	public valenciaAUX() {
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
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 903, 746);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Universidad Interamericana de Puerto Rico Recinto de Bayamon");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(269, 10, 373, 13);
		panel_1.add(lblNewLabel);
		
		JLabel lblValenciasDeLos = new JLabel("VALENCIAS DE LOS SUBCRITERIOS DE EVALUACION DE FACULTAD");
		lblValenciasDeLos.setFont(new Font("Arial", Font.BOLD, 16));
		lblValenciasDeLos.setBounds(182, 52, 580, 42);
		panel_1.add(lblValenciasDeLos);
		
		JLabel lblProfesor = new JLabel("Profesor:");
		lblProfesor.setFont(new Font("Arial", Font.BOLD, 12));
		lblProfesor.setBounds(23, 118, 73, 28);
		panel_1.add(lblProfesor);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Arial", Font.BOLD, 12));
		lblFecha.setBounds(23, 156, 73, 28);
		panel_1.add(lblFecha);
		
		JLabel lblDepartamento = new JLabel("Departamento:");
		lblDepartamento.setFont(new Font("Arial", Font.BOLD, 12));
		lblDepartamento.setBounds(461, 118, 98, 28);
		panel_1.add(lblDepartamento);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(85, 123, 223, 19);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(85, 156, 223, 19);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(569, 123, 223, 19);
		panel_1.add(textField_2);
		
		JLabel lblRangoCatedraticoAuxiliar = new JLabel("RANGO CATEDRATICO AUXILIAR");
		lblRangoCatedraticoAuxiliar.setHorizontalAlignment(SwingConstants.CENTER);
		lblRangoCatedraticoAuxiliar.setForeground(Color.BLACK);
		lblRangoCatedraticoAuxiliar.setFont(new Font("Arial", Font.BOLD, 16));
		lblRangoCatedraticoAuxiliar.setBounds(140, 206, 580, 42);
		panel_1.add(lblRangoCatedraticoAuxiliar);
		
		JLabel lblNewLabel_1 = new JLabel("I. Experiencia y Calidad Docente");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(23, 258, 205, 28);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Catedratico Asociado ");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(493, 258, 205, 28);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Puntuacion obtenida");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(688, 258, 205, 28);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Valencia (67%)");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(493, 284, 205, 28);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2 = new JLabel("a. Dominio de la disciplina que ense\u00F1a");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(23, 342, 345, 28);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("b. Habilidad para organizar el contenido y presentarlo en\r\nforma clara, l\u00F3gica e imaginativa");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(23, 380, 490, 28);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("c. Conocimiento de los desarrollos actuales de la disciplina.");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(23, 418, 345, 28);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("d. Habilidad para relacionar la disciplina con otras esferas del\r\nconocimiento.");
		lblNewLabel_2_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(23, 456, 483, 28);
		panel_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("e. Habilidad para promover y ampliar el inter\u00E9s del estudiante\r\nen la disciplina.");
		lblNewLabel_2_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_4.setBounds(23, 494, 483, 28);
		panel_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("f. Habilidad para desarrollar y utilizar m\u00E9todos y estrategias\r\nadecuadas, incluyendo ");
		lblNewLabel_2_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_5.setBounds(23, 532, 483, 28);
		panel_1.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("g. Disponibilidad y eficacia en la orientaci\u00F3n acad\u00E9mica del\r\nestudiante.");
		lblNewLabel_2_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_6.setBounds(23, 594, 483, 28);
		panel_1.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("h. Posesi\u00F3n de los atributos de integridad, laboriosidad, liberalidad y ");
		lblNewLabel_2_7.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_7.setBounds(23, 632, 483, 28);
		panel_1.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("el \u201Cassessment\u201D para una ense\u00F1anza\r\nefectiva.");
		lblNewLabel_2_5_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_5_1.setBounds(23, 556, 483, 28);
		panel_1.add(lblNewLabel_2_5_1);
		
		JLabel lblNewLabel_2_7_1 = new JLabel("objetividad en la ense\u00F1anza.");
		lblNewLabel_2_7_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_7_1.setBounds(23, 656, 345, 28);
		panel_1.add(lblNewLabel_2_7_1);
		
		JLabel lblNewLabel_3 = new JLabel("16");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(588, 357, 45, 13);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("12");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.BLACK);
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(588, 388, 45, 13);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("8");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setForeground(Color.BLACK);
		lblNewLabel_3_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_2.setBounds(588, 426, 45, 13);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("6");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setForeground(Color.BLACK);
		lblNewLabel_3_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_3.setBounds(588, 464, 45, 13);
		panel_1.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("6");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setForeground(Color.BLACK);
		lblNewLabel_3_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_4.setBounds(588, 502, 45, 13);
		panel_1.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("9");
		lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_5.setForeground(Color.BLACK);
		lblNewLabel_3_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_5.setBounds(588, 540, 45, 13);
		panel_1.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("10");
		lblNewLabel_3_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_6.setForeground(Color.BLACK);
		lblNewLabel_3_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_6.setBounds(588, 618, 45, 13);
		panel_1.add(lblNewLabel_3_6);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(744, 351, 112, 19);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(744, 385, 112, 19);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(744, 423, 112, 19);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(744, 461, 112, 19);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(744, 499, 112, 19);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(744, 537, 112, 19);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(744, 615, 112, 19);
		panel_1.add(textField_9);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Pagina 2", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 0, 903, 746);
		panel_2.add(panel_1_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("II. Servicio a la Institucion");
		lblNewLabel_1_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(10, 45, 205, 28);
		panel_1_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Catedratico Asociado ");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(479, 45, 205, 28);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Valencia (12%)");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_3_1.setBounds(479, 69, 205, 28);
		panel_1_1.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Puntuacion obtenida");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_2_1.setBounds(688, 45, 205, 28);
		panel_1_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("a. Trabajo en comit\u00E9s de facultad a nivel departamental.");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(10, 107, 490, 28);
		panel_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("b. Participaci\u00F3n y aportaci\u00F3n a reuniones de facultad y de\r\ncomit\u00E9s a nivel de Recinto.");
		lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1.setBounds(10, 137, 490, 28);
		panel_1_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("c. Servicio en comit\u00E9s y en organizaciones a nivel  institucional");
		lblNewLabel_2_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_2.setBounds(10, 175, 490, 28);
		panel_1_1.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("d. Colaboraci\u00F3n en actividades estudiantiles");
		lblNewLabel_2_1_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_3.setBounds(10, 213, 490, 28);
		panel_1_1.add(lblNewLabel_2_1_1_3);
		
		JLabel lblNewLabel_2_1_1_4 = new JLabel("e. Asistencia a actos oficiales.");
		lblNewLabel_2_1_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_4.setBounds(10, 251, 490, 28);
		panel_1_1.add(lblNewLabel_2_1_1_4);
		
		JLabel lblNewLabel_2_1_1_5 = new JLabel("f. Designaci\u00F3n como director/a de departamento, presidente\r\nde comit\u00E9 y otras.");
		lblNewLabel_2_1_1_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_5.setBounds(10, 289, 490, 28);
		panel_1_1.add(lblNewLabel_2_1_1_5);
		
		JLabel lblNewLabel_2_1_1_6 = new JLabel("g. Participaci\u00F3n en organismos de gobierno; tales como: el Senado y el Consejo ");
		lblNewLabel_2_1_1_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_6.setBounds(10, 322, 490, 28);
		panel_1_1.add(lblNewLabel_2_1_1_6);
		
		JLabel lblNewLabel_2_1_1_4_1 = new JLabel("Universitario.");
		lblNewLabel_2_1_1_4_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_4_1.setBounds(10, 347, 490, 28);
		panel_1_1.add(lblNewLabel_2_1_1_4_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(732, 112, 112, 19);
		panel_1_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(732, 157, 112, 19);
		panel_1_1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(732, 236, 112, 19);
		panel_1_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(732, 327, 112, 19);
		panel_1_1.add(textField_13);
		
		JLabel lblNewLabel_3_7 = new JLabel("3");
		lblNewLabel_3_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_7.setForeground(Color.BLACK);
		lblNewLabel_3_7.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_7.setBounds(560, 107, 45, 13);
		panel_1_1.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_8 = new JLabel("4");
		lblNewLabel_3_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_8.setForeground(Color.BLACK);
		lblNewLabel_3_8.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_8.setBounds(560, 160, 45, 13);
		panel_1_1.add(lblNewLabel_3_8);
		
		JLabel lblNewLabel_3_9 = new JLabel("2");
		lblNewLabel_3_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_9.setForeground(Color.BLACK);
		lblNewLabel_3_9.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_9.setBounds(560, 239, 45, 13);
		panel_1_1.add(lblNewLabel_3_9);
		
		JLabel lblNewLabel_3_10 = new JLabel("3");
		lblNewLabel_3_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_10.setForeground(Color.BLACK);
		lblNewLabel_3_10.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_10.setBounds(560, 335, 45, 13);
		panel_1_1.add(lblNewLabel_3_10);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("III. Servicio a la Comunidad");
		lblNewLabel_1_4_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_4_1.setBounds(10, 425, 205, 28);
		panel_1_1.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Catedratico Asociado ");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(479, 425, 205, 28);
		panel_1_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Valencia (2%)");
		lblNewLabel_1_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_3_1_1.setBounds(489, 448, 205, 28);
		panel_1_1.add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Puntuacion obtenida");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_2_1_1.setBounds(688, 433, 205, 28);
		panel_1_1.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_2_1_1_7 = new JLabel("a. Servicio en el campo profesional del profesor como consultor o investigador.");
		lblNewLabel_2_1_1_7.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_7.setBounds(10, 510, 490, 28);
		panel_1_1.add(lblNewLabel_2_1_1_7);
		
		JLabel lblNewLabel_2_1_1_8 = new JLabel("b. Servicio como recurso: conferenciante de grupos de la\r\ncomunidad, participaci\u00F3n activa ");
		lblNewLabel_2_1_1_8.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_8.setBounds(10, 548, 490, 28);
		panel_1_1.add(lblNewLabel_2_1_1_8);
		
		JLabel lblNewLabel_2_1_1_8_1 = new JLabel("en gestiones pol\u00EDticas, religiosas o c\u00EDvicas.");
		lblNewLabel_2_1_1_8_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_8_1.setBounds(10, 576, 490, 28);
		panel_1_1.add(lblNewLabel_2_1_1_8_1);
		
		JLabel lblNewLabel_3_9_1 = new JLabel("2");
		lblNewLabel_3_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_9_1.setForeground(Color.BLACK);
		lblNewLabel_3_9_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_9_1.setBounds(560, 535, 45, 13);
		panel_1_1.add(lblNewLabel_3_9_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(732, 532, 112, 19);
		panel_1_1.add(textField_14);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Pagina 3", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(0, 0, 903, 746);
		panel_3.add(panel_2_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("IV. Investigacion y Trabajo Creativo");
		lblNewLabel_1_4_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_4_2.setBounds(10, 10, 205, 28);
		panel_2_1.add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Catedratico Asociado ");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_2.setBounds(492, 18, 205, 28);
		panel_2_1.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("Valencia (12%)");
		lblNewLabel_1_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_3_1_2.setBounds(502, 39, 205, 28);
		panel_2_1.add(lblNewLabel_1_3_1_2);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Puntuacion obtenida");
		lblNewLabel_1_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_2_1_2.setBounds(682, 18, 205, 28);
		panel_2_1.add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("a. Publicaciones ");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1.setBounds(10, 77, 490, 28);
		panel_2_1.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_3_7_1 = new JLabel("2");
		lblNewLabel_3_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_7_1.setForeground(Color.BLACK);
		lblNewLabel_3_7_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_7_1.setBounds(554, 85, 45, 13);
		panel_2_1.add(lblNewLabel_3_7_1);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(736, 82, 112, 19);
		panel_2_1.add(textField_15);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("b. Presentaciones y trabajos creativos relacionados con la\r\ndisciplina que ense\u00F1a.");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1.setBounds(10, 115, 490, 28);
		panel_2_1.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_2 = new JLabel("c. Propuestas dise\u00F1adas y presentadas");
		lblNewLabel_2_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_2.setBounds(10, 153, 490, 28);
		panel_2_1.add(lblNewLabel_2_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1_3 = new JLabel("d. Concesi\u00F3n de ayudas para investigaci\u00F3n y proyectos.");
		lblNewLabel_2_1_1_1_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_3.setBounds(10, 191, 490, 28);
		panel_2_1.add(lblNewLabel_2_1_1_1_1_3);
		
		JLabel lblNewLabel_2_1_1_1_1_4 = new JLabel("e. Invenciones, patentes, labor art\u00EDstica y actuaci\u00F3n.");
		lblNewLabel_2_1_1_1_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_4.setBounds(10, 229, 490, 28);
		panel_2_1.add(lblNewLabel_2_1_1_1_1_4);
		
		JLabel lblNewLabel_1_4_2_1 = new JLabel("V. Crecimiento Y Desarrollo Profesional");
		lblNewLabel_1_4_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_4_2_1.setBounds(10, 280, 343, 28);
		panel_2_1.add(lblNewLabel_1_4_2_1);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Catedratico Asociado ");
		lblNewLabel_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_2_1.setBounds(492, 280, 205, 28);
		panel_2_1.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblNewLabel_1_2_1_2_1 = new JLabel("Puntuacion obtenida");
		lblNewLabel_1_2_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_2_1_2_1.setBounds(682, 280, 205, 28);
		panel_2_1.add(lblNewLabel_1_2_1_2_1);
		
		JLabel lblNewLabel_1_3_1_2_1 = new JLabel("Valencia (9%)");
		lblNewLabel_1_3_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_3_1_2_1.setBounds(492, 302, 205, 28);
		panel_2_1.add(lblNewLabel_1_3_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_1_5 = new JLabel("a. Obtenci\u00F3n de premios, ayudas y becas.");
		lblNewLabel_2_1_1_1_1_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_5.setBounds(10, 340, 490, 28);
		panel_2_1.add(lblNewLabel_2_1_1_1_1_5);
		
		JLabel lblNewLabel_2_1_1_1_1_6 = new JLabel("b. Nombramiento como asesor/a en agencias de gobierno");
		lblNewLabel_2_1_1_1_1_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_6.setBounds(10, 378, 490, 28);
		panel_2_1.add(lblNewLabel_2_1_1_1_1_6);
		
		JLabel lblNewLabel_2_1_1_1_1_7 = new JLabel("c. Participaci\u00F3n activa en organizaciones profesionales.");
		lblNewLabel_2_1_1_1_1_7.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_7.setBounds(10, 416, 490, 28);
		panel_2_1.add(lblNewLabel_2_1_1_1_1_7);
		
		JLabel lblNewLabel_2_1_1_1_1_8 = new JLabel("d. Recurso en conferencia y charlas.");
		lblNewLabel_2_1_1_1_1_8.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_8.setBounds(10, 454, 490, 28);
		panel_2_1.add(lblNewLabel_2_1_1_1_1_8);
		
		JLabel lblNewLabel_2_1_1_1_1_9 = new JLabel("e. Participaci\u00F3n en conferencias, congresos o institutos.");
		lblNewLabel_2_1_1_1_1_9.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_9.setBounds(10, 492, 490, 28);
		panel_2_1.add(lblNewLabel_2_1_1_1_1_9);
		
		JLabel lblNewLabel_2_1_1_1_1_10 = new JLabel("f. Educaci\u00F3n post doctoral, educaci\u00F3n continua.");
		lblNewLabel_2_1_1_1_1_10.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_10.setBounds(10, 530, 490, 28);
		panel_2_1.add(lblNewLabel_2_1_1_1_1_10);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(736, 383, 112, 19);
		panel_2_1.add(textField_16);
		
		JLabel lblNewLabel_3_7_1_1 = new JLabel("4");
		lblNewLabel_3_7_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_7_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_7_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_7_1_1.setBounds(554, 123, 45, 13);
		panel_2_1.add(lblNewLabel_3_7_1_1);
		
		JLabel lblNewLabel_3_7_1_2 = new JLabel("4");
		lblNewLabel_3_7_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_7_1_2.setForeground(Color.BLACK);
		lblNewLabel_3_7_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_7_1_2.setBounds(554, 199, 45, 13);
		panel_2_1.add(lblNewLabel_3_7_1_2);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(736, 120, 112, 19);
		panel_2_1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(736, 196, 112, 19);
		panel_2_1.add(textField_18);
		
		JLabel lblNewLabel_3_7_1_1_1 = new JLabel("3");
		lblNewLabel_3_7_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_7_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_7_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_7_1_1_1.setBounds(571, 386, 45, 13);
		panel_2_1.add(lblNewLabel_3_7_1_1_1);
		
		JLabel lblNewLabel_3_7_1_3 = new JLabel("3");
		lblNewLabel_3_7_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_7_1_3.setForeground(Color.BLACK);
		lblNewLabel_3_7_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_7_1_3.setBounds(571, 500, 45, 13);
		panel_2_1.add(lblNewLabel_3_7_1_3);
		
		JLabel lblNewLabel_3_7_1_4 = new JLabel("3");
		lblNewLabel_3_7_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_7_1_4.setForeground(Color.BLACK);
		lblNewLabel_3_7_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_7_1_4.setBounds(571, 538, 45, 13);
		panel_2_1.add(lblNewLabel_3_7_1_4);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(736, 492, 112, 19);
		panel_2_1.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(736, 535, 112, 19);
		panel_2_1.add(textField_20);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Pagina 4", null, panel_4, null);
		panel_4.setLayout(null);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(0, 0, 903, 746);
		panel_4.add(panel_3_1);
		
		JLabel lblRecomendacion = new JLabel("RECOMENDACION:");
		lblRecomendacion.setHorizontalAlignment(SwingConstants.LEFT);
		lblRecomendacion.setForeground(Color.BLACK);
		lblRecomendacion.setFont(new Font("Arial", Font.BOLD, 16));
		lblRecomendacion.setBounds(10, 46, 325, 42);
		panel_3_1.add(lblRecomendacion);
		
		JLabel lblNewLabel_1_5 = new JLabel("I. Experiencia y Calidad Docente");
		lblNewLabel_1_5.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_5.setBounds(10, 161, 205, 28);
		panel_3_1.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_4_3 = new JLabel("II. Servicio a la Institucion");
		lblNewLabel_1_4_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_4_3.setBounds(10, 199, 205, 28);
		panel_3_1.add(lblNewLabel_1_4_3);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("III. Servicio a la Comunidad");
		lblNewLabel_1_4_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_4_1_1.setBounds(10, 237, 205, 28);
		panel_3_1.add(lblNewLabel_1_4_1_1);
		
		JLabel lblNewLabel_1_4_2_2 = new JLabel("IV. Investigacion y Trabajo Creativo");
		lblNewLabel_1_4_2_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_4_2_2.setBounds(10, 275, 205, 28);
		panel_3_1.add(lblNewLabel_1_4_2_2);
		
		JLabel lblNewLabel_1_4_2_1_1 = new JLabel("V. Crecimiento Y Desarrollo Profesional");
		lblNewLabel_1_4_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_4_2_1_1.setBounds(10, 313, 343, 28);
		panel_3_1.add(lblNewLabel_1_4_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Resumen de las valencias de los criterios, seg\u00FAn adoptados en el Recinto de Bayam\u00F3n, para el rango de Catedr\u00E1tico Auxiliar:");
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1.setBackground(SystemColor.menu);
		lblNewLabel_2_1_1_1_1_1_1.setBounds(10, 84, 734, 28);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_1_1);
		
		JLabel lblRecomendacion_1 = new JLabel("CRITERIOS");
		lblRecomendacion_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblRecomendacion_1.setForeground(Color.BLACK);
		lblRecomendacion_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblRecomendacion_1.setBounds(10, 122, 176, 28);
		panel_3_1.add(lblRecomendacion_1);
		
		JLabel lblRecomendacion_1_1 = new JLabel("VALENCIAS");
		lblRecomendacion_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblRecomendacion_1_1.setForeground(Color.BLACK);
		lblRecomendacion_1_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblRecomendacion_1_1.setBounds(330, 122, 176, 28);
		panel_3_1.add(lblRecomendacion_1_1);
		
		JLabel lblRecomendacion_1_2 = new JLabel("DEL PROFESOR");
		lblRecomendacion_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblRecomendacion_1_2.setForeground(Color.BLACK);
		lblRecomendacion_1_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblRecomendacion_1_2.setBounds(651, 122, 176, 28);
		panel_3_1.add(lblRecomendacion_1_2);
		
		JLabel lblNewLabel_3_7_1_5 = new JLabel("67%");
		lblNewLabel_3_7_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_7_1_5.setForeground(Color.BLACK);
		lblNewLabel_3_7_1_5.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_3_7_1_5.setBounds(340, 169, 45, 13);
		panel_3_1.add(lblNewLabel_3_7_1_5);
		
		JLabel lblNewLabel_3_7_1_5_1 = new JLabel("12%");
		lblNewLabel_3_7_1_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_7_1_5_1.setForeground(Color.BLACK);
		lblNewLabel_3_7_1_5_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_3_7_1_5_1.setBounds(340, 207, 45, 13);
		panel_3_1.add(lblNewLabel_3_7_1_5_1);
		
		JLabel lblNewLabel_3_7_1_5_2 = new JLabel("2%");
		lblNewLabel_3_7_1_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_7_1_5_2.setForeground(Color.BLACK);
		lblNewLabel_3_7_1_5_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_3_7_1_5_2.setBounds(340, 245, 45, 13);
		panel_3_1.add(lblNewLabel_3_7_1_5_2);
		
		JLabel lblNewLabel_3_7_1_5_3 = new JLabel("10%");
		lblNewLabel_3_7_1_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_7_1_5_3.setForeground(Color.BLACK);
		lblNewLabel_3_7_1_5_3.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_3_7_1_5_3.setBounds(340, 283, 45, 13);
		panel_3_1.add(lblNewLabel_3_7_1_5_3);
		
		JLabel lblNewLabel_3_7_1_5_4 = new JLabel("9%");
		lblNewLabel_3_7_1_5_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_7_1_5_4.setForeground(Color.BLACK);
		lblNewLabel_3_7_1_5_4.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_3_7_1_5_4.setBounds(340, 321, 45, 13);
		panel_3_1.add(lblNewLabel_3_7_1_5_4);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(630, 169, 197, 19);
		panel_3_1.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(630, 204, 197, 19);
		panel_3_1.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(630, 242, 197, 19);
		panel_3_1.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(630, 280, 197, 19);
		panel_3_1.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(630, 318, 197, 19);
		panel_3_1.add(textField_25);
		
		JLabel lblRecomendacion_1_3 = new JLabel("EVALUACION PROMEDIO FINAL:");
		lblRecomendacion_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblRecomendacion_1_3.setForeground(Color.BLACK);
		lblRecomendacion_1_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblRecomendacion_1_3.setBounds(460, 369, 230, 28);
		panel_3_1.add(lblRecomendacion_1_3);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(688, 375, 104, 19);
		panel_3_1.add(textField_26);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("El/la profesor/a");
		lblNewLabel_2_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_1.setBackground(SystemColor.menu);
		lblNewLabel_2_1_1_1_1_1_1_1.setBounds(10, 429, 156, 28);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_2 = new JLabel("seg\u00FAn consta en la Parte II, 2.2.2 del Manual de Facultad y cumple con los criterios de Experiencia y Calidad Docente, Servicio a la ");
		lblNewLabel_2_1_1_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_2.setBackground(SystemColor.menu);
		lblNewLabel_2_1_1_1_1_1_1_2.setBounds(10, 450, 734, 28);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_3 = new JLabel("Instituci\u00F3n y Servicio a la Comunidad, seg\u00FAn descritos en la Parte V, 5.6 y en las Gu\u00EDas para la Evaluaci\u00F3n del Personal Docente,");
		lblNewLabel_2_1_1_1_1_1_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_3.setBackground(SystemColor.menu);
		lblNewLabel_2_1_1_1_1_1_1_3.setBounds(10, 472, 734, 28);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_1_1_3);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_3_1 = new JLabel("correspondientes al rango que solicita.\r");
		lblNewLabel_2_1_1_1_1_1_1_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_3_1.setBackground(SystemColor.menu);
		lblNewLabel_2_1_1_1_1_1_1_3_1.setBounds(10, 498, 283, 19);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_1_1_3_1);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(98, 434, 214, 19);
		panel_3_1.add(textField_27);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1 = new JLabel("cumple con los criterios requeridos para el Rango de Catedr\u00E1tico Auxiliar,");
		lblNewLabel_2_1_1_1_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_1_1.setBackground(SystemColor.menu);
		lblNewLabel_2_1_1_1_1_1_1_1_1.setBounds(322, 429, 422, 28);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_2 = new JLabel("Este comit\u00E9 recomienda en forma");
		lblNewLabel_2_1_1_1_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_1_2.setBackground(SystemColor.menu);
		lblNewLabel_2_1_1_1_1_1_1_1_2.setBounds(10, 527, 197, 28);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_1_1_1_2);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(199, 532, 186, 19);
		panel_3_1.add(textField_28);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1 = new JLabel("que se le otorgue a el/la");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_1_1_1.setBackground(SystemColor.menu);
		lblNewLabel_2_1_1_1_1_1_1_1_1_1.setBounds(395, 527, 197, 28);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_1_1_1_1_1);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(10, 551, 214, 19);
		panel_3_1.add(textField_29);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_2_1 = new JLabel("el ascenso en rango de Catedratico/a Auxiliar a");
		lblNewLabel_2_1_1_1_1_1_1_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_1_2_1.setBackground(SystemColor.menu);
		lblNewLabel_2_1_1_1_1_1_1_1_2_1.setBounds(234, 546, 272, 28);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_1_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1 = new JLabel("Catedratico/a Asociado/a.");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1.setBackground(SystemColor.menu);
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1.setBounds(10, 580, 197, 19);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Miembros del Comite de Evaluacion Sumativa:");
		lblNewLabel_1_5_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_5_1.setBounds(10, 609, 283, 28);
		panel_3_1.add(lblNewLabel_1_5_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 647, 264, 63);
		panel_3_1.add(textArea);
		
		JLabel lblNewLabel_1_5_1_1 = new JLabel("Firma del/a Profesor/a Evaluado/a");
		lblNewLabel_1_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_5_1_1.setBounds(602, 551, 283, 28);
		panel_3_1.add(lblNewLabel_1_5_1_1);
		
		JLabel lblNewLabel_1_5_1_2 = new JLabel("Fecha");
		lblNewLabel_1_5_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_5_1_2.setBounds(710, 609, 69, 28);
		panel_3_1.add(lblNewLabel_1_5_1_2);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(602, 532, 283, 19);
		panel_3_1.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(602, 580, 283, 19);
		panel_3_1.add(textField_31);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(614, 660, 214, 33);
		panel_3_1.add(btnNewButton);
	}
}
