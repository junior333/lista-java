package lista;

import javax.swing.JOptionPane;

/*
 * Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 */
public class ex24 {

	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("digite um numero inteiro: "));
		
		if(a%6==0) {
			JOptionPane.showMessageDialog(null, "o numero é divisivel por 2 e 3");
		}
		else
			JOptionPane.showMessageDialog(null, "o numero não é divisivel por 2 e 3");
	}

}
