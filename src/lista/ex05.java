package lista;

import javax.swing.JOptionPane;

/*
 * Receba os coeficientes A, B e C de uma equação do 2o grau
(AX2+BX+C=0). Calcule e mostre as raízes reais (considerar que a
equação possue2 raízes).
 */
public class ex05 {

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
