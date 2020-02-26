package lista;

import javax.swing.JOptionPane;

/*
 * Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do
maior pelo menos valor.
 */
public class ex18 {

	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("digite o 1 valor: "));
		int b=Integer.parseInt(JOptionPane.showInputDialog("digite o 2 valor: "));
		
		if(a>b) {
			JOptionPane.showMessageDialog(null, "a diferença dos maior pro menor é: "+(a-b));
		}
		else {
			JOptionPane.showMessageDialog(null, "a diferença dos maior pro menor é: "+(b-a));
		}
	}

}
