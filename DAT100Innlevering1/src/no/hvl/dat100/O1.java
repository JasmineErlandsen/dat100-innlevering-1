package no.hvl.dat100;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*; 
public class O1 {

	public static void main(String[] args) {
		 String inntektStr = JOptionPane.showInputDialog("oppgi din bruttoinntekt: ");
		 
		 double bruttoinntekt = Double.parseDouble(inntektStr);
		 
		 double trinnskatt = beregnTrinnskatt(bruttoinntekt);
		 
		 JOptionPane.showMessageDialog(null,
		 String.format("Du må betale %.2f NOK i trinnskatt", trinnskatt),
		 "trinnskatt Beregning",
		 JOptionPane.INFORMATION_MESSAGE); 
		 
	}

	private static String ShowInputDialog(Object object, String string) {
		return null;
	}

	public static double beregnTrinnskatt(double bruttoinntekt) {
		double trinn1_sats = 0.017;
		double trinn2_sats = 0.04;
		double trinn3_sats = 0.136;
		double trinn4_sats = 0.166;
		double trinn5_sats = 0.176;
		
		
		double trinn1_grense = 208051;
		double trinn2_grense = 292851;
		double trinn3_grense = 670001;
		double trinn4_grense = 937901;
		double trinn5_grense = 1350001;
		
		double trinnskatt = 0.0;
		
		if (bruttoinntekt > trinn4_grense) {
			trinnskatt += (bruttoinntekt - trinn4_grense) * trinn4_sats;
			bruttoinntekt = trinn4_grense;
		}
		if (bruttoinntekt > trinn3_grense) {
			trinnskatt += (bruttoinntekt - trinn3_grense) * trinn3_sats;
			bruttoinntekt = trinn3_grense;
		}
		if (bruttoinntekt > trinn2_grense) {
            trinnskatt += (bruttoinntekt - trinn2_grense) * trinn2_sats;
            bruttoinntekt = trinn2_grense;
        }
        if (bruttoinntekt > trinn1_grense) {
            trinnskatt += (bruttoinntekt - trinn1_grense) * trinn1_sats;
        }

        return trinnskatt;
		}
	}


