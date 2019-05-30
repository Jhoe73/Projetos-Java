
public final class Cilindro extends Forma {
	//atributos
	private double raio;
	private double altura;
	
	//construtor
	public Cilindro(int cx, int cy, double raio, double altura) {
		super(cx, cy);
		this.raio = raio;
		this.altura = altura;
	}	
	
	public double calcularArea() {
		return Math.PI*Math.pow(raio, 2);
	}
	
	public double calcularVolume() {
		return Math.PI*Math.pow(raio, 2);
	}
	//método toString()
	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Raio -> "+raio+"\n";
		aux += "Altura -> "+altura+"\n";
		return aux;
	}
	
}
