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
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Criterios_I3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Criterios_I3 frame = new Criterios_I3();
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
	public Criterios_I3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CRITERIO I. DOMINIO DE LA DISCIPLINA");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 24, 281, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1. Domina el tema discutido en clase.");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(27, 83, 211, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Comentarios:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(27, 125, 95, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Puntuacion");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(658, 125, 69, 13);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(118, 125, 486, 76);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("2. Usa ejemplos o ejercicios relacionados con el tema de la clase.");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(27, 244, 382, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Comentarios:");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(27, 292, 95, 13);
		contentPane.add(lblNewLabel_2_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(118, 289, 486, 76);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Puntuacion");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(658, 292, 69, 13);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("3. Integra conceptos o experiencias de otras disciplinas para enriquecer la clase.");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(27, 401, 446, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Comentarios:");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(27, 450, 95, 13);
		contentPane.add(lblNewLabel_2_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(118, 450, 486, 76);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Puntuacion");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_1.setBounds(658, 450, 69, 13);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("4. Relaciona la utilidad del tema con otros cursos o areas del conocimiento.");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(27, 561, 446, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Comentarios:");
		lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1.setBounds(27, 612, 95, 13);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(118, 609, 486, 76);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Puntuacion");
		lblNewLabel_3_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_1_1.setBounds(658, 612, 69, 13);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner.setBounds(736, 163, 30, 20);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_1.setBounds(736, 317, 30, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_2.setBounds(736, 478, 30, 20);
		contentPane.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_3.setBounds(736, 637, 30, 20);
		contentPane.add(spinner_3);
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBounds(325, 762, 101, 21);
		contentPane.add(btnNewButton);
	}
}
