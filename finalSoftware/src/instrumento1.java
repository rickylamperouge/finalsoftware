import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class instrumento1 extends JFrame {

	private JPanel contentPane;
	private JTable table;

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
		scrollPane.setBounds(24, 89, 641, 59);
		contentPane.add(scrollPane);
		
		table = new JTable();
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
	}
}
