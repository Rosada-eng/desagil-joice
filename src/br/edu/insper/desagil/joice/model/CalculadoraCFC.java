package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora {
	private static double constanteCFC = (double) 2*Math.pow(2, 0.5) / (6.02* Math.pow(10, 2) * 16); // constanteCFC =  (4.2.sqrt(2)) / (Nav . 64. 10^-21) 
	

	public CalculadoraCFC() {
	super("Cúbica de Face Centrada");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcula(double peso, double raio) {
		double densidade = (double) constanteCFC * peso / Math.pow(raio, 3) ;
		
		return densidade;
	}
}
