import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Forma> lista = new ArrayList<>();
		lista.add(new Ponto(0, 0));
		lista.add(new Circulo(5, 6, 8.75));
		lista.add(new Cilindro(3, 4, 2, 2));
		
		for (Forma forma : lista) {
			System.out.println(forma);
		}
		
		//impressão das áreas (que tem àrea)
		double area;
		for (Forma forma : lista) {
			if(forma instanceof Circulo){
				area = ((Circulo) forma).calcularArea();//forma que é do tipo circulo = (circulo)forma
				System.out.println(area);
			}
			
		}

	}

}
