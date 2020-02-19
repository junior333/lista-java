package lista;

import javax.swing.JOptionPane;

/*
 * Receba o raio de uma circunferência. Calcule e mostre o comprimento da
circunferência.
 */
public class ex11 {

	public static void main(String[] args) {
		int r=Integer.parseInt(JOptionPane.showInputDialog("digite o raio da circunferência: "));
		
		double c=2*3.14*r;
		
		JOptionPane.showMessageDialog(null, "a circunferencia do raio "+r+" é: "+c);
	}

}
