import java.util.Scanner;

public class NumeroPositivo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Float N;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite um n�mero positivo maior que 0:");
			N = sc.nextFloat();
		} while(N <= 0);

		System.out.println("N�mero digitado: " +N);
		
		sc.close();
	}

}