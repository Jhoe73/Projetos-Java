import java.util.Scanner;

public class EntradaDeDados 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num_int;
		double num_real;
		String snome;
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		snome = teclado.nextLine();
		System.out.println("Ol� " + snome);	
		
		System.out.println("Digite um n�mero inteiro: ");
		num_int = teclado.nextInt();
		System.out.println("O n�mero inteiro �: " + num_int);
		
		System.out.println("Digite um n�mero real: ");
		num_real = teclado.nextDouble();
		System.out.println("O n�mero real �: " + num_real);
		
		teclado.close();
		
	}

}

