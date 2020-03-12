package br.com.agm.transparencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.agm.transparencia.repository.Cargos;

@Controller
public class CargosController {
	
	@Autowired
	private Cargos cargos;
	
	@GetMapping ("/cargos")
	public ModelAndView listaCargos() {
		ModelAndView mv = new ModelAndView("ListaCargos");
		
		mv.addObject("cargos",cargos.findAll());
		
		return mv;
	}
	
}