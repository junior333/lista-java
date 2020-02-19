package lista;

import javax.swing.JOptionPane;

/*
 * Receba 2 números reais. Calcule e mostre a diferença desses valores.
 */
public class ex10 {

	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("digite o 1 numero"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("digite o 2 numero"));
		if(a>b) {
			JOptionPane.showMessageDialog(null, "a diferença dos numeros é de: "+(a-b));
		}
		else {
			JOptionPane.showMessageDialog(null,"a diferença dos numeros é de: "+(b-a));
		}
	}

}
