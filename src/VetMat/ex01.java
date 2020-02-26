package VetMat;
/*
 * Criar e coletar um vetor [50] inteiro. Calcular e exibir:
a. A média dos valores entre 10 e 200;
b. A soma dos números ímpares.
 */
public class ex01 {

	public static void main(String[] args) {
		 int [] vet = new int [50];
		 int cont=0,m=0,soma=0;
		 for(int i=0;i<50;i++) {
			 vet[i]=(int)(Math.random()*500);
			 if(vet[i]>10 && vet[i]<200) {
				 cont++;
				 m+=vet[i];
			 }
			 if(vet[i]%2==1) {
				 soma+=vet[i];
			 }
			 System.out.print(vet[i]+" ");
			 
		 }
		 double md=m/cont;
		 System.out.println("");
		 System.out.println(" a media("+m+"/"+cont+") dos valores entre 10 e 200 é: "+md);
		 System.out.println(" a soma dos numeros impares é: "+soma);
	}

}
