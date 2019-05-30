package Empregado;

public final class EmpregadoComissionado extends Empregado {
	
	private double totalDeVendas;
	private double comissao;
	
	public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao) {
		super(matricula, nome);
		this.totalDeVendas = totalDeVendas;
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		String aux = super.toString()+"\n";
		aux += totalDeVendas+"\n";
		aux += comissao;
		return aux;
	}
	
	public double calcularSalario() {
		return totalDeVendas*comissao/100;
	}
	
	
}
