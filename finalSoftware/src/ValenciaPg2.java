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

public class ValenciaPg2 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValenciaPg2 frame = new ValenciaPg2();
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
	public ValenciaPg2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VALENCIAS CATEDR\u00C1TICAS");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 914, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("V. Crecimiento y Desarrollo Profesional ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 36, 234, 14);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 61, 894, 122);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"a. Obtenci\u00F3n de premios, ayudas y becas. ", null},
				{"b. Nombramiento como asesor/a en agencias de gobierno estatal o federal.", null},
				{"c. Participaci\u00F3n activa en organizaciones profesionales.", null},
				{"d. Recurso en conferencia y charlas. ", null},
				{"e. Participaci\u00F3n en conferencias, congresos o institutos.", null},
				{"f. Educaci\u00F3n post doctoral, educaci\u00F3n continua.", null},
			},
			new String[] {
				"Preguntas:", "Puntuaci\u00F3n:"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(657);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_2 = new JLabel("RECOMENDACIONES");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 194, 124, 14);
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 219, 894, 122);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"I. Experiencia y Calidad Docente", null},
				{"II. Servicio a la Instituci\u00F3n ", null},
				{"III. Servicio a la Comunidad", null},
				{"IV. Investigaci\u00F3n y Trabajo Creativo", null},
				{"V. Crecimiento y Desarrollo Profesional", null},
				{"EVALUACION PROMEDIO FINAL:", null},
			},
			new String[] {
				"Criterios:", "Puntuacion:"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(495);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(114);
		scrollPane_1.setViewportView(table_1);
		
		JButton btnNewButton = new JButton("FINALIZAR\r\n");
		btnNewButton.setBounds(425, 714, 89, 23);
		contentPane.add(btnNewButton);
	}

}

