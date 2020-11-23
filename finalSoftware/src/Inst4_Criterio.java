import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class Inst4_Criterio extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inst4_Criterio frame = new Inst4_Criterio();
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
	public Inst4_Criterio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Instrumento IV: Evaluacion del Director");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(329, 10, 298, 38);
		contentPane.add(lblNewLabel_3);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"4", "El profesor demuestra que cumple totalmente con el criterio y no requiere recomendaciones"},
				{"3", "El profesor demuestra que cumple mayormente con el criterio y requiere algina recomendacin menor."},
				{"2", "El profesor demuestra que cumple satisfactoriamente con el criterio y requiere varias recomendaciones."},
				{"1", "El profesor cumple deficientemente con el criterio y requiere recomendaciones sustanciales."},
				{"0", "El profesor no cumple con el criterio y requiere recomendaciones extraordinarias."},
				{"N/A", "No se puede evaluar porque el criterio no aplica."},
			},
			new String[] {
				"puntuacion", "Descripcion"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(650);
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		table.setBounds(97, 127, 719, 96);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("Rubrica\r\n");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(97, 71, 136, 30);
		contentPane.add(lblNewLabel);
	}
}
