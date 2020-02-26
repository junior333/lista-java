package lista;

import javax.swing.JOptionPane;

/*
 * Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem
crescente.
 */
public class ex22 {

	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("digite o 1 numero: "));
		int b=Integer.parseInt(JOptionPane.showInputDialog("digite o 2 numero: "));
		
		if(a<b) {
			JOptionPane.showMessageDialog(null, "a ordem dos numeros é: "+a+", "+b);
		}
		else
			JOptionPane.showMessageDialog(null, "a ordem dos numeros é: "+b+", "+a);
	}

}
