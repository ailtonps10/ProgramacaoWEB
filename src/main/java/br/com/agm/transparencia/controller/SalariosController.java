package br.com.agm.transparencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.agm.transparencia.repository.Salarios;

@Controller
public class SalariosController {
	
	@Autowired
	private Salarios salarios;
	
	@GetMapping ("/salarios")
	public ModelAndView listaSalarios() {
		ModelAndView mv = new ModelAndView("ListaSalarios");
		
		mv.addObject("salarios",salarios.findAll());
		
		return mv;
	}
	
}