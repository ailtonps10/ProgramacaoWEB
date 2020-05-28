package br.gov.sp.fatec.transparencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.gov.sp.fatec.transparencia.repository.Projetos;

@Controller
public class ProjetosController {

	@Autowired
	private Projetos projetos;
	
	

}
