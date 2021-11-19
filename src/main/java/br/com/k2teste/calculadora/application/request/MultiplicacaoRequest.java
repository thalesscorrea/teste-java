package br.com.k2teste.calculadora.application.request;

import javax.validation.constraints.NotNull;

public class MultiplicacaoRequest {
	@NotNull(message = "Multiplicando não pode ser nulo")
	public Float multiplicando;
	@NotNull(message = "Multiplicador não pode ser nulo")
	public Float multiplicador;

}
