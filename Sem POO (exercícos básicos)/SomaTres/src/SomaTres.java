import java.util.Scanner;

public class SomaTres 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n1, n2, n3, nsoma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = sc.nextInt();
		
		sc.close();
		
		nsoma = (n1+n2+n3);
		
		System.out.println("A soma dos números são: " + nsoma);
		
		sc.close();
	}

}
