package lista;

import javax.swing.JOptionPane;

/*
 * Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados
 */
public class ex09 {

	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("digite o 1 valor: "));
		int b=Integer.parseInt(JOptionPane.showInputDialog("digite o 2 valor: "));
		JOptionPane.showMessageDialog(null, "a soma dos quadrados é: "+(a*a+b*b));
	}

}
