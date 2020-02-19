package lista;

import javax.swing.JOptionPane;

/*
 * Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3o ângulo.
 */
public class ex14 {

	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("digite o 1 angulo: "));
		int b=Integer.parseInt(JOptionPane.showInputDialog("digite o 2 angulo: "));
		
		int c=180-a-b;
	
		JOptionPane.showMessageDialog(null, "o valor do 3 angulo é: "+c);
	}

}
