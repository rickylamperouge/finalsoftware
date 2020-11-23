import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AutoEvNarrativa extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AutoEvNarrativa frame = new AutoEvNarrativa();
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
	public AutoEvNarrativa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 69, 702, 158);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"a. Dominio de la disciplina que ense\u00F1a"},
				{"b. Habilidad para organizar el contenido y presentarlo en forma clara, l\u00F3gica e imaginativa"},
				{"c. . Conocimiento de los desarrollos actuales de la disciplina "},
				{"d. Habilidad para relacionar la disciplina con otras esferas del conocimiento"},
				{"e. Habilidad para promover y ampliar el inter\u00E9s del estudiante en la disciplina"},
				{"f. Habilidad para desarrollar y utilizar m\u00E9todos y estrategias adecuadas, incluyendo \u201Cassessment\u201D para una ense\u00F1anza efectiva"},
				{"g. Disponibilidad y eficacia en la orientaci\u00F3n acad\u00E9mica del estudiante"},
				{"h. Posesi\u00F3n de los atributos de integridad, laboriosidad, liberalidad y objetividad en la ense\u00F1anza "},
			},
			new String[] {
				"Preguntas:"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(626);
		table.getColumnModel().getColumn(0).setMinWidth(31);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Instrumento II");
		lblNewLabel.setBounds(0, 11, 916, 30);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Calidad Docente:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 52, 134, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Servicio a la instituci\u00F3n ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 260, 128, 14);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 285, 702, 123);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Arial", Font.PLAIN, 12));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"a. Participaci\u00F3n y aportaci\u00F3n a reuniones de facultad y de comit\u00E9s a nivel de Recinto."},
				{"b. Servicio en comit\u00E9s y en organizaciones a nivel institucional"},
				{"c. Colaboraci\u00F3n en actividades estudiantiles"},
				{"d. Asistencia a actos oficiales"},
				{"e. Designaci\u00F3n como director/a de departamento, presidente de comit\u00E9 y otras"},
				{"f. Participaci\u00F3n en organismos de gobierno; tales como: el Senado y el Consejo Universitario "},
			},
			new String[] {
				"Preguntas:"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(616);
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblNewLabel_3 = new JLabel("Servicio a la Comunidad\r\n");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 419, 146, 14);
		contentPane.add(lblNewLabel_3);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 444, 702, 60);
		contentPane.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setFont(new Font("Arial", Font.PLAIN, 12));
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"a. Servicio en el campo profesional del profesor como consultor o investigador"},
				{"b. Servicio como recurso: conferenciante de grupos de la comunidad, participaci\u00F3n activa en gestiones pol\u00EDticas, religiosas o c\u00EDvicas"},
			},
			new String[] {
				"Preguntas:"
			}
		));
		table_2.getColumnModel().getColumn(0).setPreferredWidth(641);
		scrollPane_2.setViewportView(table_2);
		
		JLabel lblNewLabel_4 = new JLabel("Investigaci\u00F3n y trabajo creativo\r\n");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 515, 174, 14);
		contentPane.add(lblNewLabel_4);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 540, 702, 113);
		contentPane.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{"a. Publicaciones "},
				{"b. Presentaciones y trabajos creativos relacionados con la disciplina que ense\u00F1a "},
				{"c. Propuestas dise\u00F1adas y presentadas "},
				{"d. Concesi\u00F3n de ayudas para investigaci\u00F3n y proyectos "},
				{"e. Invenciones, patentes, labor art\u00EDstica y actuaci\u00F3n "},
			},
			new String[] {
				"Preguntas:"
			}
		));
		table_3.getColumnModel().getColumn(0).setPreferredWidth(609);
		scrollPane_3.setViewportView(table_3);
		
		JLabel lblNewLabel_5 = new JLabel("Puntuaci\u00F3n");
		lblNewLabel_5.setBounds(783, 52, 97, 14);
		contentPane.add(lblNewLabel_5);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner.setBounds(722, 73, 30, 20);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner_1.setBounds(722, 93, 30, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner_1_1.setBounds(722, 114, 30, 20);
		contentPane.add(spinner_1_1);
		
		JSpinner spinner_1_1_1 = new JSpinner();
		spinner_1_1_1.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner_1_1_1.setBounds(722, 135, 30, 20);
		contentPane.add(spinner_1_1_1);
		
		JSpinner spinner_1_1_1_1 = new JSpinner();
		spinner_1_1_1_1.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner_1_1_1_1.setBounds(722, 157, 30, 20);
		contentPane.add(spinner_1_1_1_1);
		
		JSpinner spinner_1_1_1_1_1 = new JSpinner();
		spinner_1_1_1_1_1.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner_1_1_1_1_1.setBounds(722, 178, 30, 20);
		contentPane.add(spinner_1_1_1_1_1);
		
		JSpinner spinner_1_1_1_1_2 = new JSpinner();
		spinner_1_1_1_1_2.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner_1_1_1_1_2.setBounds(722, 195, 30, 20);
		contentPane.add(spinner_1_1_1_1_2);
		
		JSpinner spinner_1_1_1_1_3 = new JSpinner();
		spinner_1_1_1_1_3.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner_1_1_1_1_3.setBounds(722, 216, 30, 20);
		contentPane.add(spinner_1_1_1_1_3);
		
		JLabel lblNewLabel_6 = new JLabel("a");
		lblNewLabel_6.setBounds(762, 80, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("b");
		lblNewLabel_6_1.setBounds(762, 96, 46, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("c");
		lblNewLabel_6_1_1.setBounds(762, 117, 46, 14);
		contentPane.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("d");
		lblNewLabel_6_1_1_1.setBounds(762, 138, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_1);
		
		JLabel lblNewLabel_6_1_1_2 = new JLabel("e");
		lblNewLabel_6_1_1_2.setBounds(762, 160, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_2);
		
		JLabel lblNewLabel_6_1_1_3 = new JLabel("f");
		lblNewLabel_6_1_1_3.setBounds(762, 181, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_3);
		
		JLabel lblNewLabel_6_1_1_4 = new JLabel("g");
		lblNewLabel_6_1_1_4.setBounds(762, 198, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_4);
		
		JLabel lblNewLabel_6_1_1_5 = new JLabel("h");
		lblNewLabel_6_1_1_5.setBounds(762, 219, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_5);
		
		JSpinner spinner9 = new JSpinner();
		spinner9.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner9.setBounds(722, 285, 30, 20);
		contentPane.add(spinner9);
		
		JSpinner spinner10 = new JSpinner();
		spinner10.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner10.setBounds(722, 305, 30, 20);
		contentPane.add(spinner10);
		
		JSpinner spinner11 = new JSpinner();
		spinner11.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner11.setBounds(722, 326, 30, 20);
		contentPane.add(spinner11);
		
		JSpinner spinner12 = new JSpinner();
		spinner12.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner12.setBounds(722, 347, 30, 20);
		contentPane.add(spinner12);
		
		JSpinner spinner13 = new JSpinner();
		spinner13.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner13.setBounds(722, 369, 30, 20);
		contentPane.add(spinner13);
		
		JSpinner spinner14 = new JSpinner();
		spinner14.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner14.setBounds(722, 390, 30, 20);
		contentPane.add(spinner14);
		
		JLabel lblNewLabel_6_2 = new JLabel("a");
		lblNewLabel_6_2.setBounds(762, 292, 46, 14);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("b");
		lblNewLabel_6_1_2.setBounds(762, 308, 46, 14);
		contentPane.add(lblNewLabel_6_1_2);
		
		JLabel lblNewLabel_6_1_1_6 = new JLabel("c");
		lblNewLabel_6_1_1_6.setBounds(762, 329, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_6);
		
		JLabel lblNewLabel_6_1_1_1_1 = new JLabel("d");
		lblNewLabel_6_1_1_1_1.setBounds(762, 350, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_1_1);
		
		JLabel lblNewLabel_6_1_1_2_1 = new JLabel("e");
		lblNewLabel_6_1_1_2_1.setBounds(762, 372, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_2_1);
		
		JLabel lblNewLabel_6_1_1_3_1 = new JLabel("f");
		lblNewLabel_6_1_1_3_1.setBounds(762, 393, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_3_1);
	
		
		JSpinner spinner15 = new JSpinner();
		spinner15.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner15.setBounds(722, 464, 30, 20);
		contentPane.add(spinner15);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("a");
		lblNewLabel_6_2_1.setBounds(762, 471, 46, 14);
		contentPane.add(lblNewLabel_6_2_1);
		
		JSpinner spinner16 = new JSpinner();
		spinner16.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner16.setBounds(722, 484, 30, 20);
		contentPane.add(spinner16);
		
		JLabel lblNewLabel_6_1_2_1 = new JLabel("b");
		lblNewLabel_6_1_2_1.setBounds(762, 487, 46, 14);
		contentPane.add(lblNewLabel_6_1_2_1);
		
		JSpinner spinner17 = new JSpinner();
		spinner17.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner17.setBounds(722, 540, 30, 20);
		contentPane.add(spinner17);
		
		JSpinner spinner18 = new JSpinner();
		spinner18.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner18.setBounds(722, 560, 30, 20);
		contentPane.add(spinner18);
		
		JLabel lblNewLabel_6_1_2_2 = new JLabel("b");
		lblNewLabel_6_1_2_2.setBounds(762, 563, 46, 14);
		contentPane.add(lblNewLabel_6_1_2_2);
		
		JLabel lblNewLabel_6_2_2 = new JLabel("a");
		lblNewLabel_6_2_2.setBounds(762, 547, 46, 14);
		contentPane.add(lblNewLabel_6_2_2);
		
		JSpinner spinner19 = new JSpinner();
		spinner19.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner19.setBounds(722, 581, 30, 20);
		contentPane.add(spinner19);
		
		JLabel lblNewLabel_6_1_1_6_1 = new JLabel("c");
		lblNewLabel_6_1_1_6_1.setBounds(762, 584, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_6_1);
		
		JSpinner spinner20 = new JSpinner();
		spinner20.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner20.setBounds(722, 602, 30, 20);
		contentPane.add(spinner20);
		
		JLabel lblNewLabel_6_1_1_1_1_1 = new JLabel("d");
		lblNewLabel_6_1_1_1_1_1.setBounds(762, 605, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_1_1_1);
		
		JSpinner spinner21 = new JSpinner();
		spinner21.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner21.setBounds(722, 624, 30, 20);
		contentPane.add(spinner21);
		
		JLabel lblNewLabel_6_1_1_2_1_1 = new JLabel("e");
		lblNewLabel_6_1_1_2_1_1.setBounds(762, 627, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_2_1_1);
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Calidad Panel
				int calidadA = (int) spinner.getValue();
				System.out.println(calidadA);
				int calidadB = (int) spinner_1.getValue();
				System.out.println(calidadB);
				int calidadC = (int) spinner_1_1.getValue();
				System.out.println(calidadC);
				int calidadD = (int) spinner_1_1_1.getValue();
				System.out.println(calidadD);
				int calidadE = (int) spinner_1_1_1_1.getValue();
				System.out.println(calidadE);
				int calidadF = (int) spinner_1_1_1_1_1.getValue();
				System.out.println(calidadF);
				int calidadG = (int) spinner_1_1_1_1_2.getValue();
				System.out.println(calidadG);
				int calidadH = (int) spinner_1_1_1_1_3.getValue();
				System.out.println(calidadH);
				int totalCalidad = calidadA + calidadB + calidadC + calidadD + calidadE + calidadF + calidadG + calidadH;
				System.out.println(totalCalidad);
				//Servicio panel
				int servicioA = (int) spinner9.getValue();
				System.out.println(servicioA);
				int servicioB = (int) spinner10.getValue();
				System.out.println(servicioB);
				int servicioC = (int) spinner11.getValue();
				System.out.println(servicioC);
				int servicioD = (int) spinner12.getValue();
				System.out.println(servicioD);
				int servicioE = (int) spinner13.getValue();
				System.out.println(servicioE);
				int servicioF = (int) spinner14.getValue();
				System.out.println(servicioF);
				int totalServicio = servicioA + servicioB + servicioC + servicioD + servicioE + calidadF;
				System.out.println(totalServicio);
				//Servicio a la comunidad
				int comunidadA = (int) spinner15.getValue();
				System.out.println(comunidadA);
				int comunidadB = (int) spinner16.getValue();
				System.out.println(comunidadB);
				int totalComunidad = comunidadA + comunidadB;
				System.out.println(totalCalidad);
				//Investigacion Panel
				int investigacionA = (int) spinner16.getValue();
				System.out.println(investigacionA);
				int investigacionB = (int) spinner17.getValue();
				System.out.println(investigacionB);
				int investigacionC = (int) spinner18.getValue();
				System.out.println(investigacionC);
				int investigacionD = (int) spinner19.getValue();
				System.out.println(investigacionD);
				int investigacionE = (int) spinner20.getValue();
				System.out.println(investigacionE);
				int totalInvestigacion = investigacionA + investigacionB + investigacionC + investigacionD + investigacionE;
				System.out.println(totalInvestigacion);
				

				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(397, 690, 89, 23);
		contentPane.add(btnNewButton);
	}
}