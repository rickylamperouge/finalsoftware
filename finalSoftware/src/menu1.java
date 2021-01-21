import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
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
import java.awt.Color;


import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;

import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;



public class menu1 extends menuFinal {
	ArrayList instrumentoIList = new ArrayList();
	ArrayList instrumentoIAList = new ArrayList();
	ArrayList instrumentoIIList = new ArrayList();
	ArrayList instrumentoIIIList = new ArrayList();
	ArrayList instrumentoIIIAList = new ArrayList();
	ArrayList instrumentoIVList = new ArrayList();
	ArrayList valenciaRCAList = new ArrayList();
	public int arra;
	public int arrayB;
	public int arrayC;
	public int arrayD;
	public int arrayE;
	public int arrayF;
	public int arrayRCA;
	public int promedio = 22;
	public int[] instrumentoI;
	
	public int[] instrumentoIA;
	public int[] instrumentoII;
	public int[] instrumentoIII;
	public int[] instrumentoIIIA;
	public int[] instrumentoIV;
	public int[] valenciaRCA;
	public String[] valenciaRCAString;

	
	public String[] instrumentoIIItxt;
	public String[] instrumentoIIIAtxt;
	public String[] instrumentoIAtxt;
	public String[] instrumentoIVtxt;
	public double A = 0.25;
	public double B = 0.25;
	public double C = 0.25;
	public double D = 0.25;
	public double sB = 0.8;
	public double sD = 0.2;
	public double iB = .9;
	public double iD = .1;
	public int totalI = 0;
	public int totalIA = 0;
	public int totalI2 = 0;
	public int totalI3 = 0;
	public int totalI3A = 0;
	int totalI4 = 0;
	//**********************************************************************************
	//Calidad docente a
	public double valenciaCalAI1 = 0;
	public double valenciaCalApromI1 = 0;
	public double puntuacionCalA = 0;
	public double valenciaCalAI3 = 0;
	public double valenciaCalApromI3 = 0;
	public double valenciaCalAI1A = 0;
	public double valenciaCalAI1Aprom = 0;
	//termina calidad docente a
	
	//Calidad docente b
	public double valenciaCalBI1 = 0;
	public double valenciaCalBpromI1 = 0;
	public double valenciaCalBI1A = 0;
	public double valenciaCalBI1Aprom = 0;
	public double valenciaCalBI3 = 0;
	public double valenciaCalBpromI3 = 0;
	public double puntuacionCalB = 0;
	
	//termina calidad docente b
	
	//Calidad docente c
	public double puntuacionCalC = 0;
	//termina calidad docente c
	//calidad docente d
	public double puntuacionCalD = 0;
	//termina calidad docente d
	
	//calidad docente e
	public double valenciaCalEI1 = 0;
	public double puntuacionCalE = 0;
	public double valenciaCalEpromI1 = 0;
	public double valenciaCalEI1A = 0;
	public double valenciaCalEI1Aprom = 0;
	public double valenciaCalEI3 = 0;
	public double valenciaCalEpromI3 = 0;
	//termina calidad docente e
	
	//calidad docente f
	public double valenciaCalFI1 = 0;
	public double valenciaCalFI1A = 0;
	public double valenciaCalFpromI1 = 0;
	public double valenciaCalFI1Aprom = 0;
	public double puntuacionCalF = 0;
	public double valenciaCalFI3 = 0;
	public double valenciaCalFpromI3 = 0;	
	public double valenciaCalFI4 = 0;
	public double valenciaCalFpromI4 = 0;
	
	//termina calidad docente f
	
	//calidad docente g y h
	public double valenciaCalGpromI1 = 0;
	public double valenciaCalGI1Aprom = 0;
	public double valenciaCalGI1A = 0;
	//termina calidad docente g y h
	//**********************************************************************************
	//Servicio a la institucion a
	public double puntuacionSIA = 0;
	public double valenciaSIApromI4 = 0;
	//Termina servicio a la institucion a
	
	//Servicio a la institucion bc
	public double puntuacionSIBC =0;
	//Termina la institucion bc
	
	//Servicio a la institucion de
	public double puntuacionSIDE = 0;
	//Termina servicio a la institucion de
	
	//Servicio a la institucion fg
	public double puntuacionSIFG = 0;
	//Termina servicio a la institucion fg
	
	//Servicio a la comunidad 
	public double puntuacionSCAB = 0;
	//Termina servicio a la comunidad
	
	//Investigacion y trabajo creativo 12%
	public double puntuacionITa = 0;
	public double puntuacionITb = 0;
	public double puntuacionITcde = 0;
	
	
	//Termina investigacion y trabajo creativo
	
	
	
	
	//Crecimiento y desarrollo profesional
	 public double puntuacionCDP1;
	 public double puntuacionCDP2;
	 public double puntuacionCDP3;
	
	//Termina Crecimiento y desarrollo profesional

	private JPanel contentPane;

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
		setForeground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione una opcion:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(150, 10, 205, 41);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Instrumento 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new I11().setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBounds(118, 61, 266, 21);
		contentPane.add(btnNewButton);
		
		JButton btnInstrumentoa = new JButton("Instrumento 1-A");
		btnInstrumentoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new I11A().setVisible(true);
				dispose();
			}
		});
		btnInstrumentoa.setForeground(Color.DARK_GRAY);
		btnInstrumentoa.setFont(new Font("Arial", Font.BOLD, 12));
		btnInstrumentoa.setBounds(118, 92, 266, 21);
		contentPane.add(btnInstrumentoa);
		
		JButton btnInstrumento = new JButton("Instrumento 2");
		btnInstrumento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new I22().setVisible(true);
				dispose();
			}
		});
		btnInstrumento.setForeground(Color.DARK_GRAY);
		btnInstrumento.setFont(new Font("Arial", Font.BOLD, 12));
		btnInstrumento.setBounds(118, 123, 266, 21);
		contentPane.add(btnInstrumento);
		
		JButton btnInstrumento_1 = new JButton("Instrumento 3");
		btnInstrumento_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new I33().setVisible(true);
				dispose();
			}
		});
		btnInstrumento_1.setForeground(Color.DARK_GRAY);
		btnInstrumento_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnInstrumento_1.setBounds(118, 154, 266, 21);
		contentPane.add(btnInstrumento_1);
		
		JButton btnInstrumentoa_1 = new JButton("Instrumento 3-A");
		btnInstrumentoa_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new I33A().setVisible(true);
				dispose();
				
			}
		});
		btnInstrumentoa_1.setForeground(Color.DARK_GRAY);
		btnInstrumentoa_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnInstrumentoa_1.setBounds(118, 185, 266, 21);
		contentPane.add(btnInstrumentoa_1);
		
		JButton btnInstrumento_2 = new JButton("Instrumento 4");
		btnInstrumento_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new I44().setVisible(true);
				dispose();
			}
		});
		btnInstrumento_2.setForeground(Color.DARK_GRAY);
		btnInstrumento_2.setFont(new Font("Arial", Font.BOLD, 12));
		btnInstrumento_2.setBounds(118, 216, 266, 21);
		contentPane.add(btnInstrumento_2);
		
	}
}
