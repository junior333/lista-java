package VetMat;
/*
 * Criar e coletar em um vetor [30] real e calcular e exibir:
a. A média do grupo;
b. A quantidade de notas acima do grupo;
c. As posições dos valores abaixo da média do grupo.
 */
public class ex04 {

	public static void main(String[] args) {
		int []vt=new int [10];
		int cont=0,qtd=0;
		double md=0;
		System.out.print("vt: ");
		for(int i=0;i<10;i++) {
			vt[i]=(int)(Math.random()*500);
			md+=vt[i];
			cont++;
			System.out.print(vt[i]+" ");
		}
		System.out.println(md+"/"+cont);
		md=md/cont;
		System.out.println("\nMedia:"+md+"\nAs posições das notas abaixo da media: ");
		for(int i=0;i<10;i++) {
			if(vt[i]>md) {
				qtd++;
				
			}
			else {
				System.out.print("vt["+i+"] ");
			}
		}
		System.out.println("\n quantidade de notas acima da media: "+qtd);
	}

}
