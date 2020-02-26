package lista;

import javax.swing.JOptionPane;

/*
 * Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
Mostre a mensagem de acordo com a média:
a. Se a média for >= 6,0 exibir “APROVADO”;
b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c. Se a média for < 3,0 exibir “RETIDO”.
 */
public class ex21 {

	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("digite a 1 nota: "));
		int b=Integer.parseInt(JOptionPane.showInputDialog("digite a 2 nota: "));
		int c=Integer.parseInt(JOptionPane.showInputDialog("digite a 3 nota: "));
		int d=Integer.parseInt(JOptionPane.showInputDialog("digite a 4 nota: "));
		
		double media=(a+b+c+d)/4;
		
		if(media>=6) {
			JOptionPane.showMessageDialog(null, "Aprovado");
		}
		else {
		if(media>=3) {
			JOptionPane.showMessageDialog(null, "Exame");
		}
		else {
			JOptionPane.showMessageDialog(null, "Reprovado");
		}
		}
	}

	
}
