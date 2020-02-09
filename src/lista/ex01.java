package lista;

import javax.swing.JOptionPane;

/*Coletar o valor do lado de um quadrado, calcular sua área e apresentar o
resultado.
 * 
 */
public class ex01 {

	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("digite o valor do lado do quadrado"));
		a=(int) Math.pow(a, 2);
		System.out.println("o valor do quadrado é: "+a);
	}

}
