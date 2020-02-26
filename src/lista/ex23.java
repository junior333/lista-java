package lista;

import javax.swing.JOptionPane;

/*
 * Receba 3 valores obrigatoriamente em ordem crescente e um 4o valor não
necessariamente em ordem. Mostre os 4 números em ordem crescente.
 */
public class ex23 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("digite 3 numeros em ordem crescente: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("digite 2 numeros restantes: "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("digite 1 numero restante: "));
		int d = Integer.parseInt(JOptionPane.showInputDialog("digite 1 numero aleatório: "));
		
		if(d<a) {
			JOptionPane.showMessageDialog(null,"a ordem dos numeros é: " +d+a+b+c);
			
		}
		else {
			if(d<b){
				JOptionPane.showMessageDialog(null,"a ordem dos numeros é: " +a+d+b+c);
			}
			else {
				if(d<c){
					JOptionPane.showMessageDialog(null,"a ordem dos numeros é: " +a+b+d+c);
				}
				else {
					JOptionPane.showMessageDialog(null,"a ordem dos numeros é: " +a+b+c+d);
				}
			}
		}
	}

}
