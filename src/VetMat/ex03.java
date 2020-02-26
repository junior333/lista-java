package VetMat;
/*
 * Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar
esses valores em um 3o vetor (VT3[6]) e mostrar os seus dados. P. ex:
VT1| 1| 2| 3|
|VT2| 4| 5| 6|
|VT3| 1| 2| 3| 4| 5| 6
 */
public class ex03 {

	public static void main(String[] args) {
		int []vt1=new int [3];
		int []vt2=new int [3];
		int []vt3=new int [6];
		int j=0;
			System.out.print("vt1: ");
			for(int i=0;i<3;i++) {
				vt1[i]=(int)(Math.random()*500);
				vt3[j]=vt1[i];
				System.out.print(vt1[i]+" ");
				j++;
			}
			System.out.print("vt2: ");
			for(int i=0;i<3;i++) {
				vt2[i]=(int)(Math.random()*500);
				vt3[j]=vt2[i];
				System.out.print(vt2[i]+" ");
				j++;
			}
			System.out.println("vt3: ");
			for(j=0;j<6;j++) {
				System.out.print(vt3[j]+" ");
			}
	}

}
