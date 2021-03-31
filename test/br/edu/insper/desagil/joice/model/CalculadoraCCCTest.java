package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraCCCTest {
	private CalculadoraCCC calculadoraCCC;
	private static double DELTA = 0.05;
	
	@BeforeEach
	public void init() {
		calculadoraCCC = new CalculadoraCCC();
	}
	
	@Test
	public void testNiobio() {
		double densidade = calculadoraCCC.calcula(92.91, 0.143);
		double densidadeEsperada = 8.57;
		
		assertEquals(densidadeEsperada, densidade, DELTA);
		
	}
	
	@Test
	public void testTungstenio() {
		double densidade = calculadoraCCC.calcula(183.84, 0.137);
		double densidadeEsperada = 19.28;
		
		assertEquals(densidadeEsperada, densidade, DELTA);
	}
	
	@Test
	public void testLitio() {
		double densidade = calculadoraCCC.calcula(6.94, 0.152);
		double densidadeEsperada = 0.53;
		
		assertEquals(densidadeEsperada, densidade, DELTA);
		
	}
}
