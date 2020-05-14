package br.gov.sp.fatec.transparencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@PostMapping("**/pesquisarfuncionario")
	public ModelAndView listaFuncionariosComFiltro(@RequestParam("nomepesquisa") String nome, @RequestParam("cargopesquisa") String cargo, @RequestParam("salpesquisa") String salario) {
		ModelAndView modelAndView = new ModelAndView("ListaFuncionarios");
		nome = "%" + nome.toUpperCase() + "%";
		cargo = "%" + cargo.toUpperCase() + "%";
		modelAndView.addObject("funcionarios", funcionarios.findFuncionarioByName(nome, cargo));
		return modelAndView;
	}
}
