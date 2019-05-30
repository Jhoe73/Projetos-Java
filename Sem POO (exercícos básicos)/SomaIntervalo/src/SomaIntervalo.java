import java.util.Scanner;

public class SomaIntervalo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n1, n2, nintervalo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();
		
		sc.close();
		
		nintervalo = 0;
		
		for (int x = n1; x < n2; x++) {
			System.out.println(nintervalo);
			nintervalo = (nintervalo + x);
		}
		
		System.out.println("A soma do intervalo é: " + nintervalo);
		
		sc.close();
	}

}

