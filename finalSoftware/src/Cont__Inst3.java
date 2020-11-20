import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Cont__Inst3 extends JFrame {

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
					Cont__Inst3 frame = new Cont__Inst3();
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
	public Cont__Inst3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(10, 10, 918, 783);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel_1 = new JLabel("5. Presenta el tema en forma actualizada.");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(20, 10, 211, 14);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Comentarios:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(20, 34, 95, 13);
		contentPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Puntuacion");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(658, 45, 69, 13);
		contentPane_1.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(118, 34, 486, 76);
		contentPane_1.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("6. Incorpora en la clase las nuevas tendencias de disciplina.");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(20, 154, 382, 14);
		contentPane_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Comentarios:");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(20, 178, 95, 13);
		contentPane_1.add(lblNewLabel_2_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(118, 178, 486, 76);
		contentPane_1.add(textField_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Puntuacion");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(658, 178, 69, 13);
		contentPane_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("7. Presenta el material de la clase en forma organizada y coherente.");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(20, 327, 446, 14);
		contentPane_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Comentarios:");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(20, 351, 95, 13);
		contentPane_1.add(lblNewLabel_2_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(118, 351, 486, 76);
		contentPane_1.add(textField_4);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Puntuacion");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_1.setBounds(658, 351, 69, 13);
		contentPane_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("8. Utiliza el vocabulario propio de la materia.");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(20, 499, 446, 14);
		contentPane_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Comentarios:");
		lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1.setBounds(20, 523, 95, 13);
		contentPane_1.add(lblNewLabel_2_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(118, 523, 486, 76);
		contentPane_1.add(textField_6);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Puntuacion");
		lblNewLabel_3_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1_1_1.setBounds(658, 523, 69, 13);
		contentPane_1.add(lblNewLabel_3_1_1_1);
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(386, 734, 100, 21);
		contentPane_1.add(btnNewButton);
		
		JLabel lblCriterioIiOrganizacion = new JLabel("CRITERIO II. ORGANIZACION Y PRESENTACION DEL CONTENIDO");
		lblCriterioIiOrganizacion.setFont(new Font("Arial", Font.BOLD, 14));
		lblCriterioIiOrganizacion.setBounds(10, 284, 476, 33);
		contentPane_1.add(lblCriterioIiOrganizacion);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner.setBounds(737, 62, 30, 20);
		contentPane_1.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_1.setBounds(737, 206, 30, 20);
		contentPane_1.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_2.setBounds(737, 379, 30, 20);
		contentPane_1.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_3.setBounds(737, 551, 30, 20);
		contentPane_1.add(spinner_3);
	}
}
