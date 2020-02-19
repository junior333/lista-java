package lista;

import javax.swing.JOptionPane;

/*
 * Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias
durará esse alimento sabendo que a pessoa consome 50g ao dia.
 */
public class ex13 {

	public static void main(String[] args) {
		int kg=Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de alimento (kg)"));
		JOptionPane.showMessageDialog(null, "o alimento durará "+(kg/0.050)+" dias");
	}

}
