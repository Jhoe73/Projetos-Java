
//abstract para classe indica que ela não pode ser instanciada (gerar objeto)
public abstract class Forma {
	//atributos protected são compartilhados apenas entre as subclasses
	protected int cx;
	protected int cy;
	
	//construtor da classe
	public Forma(int cx, int cy) {
		this.cx = cx;
		this.cy = cy;
	}
	
	//método toString()
	@Override
	public String toString() {
		String aux = "";
		aux += "Coordenada x -> "+cx+"\n";
		aux += "Coordenada y -> "+cy+"\n";
		return aux;
	}
	
}
