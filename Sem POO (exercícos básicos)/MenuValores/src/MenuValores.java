import java.util.Scanner;

public class MenuValores 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int N;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite (1) Para exibir o valor de pi");
			System.out.println("Digite (2) Para exibir o valor de e");
			System.out.println("Digite (3) Para sair");
			System.out.print("Digite um n�mero: ");
			N = sc.nextInt();
			System.out.println("                ");
			
			switch(N) {
				case 1:
					System.out.println("Valor de PI: "+Math.PI);
					System.out.println("                     ");
					break;
				case 2:
					System.out.println("Valor de e: "+Math.E);
					System.out.println("                   ");
					break;
				case 3:
					System.out.println("Voc� saiu.");
					break;
				default: System.out.println("Digite uma op��o v�lida"); 
			}
		} while (N != 3);
		
		sc.close();
	}

}
