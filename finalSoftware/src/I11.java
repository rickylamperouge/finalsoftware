import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class I11 extends menu1 {

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
					I11 frame = new I11();
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
	public I11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Pagina 1", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBounds(0, 0, 916, 781);
		panel_1.add(contentPane);
		
		JLabel lblNewLabel = new JLabel("Instrumento I");
		lblNewLabel.setBounds(305, 11, 94, 14);
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
		
		JLabel lblNewLabel_2 = new JLabel("1 - Casi\r\n");
		lblNewLabel_2.setBounds(320, 60, 101, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Perfil del Estudiante");
		lblNewLabel_2_1.setBounds(294, 36, 163, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(24, 235, 641, 77);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
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
		lblNewLabel_2_1_1.setBounds(303, 323, 134, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(24, 383, 641, 239);
		contentPane.add(scrollPane_2);
		
		table_2 = new JTable();
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
		spinner.setModel(new SpinnerNumberModel(1, 1, 4, 1));
		spinner.setBounds(675, 110, 30, 20);
		contentPane.add(spinner);
		
		JLabel lblNewLabel_6 = new JLabel("1");
		lblNewLabel_6.setBounds(715, 117, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JSpinner spinner2 = new JSpinner();
		spinner2.setModel(new SpinnerNumberModel(1, 1, 4, 1));
		spinner2.setBounds(675, 127, 30, 20);
		contentPane.add(spinner2);
		
		JLabel lblNewLabel_6_1 = new JLabel("2");
		lblNewLabel_6_1.setBounds(715, 134, 46, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JSpinner spinner3 = new JSpinner();
		spinner3.setModel(new SpinnerNumberModel(1, 1, 3, 1));
		spinner3.setBounds(675, 274, 30, 20);
		contentPane.add(spinner3);
		
		JSpinner spinner4 = new JSpinner();
		spinner4.setModel(new SpinnerNumberModel(1, 1, 3, 1));
		spinner4.setBounds(675, 291, 30, 20);
		contentPane.add(spinner4);
		
		JLabel lblNewLabel_6_2 = new JLabel("3");
		lblNewLabel_6_2.setBounds(715, 281, 46, 14);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("4");
		lblNewLabel_6_1_1.setBounds(715, 298, 46, 14);
		contentPane.add(lblNewLabel_6_1_1);
		
		JSpinner spinner5 = new JSpinner();
		spinner5.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner5.setBounds(675, 386, 30, 20);
		contentPane.add(spinner5);
		
		JSpinner spinner6 = new JSpinner();
		spinner6.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner6.setBounds(675, 403, 30, 20);
		contentPane.add(spinner6);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("5");
		lblNewLabel_6_2_1.setBounds(715, 393, 46, 14);
		contentPane.add(lblNewLabel_6_2_1);
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("6");
		lblNewLabel_6_1_1_1.setBounds(715, 410, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_1);
		
		JSpinner spinner7 = new JSpinner();
		spinner7.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner7.setBounds(675, 425, 30, 20);
		contentPane.add(spinner7);
		
		JSpinner spinner8 = new JSpinner();
		spinner8.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner8.setBounds(675, 442, 30, 20);
		contentPane.add(spinner8);
		
		JLabel lblNewLabel_6_2_1_1 = new JLabel("7");
		lblNewLabel_6_2_1_1.setBounds(715, 432, 46, 14);
		contentPane.add(lblNewLabel_6_2_1_1);
		
		JLabel lblNewLabel_6_1_1_1_1 = new JLabel("8");
		lblNewLabel_6_1_1_1_1.setBounds(715, 449, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_1_1);
		
		JSpinner spinner9 = new JSpinner();
		spinner9.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner9.setBounds(675, 465, 30, 20);
		contentPane.add(spinner9);
		
		JSpinner spinner10 = new JSpinner();
		spinner10.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner10.setBounds(675, 482, 30, 20);
		contentPane.add(spinner10);
		
		JLabel lblNewLabel_6_2_1_2 = new JLabel("9");
		lblNewLabel_6_2_1_2.setBounds(715, 472, 46, 14);
		contentPane.add(lblNewLabel_6_2_1_2);
		
		JLabel lblNewLabel_6_1_1_1_2 = new JLabel("10");
		lblNewLabel_6_1_1_1_2.setBounds(715, 489, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_1_2);
		
		JSpinner spinner11 = new JSpinner();
		spinner11.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner11.setBounds(675, 506, 30, 20);
		contentPane.add(spinner11);
		
		JSpinner spinner12 = new JSpinner();
		spinner12.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner12.setBounds(675, 523, 30, 20);
		contentPane.add(spinner12);
		
		JLabel lblNewLabel_6_2_1_3 = new JLabel("11");
		lblNewLabel_6_2_1_3.setBounds(715, 513, 46, 14);
		contentPane.add(lblNewLabel_6_2_1_3);
		
		JLabel lblNewLabel_6_1_1_1_3 = new JLabel("12");
		lblNewLabel_6_1_1_1_3.setBounds(715, 530, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_1_3);
		
		JSpinner spinner13 = new JSpinner();
		spinner13.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner13.setBounds(675, 547, 30, 20);
		contentPane.add(spinner13);
		
		JSpinner spinner14 = new JSpinner();
		spinner14.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner14.setBounds(675, 564, 30, 20);
		contentPane.add(spinner14);
		
		JLabel lblNewLabel_6_2_1_4 = new JLabel("13");
		lblNewLabel_6_2_1_4.setBounds(715, 554, 46, 14);
		contentPane.add(lblNewLabel_6_2_1_4);
		
		JLabel lblNewLabel_6_1_1_1_4 = new JLabel("14");
		lblNewLabel_6_1_1_1_4.setBounds(715, 571, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_1_4);
		
		JSpinner spinner15 = new JSpinner();
		spinner15.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner15.setBounds(675, 584, 30, 20);
		contentPane.add(spinner15);
		
		JSpinner spinner16 = new JSpinner();
		spinner16.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner16.setBounds(675, 601, 30, 20);
		contentPane.add(spinner16);
		
		JLabel lblNewLabel_6_2_1_4_1 = new JLabel("15");
		lblNewLabel_6_2_1_4_1.setBounds(715, 591, 46, 14);
		contentPane.add(lblNewLabel_6_2_1_4_1);
		
		JLabel lblNewLabel_6_1_1_1_4_1 = new JLabel("16");
		lblNewLabel_6_1_1_1_4_1.setBounds(715, 608, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_1_4_1);
		
		JLabel lblNewLabel_9 = new JLabel("4 - Siempre");
		lblNewLabel_9.setBounds(24, 60, 78, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("3 - Casi siempre");
		lblNewLabel_9_1.setBounds(112, 60, 94, 14);
		contentPane.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("2 - Ocasionalmente\r\n");
		lblNewLabel_9_1_1.setBounds(216, 60, 94, 14);
		contentPane.add(lblNewLabel_9_1_1);
		
		JLabel lblNewLabel_9_2 = new JLabel("3 - Lo hizo");
		lblNewLabel_9_2.setBounds(24, 210, 78, 14);
		contentPane.add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_9_1_2 = new JLabel("2 - No lo hizo");
		lblNewLabel_9_1_2.setBounds(112, 210, 94, 14);
		contentPane.add(lblNewLabel_9_1_2);
		
		JLabel lblNewLabel_9_1_1_1 = new JLabel("1 - Desconozco porque no estuve al inicio del curso\r\n");
		lblNewLabel_9_1_1_1.setBounds(216, 210, 280, 14);
		contentPane.add(lblNewLabel_9_1_1_1);
		
		JLabel lblNewLabel_8_1_1_1_1 = new JLabel("-1 - No aplica");
		lblNewLabel_8_1_1_1_1.setBounds(34, 392, 239, 14);
		contentPane.add(lblNewLabel_8_1_1_1_1);
		
		JLabel lblNewLabel_8_1_1_2 = new JLabel("1 - Totalmente en desacuerdo (no)");
		lblNewLabel_8_1_1_2.setBounds(677, 358, 239, 14);
		contentPane.add(lblNewLabel_8_1_1_2);
		
		JLabel lblNewLabel_8_1_2 = new JLabel("2 - Parcialmente en descauerdo (mayormente no)");
		lblNewLabel_8_1_2.setBounds(426, 358, 239, 14);
		contentPane.add(lblNewLabel_8_1_2);
		
		JLabel lblNewLabel_8_2 = new JLabel("3 - Parcialmente de acuerdo (mayormente si)");
		lblNewLabel_8_2.setBounds(192, 358, 239, 14);
		contentPane.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_7_1 = new JLabel("4 - Totalmente de acuerdo (si)");
		lblNewLabel_7_1.setBounds(24, 358, 207, 14);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Prontuario del curso\r\n");
		lblNewLabel_2_1_2.setBounds(294, 177, 163, 14);
		contentPane.add(lblNewLabel_2_1_2);
		
		JSpinner spinner17 = new JSpinner();
		spinner17.setBounds(675, 622, 30, 20);
		contentPane.add(spinner17);
		
		JLabel label17 = new JLabel("17\r\n");
		label17.setBounds(715, 629, 46, 14);
		contentPane.add(label17);
		
		JPanel spinner29 = new JPanel();
		tabbedPane.addTab("Pagina 2", null, spinner29, null);
		spinner29.setLayout(null);
		
		JSpinner spinner18 = new JSpinner();
		spinner18.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner18.setBounds(705, 274, 30, 20);
		spinner29.add(spinner18);
		
		JLabel lblNewLabel_6_3 = new JLabel("18");
		lblNewLabel_6_3.setBounds(745, 281, 46, 14);
		spinner29.add(lblNewLabel_6_3);
		
		JSpinner spinner19 = new JSpinner();
		spinner19.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner19.setBounds(705, 291, 30, 20);
		spinner29.add(spinner19);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("19");
		lblNewLabel_6_1_2.setBounds(745, 298, 46, 14);
		spinner29.add(lblNewLabel_6_1_2);
		
		JSpinner spinner20 = new JSpinner();
		spinner20.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner20.setBounds(705, 305, 30, 20);
		spinner29.add(spinner20);
		
		JLabel lblNewLabel_6_2_2 = new JLabel("20");
		lblNewLabel_6_2_2.setBounds(745, 312, 46, 14);
		spinner29.add(lblNewLabel_6_2_2);
		
		JSpinner spinner21 = new JSpinner();
		spinner21.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner21.setBounds(705, 322, 30, 20);
		spinner29.add(spinner21);
		
		JLabel lblNewLabel_6_1_1_2 = new JLabel("21");
		lblNewLabel_6_1_1_2.setBounds(745, 329, 46, 14);
		spinner29.add(lblNewLabel_6_1_1_2);
		
		JSpinner spinner22 = new JSpinner();
		spinner22.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner22.setBounds(705, 336, 30, 20);
		spinner29.add(spinner22);
		
		JLabel lblNewLabel_6_2_1_5 = new JLabel("22");
		lblNewLabel_6_2_1_5.setBounds(745, 343, 46, 14);
		spinner29.add(lblNewLabel_6_2_1_5);
		
		JSpinner spinner23 = new JSpinner();
		spinner23.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner23.setBounds(705, 353, 30, 20);
		spinner29.add(spinner23);
		
		JLabel lblNewLabel_6_1_1_1_5 = new JLabel("23");
		lblNewLabel_6_1_1_1_5.setBounds(745, 360, 46, 14);
		spinner29.add(lblNewLabel_6_1_1_1_5);
		
		JSpinner spinner24 = new JSpinner();
		spinner24.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner24.setBounds(705, 375, 30, 20);
		spinner29.add(spinner24);
		
		JLabel lblNewLabel_6_2_1_1_1 = new JLabel("24");
		lblNewLabel_6_2_1_1_1.setBounds(745, 382, 46, 14);
		spinner29.add(lblNewLabel_6_2_1_1_1);
		
		JSpinner spinner25 = new JSpinner();
		spinner25.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner25.setBounds(705, 392, 30, 20);
		spinner29.add(spinner25);
		
		JLabel lblNewLabel_6_1_1_1_1_1 = new JLabel("25");
		lblNewLabel_6_1_1_1_1_1.setBounds(745, 399, 46, 14);
		spinner29.add(lblNewLabel_6_1_1_1_1_1);
		
		JSpinner spinner26 = new JSpinner();
		spinner26.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner26.setBounds(705, 415, 30, 20);
		spinner29.add(spinner26);
		
		JLabel lblNewLabel_6_2_1_2_1 = new JLabel("26");
		lblNewLabel_6_2_1_2_1.setBounds(745, 422, 46, 14);
		spinner29.add(lblNewLabel_6_2_1_2_1);
		
		JSpinner spinner27 = new JSpinner();
		spinner27.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner27.setBounds(705, 432, 30, 20);
		spinner29.add(spinner27);
		
		JLabel lblNewLabel_6_1_1_1_2_1 = new JLabel("27");
		lblNewLabel_6_1_1_1_2_1.setBounds(745, 439, 46, 14);
		spinner29.add(lblNewLabel_6_1_1_1_2_1);
		
		JSpinner spinner28 = new JSpinner();
		spinner28.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner28.setBounds(705, 456, 30, 20);
		spinner29.add(spinner28);
		
		JLabel lblNewLabel_6_2_1_3_1 = new JLabel("28");
		lblNewLabel_6_2_1_3_1.setBounds(745, 463, 46, 14);
		spinner29.add(lblNewLabel_6_2_1_3_1);
		
		JSpinner spinner_1_1_3_1_1 = new JSpinner();
		spinner_1_1_3_1_1.setModel(new SpinnerNumberModel(0, -1, 4, 1));
		spinner_1_1_3_1_1.setBounds(705, 475, 30, 20);
		spinner29.add(spinner_1_1_3_1_1);
		
		JLabel lblNewLabel_6_2_1_3_1_1 = new JLabel("29");
		lblNewLabel_6_2_1_3_1_1.setBounds(745, 482, 46, 14);
		spinner29.add(lblNewLabel_6_2_1_3_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Instrumento I");
		lblNewLabel_3.setBounds(432, 11, 145, 14);
		spinner29.add(lblNewLabel_3);
		

		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(90, 245, 605, 256);
		spinner29.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
				new Object[][] {
					{"18. El profesor presenta la clase en forma organizada y coherente."},
					{"19. El profesor explica el material con claridad."},
					{"20. El profesor cumple con el horario de clase."},
					{"21. El profesor explica claramente c\u00F3mo los estudiantes ser\u00E1n evaluados conforme al prontuario."},
					{"22. Los ex\u00E1menes y trabajos responden al contenido del curso. "},
					{"23. El profesor utiliza diversos m\u00E9todos para evaluar el aprendizaje."},
					{"24. El profesor corrige los ex\u00E1menes y trabajos, seg\u00FAn los criterios establecidos en el prontuario."},
					{"25. El profesor hace recomendaciones sobre los trabajos que presentan los estudiantes. "},
					{"26. El profesor informa los resultados de los ex\u00E1menes y trabajos "},
					{"corregidos, preferiblemente en o antes de dos semanas. "},
					{"27. El profesor discute los resultados de las evaluaciones con los estudiantes."},
					{"28. El profesor exhorta a los estudiantes a comunicarse con \u00E9l, en caso de que "},
					{"surjan dudas relacionadas con los temas del curso y sus evaluaciones."},
					{"29. El profesor provee la oportunidad de reunirse con \u00E9l en sus horas de oficina. "},
				},
				new String[] {
					"Preguntas"
				}
			));
		scrollPane_3.setViewportView(table_3);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("Gerencia del proceso de ense\u00F1anza aprendizaje");
		lblNewLabel_4.setBounds(153, 78, 432, 14);
		spinner29.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Clave:");
		lblNewLabel_5.setBounds(153, 111, 46, 14);
		spinner29.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("4 - Totalmente de acuerdo (si)");
		lblNewLabel_7.setBounds(153, 145, 207, 14);
		spinner29.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("3 - Parcialmente de acuerdo (mayormente si)");
		lblNewLabel_8.setBounds(153, 163, 239, 14);
		spinner29.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("2 - Parcialmente en descauerdo (mayormente no)");
		lblNewLabel_8_1.setBounds(153, 177, 239, 14);
		spinner29.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("1 - Totalmente en desacuerdo (no)");
		lblNewLabel_8_1_1.setBounds(153, 193, 239, 14);
		spinner29.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_8_1_1_1 = new JLabel("-1 - No aplica");
		lblNewLabel_8_1_1_1.setBounds(149, 209, 239, 14);
		spinner29.add(lblNewLabel_8_1_1_1);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//perfilEstudiante
				int[] instrumentoI;
				instrumentoI = new int[30];
				 instrumentoI[0] = (int) spinner.getValue();
				 instrumentoI[1] = (int) spinner2.getValue();
				//prontuario del curso
				 instrumentoI[2] = (int) spinner3.getValue();
				 instrumentoI[3] = (int) spinner4.getValue();
				//Desarrollo de la clase
				 instrumentoI[4] = (int) spinner5.getValue();
				 instrumentoI[5] = (int) spinner6.getValue();
				 instrumentoI[6] = (int) spinner7.getValue();
				 instrumentoI[7] = (int) spinner8.getValue();
				 instrumentoI[8] = (int) spinner9.getValue();
				 instrumentoI[9] = (int) spinner10.getValue();
				 instrumentoI[10] = (int) spinner11.getValue();
				 instrumentoI[11] = (int) spinner12.getValue();
				 instrumentoI[12] = (int) spinner13.getValue();
				 instrumentoI[13] = (int) spinner14.getValue();
				 instrumentoI[14] = (int) spinner15.getValue();
				 instrumentoI[15] = (int) spinner16.getValue();
				 instrumentoI[16] = (int) spinner17.getValue();
				 //Gerencia del proceso de enseñanza
				 instrumentoI[17] = (int) spinner18.getValue();
				 instrumentoI[18] = (int) spinner19.getValue();
				 instrumentoI[19] = (int) spinner20.getValue();
				 instrumentoI[20] = (int) spinner21.getValue();
				 instrumentoI[21] = (int) spinner22.getValue();
				 instrumentoI[22] = (int) spinner23.getValue();
				 instrumentoI[23] = (int) spinner24.getValue();
				 instrumentoI[24] = (int) spinner25.getValue();
				 instrumentoI[25] = (int) spinner26.getValue();
				 instrumentoI[26] = (int) spinner27.getValue();
				 instrumentoI[27] = (int) spinner28.getValue();
				 instrumentoI[28] = (int) spinner_1_1_3_1_1.getValue();
				
				for(int i = 0; i < 23;i++)
				{
					totalI = instrumentoI[i] + totalI;
				}
				System.out.println(totalI);
				dispose();
				
				
				
			}
		});
		btnNewButton.setBounds(373, 662, 89, 23);
		spinner29.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new menu1().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(508, 662, 136, 23);
		spinner29.add(btnNewButton_1);
	}
}
