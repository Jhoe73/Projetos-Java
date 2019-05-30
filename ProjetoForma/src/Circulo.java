		//final para a classe significa que ela não pode ser extendida
public final class Circulo extends Forma {
	
	//atributos
	private double raio;
	
	//construtor
	public Circulo(int cx, int cy, double raio) {
		super(cx, cy);
		this.raio = raio;
	}
	
	//método toString()
	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Raio -> "+raio+"\n";
		return aux;
	}
	public double calcularArea() {
		return Math.PI*Math.pow(raio, 2);
	}
	
}
