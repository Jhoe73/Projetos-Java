import java.util.Scanner;

public class FatorialVariavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Ndf, Nf, i, j, Fatorial;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números você quer fatorar");
		Ndf = sc.nextInt();
		
		for (i=1; i<=Ndf; i++) {
			System.out.println("Qual o "+i+"° número a fatorar: ");
			Nf = sc.nextInt();
			
			Fatorial = 1;
			
			for (j=Nf; j>=1; j--) {
				Fatorial *= j;
				System.out.println("o fatorial de "+ Nf +" é: "+Fatorial);
			}
		}
		
		sc.close();
	}

}
