import java.util.Scanner;

public class CodigoIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cod, idade, i, idadeMV, idadeMJ, codMV, codMJ;
		
		Scanner sc = new Scanner(System.in);
		
		codMJ = 0;
		idadeMJ = 0;
		codMV = 0;
		idadeMV = 0;
		
		for (i = 1; i <= 5; i++) {
		
			do {
				System.out.println("Digite seu código de verificação:  (1 a 99)");
				cod = sc.nextInt();
			} while (cod < 1 || cod > 99);
		
			System.out.println("Digite a "+i+"° idade: ");
			idade = sc.nextInt();
		
			System.out.println("A pessoa de código "+cod+" tem "+idade+" anos\n");
		
			if (i == 1) {
				codMJ = cod;
				idadeMJ = idade;
				codMV = cod; 
				idadeMV = idade;
			}
			else {
				if (idade < idadeMJ) {
					codMJ = cod;
					idadeMJ = idade;
				}
				if (idade > idadeMV) {
					codMV = cod;
					idadeMV = idade;
				}
			}
		
		}
		
		System.out.println("Pessoa mais jovem: codigo "+codMJ+", idade "+idadeMJ);
		System.out.println("Pessoa mais velha: codigo "+codMV+", idade "+idadeMV);
		sc.close();
	}

}