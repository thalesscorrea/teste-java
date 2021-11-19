package br.com.k2teste.calculadora.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraServiceTest {

	CalculadoraService calculadoraService = new CalculadoraService();

	@Test
	void assertSomarFunciona() {
		Float[] valores = {2.0f, 1.0f, 3.0f, 4.0f};
		Float soma = calculadoraService.somar(valores);
		Assertions.assertEquals(10.0f, soma);
	}

	@Test
	void assertMultiplicarFunciona() {
		Float multiplicando = 4.0f;
		Float multiplicador = 3.0f;
		Float resultado = calculadoraService.multiplicar(multiplicando,
				multiplicador);
		Assertions.assertEquals(12.0f, resultado);

	}

}
