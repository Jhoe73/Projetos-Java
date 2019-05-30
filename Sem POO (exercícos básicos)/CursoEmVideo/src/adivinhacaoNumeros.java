import java.util.Scanner;


public class adivinhacaoNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1=1, n2=5, nD, nP;
		String resultado;
		for(int i=0;i<=99;i++) {
			
			System.out.println("Adivinhe o número de "+n1+" a "+n2+" que estou pensando");
			
			nD = sc.nextInt();
			
			nP = (int) (1 + Math.random() * (6-1));
			
			resultado = (nD == nP)?"Acertou!":"Errou pensei em "+nP;
			
			System.out.println(resultado);
			
		}
		sc.close();
	}

}
