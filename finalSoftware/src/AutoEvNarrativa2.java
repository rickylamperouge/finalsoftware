import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AutoEvNarrativa2 {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void Page2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AutoEvNarrativa2 window = new AutoEvNarrativa2();
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
	public AutoEvNarrativa2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 932, 820);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Autoevaluaci\u00F3n Narrativa");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 916, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Crecimiento y Desarrollo Profesional");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 36, 209, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 56, 896, 126);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"a. Obtenci\u00F3n de premios, ayudas y becas "},
				{"b. Nombramiento como asesor/a en agencias del gobierno estatal o federal"},
				{"c. Participaci\u00F3n activa en organizaciones profesionales "},
				{"d. Recurso en conferencias y charlas"},
				{"e. Participaci\u00F3n en conferencias, congresos o institutos "},
				{"f. Educaci\u00F3n post doctoral, educaci\u00F3n continua"},
			},
			new String[] {
				"Preguntas:"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(609);
		scrollPane.setViewportView(table);
	}

}