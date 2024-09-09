package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			int a = 101;
		
			
			while (a < 0 || a > 100) {
				String inputA = JOptionPane.showInputDialog("Poengsum :");
				a = Integer.parseInt(inputA);
				if (a < 0 || a > 100) {
				System.out.println("Ugyldig poengsum. Oppgi en verdi mellom 0 og 100.");
				}
				
			}
				
			if (a <= 100 && a >= 90) {
				System.out.println("A");
			} else if (a <= 89 && a >= 80) {
				System.out.println("B");

			} else if (a <= 79 && a >= 60) {
				System.out.println("C");

			} else if (a <= 59 && a >= 50) {
				System.out.println("D");

			} else if (a <= 49 && a >= 40) {
				System.out.println("E");

			} else if (a <= 39 && a >= 0) {
				System.out.println("F");

		
			}

		}
	}
}


	