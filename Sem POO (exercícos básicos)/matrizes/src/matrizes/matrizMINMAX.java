package matrizes;

import java.util.Scanner;

public class matrizMINMAX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int mat[][] = new int[3][4]; 
		int i, j, valorMe, valorMa, linhaMe, valorMINMAX;
		
		mat[0][0] = 0; 
		
		for(i=0;i<3;i++)
			for(j=0;j<4;j++) {
				System.out.println("Digite o valor da posição "+(i+1)+"x"+(j+1));
				mat[i][j] = sc.nextInt();
			}
		
		valorMe = mat[0][0];
		linhaMe = 0;
		
		
		for(i=0;i<3;i++)
			for(j=0;j<4;j++) {
				if(mat[i][j] < valorMe) {
					valorMe = mat[i][j];
					linhaMe = i;
				}
			}
		
		System.out.println(linhaMe);
		valorMINMAX = mat[linhaMe][0];
		valorMa = mat[linhaMe][0];
		
		for(j=0;j<4;j++) {
			if(mat[linhaMe][j] > valorMa) {
				valorMINMAX = mat[linhaMe][j];
			}
		}
		
		System.out.println("O valor MINMAX: "+valorMINMAX);
		
		sc.close();
	}

}
