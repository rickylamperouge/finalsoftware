import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class menu1 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu1 frame = new menu1();
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
	public menu1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Rubrica para evalucaion.");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(39, 80, 146, 13);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 156, 881, 123);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"4", "El profesor demuestra que cumple totalmente con el criterio y no requiere recomendaciones correctivas."},
				{"3", "El profesor demuestra que cumple mayormente con el criterio aunque requiere de alguna recomendaci\u00F3n correctiva menor para que cumpla totalmente. "},
				{"2", "El profesor demuestra que cumple satisfactoriamente con el criterio y requiere varias recomendaciones correctivas para que cumpla totalmente. "},
				{"1", "El profesor cumple deficientemente con el criterio y requiere recomendaciones correctivas sustanciales. "},
				{"0", "El profesor no cumple con el criterio y requiere recomendaciones correctivas extraordinarias."},
				{"N/A", "No se puede evaluar porque el criterio no aplica a la clase visitada."},
			},
			new String[] {
				"Puntuacion", "Descripcion"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(1250);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new menu2().setVisible(true);
				menu1.this.dispose();
			}
		});
		btnNewButton.setBounds(394, 315, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Instrumento III");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(292, 10, 233, 53);
		contentPane.add(lblNewLabel_3);
	}
}
