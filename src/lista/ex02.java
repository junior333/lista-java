package lista;

import javax.swing.JOptionPane;

/*
 * Receba o salário de um funcionário e mostre o novo salário com reajuste
de 15%.
 */
public class ex02 {

	public static void main(String[] args) {
		double sal=Double.parseDouble(JOptionPane.showInputDialog("digite o salário"));
		sal=sal*1.015;
		JOptionPane.showMessageDialog(null, "o novo salário é: "+sal);
	}

}
