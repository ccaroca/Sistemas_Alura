package br.com.caelum.figuras;
public class Circulo implements AreaCalculavel {

	private double raio;

	public double calculaArea() {
		return this.raio * this.raio * Math.PI;
	}

	public Circulo(double raio) {
		this.raio = raio;
	}

}
