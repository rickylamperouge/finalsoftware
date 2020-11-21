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

public class instrumento1pag2 extends JFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					instrumento1pag2 frame = new instrumento1pag2();
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
	public instrumento1pag2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 820);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Instrumento I");
		lblNewLabel.setBounds(417, 25, 145, 14);
		getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 94, 668, 250);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
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
		table.getColumnModel().getColumn(0).setPreferredWidth(566);
		scrollPane.setViewportView(table);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(693, 122, 30, 20);
		getContentPane().add(spinner);
		
		JLabel lblNewLabel_6 = new JLabel("18");
		lblNewLabel_6.setBounds(733, 129, 46, 14);
		getContentPane().add(lblNewLabel_6);
		
		JSpinner spinner2 = new JSpinner();
		spinner2.setBounds(693, 139, 30, 20);
		getContentPane().add(spinner2);
		
		JLabel lblNewLabel_6_1 = new JLabel("19");
		lblNewLabel_6_1.setBounds(733, 146, 46, 14);
		getContentPane().add(lblNewLabel_6_1);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(693, 153, 30, 20);
		getContentPane().add(spinner_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("20");
		lblNewLabel_6_2.setBounds(733, 160, 46, 14);
		getContentPane().add(lblNewLabel_6_2);
		
		JSpinner spinner2_1 = new JSpinner();
		spinner2_1.setBounds(693, 170, 30, 20);
		getContentPane().add(spinner2_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("21");
		lblNewLabel_6_1_1.setBounds(733, 177, 46, 14);
		getContentPane().add(lblNewLabel_6_1_1);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setBounds(693, 184, 30, 20);
		getContentPane().add(spinner_1_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("22");
		lblNewLabel_6_2_1.setBounds(733, 191, 46, 14);
		getContentPane().add(lblNewLabel_6_2_1);
		
		JSpinner spinner2_1_1 = new JSpinner();
		spinner2_1_1.setBounds(693, 201, 30, 20);
		getContentPane().add(spinner2_1_1);
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("23");
		lblNewLabel_6_1_1_1.setBounds(733, 208, 46, 14);
		getContentPane().add(lblNewLabel_6_1_1_1);
		
		JSpinner spinner_1_1_1 = new JSpinner();
		spinner_1_1_1.setBounds(693, 223, 30, 20);
		getContentPane().add(spinner_1_1_1);
		
		JLabel lblNewLabel_6_2_1_1 = new JLabel("24");
		lblNewLabel_6_2_1_1.setBounds(733, 230, 46, 14);
		getContentPane().add(lblNewLabel_6_2_1_1);
		
		JSpinner spinner2_1_1_1 = new JSpinner();
		spinner2_1_1_1.setBounds(693, 240, 30, 20);
		getContentPane().add(spinner2_1_1_1);
		
		JLabel lblNewLabel_6_1_1_1_1 = new JLabel("25");
		lblNewLabel_6_1_1_1_1.setBounds(733, 247, 46, 14);
		getContentPane().add(lblNewLabel_6_1_1_1_1);
		
		JSpinner spinner_1_1_2 = new JSpinner();
		spinner_1_1_2.setBounds(693, 263, 30, 20);
		getContentPane().add(spinner_1_1_2);
		
		JLabel lblNewLabel_6_2_1_2 = new JLabel("26");
		lblNewLabel_6_2_1_2.setBounds(733, 270, 46, 14);
		getContentPane().add(lblNewLabel_6_2_1_2);
		
		JSpinner spinner2_1_1_2 = new JSpinner();
		spinner2_1_1_2.setBounds(693, 280, 30, 20);
		getContentPane().add(spinner2_1_1_2);
		
		JLabel lblNewLabel_6_1_1_1_2 = new JLabel("27");
		lblNewLabel_6_1_1_1_2.setBounds(733, 287, 46, 14);
		getContentPane().add(lblNewLabel_6_1_1_1_2);
		
		JSpinner spinner_1_1_3 = new JSpinner();
		spinner_1_1_3.setBounds(693, 304, 30, 20);
		getContentPane().add(spinner_1_1_3);
		
		JLabel lblNewLabel_6_2_1_3 = new JLabel("28");
		lblNewLabel_6_2_1_3.setBounds(733, 311, 46, 14);
		getContentPane().add(lblNewLabel_6_2_1_3);
		
		JSpinner spinner_1_1_3_1 = new JSpinner();
		spinner_1_1_3_1.setBounds(693, 323, 30, 20);
		getContentPane().add(spinner_1_1_3_1);
		
		JLabel lblNewLabel_6_2_1_3_1 = new JLabel("29");
		lblNewLabel_6_2_1_3_1.setBounds(733, 330, 46, 14);
		getContentPane().add(lblNewLabel_6_2_1_3_1);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.setBounds(401, 708, 89, 23);
		getContentPane().add(btnNewButton);
	}

}
