import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

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
		scrollPane.setBounds(10, 73, 702, 150);
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
		table.getColumnModel().getColumn(0).setPreferredWidth(615);
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
		scrollPane_1.setBounds(10, 285, 896, 123);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Arial", Font.PLAIN, 12));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"a. Participaci\u00F3n y aportaci\u00F3n a reuniones de facultad y de comit\u00E9s a nivel de Recinto.", null},
				{"b. Servicio en comit\u00E9s y en organizaciones a nivel institucional", null},
				{"c. Colaboraci\u00F3n en actividades estudiantiles", null},
				{"d. Asistencia a actos oficiales", null},
				{"e. Designaci\u00F3n como director/a de departamento, presidente de comit\u00E9 y otras", null},
				{"f. Participaci\u00F3n en organismos de gobierno; tales como: el Senado y el Consejo Universitario ", null},
			},
			new String[] {
				"Preguntas:", "Puntuaci\u00F3n:"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(616);
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblNewLabel_3 = new JLabel("Servicio a la Comunidad\r\n");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 419, 146, 14);
		contentPane.add(lblNewLabel_3);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 444, 896, 60);
		contentPane.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setFont(new Font("Arial", Font.PLAIN, 12));
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"a. Servicio en el campo profesional del profesor como consultor o investigador", null},
				{"b. Servicio como recurso: conferenciante de grupos de la comunidad, participaci\u00F3n activa en gestiones pol\u00EDticas, religiosas o c\u00EDvicas", null},
			},
			new String[] {
				"Preguntas:", "Puntuaci\u00F3n"
			}
		));
		table_2.getColumnModel().getColumn(0).setPreferredWidth(641);
		scrollPane_2.setViewportView(table_2);
		
		JLabel lblNewLabel_4 = new JLabel("Investigaci\u00F3n y trabajo creativo\r\n");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 515, 174, 14);
		contentPane.add(lblNewLabel_4);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 540, 896, 113);
		contentPane.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{"a. Publicaciones ", null},
				{"b. Presentaciones y trabajos creativos relacionados con la disciplina que ense\u00F1a ", null},
				{"c. Propuestas dise\u00F1adas y presentadas ", null},
				{"d. Concesi\u00F3n de ayudas para investigaci\u00F3n y proyectos ", null},
				{"e. Invenciones, patentes, labor art\u00EDstica y actuaci\u00F3n ", null},
			},
			new String[] {
				"Preguntas:", "Puntuaci\u00F3n"
			}
		));
		table_3.getColumnModel().getColumn(0).setPreferredWidth(609);
		scrollPane_3.setViewportView(table_3);
		
		JButton btnNewButton = new JButton("Continuar\r\n");
		btnNewButton.setBounds(414, 686, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Puntuaci\u00F3n");
		lblNewLabel_5.setBounds(783, 80, 97, 14);
		contentPane.add(lblNewLabel_5);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner.setBounds(722, 96, 30, 20);
		contentPane.add(spinner);
	}
}