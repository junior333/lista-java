package lista;

import javax.swing.JOptionPane;

/*
 * Receba os valores do comprimento, largura e altura de um paralelepípedo.
Calcule e mostre seu volume.
 */
public class ex07 {

	public static void main(String[] args) {
		int lag=Integer.parseInt(JOptionPane.showInputDialog("digite a largura: "));
		int alt=Integer.parseInt(JOptionPane.showInputDialog("digite a altura: "));
		int com=Integer.parseInt(JOptionPane.showInputDialog("digite o comprimento: "));
		
		int vol=lag*alt*com;
		JOptionPane.showMessageDialog(null, "o volume do paralelepípedo é: "+vol);
	}

}
