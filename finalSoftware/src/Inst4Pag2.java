import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Inst4Pag2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inst4Pag2 frame = new Inst4Pag2();
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
	public Inst4Pag2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 918, 783);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel_1 = new JLabel("4. Informa al Director del Departamento como repone sus ausencias.");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 45, 400, 13);
		contentPane_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(108, 68, 526, 97);
		contentPane_1.add(textField);
		
		JLabel lblNewLabel_2 = new JLabel("Comentarios:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 68, 88, 13);
		contentPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Puntuacion:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(675, 68, 88, 13);
		contentPane_1.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(773, 68, 96, 19);
		contentPane_1.add(textField_1);
		
		JLabel lblNewLabel_4 = new JLabel("5. Contribuye a las deliberaciones de las reuniones de su Departamento.");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 200, 467, 13);
		contentPane_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Comentarios:");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 223, 88, 13);
		contentPane_1.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(108, 223, 526, 97);
		contentPane_1.add(textField_2);
		
		JLabel lblNewLabel_6 = new JLabel("Puntuacion:");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(675, 223, 88, 13);
		contentPane_1.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(773, 223, 96, 19);
		contentPane_1.add(textField_3);
		
		JLabel lblNewLabel_7 = new JLabel("6. Colabora en las actividades que desarrolla el Departamento");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(10, 363, 427, 13);
		contentPane_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Comentarios:");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(10, 386, 88, 13);
		contentPane_1.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(108, 395, 526, 97);
		contentPane_1.add(textField_4);
		
		JLabel lblNewLabel_9 = new JLabel("Puntuacion:");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(675, 395, 88, 13);
		contentPane_1.add(lblNewLabel_9);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(773, 395, 96, 19);
		contentPane_1.add(textField_5);
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.setBounds(364, 701, 113, 21);
		contentPane_1.add(btnNewButton);
		
		JLabel lblNewLabel_7_1 = new JLabel("7. Cumple con las normas y procedimientos de la Instituci\u00F3n. Somete dentro del\r\ntiempo establecido por la Universidad y la unidad acad\u00E9mica, los siguientes\r\ndocumentos: el cotejo de listas, el informe de estudiantes que nunca han asistido,\r\nlas calificaciones finales, la remoci\u00F3n de incompletos, la notificaci\u00F3n de extramuros,\r\nlos horarios de clase, entre otros, y sigue el calendario acad\u00E9mico.");
		lblNewLabel_7_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7_1.setBounds(10, 527, 427, 13);
		contentPane_1.add(lblNewLabel_7_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(108, 550, 526, 97);
		contentPane_1.add(textField_6);
		
		JLabel lblNewLabel_8_1 = new JLabel("Comentarios:");
		lblNewLabel_8_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_1.setBounds(10, 550, 88, 13);
		contentPane_1.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("Puntuacion:");
		lblNewLabel_9_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9_1.setBounds(675, 550, 88, 13);
		contentPane_1.add(lblNewLabel_9_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(773, 550, 96, 19);
		contentPane_1.add(textField_7);
	}

}
