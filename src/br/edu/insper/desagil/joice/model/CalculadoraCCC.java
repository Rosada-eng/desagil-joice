package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora {
	private static double constanteCCC = (double) 6*Math.pow(3,0.5) / (6.02* Math.pow(10,2)*64); //0.000269733; // constanteCCC =  (2.3.sqrt(3)) / (Nav . 64. 10^-21) 
	
	public CalculadoraCCC() {
		super("Cubica de Corpo Centrado");
	}

	@Override
	public double calcula(double peso, double raio) {
		double densidade = (double) constanteCCC*peso / Math.pow(raio,3);
		
		return densidade;
	}

}
