import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class Valencia extends JFrame {

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
					Valencia frame = new Valencia();
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
	public Valencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VALENCIAS CATEDR\u00C1TICAS");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 914, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("I. Experiencia y Calidad Docente");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 36, 210, 14);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 78, 894, 138);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"a. Dominio de la disciplina que ense\u00F1a.", null},
				{"b. Habilidad para organizar el contenido y presentarlo en forma clara, l\u00F3gica e imaginativa.", null},
				{"c. Conocimiento de los desarrollos actuales de la disciplina. ", null},
				{"d. Habilidad para relacionar la disciplina con otras esferas del conocimiento.", null},
				{"e. Habilidad para promover y ampliar el inter\u00E9s del estudiante en la disciplina. ", null},
				{"f. Habilidad para desarrollar y utilizar m\u00E9todos y estrategias adecuadas, incluyendo el \u201Cassessment\u201D para una ense\u00F1anza efectiva.", null},
				{"h. Posesi\u00F3n de los atributos de integridad, laboriosidad, 8 liberalidad y objetividad en la ense\u00F1anza ", null},
			},
			new String[] {
				"Preguntas:", "Puntuaci\u00F3n:"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(642);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_2 = new JLabel("II. Servicio a la Instituci\u00F3n ");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 227, 150, 14);
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 252, 894, 138);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"a. Trabajo en comit\u00E9s de facultad a nivel departamental.", null},
				{"b. Participaci\u00F3n y aportaci\u00F3n a reuniones de facultad y de comit\u00E9s a nivel de Recinto.", null},
				{"c. Servicio en comit\u00E9s y en organizaciones a nivel 3 institucional.", null},
				{"d. Colaboraci\u00F3n en actividades estudiantiles. ", null},
				{"e. Asistencia a actos oficiales.", null},
				{"f. Designaci\u00F3n como director/a de departamento, presidente de comit\u00E9 y otras.", null},
				{"g. Participaci\u00F3n en organismos de gobierno; tales como: el 2 Senado y el Consejo Universitario. ", null},
			},
			new String[] {
				"Preguntas:", "Puntuaci\u00F3n:"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(627);
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblNewLabel_3 = new JLabel("III. Servicio a la Comunidad \r\n");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 401, 176, 14);
		contentPane.add(lblNewLabel_3);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 426, 894, 58);
		contentPane.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"a. Publicaciones", null},
				{"b. Presentaciones y trabajos creativos relacionados con la disciplina que ense\u00F1a.", null},
			},
			new String[] {
				"Preguntas:", "Puntuaci\u00F3n:"
			}
		));
		table_2.getColumnModel().getColumn(0).setPreferredWidth(642);
		scrollPane_2.setViewportView(table_2);
		
		JLabel lblNewLabel_4 = new JLabel("IV. Investigaci\u00F3n y Trabajo Creativo ");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 495, 210, 14);
		contentPane.add(lblNewLabel_4);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 520, 894, 108);
		contentPane.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{"a. Publicaciones ", null},
				{"b. Presentaciones y trabajos creativos relacionados con la disciplina que ense\u00F1a.", null},
				{"c. Propuestas dise\u00F1adas y presentadas.", null},
				{"d. Concesi\u00F3n de ayudas para investigaci\u00F3n y proyectos.", null},
				{"e. Invenciones, patentes, labor art\u00EDstica y actuaci\u00F3n.", null},
			},
			new String[] {
				"Preguntas:", "Puntuaci\u00F3n:"
			}
		));
		table_3.getColumnModel().getColumn(0).setPreferredWidth(622);
		scrollPane_3.setViewportView(table_3);
		
		JButton btnNewButton = new JButton("Continuar\r\n");
		btnNewButton.setBounds(411, 660, 89, 23);
		contentPane.add(btnNewButton);
	}
}