package br.gov.sp.fatec.transparencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.gov.sp.fatec.transparencia.repository.Funcionarios;

@Controller
public class FuncionariosController {
	
	@Autowired
	private Funcionarios funcionarios;

	@GetMapping("/funcionarios")
	public ModelAndView listaFuncionarios() {
		ModelAndView modelAndView = new ModelAndView("ListaFuncionarios");
		
		modelAndView.addObject("funcionarios",funcionarios.findAll());
		return modelAndView;
	}

}
