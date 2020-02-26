package lista;

import javax.swing.JOptionPane;

/*
 * Calcule a quantidade de litros gastos em uma viagem, sabendo que o
automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
 */
public class ex17 {

	public static void main(String[] args) {
		double tp=Double.parseDouble(JOptionPane.showInputDialog("digite o tempo de percurso(hr): "));
		double vm=Double.parseDouble(JOptionPane.showInputDialog("digite a velocidade média(km/h): "));
		
		double lg=tp*vm/12;
		
		JOptionPane.showMessageDialog(null, "a quantidade de litros gastos é: "+lg);
	}

}
