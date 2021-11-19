package br.com.k2teste.calculadora.application.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class SomaRequest {
	@NotNull
	@NotEmpty
	public Float[] valores;

	
}
