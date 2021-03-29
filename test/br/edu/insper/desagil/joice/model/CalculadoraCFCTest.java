package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraCFCTest {
	private static double DELTA = 0.015;
	private CalculadoraCFC calculadoraCFC;
	
	@BeforeEach
	public void init() {
		calculadoraCFC = new CalculadoraCFC();
	}
	
	@Test
	public void testCobre() {
		double densidade = calculadoraCFC.calcula(63.55, 0.128);
		double densidadeEsperada = 8.89;
		
		assertEquals(densidadeEsperada, densidade, DELTA);
		
	}
	
	@Test
	public void testOuro() {
		double densidade = calculadoraCFC.calcula(196.97, 0.144);
		double densidadeEsperada = 19.36;
		
		assertEquals(densidadeEsperada, densidade, DELTA);
	}
	
	@Test
	public void testPrata() {
		double densidade = calculadoraCFC.calcula(107.87, 0.144);
		double densidadeEsperada = 10.6;
		
		assertEquals(densidadeEsperada, densidade, DELTA);
		
	}

}
