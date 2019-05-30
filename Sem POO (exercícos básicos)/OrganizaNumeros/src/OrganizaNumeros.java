import java.util.Scanner;

public class OrganizaNumeros 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n1, n2, n3, n1o, n2o, n3o;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		n1 = sc.nextInt();		
		System.out.println("Digite o segundo número");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro número");
		n3 = sc.nextInt();
		
		n1o = 0; n2o = 0; n3o = 0; 
		
		if (n1>=n2) {
			if (n2>=n3) {
				n1o = n1; n2o = n2; n3o = n3;
			}
			else {
				n1o = n1; n2o = n3; n3o = n2;
			}
		}
		if (n2>=n1) {
			if (n1>=n3) {
				n1o = n2; n2o = n1; n3o = n3;
			}
			else {
				n1o = n2; n2o = n3; n3o = n1;
			}
		}
		if (n3>=n2) {
			if (n2>=n1) {
				n1o = n3; n2o = n2; n3o = n1;
			}
			else {
				n1o = n3; n2o = n1; n3o = n2;
			}
		}
		
		System.out.println("Os números são: "+ n1o +" "+ n2o +" "+ n3o);
		sc.close();
	}

}
