import java.util.Scanner;

public class SomaDois 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int n1, n2, soma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		n2 = sc.nextInt();
		
		soma = n1+n2;
		
		System.out.println("A soma �: "+ soma);
		sc.close();
	}

}
