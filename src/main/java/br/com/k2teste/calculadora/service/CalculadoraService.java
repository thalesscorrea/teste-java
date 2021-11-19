package br.com.k2teste.calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

	public float somar(Float[] valores) {
		float resultado = 0;
		for (int i = 0; i < valores.length; i++) 
			resultado = resultado + valores[i];
		return resultado;
	}

	public float multiplicar(float multiplicando, float multiplicador) {
		return multiplicando * multiplicador;
	}

}
