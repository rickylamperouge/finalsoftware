import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;

public class Register extends JFrame {

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
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informaci\u00F3n a Ingresar");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 916, 14);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setRowHeight(22);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Unidad acad\u00E9mica", null},
				{"Nombre del profesor", null},
				{"Rango acad\u00E9mico que solicita", null},
				{"Departamento", null},
				{"Disciplina que ense\u00F1a ", null},
				{"Objetivo de la evaluaci\u00F3n", null},
				{"Per\u00EDodo evaluado", null},
				{"A\u00F1os de servicio como profesor", null},
				{"Tipo de contrato ", null},
			},
			new String[] {
				"New column", "New column"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(175);
		table.getColumnModel().getColumn(1).setPreferredWidth(423);
		table.setBounds(10, 36, 742, 198);
		contentPane.add(table);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"T. Completo", "T. Parcial"}));
		comboBox.setBounds(762, 189, 90, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Sustituto", "Temporero", "Probatorio", "Permanente"}));
		comboBox_1.setBounds(762, 211, 90, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Formativa", "Sumativa"}));
		comboBox_2.setBounds(762, 146, 90, 22);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_1 = new JLabel("Especifique los cursos ofrecidos durante el per\u00EDodo evaluado:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 263, 906, 14);
		contentPane.add(lblNewLabel_1);
		
		table_1 = new JTable();
		table_1.setRowHeight(22);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"C\u00F3digo", "T\u00EDtulo del Curso", "Modalidad"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table_1.getColumnModel().getColumn(2).setPreferredWidth(81);
		table_1.setBounds(10, 288, 896, 132);
		contentPane.add(table_1);
		
		JButton btnNewButton = new JButton("Continue\r\n");
		btnNewButton.setBounds(421, 692, 89, 23);
		contentPane.add(btnNewButton);
	}
}
