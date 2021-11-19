package br.com.k2teste.calculadora.application.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.k2teste.calculadora.application.request.MultiplicacaoRequest;
import br.com.k2teste.calculadora.application.request.SomaRequest;
import br.com.k2teste.calculadora.application.response.MultiplicacaoResponse;
import br.com.k2teste.calculadora.application.response.SomaResponse;
import br.com.k2teste.calculadora.service.CalculadoraService;

@RestController
public class CalculadoraController {
	
	@Autowired
	private CalculadoraService calculadoraService;

	@GetMapping("/somar")
	public SomaResponse somar(@Valid @RequestBody SomaRequest request) {
		return new SomaResponse(calculadoraService.somar(request.valores));
	}
	

	@GetMapping("/multiplicar")
	public MultiplicacaoResponse multiplicar(@Valid @RequestBody MultiplicacaoRequest request) {
		return new MultiplicacaoResponse(calculadoraService.multiplicar(request.multiplicando, request.multiplicador));
	}

}
