package VetMat;
/*
 * Criar e coletar um vetor [100] inteiro e exibir:
a. O maior e o menor valor;
b. A média dos valores.
 */
public class ex02 {

	public static void main(String[] args) {
		int []vt = new int [10];
		int cont=0,maior=0,menor=0,m=0;
		
		for(int i=0;i<10;i++) {
			vt[i]=(int) (Math.random()*500);
			if(menor==0) {
				menor=vt[i];
			}
			if(vt[i]>maior) {
				maior=vt[i];
			}
			if(vt[i]<menor) {
				menor=vt[i];
			}
			System.out.print(vt[i]+" ");
			m+=vt[i];
			cont++;
		}
		
		double md=m/cont;
		System.out.println();
		System.out.println("Maior:"+maior+" Menor:"+menor);
		System.out.println("A média ("+m+"/"+cont+") dos valores é: "+md);
	}

}
