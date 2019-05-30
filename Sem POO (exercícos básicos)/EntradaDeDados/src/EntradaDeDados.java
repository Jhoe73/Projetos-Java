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
		System.out.println("Olá " + snome);	
		
		System.out.println("Digite um número inteiro: ");
		num_int = teclado.nextInt();
		System.out.println("O número inteiro é: " + num_int);
		
		System.out.println("Digite um número real: ");
		num_real = teclado.nextDouble();
		System.out.println("O número real é: " + num_real);
		
		teclado.close();
		
	}

}

