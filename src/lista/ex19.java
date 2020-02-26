package lista;

import javax.swing.JOptionPane;

/*
 * Receba 2 valores reais. Calcule e mostre o maior deles.
 */
public class ex19 {

	public static void main(String[] args) {
		double a=Double.parseDouble(JOptionPane.showInputDialog("digite o 1 valor real: "));
		double b=Double.parseDouble(JOptionPane.showInputDialog("digite o 2 valor real: "));
		
		if(a>b) {
			JOptionPane.showMessageDialog(null, "o maior numero é: "+a);
		}
		else
			JOptionPane.showMessageDialog(null, "o maior numero é: "+b);
	}

}
