import java.util.Scanner;
import java.text.DecimalFormat;

public class NumeroDiasMesAno
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int dias, mes, ano;
		boolean mesValido = true;

		// instancia o objeto da classe Scanner
		// para receber as entradas
		Scanner sc = new Scanner(System.in);

		// instancia o objeto da classe DecimalFormat
		// para formatar os meses
		DecimalFormat MES = new DecimalFormat("00");

		dias = 0;

		// exibe o menu de opções
		System.out.print("Digite o ano com quatro dígitos: ");
		ano = sc.nextInt();
		System.out.print("Digite o mês: ");
		mes = sc.nextInt();
		
		System.out.println("");
		
		switch (mes)
		{
			case 1: case 3: case 5:
			case 7: case 8: case 10:
			case 12:
			    dias = 31;
			    break;
			case 4: case 6: case 9: case 11:
			    dias = 30;
			    break;
			case 2:
				//
				// um ano é bissexto se ele for divisível por 4 e não por 100
				// ou se ele for divisível por 400
				//
				// bissexto:  2008, 2012, 2016
				// (1900 não foi bissexto, mas 1600 foi)
				//
			    if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0))
			        dias = 29;
			    else
			        dias = 28;
			    break;
			default:
				System.out.println("mês INVÁLIDO!");
				mesValido = false;
				break;
		}

		if (mesValido == true)
			System.out.println(MES.format(mes) + "/" + ano + " tem " + dias + " dias");
		sc.close();
	}
}
