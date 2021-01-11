import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

public class I22 extends I11A {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					I22 frame = new I22();
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
	public I22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Pagina 1", null, panel, null);
		panel.setLayout(null);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBounds(0, 0, 916, 781);
		panel.add(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 69, 702, 158);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"a. Dominio de la disciplina que ense\u00F1a"},
				{"b. Habilidad para organizar el contenido y presentarlo en forma clara, l\u00F3gica e imaginativa"},
				{"c. . Conocimiento de los desarrollos actuales de la disciplina "},
				{"d. Habilidad para relacionar la disciplina con otras esferas del conocimiento"},
				{"e. Habilidad para promover y ampliar el inter\u00E9s del estudiante en la disciplina"},
				{"f. Habilidad para desarrollar y utilizar m\u00E9todos y estrategias adecuadas, incluyendo \u201Cassessment\u201D para una ense\u00F1anza efectiva"},
				{"g. Disponibilidad y eficacia en la orientaci\u00F3n acad\u00E9mica del estudiante"},
				{"h. Posesi\u00F3n de los atributos de integridad, laboriosidad, liberalidad y objetividad en la ense\u00F1anza "},
			},
			new String[] {
				"Preguntas:"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(626);
		table.getColumnModel().getColumn(0).setMinWidth(31);
		scrollPane.setViewportView(table);
		
		
		
		JLabel lblNewLabel = new JLabel("Instrumento II");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 916, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Calidad Docente:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 52, 134, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Servicio a la instituci\u00F3n ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 260, 128, 14);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 285, 702, 123);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Arial", Font.PLAIN, 12));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"a. Participaci\u00F3n y aportaci\u00F3n a reuniones de facultad y de comit\u00E9s a nivel de Recinto."},
				{"b. Servicio en comit\u00E9s y en organizaciones a nivel institucional"},
				{"c. Colaboraci\u00F3n en actividades estudiantiles"},
				{"d. Asistencia a actos oficiales"},
				{"e. Designaci\u00F3n como director/a de departamento, presidente de comit\u00E9 y otras"},
				{"f. Participaci\u00F3n en organismos de gobierno; tales como: el Senado y el Consejo Universitario "},
			},
			new String[] {
				"Preguntas:"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(616);
		scrollPane_1.setViewportView(table_1);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Servicio a la Comunidad\r\n");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 419, 146, 14);
		contentPane.add(lblNewLabel_3);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 444, 702, 60);
		contentPane.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setFont(new Font("Arial", Font.PLAIN, 12));
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"a. Servicio en el campo profesional del profesor como consultor o investigador"},
				{"b. Servicio como recurso: conferenciante de grupos de la comunidad, participaci\u00F3n activa en gestiones pol\u00EDticas, religiosas o c\u00EDvicas"},
			},
			new String[] {
				"Preguntas:"
			}
		));
		table_2.getColumnModel().getColumn(0).setPreferredWidth(641);
		scrollPane_2.setViewportView(table_2);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("Investigaci\u00F3n y trabajo creativo\r\n");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 515, 174, 14);
		contentPane.add(lblNewLabel_4);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 540, 702, 113);
		contentPane.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{"a. Publicaciones "},
				{"b. Presentaciones y trabajos creativos relacionados con la disciplina que ense\u00F1a "},
				{"c. Propuestas dise\u00F1adas y presentadas "},
				{"d. Concesi\u00F3n de ayudas para investigaci\u00F3n y proyectos "},
				{"e. Invenciones, patentes, labor art\u00EDstica y actuaci\u00F3n "},
			},
			new String[] {
				"Preguntas:"
			}
		));
		table_3.getColumnModel().getColumn(0).setPreferredWidth(609);
		scrollPane_3.setViewportView(table_3);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("Puntuaci\u00F3n");
		lblNewLabel_5.setBounds(783, 52, 97, 14);
		contentPane.add(lblNewLabel_5);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner.setBounds(722, 73, 30, 20);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner_1.setBounds(722, 93, 30, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner_1_1.setBounds(722, 114, 30, 20);
		contentPane.add(spinner_1_1);
		
		JSpinner spinner_1_1_1 = new JSpinner();
		spinner_1_1_1.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner_1_1_1.setBounds(722, 135, 30, 20);
		contentPane.add(spinner_1_1_1);
		
		JSpinner spinner_1_1_1_1 = new JSpinner();
		spinner_1_1_1_1.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner_1_1_1_1.setBounds(722, 157, 30, 20);
		contentPane.add(spinner_1_1_1_1);
		
		JSpinner spinner_1_1_1_1_1 = new JSpinner();
		spinner_1_1_1_1_1.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner_1_1_1_1_1.setBounds(722, 178, 30, 20);
		contentPane.add(spinner_1_1_1_1_1);
		
		JSpinner spinner_1_1_1_1_2 = new JSpinner();
		spinner_1_1_1_1_2.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner_1_1_1_1_2.setBounds(722, 195, 30, 20);
		contentPane.add(spinner_1_1_1_1_2);
		
		JSpinner spinner_1_1_1_1_3 = new JSpinner();
		spinner_1_1_1_1_3.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner_1_1_1_1_3.setBounds(722, 216, 30, 20);
		contentPane.add(spinner_1_1_1_1_3);
		
		JLabel lblNewLabel_6 = new JLabel("a");
		lblNewLabel_6.setBounds(762, 80, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("b");
		lblNewLabel_6_1.setBounds(762, 96, 46, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("c");
		lblNewLabel_6_1_1.setBounds(762, 117, 46, 14);
		contentPane.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("d");
		lblNewLabel_6_1_1_1.setBounds(762, 138, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_1);
		
		JLabel lblNewLabel_6_1_1_2 = new JLabel("e");
		lblNewLabel_6_1_1_2.setBounds(762, 160, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_2);
		
		JLabel lblNewLabel_6_1_1_3 = new JLabel("f");
		lblNewLabel_6_1_1_3.setBounds(762, 181, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_3);
		
		JLabel lblNewLabel_6_1_1_4 = new JLabel("g");
		lblNewLabel_6_1_1_4.setBounds(762, 198, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_4);
		
		JLabel lblNewLabel_6_1_1_5 = new JLabel("h");
		lblNewLabel_6_1_1_5.setBounds(762, 219, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_5);
		
		JSpinner spinner9 = new JSpinner();
		spinner9.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner9.setBounds(722, 285, 30, 20);
		contentPane.add(spinner9);
		
		JSpinner spinner10 = new JSpinner();
		spinner10.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner10.setBounds(722, 305, 30, 20);
		contentPane.add(spinner10);
		
		JSpinner spinner11 = new JSpinner();
		spinner11.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner11.setBounds(722, 326, 30, 20);
		contentPane.add(spinner11);
		
		JSpinner spinner12 = new JSpinner();
		spinner12.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner12.setBounds(722, 347, 30, 20);
		contentPane.add(spinner12);
		
		JSpinner spinner13 = new JSpinner();
		spinner13.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner13.setBounds(722, 369, 30, 20);
		contentPane.add(spinner13);
		
		JSpinner spinner14 = new JSpinner();
		spinner14.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner14.setBounds(722, 390, 30, 20);
		contentPane.add(spinner14);
		
		JLabel lblNewLabel_6_2 = new JLabel("a");
		lblNewLabel_6_2.setBounds(762, 292, 46, 14);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("b");
		lblNewLabel_6_1_2.setBounds(762, 308, 46, 14);
		contentPane.add(lblNewLabel_6_1_2);
		
		JLabel lblNewLabel_6_1_1_6 = new JLabel("c");
		lblNewLabel_6_1_1_6.setBounds(762, 329, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_6);
		
		JLabel lblNewLabel_6_1_1_1_1 = new JLabel("d");
		lblNewLabel_6_1_1_1_1.setBounds(762, 350, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_1_1);
		
		JLabel lblNewLabel_6_1_1_2_1 = new JLabel("e");
		lblNewLabel_6_1_1_2_1.setBounds(762, 372, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_2_1);
		
		JLabel lblNewLabel_6_1_1_3_1 = new JLabel("f");
		lblNewLabel_6_1_1_3_1.setBounds(762, 393, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_3_1);
	
		
		JSpinner spinner15 = new JSpinner();
		spinner15.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner15.setBounds(722, 464, 30, 20);
		contentPane.add(spinner15);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("a");
		lblNewLabel_6_2_1.setBounds(762, 471, 46, 14);
		contentPane.add(lblNewLabel_6_2_1);
		
		JSpinner spinner16 = new JSpinner();
		spinner16.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner16.setBounds(722, 484, 30, 20);
		contentPane.add(spinner16);
		
		JLabel lblNewLabel_6_1_2_1 = new JLabel("b");
		lblNewLabel_6_1_2_1.setBounds(762, 487, 46, 14);
		contentPane.add(lblNewLabel_6_1_2_1);
		
		JSpinner spinner17 = new JSpinner();
		spinner17.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner17.setBounds(722, 540, 30, 20);
		contentPane.add(spinner17);
		
		JSpinner spinner18 = new JSpinner();
		spinner18.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner18.setBounds(722, 560, 30, 20);
		contentPane.add(spinner18);
		
		JLabel lblNewLabel_6_1_2_2 = new JLabel("b");
		lblNewLabel_6_1_2_2.setBounds(762, 563, 46, 14);
		contentPane.add(lblNewLabel_6_1_2_2);
		
		JLabel lblNewLabel_6_2_2 = new JLabel("a");
		lblNewLabel_6_2_2.setBounds(762, 547, 46, 14);
		contentPane.add(lblNewLabel_6_2_2);
		
		JSpinner spinner19 = new JSpinner();
		spinner19.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner19.setBounds(722, 581, 30, 20);
		contentPane.add(spinner19);
		
		JLabel lblNewLabel_6_1_1_6_1 = new JLabel("c");
		lblNewLabel_6_1_1_6_1.setBounds(762, 584, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_6_1);
		
		JSpinner spinner20 = new JSpinner();
		spinner20.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner20.setBounds(722, 602, 30, 20);
		contentPane.add(spinner20);
		
		JLabel lblNewLabel_6_1_1_1_1_1 = new JLabel("d");
		lblNewLabel_6_1_1_1_1_1.setBounds(762, 605, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_1_1_1);
		
		JSpinner spinner21 = new JSpinner();
		spinner21.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner21.setBounds(722, 624, 30, 20);
		contentPane.add(spinner21);
		
		JLabel lblNewLabel_6_1_1_2_1_1 = new JLabel("e");
		lblNewLabel_6_1_1_2_1_1.setBounds(762, 627, 46, 14);
		contentPane.add(lblNewLabel_6_1_1_2_1_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Pagina 2", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Crecimiento y Desarrollo Profesional");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 36, 209, 14);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_7 = new JLabel("Autoevaluaci\u00F3n Narrativa");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(0, 11, 916, 14);
		panel_1.add(lblNewLabel_7);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 90, 561, 124);
		panel_1.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{"a. Obtenci\u00F3n de premios, ayudas y becas "},
				{"b. Nombramiento como asesor/a en agencias del gobierno estatal o federal"},
				{"c. Participaci\u00F3n activa en organizaciones profesionales "},
				{"d. Recurso en conferencias y charlas"},
				{"e. Participaci\u00F3n en conferencias, congresos o institutos "},
				{"f. Educaci\u00F3n post doctoral, educaci\u00F3n continua"},
			},
			new String[] {
				"Preguntas"
			}
		));
		scrollPane_4.setViewportView(table_4);
		
		
		
		JLabel lblNewLabel_5_1 = new JLabel("Puntuaci\u00F3n");
		lblNewLabel_5_1.setBounds(649, 68, 97, 14);
		panel_1.add(lblNewLabel_5_1);
		
		JSpinner spinner22 = new JSpinner();
		spinner22.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner22.setBounds(588, 89, 30, 20);
		panel_1.add(spinner22);
		
		JLabel lblNewLabel_6_3 = new JLabel("a");
		lblNewLabel_6_3.setBounds(628, 96, 46, 14);
		panel_1.add(lblNewLabel_6_3);
		
		JSpinner spinner23 = new JSpinner();
		spinner23.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner23.setBounds(588, 109, 30, 20);
		panel_1.add(spinner23);
		
		JLabel lblNewLabel_6_1_3 = new JLabel("b");
		lblNewLabel_6_1_3.setBounds(628, 112, 46, 14);
		panel_1.add(lblNewLabel_6_1_3);
		
		JSpinner spinner24 = new JSpinner();
		spinner24.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner24.setBounds(588, 130, 30, 20);
		panel_1.add(spinner24);
		
		JLabel lblNewLabel_6_1_1_7 = new JLabel("c");
		lblNewLabel_6_1_1_7.setBounds(628, 133, 46, 14);
		panel_1.add(lblNewLabel_6_1_1_7);
		
		JSpinner spinner25 = new JSpinner();
		spinner25.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner25.setBounds(588, 151, 30, 20);
		panel_1.add(spinner25);
		
		JLabel lblNewLabel_6_1_1_1_2 = new JLabel("d");
		lblNewLabel_6_1_1_1_2.setBounds(628, 154, 46, 14);
		panel_1.add(lblNewLabel_6_1_1_1_2);
		
		JSpinner spinner26 = new JSpinner();
		spinner26.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner26.setBounds(588, 173, 30, 20);
		panel_1.add(spinner26);
		
		JLabel lblNewLabel_6_1_1_2_2 = new JLabel("e");
		lblNewLabel_6_1_1_2_2.setBounds(628, 176, 46, 14);
		panel_1.add(lblNewLabel_6_1_1_2_2);
		
		JSpinner spinner27 = new JSpinner();
		spinner27.setModel(new SpinnerNumberModel(0, -1, 3, 1));
		spinner27.setBounds(588, 194, 30, 20);
		panel_1.add(spinner27);
		
		JLabel lblNewLabel_6_1_1_3_2 = new JLabel("f");
		lblNewLabel_6_1_1_3_2.setBounds(628, 197, 46, 14);
		panel_1.add(lblNewLabel_6_1_1_3_2);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				instrumentoII = new int[30];
				//Calidad Panel
				instrumentoII[0] = (int) spinner.getValue();
				
				instrumentoII[1] = (int) spinner_1.getValue();
				
				instrumentoII[2] = (int) spinner_1_1.getValue();
				
				instrumentoII[3] = (int) spinner_1_1_1.getValue();
				
				instrumentoII[4] = (int) spinner_1_1_1_1.getValue();
				
				instrumentoII[5] = (int) spinner_1_1_1_1_1.getValue();
				
				instrumentoII[6] = (int) spinner_1_1_1_1_2.getValue();
				
				instrumentoII[7] = (int) spinner_1_1_1_1_3.getValue();
				
				
				
				//Servicio panel
				instrumentoII[8] = (int) spinner9.getValue();
				
				instrumentoII[9] = (int) spinner10.getValue();
				
				instrumentoII[10] = (int) spinner11.getValue();
				
				instrumentoII[11] = (int) spinner12.getValue();
				
				instrumentoII[12] = (int) spinner13.getValue();
				
				instrumentoII[13] = (int) spinner14.getValue();
				
				
				
				//Servicio a la comunidad
				instrumentoII[14] = (int) spinner15.getValue();
				
				instrumentoII[15] = (int) spinner16.getValue();
				
				
				
				//Investigacion Panel
				instrumentoII[16] = (int) spinner17.getValue();
				
				instrumentoII[17] = (int) spinner18.getValue();
				
				instrumentoII[18] = (int) spinner19.getValue();
				
				instrumentoII[19] = (int) spinner20.getValue();
				
				instrumentoII[20] = (int) spinner21.getValue();
				instrumentoII[21] = (int) spinner22.getValue();
				instrumentoII[21] = (int) spinner23.getValue();
				instrumentoII[22] = (int) spinner24.getValue();
				instrumentoII[23] = (int) spinner25.getValue();
				instrumentoII[24] = (int) spinner26.getValue();
				instrumentoII[25] = (int) spinner27.getValue();
				
				
				for(int i = 0; i < 26;i++)
				{
					totalI2 = instrumentoII[i] + totalI2;
				}
				System.out.println(totalI2);
				
		        try{
		        	for(int i = 0; i < 26; i++) {
		            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");//Loading Driver
		            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C://DatabaseProject.accdb");//Establishing Connection
		            System.out.println("Connected Successfully");

		           PreparedStatement preparedStatement=connection.prepareStatement("insert into Instrumento2 values(?,?)");
		            //Setting values for Each Parameter

		        	preparedStatement.setInt(1,1);
		            preparedStatement.setInt(2,instrumentoII[i]);
		            //Executing Query
		            preparedStatement.executeUpdate();
		            System.out.println("data inserted successfully");
		            
		            
		        	}
		        }
		        catch(Exception e){
		            System.out.println("Error in connection");

		        }
				
				new I33().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(397, 631, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new menu1().setVisible(true);
				dispose();
			}
		});
		btnMenu.setBounds(515, 631, 89, 23);
		panel_1.add(btnMenu);
	}

}
