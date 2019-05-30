package Empregado;

public final class EmpregadoHorista extends Empregado{
	private int totalDeHorasTrabalhadas;
	private double valorDaHoraTrabalhada;
	
	public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDaHoraTrabalhada) {
		super(matricula, nome);
		this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
		this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
	}
	
	@Override
	public String toString() {
		String aux = super.toString()+"\n";
		aux += totalDeHorasTrabalhadas+"\n";
		aux += valorDaHoraTrabalhada;
		return aux;
	}
	
	public double calcularSalario() {
		return totalDeHorasTrabalhadas*valorDaHoraTrabalhada;
	}
}
