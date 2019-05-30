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
		// para formatar a saída
		DecimalFormat casas = new DecimalFormat("0.00");
		
		// exibe o menu de opções
		System.out.println("Digite (Q) para quadrado.");
		System.out.println("Digite (T) para triângulo.");
		System.out.println("Digite (C) para círculo.");
		System.out.print("Digite a opção desejada: ");
		
		// recebe a opção do usuário
		opcao = sc.nextLine();
		System.out.println("");
		
		switch (opcao)
		{
			case "Q":
			case "q":
				System.out.print("Digite o lado do quadrado: ");
				lado = sc.nextInt();
				area = Math.pow(lado,  2);
				System.out.println("área= " + area);
				break;
			case "T": case "t":
				System.out.print("Digite a base do triângulo: ");
				base = sc.nextInt();
				System.out.print("Digite a altura do triângulo: ");
				altura = sc.nextInt();
				area = (base * altura) / 2;
				System.out.println("área= " + area);
				break;
			case "C": case "c":
				System.out.print("Digite o raio do círculo: ");
				raio = sc.nextInt();
				area = Math.PI * Math.pow(raio, 2);
				System.out.println("área= " + casas.format(area));
				break;
			default:
				System.out.println("opção INVÁLIDA!");
				break;
		}

		sc.close();
	}
}

