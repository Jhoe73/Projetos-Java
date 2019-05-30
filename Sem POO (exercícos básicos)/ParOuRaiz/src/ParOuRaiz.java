import java.util.Scanner;
import java.text.DecimalFormat;

public class ParOuRaiz 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int opcao, n1;
		String r1;
		double r2;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		
		System.out.println("1- Verifique se um número é par");
		System.out.println("2- Calcular a raiz quadrada de um número");
		System.out.println("Digite a opção:");
		opcao = sc.nextInt();
		
		switch (opcao) {
			case 1:
				System.out.println("Digite um número");
				n1 = sc.nextInt();
				if (n1 % 2 == 0) {
					r1 = "Par";
				}
				else {
					r1 = "Ímpar";
				}
				System.out.println("O número é "+ r1);
				break;
			case 2:
				System.out.println("Digite a raiz");
				n1 = sc.nextInt();
				r2 = Math.sqrt(n1);
				System.out.println("A raiz quadrada é: "+ casas.format(r2));
				break;
			default:
				System.out.println("Escolha entre as opções exibidas");
		}
		
		sc.close();
	}

}