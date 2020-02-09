package lista;

import javax.swing.JOptionPane;

/*
 * Receba a base e a altura de um triângulo. Calcule e mostre a sua área
 */
public class ex03 {

	public static void main(String[] args) {
		int base=Integer.parseInt(JOptionPane.showInputDialog("digite a base: "));
		int alt=Integer.parseInt(JOptionPane.showInputDialog("digite a altura: "));
		double area=base*alt/2;
		
		JOptionPane.showMessageDialog(null, "a área do triangulo é: "+area);
	}

}
