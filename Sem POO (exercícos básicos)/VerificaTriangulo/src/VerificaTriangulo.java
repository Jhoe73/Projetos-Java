import java.util.Scanner;

public class VerificaTriangulo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int hp, cm, cM;
		double l1, l2, l3;
		boolean c1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro lado");
		l1 = sc.nextDouble();
		System.out.println("Digite o segundo lado");
		l2 = sc.nextDouble();
		System.out.println("Digite o terceiro lado");
		l3 = sc.nextDouble();
		
		if (l1 > 0 && l2 > 0 && l3 > 0) {
			
			c1 = ((Math.abs(l2-l3) <l1) && (l1< (l2+l3))) && ((Math.abs(l1-l3) <l2) && (l2< (l1+l3))) && ((Math.abs(l1-l2) <l3) && (l3< (l1+l2)));
		
			if (c1) {
				
				if (l1 == l2 && l2 == l3 && l3 == l1) {
					System.out.println("Triângulo equilátero");
				}
				if ((l1 == l2) && (l2 != l3) || (l2 == l3) && (l3 != l1) || (l3 == l1) && (l1 != l2)) {
					System.out.println("Triângulo isósceles");
				}
				if (l1 != l2 && l2 != l3 && l3 != l1) {
					System.out.println("Triângulo escaleno");
					
					int a = (int) l1;
					int b = (int) l2;
					int c = (int) l3;
					
					hp = Math.max(a, Math.max(b, c));
					cm = Math.min(a, Math.min(b, c));
					cM = a + b + c - hp - cm;
					
					if (Math.pow(hp, 2) == Math.pow(cm, 2) + Math.pow(cM, 2)) {
						System.out.println("É um triângulo retangulo");
					}
				}
			
			}
			
			else {
				System.out.println("Medidas impossiveis para triângulo");
			}
		
		}
		
		else {
			System.out.println("Os lados devem ter valores positivos");
		}
		
		sc.close();
	}

}