package lista;

import javax.swing.JOptionPane;

/*
 * Receba 3 coeficientes A, B, e C de uma equação do 2o grau da fórmula
AX2+BX+C=0. Verifique e mostre a existência de raízes reais e se caso
exista, calcule e mostre.
 */
public class ex20 {

	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("digite o valor de A: "));
		int b=Integer.parseInt(JOptionPane.showInputDialog("digite o valor de B: "));
		int c=Integer.parseInt(JOptionPane.showInputDialog("digite o valor de C: "));
		
		double d=b*b-4*a*c;
		double rd=Math.sqrt(d);
		if(rd<0) {
			JOptionPane.showMessageDialog(null, "raízes não compatíveis");
		}
		else {
		double r1=(-b+rd)/(2*a);
		double r2=(-b-rd)/(2*a);
		
		JOptionPane.showMessageDialog(null,"as duas raízes são "+r1+" e "+r2);
	
		}
	}

}
