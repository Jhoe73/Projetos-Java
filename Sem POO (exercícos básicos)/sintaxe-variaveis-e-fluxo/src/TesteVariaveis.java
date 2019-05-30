import java.util.Calendar;;

public class TesteVariaveis {
	
	private String dataNascimento;
	private int diaNascimento;
	private int	mesNascimento;
	private int anoNascimento;
	private int idade;
	private double mesesVividos;
	private int diaAtual = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	private int mesAtual = Calendar.getInstance().get(Calendar.MONTH)+1;
	private int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
	
	public void setDataNascimento(int dia, int mes, int ano) {
		this.dataNascimento = dia+"/"+mes+"/"+ano;
		this.diaNascimento = dia;
		this.mesNascimento = mes;
		this.anoNascimento = ano;
	}
	
	public String getDataNascimento() {
		return this.dataNascimento;
	}
	
	public void setIdade() {
		if (this.diaAtual >= this.diaNascimento  && this.mesAtual >= this.mesNascimento) {
			this.idade = this.anoAtual-this.anoNascimento;
		}
		else {
			this.idade = (this.anoAtual-this.anoNascimento)-1;
		}
	}
	
	public int getIdade() {
		setIdade();
		return this.idade;
	}
	
	private void setMesesVividos() {
		this.mesesVividos = ((getIdade()*12)-12)+this.mesAtual;
	}
	
	public double getMesesVividos() {
		setMesesVividos();
		return this.mesesVividos;
	}
	
	public String getAllInformations() {
		return 
				"dataNascimento \t"+this.dataNascimento+"\n"+
				"diaNascimento \t"+this.diaNascimento+"\n"+
				"mesNascimento \t"+this.mesNascimento+"\n"+
				"mesesVividos \t"+getMesesVividos()+"\n"+
				"idade \t"+getIdade()+"\n"+
				"anoNascimento \t"+this.anoNascimento+"\n"+
				"diaAtual \t"+this.diaAtual+"\n"+
				"mesAtual \t"+this.mesAtual+"\n"+
				"anoAtual \t"+this.anoAtual+"\n";
	}
	
}
