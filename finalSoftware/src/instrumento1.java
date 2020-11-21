import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class instrumento1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					instrumento1 frame = new instrumento1();
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
	public instrumento1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Instrumento I");
		lblNewLabel.setBounds(402, 24, 94, 14);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 89, 641, 64);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setRowHeight(20);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1. Indica la regularidad con que hasta ahora has asistido a este curso"},
				{"2. Indica la regularidad con que hasta ahora has asistido a las horas de oficina del profesor"},
			},
			new String[] {
				"Preguntas"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(474);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("Puntuaci\u00F3n");
		lblNewLabel_1.setBounds(747, 96, 78, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Perfil del Estudiante");
		lblNewLabel_2.setBounds(303, 64, 101, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Perfil del Estudiante");
		lblNewLabel_2_1.setBounds(303, 159, 101, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(24, 184, 641, 77);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table.setRowHeight(20);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"3. Al inicio del curso en o antes de las primeras dos reuniones de cada t\u00E9rmino acad\u00E9mico"},
				{"el profesor pone a mi disposici\u00F3n el prontuario, ya sea en forma impresa o digital"},
				{"4. El profesor discute el prontuario al inicio del curso"},
			},
			new String[] {
				"Preguntas"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(470);
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Desarrollo de la Clase");
		lblNewLabel_2_1_1.setBounds(270, 272, 134, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(24, 304, 641, 232);
		contentPane.add(scrollPane_2);
		
		table_2 = new JTable();
		table.setRowHeight(20);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"5. La forma en que se desarrolla la clase me mantiene interesado. "},
				{"6. El profesor demuestra conocer el material de la clase. "},
				{"7. El profesor me hace pensar y reflexionar sobre los temas del curso"},
				{"8. La forma en que el profesor ense\u00F1a el contenido del curso ha aumentado mi entendimiento de esta materia."},
				{"9. Hasta el presente, se han logrado los objetivos del curso conforme al prontuario."},
				{"10. El profesor utiliza diversas formas o maneras de ense\u00F1anza para presentar el contenido del curso. "},
				{"11. El profesor utiliza materiales educativos relacionados con el contenido del curso. "},
				{"12. Cuando es oportuno, el profesor enriquece la clase con recursos tecnol\u00F3gicos y audiovisuales. "},
				{"13. El profesor escucha y discute con respeto los planteamientos de los estudiantes."},
				{"14. El profesor toma medidas para asegurarse que yo entienda el contenido del curso. "},
				{"15. El profesor relaciona las ideas y temas presentados en el curso con situaciones del diario vivir. "},
				{"16. El profesor promueve la participaci\u00F3n de los estudiantes. "},
				{"17. El profesor muestra inter\u00E9s por el aprovechamiento acad\u00E9mico de los estudiantes. "},
			},
			new String[] {
				"Preguntas"
			}
		));
		table_2.getColumnModel().getColumn(0).setPreferredWidth(566);
		scrollPane_2.setViewportView(table_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(675, 110, 30, 20);
		contentPane.add(spinner);
		
		JLabel lblNewLabel_6 = new JLabel("1");
		lblNewLabel_6.setBounds(715, 117, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JSpinner spinner2 = new JSpinner();
		spinner2.setBounds(675, 127, 30, 20);
		contentPane.add(spinner2);
		
		JLabel lblNewLabel_6_1 = new JLabel("2");
		lblNewLabel_6_1.setBounds(715, 134, 46, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(675, 223, 30, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner2_1 = new JSpinner();
		spinner2_1.setBounds(675, 240, 30, 20);
		contentPane.add(spinner2_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("3");
		lblNewLabel_6_2.setBounds(715, 230, 46, 14);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("4");
		lblNewLabel_6_1_1.setBounds(715, 247, 46, 14);
		contentPane.add(lblNewLabel_6_1_1);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setBounds(675, 308, 30, 20);
		contentPane.add(spinner_1_1);
		
		JSpinner spinner2_1_1 = new JSpinner();
		spinner2_1_1.setBounds(675, 325, 30, 20);
		contentPane.add(spinner2_1_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("5");
		lblNewLabel_6_2_1.setBounds(715, 315, 46, 14);
		contentPane.add(lblNewLabel_6_2_1);
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("6");
		lblNewLabel_6_1_1_1.setBounds(715, 332, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_1);
		
		JSpinner spinner_1_1_1 = new JSpinner();
		spinner_1_1_1.setBounds(675, 347, 30, 20);
		contentPane.add(spinner_1_1_1);
		
		JSpinner spinner2_1_1_1 = new JSpinner();
		spinner2_1_1_1.setBounds(675, 364, 30, 20);
		contentPane.add(spinner2_1_1_1);
		
		JLabel lblNewLabel_6_2_1_1 = new JLabel("7");
		lblNewLabel_6_2_1_1.setBounds(715, 354, 46, 14);
		contentPane.add(lblNewLabel_6_2_1_1);
		
		JLabel lblNewLabel_6_1_1_1_1 = new JLabel("8");
		lblNewLabel_6_1_1_1_1.setBounds(715, 371, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_1_1);
		
		JSpinner spinner_1_1_2 = new JSpinner();
		spinner_1_1_2.setBounds(675, 387, 30, 20);
		contentPane.add(spinner_1_1_2);
		
		JSpinner spinner2_1_1_2 = new JSpinner();
		spinner2_1_1_2.setBounds(675, 404, 30, 20);
		contentPane.add(spinner2_1_1_2);
		
		JLabel lblNewLabel_6_2_1_2 = new JLabel("9");
		lblNewLabel_6_2_1_2.setBounds(715, 394, 46, 14);
		contentPane.add(lblNewLabel_6_2_1_2);
		
		JLabel lblNewLabel_6_1_1_1_2 = new JLabel("10");
		lblNewLabel_6_1_1_1_2.setBounds(715, 411, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_1_2);
		
		JSpinner spinner_1_1_3 = new JSpinner();
		spinner_1_1_3.setBounds(675, 428, 30, 20);
		contentPane.add(spinner_1_1_3);
		
		JSpinner spinner2_1_1_3 = new JSpinner();
		spinner2_1_1_3.setBounds(675, 445, 30, 20);
		contentPane.add(spinner2_1_1_3);
		
		JLabel lblNewLabel_6_2_1_3 = new JLabel("11");
		lblNewLabel_6_2_1_3.setBounds(715, 435, 46, 14);
		contentPane.add(lblNewLabel_6_2_1_3);
		
		JLabel lblNewLabel_6_1_1_1_3 = new JLabel("12");
		lblNewLabel_6_1_1_1_3.setBounds(715, 452, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_1_3);
		
		JSpinner spinner_1_1_4 = new JSpinner();
		spinner_1_1_4.setBounds(675, 469, 30, 20);
		contentPane.add(spinner_1_1_4);
		
		JSpinner spinner2_1_1_4 = new JSpinner();
		spinner2_1_1_4.setBounds(675, 486, 30, 20);
		contentPane.add(spinner2_1_1_4);
		
		JLabel lblNewLabel_6_2_1_4 = new JLabel("13");
		lblNewLabel_6_2_1_4.setBounds(715, 476, 46, 14);
		contentPane.add(lblNewLabel_6_2_1_4);
		
		JLabel lblNewLabel_6_1_1_1_4 = new JLabel("14");
		lblNewLabel_6_1_1_1_4.setBounds(715, 493, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_1_4);
		
		JSpinner spinner_1_1_4_1 = new JSpinner();
		spinner_1_1_4_1.setBounds(675, 506, 30, 20);
		contentPane.add(spinner_1_1_4_1);
		
		JSpinner spinner2_1_1_4_1 = new JSpinner();
		spinner2_1_1_4_1.setBounds(675, 523, 30, 20);
		contentPane.add(spinner2_1_1_4_1);
		
		JLabel lblNewLabel_6_2_1_4_1 = new JLabel("15");
		lblNewLabel_6_2_1_4_1.setBounds(715, 513, 46, 14);
		contentPane.add(lblNewLabel_6_2_1_4_1);
		
		JLabel lblNewLabel_6_1_1_1_4_1 = new JLabel("16");
		lblNewLabel_6_1_1_1_4_1.setBounds(715, 530, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_1_4_1);
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.setBounds(402, 632, 89, 23);
		contentPane.add(btnNewButton);
	}
}
