package Main;

import Empregado.EmpregadoComissionado;
import Empregado.Empregado;
import Empregado.EmpregadoHorista;

public class Aplicacao {

	public static void main(String[] args) {
		Empregado[] empregado = new Empregado[3];
		
		empregado[0] = new EmpregadoHorista(01, "João", 190, 350);
		empregado[1] = new EmpregadoComissionado(02, "Maria", 589000, 20);
		empregado[2] = new EmpregadoHorista(03, "José", 220, 450);
		
		for(Empregado e : empregado) {
			System.out.println(e.calcularSalario());
		}
	}

}
