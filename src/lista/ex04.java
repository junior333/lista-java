package lista;

import javax.swing.JOptionPane;

/*
 * Receba a temperatura em graus Celsius. Calcule e mostre a sua
temperatura convertida em fahrenheit F = (9*C+160) /5.
 */
public class ex04 {

	public static void main(String[] args) {
		int c=Integer.parseInt(JOptionPane.showInputDialog("digite a temperatura(°C): "));
		double f=(9*c+160)/5;
		JOptionPane.showMessageDialog(null, "a temperatura de "+c+"°C convertido e fahrenheit é: "+f);
	}

}
