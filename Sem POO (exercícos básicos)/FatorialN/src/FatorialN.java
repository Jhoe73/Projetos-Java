import java.util.Scanner;

public class FatorialN 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int N, i;
		double Nf;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero natural: ");
		N = sc.nextInt();
		
		Nf = 1;
		
		if(N>=0) {
			for(i=N; i>=1; i--) {
				Nf *= i;
			}
			System.out.println("o fatorial de "+ N +" �: "+Nf);
		}
		else {
			System.out.println("N�mero inv�lido");
		}
		
		sc.close();
	}

}
