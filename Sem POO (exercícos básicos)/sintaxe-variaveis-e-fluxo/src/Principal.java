import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TesteVariaveis n = new TesteVariaveis();
		
		System.out.println("Digite a data de nascimento (dd/mm/aaaa)");
		String dataNascimento = sc.nextLine();
		
		String[] dataStrings =  dataNascimento.split("/");
		int[] dataInts = new int[3];
		
		for(int i = 0; i<dataInts.length; i++) {
			dataInts[i] = Integer.parseInt(dataStrings[i]);
		}
		
		n.setDataNascimento(dataInts[0], dataInts[1], dataInts[2]);
		
		System.out.println(n.getAllInformations());
	
		sc.close();
		
	}
}
