import java.util.Scanner;
import java.text.DecimalFormat;

public class EstCASE_Exe1
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		double numero, raiz;

		// instancia o objeto da classe Scanner
		// para receber as entradas
		Scanner sc = new Scanner(System.in);
 
		// instancia o objeto da classe DecimalFormat
		// para formatar a saída
		DecimalFormat casas = new DecimalFormat("0.00");
		
		// exibe o menu de opções
		System.out.println("1- verificar se um número é par");
		System.out.println("2- calcular a raiz quadrada de um número");
		System.out.print("Digite a opção desejada: ");

		// recebe a opção do usuário
		opcao = sc.nextInt();

		switch (opcao)
		{
			// se opção = 1, verifica se um número é par OU ímpar
			case 1:
				System.out.print("Digite um número: ");
				numero = sc.nextDouble();
				if ((numero % 2) == 0)
					System.out.println("o número " + numero + " é par");
				else
					System.out.println("o número " + numero + " é ímpar");
				break;
			// se opção = 2, calcula a raiz quadrada de um número
			case 2:
				System.out.print("Digite um número: ");
				numero = sc.nextDouble();
				raiz = Math.sqrt(numero);
				System.out.println("a raiz quadrada de " + numero + " é " + casas.format(raiz));
				break;
			default:
				System.out.println("opção INVÁLIDA!");
				break;
		}

		sc.close();
	}
}