package no.hvl.dat100;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("Skriv inn et heltall som er større enn 0");
	int n = Integer.parseInt(input);
	
	long fakultetet = 1;
	for (int i = 1; i <= n; i++) {
		fakultetet *= i;
	}
	
	JOptionPane.showMessageDialog(null, "Verdien av" + n + " ! er: " + fakultetet);
	}
}
