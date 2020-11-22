import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class I3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_12;
	private JTextField textField_14;
	private JTextField textField_16;
	private JTextField textField_18;
	private JTextField textField_20;
	private JTextField textField_22;
	private JTextField textField_24;
	private JTextField textField_26;
	private JTextField textField_28;
	private JTextField textField_30;
	private JTextField textField_32;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					I3 window = new I3();
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
	public I3() {
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
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 918, 783);
		frame.getContentPane().add(tabbedPane);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		tabbedPane.addTab("New tab", null, contentPane, null);
		
		JLabel lblNewLabel_1_6 = new JLabel("Rubrica para evalucaion.");
		lblNewLabel_1_6.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_6.setBounds(39, 80, 146, 13);
		contentPane.add(lblNewLabel_1_6);
		
		JButton btnNewButton_5 = new JButton("Iniciar");
		btnNewButton_5.setBounds(394, 315, 85, 21);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("Instrumento III");
		lblNewLabel_3_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_6.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_6.setBounds(292, 10, 233, 53);
		contentPane.add(lblNewLabel_3_6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 128, 881, 123);
		contentPane.add(scrollPane);
		
		
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(10, 10, 908, 773);
		panel.add(contentPane_1);
		
		JLabel lblNewLabel_1 = new JLabel("1. Domina el tema discutido en clase.");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(20, 43, 252, 14);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Comentarios:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(20, 82, 95, 13);
		contentPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Puntuacion");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(658, 68, 69, 13);
		contentPane_1.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(118, 82, 486, 76);
		contentPane_1.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("2. Usa ejemplos relacionados con el tema de la clase.");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 209, 382, 14);
		contentPane_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Comentarios:");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(20, 249, 95, 13);
		contentPane_1.add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(118, 233, 486, 76);
		contentPane_1.add(textField_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Puntuacion");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(658, 233, 69, 13);
		contentPane_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("3. Integra o experiencias de otras disciplinas para enriquecer la clase");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(20, 353, 446, 14);
		contentPane_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Comentarios:");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(20, 391, 95, 13);
		contentPane_1.add(lblNewLabel_2_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(118, 391, 486, 76);
		contentPane_1.add(textField_2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Puntuacion");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_1.setBounds(658, 391, 69, 13);
		contentPane_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("4. Relaciona la utilidad del tema con otros cursos o areas del conocimiento.");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(20, 499, 446, 14);
		contentPane_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Comentarios:");
		lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1.setBounds(20, 554, 95, 13);
		contentPane_1.add(lblNewLabel_2_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(118, 551, 486, 76);
		contentPane_1.add(textField_3);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Puntuacion");
		lblNewLabel_3_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_1_1.setBounds(658, 554, 69, 13);
		contentPane_1.add(lblNewLabel_3_1_1_1);
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.setBounds(386, 734, 100, 21);
		contentPane_1.add(btnNewButton);
		
		JLabel lblCriterioIiOrganizacion = new JLabel("CRITERIO I. DOMINIO DE LA DISCIPLINA");
		lblCriterioIiOrganizacion.setFont(new Font("Arial", Font.BOLD, 14));
		lblCriterioIiOrganizacion.setBounds(20, 0, 476, 33);
		contentPane_1.add(lblCriterioIiOrganizacion);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(737, 65, 30, 20);
		contentPane_1.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(737, 261, 30, 20);
		contentPane_1.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(737, 419, 30, 20);
		contentPane_1.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(737, 579, 30, 20);
		contentPane_1.add(spinner_3);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel contentPane_1_1 = new JPanel();
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_1.setBounds(10, 10, 944, 838);
		panel_1.add(contentPane_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("5. Presenta el tema en forma actualizada.");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(20, 10, 211, 14);
		contentPane_1_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Comentarios:");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(20, 34, 95, 13);
		contentPane_1_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Puntuacion");
		lblNewLabel_3_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_2.setBounds(658, 45, 69, 13);
		contentPane_1_1.add(lblNewLabel_3_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(118, 34, 486, 76);
		contentPane_1_1.add(textField_4);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("6. Incorpora en la clase las nuevas tendencias de disciplina.");
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(20, 154, 382, 14);
		contentPane_1_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Comentarios:");
		lblNewLabel_2_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_2.setBounds(20, 178, 95, 13);
		contentPane_1_1.add(lblNewLabel_2_1_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(118, 178, 486, 76);
		contentPane_1_1.add(textField_5);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Puntuacion");
		lblNewLabel_3_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_2.setBounds(658, 178, 69, 13);
		contentPane_1_1.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("7. Presenta el material de la clase en forma organizada y coherente.");
		lblNewLabel_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1_2.setBounds(20, 327, 446, 14);
		contentPane_1_1.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Comentarios:");
		lblNewLabel_2_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_2.setBounds(20, 351, 95, 13);
		contentPane_1_1.add(lblNewLabel_2_1_1_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(118, 351, 486, 76);
		contentPane_1_1.add(textField_6);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("Puntuacion");
		lblNewLabel_3_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_1_2.setBounds(658, 351, 69, 13);
		contentPane_1_1.add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("8. Utiliza el vocabulario propio de la materia.");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBounds(20, 499, 446, 14);
		contentPane_1_1.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Comentarios:");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1.setBounds(20, 523, 95, 13);
		contentPane_1_1.add(lblNewLabel_2_1_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(118, 523, 486, 76);
		contentPane_1_1.add(textField_7);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Puntuacion");
		lblNewLabel_3_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_1_1_1.setBounds(658, 523, 69, 13);
		contentPane_1_1.add(lblNewLabel_3_1_1_1_1);
		
		JButton btnNewButton_1 = new JButton("Continuar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(380, 694, 100, 21);
		contentPane_1_1.add(btnNewButton_1);
		
		JLabel lblCriterioIiOrganizacion_1 = new JLabel("CRITERIO II. ORGANIZACION Y PRESENTACION DEL CONTENIDO");
		lblCriterioIiOrganizacion_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblCriterioIiOrganizacion_1.setBounds(10, 284, 476, 33);
		contentPane_1_1.add(lblCriterioIiOrganizacion_1);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(737, 62, 30, 20);
		contentPane_1_1.add(spinner_4);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setBounds(737, 206, 30, 20);
		contentPane_1_1.add(spinner_1_1);
		
		JSpinner spinner_2_1 = new JSpinner();
		spinner_2_1.setBounds(737, 379, 30, 20);
		contentPane_1_1.add(spinner_2_1);
		
		JSpinner spinner_3_1 = new JSpinner();
		spinner_3_1.setBounds(737, 551, 30, 20);
		contentPane_1_1.add(spinner_3_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel contentPane_1_2 = new JPanel();
		contentPane_1_2.setLayout(null);
		contentPane_1_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_2.setBounds(10, 10, 908, 773);
		panel_2.add(contentPane_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("9. Cumple con los objetivos establecidos para la clase.");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(20, 10, 211, 14);
		contentPane_1_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("Comentarios:");
		lblNewLabel_2_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(20, 34, 95, 13);
		contentPane_1_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("Puntuacion");
		lblNewLabel_3_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_3.setBounds(658, 45, 69, 13);
		contentPane_1_2.add(lblNewLabel_3_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(118, 34, 486, 76);
		contentPane_1_2.add(textField_8);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("10. Utiliza el tiempo de la clase de acuerdo con los objetivos establecidos y las actividades planificadas.");
		lblNewLabel_1_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_3.setBounds(20, 130, 584, 14);
		contentPane_1_2.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Comentarios:");
		lblNewLabel_2_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_3.setBounds(20, 154, 95, 13);
		contentPane_1_2.add(lblNewLabel_2_1_3);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(118, 154, 486, 76);
		contentPane_1_2.add(textField_10);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("Puntuacion");
		lblNewLabel_3_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_3.setBounds(658, 154, 69, 13);
		contentPane_1_2.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("11. Resume los conceptos discutidos en clase.");
		lblNewLabel_1_1_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1_3.setBounds(20, 252, 446, 14);
		contentPane_1_2.add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("Comentarios:");
		lblNewLabel_2_1_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_3.setBounds(20, 276, 95, 13);
		contentPane_1_2.add(lblNewLabel_2_1_1_3);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(118, 276, 486, 76);
		contentPane_1_2.add(textField_12);
		
		JLabel lblNewLabel_3_1_1_3 = new JLabel("Puntuacion");
		lblNewLabel_3_1_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_1_3.setBounds(658, 276, 69, 13);
		contentPane_1_2.add(lblNewLabel_3_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("12. Estimula la participacion de los estudiantes en la clase.");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_2.setBounds(20, 444, 446, 14);
		contentPane_1_2.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("Comentarios:");
		lblNewLabel_2_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_2.setBounds(20, 468, 95, 13);
		contentPane_1_2.add(lblNewLabel_2_1_1_1_2);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(118, 468, 486, 76);
		contentPane_1_2.add(textField_14);
		
		JLabel lblNewLabel_3_1_1_1_2 = new JLabel("Puntuacion");
		lblNewLabel_3_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_1_1_2.setBounds(658, 468, 69, 13);
		contentPane_1_2.add(lblNewLabel_3_1_1_1_2);
		
		JButton btnNewButton_2 = new JButton("Continuar");
		btnNewButton_2.setBounds(392, 706, 122, 21);
		contentPane_1_2.add(btnNewButton_2);
		
		JLabel lblCriterioIiiPromocion = new JLabel("CRITERIO III. PROMOCION DEL INTERES DEL ESTUDIANTE");
		lblCriterioIiiPromocion.setFont(new Font("Arial", Font.BOLD, 14));
		lblCriterioIiiPromocion.setBounds(10, 374, 468, 33);
		contentPane_1_2.add(lblCriterioIiiPromocion);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("13. Mantiene un clima de confiaza y respeto.");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1.setBounds(20, 581, 446, 14);
		contentPane_1_2.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Comentarios:");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1.setBounds(20, 605, 95, 13);
		contentPane_1_2.add(lblNewLabel_2_1_1_1_1_1);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(118, 605, 486, 76);
		contentPane_1_2.add(textField_16);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("Puntuacion");
		lblNewLabel_3_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_1_1_1_1.setBounds(658, 605, 69, 13);
		contentPane_1_2.add(lblNewLabel_3_1_1_1_1_1);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(737, 62, 30, 20);
		contentPane_1_2.add(spinner_5);
		
		JSpinner spinner_5_1 = new JSpinner();
		spinner_5_1.setBounds(737, 182, 30, 20);
		contentPane_1_2.add(spinner_5_1);
		
		JSpinner spinner_5_1_1 = new JSpinner();
		spinner_5_1_1.setBounds(737, 304, 30, 20);
		contentPane_1_2.add(spinner_5_1_1);
		
		JSpinner spinner_5_1_1_1 = new JSpinner();
		spinner_5_1_1_1.setBounds(737, 496, 30, 20);
		contentPane_1_2.add(spinner_5_1_1_1);
		
		JSpinner spinner_5_1_1_1_1 = new JSpinner();
		spinner_5_1_1_1_1.setBounds(737, 633, 30, 20);
		contentPane_1_2.add(spinner_5_1_1_1_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel contentPane_1_3 = new JPanel();
		contentPane_1_3.setLayout(null);
		contentPane_1_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_3.setBounds(10, 10, 908, 773);
		panel_3.add(contentPane_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("14. Facillita relacionar el contenido de la clase con las experiencias del estudiante en su diario vivir.");
		lblNewLabel_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(20, 10, 584, 14);
		contentPane_1_3.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("Comentarios:");
		lblNewLabel_2_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_4.setBounds(20, 34, 95, 13);
		contentPane_1_3.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("Puntuacion");
		lblNewLabel_3_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_4.setBounds(658, 45, 69, 13);
		contentPane_1_3.add(lblNewLabel_3_4);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(118, 34, 486, 76);
		contentPane_1_3.add(textField_18);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("15. Promueve la discusion para complementar, aclarar o enriquecer la clase.");
		lblNewLabel_1_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_4.setBounds(20, 130, 584, 14);
		contentPane_1_3.add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Comentarios:");
		lblNewLabel_2_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_4.setBounds(20, 154, 95, 13);
		contentPane_1_3.add(lblNewLabel_2_1_4);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(118, 154, 486, 76);
		contentPane_1_3.add(textField_20);
		
		JLabel lblNewLabel_3_1_4 = new JLabel("Puntuacion");
		lblNewLabel_3_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_4.setBounds(658, 154, 69, 13);
		contentPane_1_3.add(lblNewLabel_3_1_4);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("16. Promueve en los estudiantes la busqueda de informacion y otras experiencias que enriquezcan sus conocimientos y estimulen el pensamiento critico.");
		lblNewLabel_1_1_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1_4.setBounds(20, 252, 855, 14);
		contentPane_1_3.add(lblNewLabel_1_1_1_4);
		
		JLabel lblNewLabel_2_1_1_4 = new JLabel("Comentarios:");
		lblNewLabel_2_1_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_4.setBounds(20, 276, 95, 13);
		contentPane_1_3.add(lblNewLabel_2_1_1_4);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(118, 276, 486, 76);
		contentPane_1_3.add(textField_22);
		
		JLabel lblNewLabel_3_1_1_4 = new JLabel("Puntuacion");
		lblNewLabel_3_1_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_1_4.setBounds(658, 276, 69, 13);
		contentPane_1_3.add(lblNewLabel_3_1_1_4);
		
		JLabel lblNewLabel_1_1_1_1_3 = new JLabel("17. Fomenta la colaboracion y el trabajo en equipo entre los estudiantes.");
		lblNewLabel_1_1_1_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_3.setBounds(20, 444, 446, 14);
		contentPane_1_3.add(lblNewLabel_1_1_1_1_3);
		
		JLabel lblNewLabel_2_1_1_1_3 = new JLabel("Comentarios:");
		lblNewLabel_2_1_1_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_3.setBounds(20, 468, 95, 13);
		contentPane_1_3.add(lblNewLabel_2_1_1_1_3);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(118, 468, 486, 76);
		contentPane_1_3.add(textField_24);
		
		JLabel lblNewLabel_3_1_1_1_3 = new JLabel("Puntuacion");
		lblNewLabel_3_1_1_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_1_1_3.setBounds(658, 468, 69, 13);
		contentPane_1_3.add(lblNewLabel_3_1_1_1_3);
		
		JButton btnNewButton_3 = new JButton("Continuar");
		btnNewButton_3.setBounds(377, 709, 122, 21);
		contentPane_1_3.add(btnNewButton_3);
		
		JLabel lblCriterioIiiPromocion_1 = new JLabel("CRITERIO IV. USO DE METODOS Y ESTRATEGIAS DE APOYO A LA ENSENANZA");
		lblCriterioIiiPromocion_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblCriterioIiiPromocion_1.setBounds(10, 374, 594, 33);
		contentPane_1_3.add(lblCriterioIiiPromocion_1);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("18. Utiliza recursos de apoyo(pizarra, materiales educativos o tecnologicos) adecuados para desarrollar la clase.");
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_2.setBounds(20, 581, 707, 14);
		contentPane_1_3.add(lblNewLabel_1_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1_2 = new JLabel("Comentarios:");
		lblNewLabel_2_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_2.setBounds(20, 605, 95, 13);
		contentPane_1_3.add(lblNewLabel_2_1_1_1_1_2);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(118, 605, 486, 76);
		contentPane_1_3.add(textField_26);
		
		JLabel lblNewLabel_3_1_1_1_1_2 = new JLabel("Puntuacion");
		lblNewLabel_3_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_1_1_1_2.setBounds(658, 605, 69, 13);
		contentPane_1_3.add(lblNewLabel_3_1_1_1_1_2);
		
		JSpinner spinner_5_2 = new JSpinner();
		spinner_5_2.setBounds(737, 62, 30, 20);
		contentPane_1_3.add(spinner_5_2);
		
		JSpinner spinner_5_2_1 = new JSpinner();
		spinner_5_2_1.setBounds(737, 171, 30, 20);
		contentPane_1_3.add(spinner_5_2_1);
		
		JSpinner spinner_5_2_1_1 = new JSpinner();
		spinner_5_2_1_1.setBounds(737, 304, 30, 20);
		contentPane_1_3.add(spinner_5_2_1_1);
		
		JSpinner spinner_5_2_1_1_1 = new JSpinner();
		spinner_5_2_1_1_1.setBounds(737, 496, 30, 20);
		contentPane_1_3.add(spinner_5_2_1_1_1);
		
		JSpinner spinner_5_2_1_1_1_1 = new JSpinner();
		spinner_5_2_1_1_1_1.setBounds(737, 633, 30, 20);
		contentPane_1_3.add(spinner_5_2_1_1_1_1);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_4, null);
		panel_4.setLayout(null);
		
		JPanel contentPane_1_4 = new JPanel();
		contentPane_1_4.setLayout(null);
		contentPane_1_4.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_4.setBounds(10, 10, 908, 773);
		panel_4.add(contentPane_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("19. Utiliza estrategias y metodos que promueven el aprendizaje de los estudiantes.");
		lblNewLabel_1_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_5.setBounds(20, 10, 584, 14);
		contentPane_1_4.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_2_5 = new JLabel("Comentarios:");
		lblNewLabel_2_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_5.setBounds(20, 34, 95, 13);
		contentPane_1_4.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_3_5 = new JLabel("Puntuacion");
		lblNewLabel_3_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_5.setBounds(658, 45, 69, 13);
		contentPane_1_4.add(lblNewLabel_3_5);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(118, 34, 486, 76);
		contentPane_1_4.add(textField_28);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("20. Utiliza estrategias para verificar si los estudiantes entienden el material durante el transcurso de la clase.");
		lblNewLabel_1_1_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_5.setBounds(20, 130, 658, 14);
		contentPane_1_4.add(lblNewLabel_1_1_5);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Comentarios:");
		lblNewLabel_2_1_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_5.setBounds(20, 154, 95, 13);
		contentPane_1_4.add(lblNewLabel_2_1_5);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(118, 154, 486, 76);
		contentPane_1_4.add(textField_30);
		
		JLabel lblNewLabel_3_1_5 = new JLabel("Puntuacion");
		lblNewLabel_3_1_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_5.setBounds(658, 154, 69, 13);
		contentPane_1_4.add(lblNewLabel_3_1_5);
		
		JButton btnNewButton_4 = new JButton("Guardar y Someter");
		btnNewButton_4.setBounds(294, 378, 158, 21);
		contentPane_1_4.add(btnNewButton_4);
		
		JLabel lblNewLabel_3_1_1_1_1_3 = new JLabel("Promedio General");
		lblNewLabel_3_1_1_1_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_1_1_1_3.setBounds(615, 314, 112, 13);
		contentPane_1_4.add(lblNewLabel_3_1_1_1_1_3);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(737, 311, 96, 19);
		contentPane_1_4.add(textField_32);
		
		JSpinner spinner_5_2_2 = new JSpinner();
		spinner_5_2_2.setBounds(737, 62, 30, 20);
		contentPane_1_4.add(spinner_5_2_2);
		
		JSpinner spinner_5_2_2_1 = new JSpinner();
		spinner_5_2_2_1.setBounds(737, 168, 30, 20);
		contentPane_1_4.add(spinner_5_2_2_1);
	}
}
