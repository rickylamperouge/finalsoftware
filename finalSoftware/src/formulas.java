import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formulas extends I44 {

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
		int m = 1;
		int n = 1;
		int CDa = 15;
		int CDb = 10;
		int Cdc = 6;
		int CDd = 6;
		int CDe = 7;
		int CDf = 9;
		int SIa = 3;
		int SIbc = 3;
		int SIde = 2;
		int SIfg = 3;
		int SCab = 2;
		int ITa = 3;
		int ITb = 4;
		int ITcde = 5;
		
		int DPabc = 4;
		int DPd = 3;
		int DPef = 3;
		double CDPB = .9;
		double CDPD = .1;
		    
		double i1a = m/((m+n)*(valenciaCalApromI1)) + n/((m+n)*(valenciaCalAI1Aprom));
		puntuacionCalA = (A*i1a) + (B*totalI2) + (C*valenciaCalApromI3)+(D*instrumentoIV[15])*3/4*(CDa/3);
		//termina calidad docente formula  a
		
		//calidad docente formula b
		double i1b = m/((m+n)*(valenciaCalBpromI1)) + n/((m+n)*(((instrumentoIA[7] + instrumentoIA[9] + instrumentoIA[11] + instrumentoIA[12]
				+ instrumentoIA[24])/5)-1));
		puntuacionCalB = ((A*i1b) + (B*totalI2) + (C*valenciaCalBpromI3)*(CDb/3))/(1-D);
		
		
		//termina calidad docente formula  b
		
		//calidad docente formula c
		puntuacionCalC = ((B*totalI2 + C*((instrumentoIII[6]+instrumentoIII[7])/2)*3/4+D*instrumentoIV[17]*(3/4)))*(Cdc/3)/(1-A);
		
		//termina calidad docente formula c
		
		//calidad docente formula d***********
		puntuacionCalD = (A*(instrumentoI[16]-1)*(CDd/3)+B*totalI2+(C*(instrumentoIII[4]+instrumentoIII[5])*(3/4))*(CDd/3))/(1-D);
		//termina calidad docente fomula d
		
		//calidad docente fomula e
		double i1e = m/((m+n)*(valenciaCalEpromI1)) + n/((m+n)*(valenciaCalEI1Aprom));
		puntuacionCalE = (A*i1e+B*totalI2+(C*valenciaCalEpromI3)+(D*instrumentoIV[15]*(3/4)))*(CDe/3);
		
		//termina calidad docente fomula e
		
		//calidad docente fomula f
		double i1f = m/((m+n)*(valenciaCalFpromI1)) + n/((m+n)*(valenciaCalFI1Aprom));
		puntuacionCalF = (A*i1f+B*totalI2+C*valenciaCalFpromI3+D*valenciaCalFpromI4)*(CDf/3);
		
		//termina calidad docente fomula f
		
		//calidad docente g y h
		double i1g = m/((m+n)*(valenciaCalGpromI1)) + n/((m+n)*(valenciaCalGI1Aprom));
		//double i1h = m/((m+n)*(valenciaCalHpromI1)) + n/((m+n)*(valenciaCalHI1Aprom));
		
		//termina calidad docente g y h
		
		//**********************************************************************************
		//Criterio Servicio a la Institución 11%
		//Servicio a la institucion a
		puntuacionSIA = (sB*totalI2 + D*valenciaSIApromI4)/(SIa/3);
		//Termina servicio a la institucion a
		
		//Servicio a la institucion bc
		double  i4b = (instrumentoIV[4] + instrumentoIV[5] + instrumentoIV[10])*(3/4);
		double  i4c = instrumentoIV[9]*(3/4);
		double i4 = (i4b+i4c)/2;
		puntuacionSIBC = ((sB*totalI2 + sD*i4))*(SIbc/3);
		//Termina servicio a la institucion b
		
		
		
		//Servicio a la institucion de
		double i4e = instrumentoIV[10] * (3/4);
		puntuacionSIDE = (sB * totalI2 + sD*i4e)*(SIde/3);
		//Termina servicio a la institucion de
		
		//Servicio a la institucion fg
		puntuacionSIFG = (totalI2)*(SIfg/3);
		
		//Termina Servicio a la institucion fg
		
		//Servicio a la comunidad 
		puntuacionSCAB = 1*totalI2*(SCab/3);
		
		//Termina Servicio ala comunidad
		
		
		
		//Investigacion y trabajo creativo
		puntuacionITa = totalI2*(ITa/3);
		puntuacionITb = (iB*totalI2) + (iD*instrumentoIV[15])*(3/4);
		puntuacionITcde = (totalI2)*(ITcde/3);
		
		//Termina Investigacion y trabajo creativo
		
		//Crecimiento y Sesarrollo Profesional 10%
        puntuacionCDP1 = (totalI2)*(DPabc/3);
        puntuacionCDP2 = (totalI2)*(DPd/3);
        puntuacionCDP3 = ((CDPB)*(totalI2)+(CDPD*totalI4))*(DPef/3);
        //Termina Crecimiento y Desarrollo Profesional
        //*************************************************************************************
        
        
        //Empiezan formulas instrumento 2
        //Calidad docente
        int actividadA = 0;
        int añosA = 0;
        double CDaI2 = actividadA/añosA;
        //***************************
        double CDbI2;
        //**********
        int actividadC = 0;
        int añosC = 0;
        double CDcI2 = actividadC/añosC;
        //*****************************
        int comiteD = 0;
        int añosD = 0;
        double CDdI2 = comiteD/añosD;
        //*******************************
        int actividadE = 0;
        int añosE = 0;
        double CDeI2 = actividadE/añosE;
        //********************************
        int actividadF = 0;
        int añosF = 0;
        double CDfI2 = actividadF/añosF;
        //********************************
        int actividadGH = 0;
        int añosGH = 0;
        double CDgh = actividadGH/añosGH;
        //Termina calidad docente
        //*******************************
        
        //Servicio a la institucion I2
        int comitesSIA = 0;
        int añosSIA = 0;
        double SIaI2 = comitesSIA/añosSIA;
        //************************************
        int comitesSIBC = 0;
        int añosSIBC = 0;
        double SIbcI2 = comitesSIBC/añosSIBC;
        //*************************************
        int actividadSIDE = 0;
        int añosSIDE = 0;
        double SIdeI2 = actividadSIDE/añosSIDE;
        //*****************************
        int designacionSIFG = 0;
        int añosSIFG = 0;
        double SIfgI2 = designacionSIFG/añosSIFG;
        //Termina Servicio a la institucion I2
        //***************************************
        
        //Comienza servicio a la comunidad I2
        int actividadSCAB = 0;
        int añosSCAB = 0;
        double SCabI2 = actividadSCAB/añosSCAB;
        //Termina servicio a la comunidad I2
        //****************************************
        
        //Comienza Investigacion y Trabajo Creativo
        int publicacionITCa = 0;
        int libroITCa = 0;
        int tesisITCa = 0; //DUDA CON ASIGNACION DE PUNTOS. NO SE SI ES 1 PT POR TESIS/ARTICULOS O SI ES SOLO 1 PT SI HA HECHO ALGUNO DE ELLOS
        int añosITCa = 0;
        double ITCaI2 = (publicacionITCa + (libroITCa * 2) + tesisITCa)/añosITCa;
        //****************************************
        int presentacionITCb = 0;
        int cursoITCb = 0;
        int manualesITCb = 0;
        int añosITCb = 0;
        double ITCbI2 = (presentacionITCb + (cursoITCb * 2) + manualesITCb)/ añosITCb;
        //****************************************
        int propuesta1ITCcde = 0; //Se refiere a intento
        int propuesta2ITCcde = 0; //Se refiere a propuesta o patente aprobada
        int propuesta3ITCcde = 0; //Se refiere a propuesta o patente negada
        int añosITCcde = 0;
        double ITCcdeI2 = (propuesta1ITCcde + (propuesta2ITCcde * 2) + propuesta3ITCcde)/añosITCcde;
        //Termina Investigacion y Trabajo Creativo
        
        //Comienza Crecimiento y Desarrollo Profesional
        int conceptoCDPabc = 0;
        int añosCDPabc = 0;
        double CDPabcI2 = (conceptoCDPabc * 3)/añosCDPabc;
        //****************************************
        int conceptoCDPd = 0;
        int añosCDPd = 0;
        double CDPdI2 = (conceptoCDPd * 3)/añosCDPd;
        //****************************************
        int participacionCDPef = 0;
        int educacionCDPef = 0; //DUDA CON ASIGNACION DE PUNTOS. NO SE SI ES 2 PT POR EDUCACION
        int cursosCDPef = 0;
        double CDPefI2 = 0;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //termina servicio a la comunidad I2
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.println(puntuacionCalA);
				System.out.println(puntuacionCalB);
				System.out.println(puntuacionCalC);
				System.out.println(puntuacionCalD);
				System.out.println(puntuacionCalF);
				
				
				
			}
		});
		btnNewButton.setBounds(169, 106, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
