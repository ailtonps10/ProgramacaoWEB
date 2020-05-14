package br.gov.sp.fatec.transparencia.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
	public ModelAndView listaFuncionariosComFiltro(@RequestParam("nomepesquisa") String nomepesquisa, @RequestParam("cargopesquisa") String cargopesquisa, @RequestParam("salariopesquisa") String salariopesquisa) {
		ModelAndView modelAndView = new ModelAndView("ListaFuncionarios");
		
		HashMap<String, String> parametrosPesquisa = new HashMap<String, String>();
			
		if (!nomepesquisa.trim().isEmpty() && nomepesquisa != null) {
			nomepesquisa = "%" + nomepesquisa.toUpperCase() + "%";
			parametrosPesquisa.put("nome", nomepesquisa);
		}
		if (!cargopesquisa.trim().isEmpty() && cargopesquisa != null) {
			cargopesquisa = "%" + cargopesquisa.toUpperCase() + "%";
			parametrosPesquisa.put("cargo", cargopesquisa);
		}
		System.out.println(parametrosPesquisa.get("cargo"));
		
		if (parametrosPesquisa.containsKey("nome") && parametrosPesquisa.containsKey("cargo")) {
			modelAndView.addObject("funcionarios", funcionarios.findFuncionarioByNome(parametrosPesquisa.get("nome"), parametrosPesquisa.get("cargo")));
		}
		else {
			if (parametrosPesquisa.containsKey("nome")) {
				modelAndView.addObject("funcionarios", funcionarios.findFuncionarioByNome(parametrosPesquisa.get("nome")));
			}
			else {
				modelAndView.addObject("funcionarios", funcionarios.findFuncionarioByCargo(parametrosPesquisa.get("cargo")));
			}
		}
		return modelAndView;
	}
}
