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
		// para formatar a sa�da
		DecimalFormat casas = new DecimalFormat("0.00");
		
		// exibe o menu de op��es
		System.out.println("1- verificar se um n�mero � par");
		System.out.println("2- calcular a raiz quadrada de um n�mero");
		System.out.print("Digite a op��o desejada: ");

		// recebe a op��o do usu�rio
		opcao = sc.nextInt();

		switch (opcao)
		{
			// se op��o = 1, verifica se um n�mero � par OU �mpar
			case 1:
				System.out.print("Digite um n�mero: ");
				numero = sc.nextDouble();
				if ((numero % 2) == 0)
					System.out.println("o n�mero " + numero + " � par");
				else
					System.out.println("o n�mero " + numero + " � �mpar");
				break;
			// se op��o = 2, calcula a raiz quadrada de um n�mero
			case 2:
				System.out.print("Digite um n�mero: ");
				numero = sc.nextDouble();
				raiz = Math.sqrt(numero);
				System.out.println("a raiz quadrada de " + numero + " � " + casas.format(raiz));
				break;
			default:
				System.out.println("op��o INV�LIDA!");
				break;
		}

		sc.close();
	}
}