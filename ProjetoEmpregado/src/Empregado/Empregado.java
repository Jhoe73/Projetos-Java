package Empregado;

public abstract class Empregado {
	protected long matricula;
	protected String nome;
	
	public abstract double calcularSalario();
	
	public long getMatricula() {
		return matricula;
	}
	
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return matricula+"\n"+nome;
	}
	
	public Empregado(long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}
	
}
