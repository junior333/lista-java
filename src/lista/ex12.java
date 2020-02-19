package lista;

import javax.swing.JOptionPane;

/*
 * Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e
quantos anos terá daqui a 17 anos.
 */
public class ex12 {

	public static void main(String[] args) {
		int aa=Integer.parseInt(JOptionPane.showInputDialog("digite o ano atual: "));
		int an=Integer.parseInt(JOptionPane.showInputDialog("digite o ano de nascimento: "));
		
		JOptionPane.showMessageDialog(null, "A idade atual é "+(aa-an)+"\n e a idade daqui 17 anos é "+(aa-an+17));
	}

}
