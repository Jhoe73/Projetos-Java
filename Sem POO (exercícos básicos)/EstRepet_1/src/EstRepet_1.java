import java.util.Scanner;

public class EstRepet_1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int A, B, i, Snp, Mni;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um inteiro A: ");
		A = sc.nextInt();
		System.out.println("Digite um inteiro B maior que A: ");
		B = sc.nextInt();
		
		if(A<B) {
			Snp = 0;
			Mni = 1;
			
			for(i=A; i<=B; i++) {
				if((i % 2) == 0) {
					Snp = Snp+i;
				}
				else {
					Mni = Mni*i;
				}
			}

			System.out.println("A Soma dos numeros pares no intervalo entre A e B: "+Snp);
			System.out.println("A multiplicação dos numeros ímpares no intervalo entre A e B: "+Mni);
		}
		else {
			System.out.print("O número A precisa ser menor que B");
		}
		
		sc.close();
	}

}
