package lista;

import javax.swing.JOptionPane;

/*
 * Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
de desconto e o número de descendentes. Calcule o salário que serão as
horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário
Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário
Líquido. Exiba o salário a receber.
 */
public class ex16 {

	public static void main(String[] args) {

		int ht=Integer.parseInt(JOptionPane.showInputDialog("digite as horas trabalhadas: "));
		int vph=Integer.parseInt(JOptionPane.showInputDialog("digite o valor por hora: "));
		int pdesc=Integer.parseInt(JOptionPane.showInputDialog("digite o percentual de desconto: "));
		int numd=Integer.parseInt(JOptionPane.showInputDialog("digite o numero de descentdentes: "));
		
		double sal=ht*vph;
		sal=(sal*(1-pdesc/100))+(100*numd);
		
		JOptionPane.showMessageDialog(null, "o salario a receber é: "+sal);
	}

}
