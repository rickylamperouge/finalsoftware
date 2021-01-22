import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Evidencias extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Evidencias frame = new Evidencias();
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
	public Evidencias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		JLabel lblPortafolioDeEvidencias = new JLabel("PORTAFOLIO DE EVIDENCIAS");
		lblPortafolioDeEvidencias.setFont(new Font("Arial", Font.BOLD, 16));
		lblPortafolioDeEvidencias.setBounds(311, 33, 260, 42);
		panel.add(lblPortafolioDeEvidencias);
		
		JLabel lblNewLabel = new JLabel("Universidad Interamericana de Puerto Rico Recinto de Bayamon");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(260, 10, 373, 13);
		panel.add(lblNewLabel);
		
		JLabel lblDominioDeLa = new JLabel("a. Dominio de la disciplina que ense\u00F1a.");
		lblDominioDeLa.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDominioDeLa.setBounds(10, 140, 373, 13);
		panel.add(lblDominioDeLa);
		
		JLabel lblCursosQueSe = new JLabel("b. Cursos que se han ofrecido en el periodo evaluado.");
		lblCursosQueSe.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCursosQueSe.setBounds(10, 165, 373, 13);
		panel.add(lblCursosQueSe);
		
		JLabel lblRec = new JLabel("c. Recomendaciones y propuestas para mejorar laboratorios academicos.");
		lblRec.setFont(new Font("Arial", Font.PLAIN, 12));
		lblRec.setBounds(10, 188, 428, 13);
		panel.add(lblRec);
		
		JLabel lblOfrecimientoDeCursos = new JLabel("d. Ofrecimiento de cursos en diferentes modalidades.");
		lblOfrecimientoDeCursos.setFont(new Font("Arial", Font.PLAIN, 12));
		lblOfrecimientoDeCursos.setBounds(10, 211, 373, 13);
		panel.add(lblOfrecimientoDeCursos);
		
		JLabel lblCreacionDeProtuarios = new JLabel("e. Creacion de prontuarios.");
		lblCreacionDeProtuarios.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCreacionDeProtuarios.setBounds(10, 234, 373, 13);
		panel.add(lblCreacionDeProtuarios);
		
		JLabel lblRevisionDeCursos = new JLabel("f. Revision de cursos.");
		lblRevisionDeCursos.setFont(new Font("Arial", Font.PLAIN, 12));
		lblRevisionDeCursos.setBounds(10, 257, 373, 13);
		panel.add(lblRevisionDeCursos);
		
		JLabel lblCalidadDocente = new JLabel("Calidad Docente");
		lblCalidadDocente.setFont(new Font("Arial", Font.BOLD, 14));
		lblCalidadDocente.setBounds(10, 88, 260, 42);
		panel.add(lblCalidadDocente);
		
		JLabel lblSuma = new JLabel("Suma");
		lblSuma.setFont(new Font("Arial", Font.BOLD, 12));
		lblSuma.setBounds(10, 294, 373, 13);
		panel.add(lblSuma);
		
		JLabel lblServicioALa = new JLabel("Servicio a la Institucion");
		lblServicioALa.setFont(new Font("Arial", Font.BOLD, 14));
		lblServicioALa.setBounds(10, 345, 260, 42);
		panel.add(lblServicioALa);
		
		JLabel lblTrabajoEnComites = new JLabel("a. Trabajo en comites de facultad a nivel departamental.");
		lblTrabajoEnComites.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTrabajoEnComites.setBounds(10, 397, 373, 13);
		panel.add(lblTrabajoEnComites);
		
		JLabel lblParticipacionYAportacion = new JLabel("b. Participacion y aportacion a reuniones de facultad y de comites a nivel de Recinto.");
		lblParticipacionYAportacion.setFont(new Font("Arial", Font.PLAIN, 12));
		lblParticipacionYAportacion.setBounds(10, 420, 483, 13);
		panel.add(lblParticipacionYAportacion);
		
		JLabel lblServicioEnComites = new JLabel("c. Servicio en comites y en organizaciones a nivel instuticional.");
		lblServicioEnComites.setFont(new Font("Arial", Font.PLAIN, 12));
		lblServicioEnComites.setBounds(10, 443, 373, 13);
		panel.add(lblServicioEnComites);
		
		JLabel lblColaboracionEnActividades = new JLabel("d. Colaboracion en actividades estudiantiles.");
		lblColaboracionEnActividades.setFont(new Font("Arial", Font.PLAIN, 12));
		lblColaboracionEnActividades.setBounds(10, 466, 373, 13);
		panel.add(lblColaboracionEnActividades);
		
		JLabel lblAsistenciaAActos = new JLabel("e. Asistencia a actos oficiales.");
		lblAsistenciaAActos.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAsistenciaAActos.setBounds(10, 489, 373, 13);
		panel.add(lblAsistenciaAActos);
		
		JLabel lblSuma_1 = new JLabel("Suma");
		lblSuma_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblSuma_1.setBounds(10, 535, 373, 13);
		panel.add(lblSuma_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		textField.setBounds(692, 138, 55, 16);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(692, 162, 55, 16);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(692, 185, 55, 16);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(692, 208, 55, 16);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(692, 231, 55, 16);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(692, 254, 55, 16);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.BOLD, 12));
		textField_6.setColumns(10);
		textField_6.setBounds(692, 291, 55, 16);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_7.setColumns(10);
		textField_7.setBounds(692, 394, 55, 16);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_8.setColumns(10);
		textField_8.setBounds(692, 417, 55, 16);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_9.setColumns(10);
		textField_9.setBounds(692, 440, 55, 16);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_10.setColumns(10);
		textField_10.setBounds(692, 463, 55, 16);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_11.setColumns(10);
		textField_11.setBounds(692, 486, 55, 16);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Arial", Font.BOLD, 12));
		textField_12.setColumns(10);
		textField_12.setBounds(692, 532, 55, 16);
		panel.add(textField_12);
	}
}

