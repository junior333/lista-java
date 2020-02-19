package lista;

import javax.swing.JOptionPane;

/*
 * Receba o valor de um depósito em poupança. Calcule e mostre o valor
após 1 mês de aplicação sabendo que rende 1,3% a. m.
 */
public class ex08 {

	public static void main(String[] args) {
		double dep=Double.parseDouble(JOptionPane.showInputDialog("digite o valor do depósito: "));
		dep=dep*1.013;
		JOptionPane.showMessageDialog(null,"a valor após 1 mês é: "+dep);
	}

}
