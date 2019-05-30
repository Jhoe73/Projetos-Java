import java.util.Scanner;

public class FatorialN 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int N, i;
		double Nf;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número natural: ");
		N = sc.nextInt();
		
		Nf = 1;
		
		if(N>=0) {
			for(i=N; i>=1; i--) {
				Nf *= i;
			}
			System.out.println("o fatorial de "+ N +" é: "+Nf);
		}
		else {
			System.out.println("Número inválido");
		}
		
		sc.close();
	}

}
