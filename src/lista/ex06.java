package lista;

import javax.swing.JOptionPane;

/*
 * Receba os valores em x e y. Efetua a troca de seus valores e mostre seus
conteúdos.
 */
public class ex06 {

	public static void main(String[] args) {
		int x=Integer.parseInt(JOptionPane.showInputDialog("digite X: "));
		int y=Integer.parseInt(JOptionPane.showInputDialog("digite Y: "));
		JOptionPane.showMessageDialog(null,"valores " +x+" e "+y);
		int aux=x;
		x=y;
		y=aux;
		JOptionPane.showMessageDialog(null,"trocados "+ x+" e "+y);
	}

}
