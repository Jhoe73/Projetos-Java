import java.util.Scanner;

public class CalculaRaizes 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a, b, c;
		double delta, X1, X2;
		
		X1= 0; X2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite o coeficiente A");
			a = sc.nextInt();		
			System.out.println("Digite o coeficiente B");
			b = sc.nextInt();
			System.out.println("Digite o coeficiente C");
			c = sc.nextInt();
		} while (a < 1);
		
		
		
		delta = Math.pow(b,2) - (4*a*c);
		
		if (delta < 0) {
			System.out.println("não existem raízes reais");
		}
		else
			if (delta == 0) {
				X1 = -b / (2*a);
				System.out.println("X1= "+ X1 +" X2= "+ X1);
			}	
			else {
				X1 = (-b + Math.sqrt(delta)) / (2*a);
				X2 = (-b - Math.sqrt(delta)) / (2*a);
				System.out.println("X1= "+ X1 +" X2= "+ X2);	
			}
		
		sc.close();
	}

}