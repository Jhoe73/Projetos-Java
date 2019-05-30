import java.util.Scanner;

public class ValidaItau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int itau[], itauM[], i, multiplicador, soma, DV;
		
		itau = new int [10];
		itauM = new int [10];
		
		System.out.println("Entre com a Agência/Conta itau que deseja validar:");

		for (i = 0; i < 4; i++) {
			System.out.print("Informe o " + (i+1) + "º dígito da Agência: ");
			itau[i] = sc.nextInt();
		}

		for (i = 4; i < 10; i++) {
			System.out.print("Informe o " + (i-3) + "º dígito da Conta: ");
			itau[i] = sc.nextInt();
		}

		// cálculo do dígito verificador
		
		multiplicador = 2;
		soma = 0;

		for (i = 0; i < 9; i++) {  
			if (i%2 == 0) {
				itauM[i] = multiplicador * itau[i];
				if(itauM[i] > 9) {
					itauM[i] = (itauM[i]/10)+(itauM[i]%10);
				}
			} else {
				itauM[i] = itau[i];
			}
			
			soma = soma + itauM[i];
			
			//System.out.println("ordem: "+i);
			//System.out.println("numero: "+itauM[i]);
		}
		
		//System.out.println("Soma: "+soma);
		
		DV = soma % 10;
		System.out.println("DV: "+DV);
		if (DV > 0) {
			DV = 10 - DV;
		} 
			
		
		
		System.out.println();
		System.out.print("Conta Itaú ");
		for (i = 0; i < 4; i++) {
			System.out.print(itau[i]);
		}
		System.out.print(".");
		for (i = 4; i < 9; i++) {
			System.out.print(itau[i]);
		}
		System.out.print("-");
		System.out.print(itau[9]);

		if (DV == itau[9])
			System.out.println(" VÁLIDA!");
		else
			System.out.println(" INVÁLIDA!");
		
		sc.close();
	}

}
