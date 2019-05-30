import java.util.Scanner;
import java.text.DecimalFormat;

public class EstCASE_Exe3
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opcao;
		int lado, base, altura, raio;
		double area;

		// instancia o objeto da classe Scanner
		// para receber as entradas
		Scanner sc = new Scanner(System.in);
		
		// instancia o objeto da classe DecimalFormat
		// para formatar a sa�da
		DecimalFormat casas = new DecimalFormat("0.00");
		
		// exibe o menu de op��es
		System.out.println("Digite (Q) para quadrado.");
		System.out.println("Digite (T) para tri�ngulo.");
		System.out.println("Digite (C) para c�rculo.");
		System.out.print("Digite a op��o desejada: ");
		
		// recebe a op��o do usu�rio
		opcao = sc.nextLine();
		System.out.println("");
		
		switch (opcao)
		{
			case "Q":
			case "q":
				System.out.print("Digite o lado do quadrado: ");
				lado = sc.nextInt();
				area = Math.pow(lado,  2);
				System.out.println("�rea= " + area);
				break;
			case "T": case "t":
				System.out.print("Digite a base do tri�ngulo: ");
				base = sc.nextInt();
				System.out.print("Digite a altura do tri�ngulo: ");
				altura = sc.nextInt();
				area = (base * altura) / 2;
				System.out.println("�rea= " + area);
				break;
			case "C": case "c":
				System.out.print("Digite o raio do c�rculo: ");
				raio = sc.nextInt();
				area = Math.PI * Math.pow(raio, 2);
				System.out.println("�rea= " + casas.format(area));
				break;
			default:
				System.out.println("op��o INV�LIDA!");
				break;
		}

		sc.close();
	}
}

