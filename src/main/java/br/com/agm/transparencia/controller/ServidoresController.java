package br.com.agm.transparencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.agm.transparencia.repository.Servidores;

@Controller
public class ServidoresController {
	
	@Autowired
	private Servidores servidores;
	
	@GetMapping ("/servidores")
	public ModelAndView listaServidores() {
		ModelAndView mv = new ModelAndView("ListaServidores");
		
		mv.addObject("servidores",servidores.findAll());
		
		return mv;
	}
	
}