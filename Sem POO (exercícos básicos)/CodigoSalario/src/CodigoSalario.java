import java.util.Scanner;

public class CodigoSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cod, codMA, codMB, i, turno, trabD, trabN;
		float salario, salarioMA, salarioMB, somaSA, mediaSA, mediaSAD, mediaSAN, somaSAD, somaSAN;
		
		Scanner sc = new Scanner(System.in);
		
		codMB = 0;
		salarioMB = 0;
		codMA = 0;
		salarioMA = 0;
		somaSA = 0;
		mediaSA = 0;
		mediaSAD = 0;
		mediaSAN = 0;
		somaSAD = 0;
		somaSAN = 0;
		trabD = 0;
		trabN = 0;
		
		for (i = 1; i <= 7; i++) {
		
			do {
				System.out.println("Digite seu código de verificação:  (1 a 99)");
				cod = sc.nextInt();
			} while (cod < 1 || cod > 99);
			
			do {
				System.out.println("\n1 - Diurno\n2 - Noturno");
				System.out.println("Digite o turno: ");
				turno = sc.nextInt();
			} while (turno < 1 || turno > 2);
			
			do {
				System.out.println("\nDigite o "+i+"° salario: ");
				salario = sc.nextFloat();
			} while (salario < 954.00 || salario > 4770.00);
			
			System.out.println("O trabalhador de código "+cod+", turno "+turno+" recebe R$ "+salario);
			System.out.println("-------------------------------------------------------------------------");
			if (i == 1) {
				codMB = cod;
				salarioMB = salario;
				codMA = cod; 
				salarioMA = salario;
			}
			else {
				if (salario < salarioMB) {
					codMB = cod;
					salarioMB = salario;
				}
				if (salario > salarioMA) {
					codMA = cod;
					salarioMA = salario;
				}
			}
			
			somaSA = somaSA + salario;
			mediaSA = somaSA/7;
			if (turno == 1) {
				somaSAD = somaSAD + salario;
				trabD ++;
			}
			if (turno == 2) {
				somaSAN = somaSAN + salario;
				trabN ++;
			}
			mediaSAD = somaSAD/trabD;
			mediaSAN = somaSAN/trabN;
			
		}
		
		System.out.println("Pessoa que recebe menos: codigo "+codMB+", salário R$ "+salarioMB);
		System.out.println("Pessoa que recebe mais: codigo "+codMA+", salário R$ "+salarioMA);
		System.out.println("A soma dos salários: R$ "+somaSA);
		System.out.println("A media dos salários: R$ "+mediaSA);
		System.out.println("A media salarial dos trabalhadores diurnos: R$ "+mediaSAD);
		System.out.println("A media salarial dos trabalhadores noturnos: R$ "+mediaSAN);
		sc.close();
	}

}