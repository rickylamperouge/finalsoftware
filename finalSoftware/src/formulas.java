import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class formulas extends  I44 {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formulas frame = new formulas();
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
	public formulas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//rango catedratico asociado
		//calidad docente formula  a
		int m = 0;
		int n = 0;
		int CDa = 15;
		int CDb = 10;
		double i1a = m/((m+n)*(valenciaCalApromI1)) + n/((m+n)*(valenciaCalAI1Aprom));
		puntuacionCalA = (A*i1a) + (B*totalI2) + (C*valenciaCalApromI3)+(D*instrumentoIV[15])*3/4*(CDa/3);
		//termina calidad docente formula  a
		
		//calidad docente formula b
		double i1b = m/((m+n)*(valenciaCalBpromI1)) + n/((m+n)*(((instrumentoIA[7] + instrumentoIA[9] + instrumentoIA[11] + instrumentoIA[12]
				+ instrumentoIA[24])/5)-1));
		puntuacionCalB = ((A*i1b) + (B*totalI2) + (C*valenciaCalBpromI3)*(CDb/3))/(1-D);
		
		
		//termina calidad docente formula  b
		
	}

}
