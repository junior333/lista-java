package lista;

import javax.swing.JOptionPane;

/*
 * Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre
a hipotenusa.
 */
public class ex15 {

	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("digite o 1 cateto: "));
		int b=Integer.parseInt(JOptionPane.showInputDialog("digite o 2 cateto: "));
		double c=Math.sqrt(a*a+b*b);
		
		JOptionPane.showMessageDialog(null, "o valor da hipotenusa é: "+c);
	}

}
