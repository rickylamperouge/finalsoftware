import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;

public class Instrumento3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instrumento3 frame = new Instrumento3();
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
	public Instrumento3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(contentPane_1, BorderLayout.CENTER);
		
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
	}

}
