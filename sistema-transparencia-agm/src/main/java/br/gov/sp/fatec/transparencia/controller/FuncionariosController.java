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
	public ModelAndView listaFuncionariosComFiltro(@RequestParam("nomepesquisa") String nomePesquisa, @RequestParam("cargopesquisa") String cargoPesquisa, @RequestParam("salariopesquisa") String salarioPesquisa) {
		ModelAndView modelAndView = new ModelAndView("ListaFuncionarios");
		HashMap<String, String> parametrosPesquisa = new HashMap<String, String>();
		Double salarioPesquisaDouble;
		
		if (!nomePesquisa.trim().isEmpty() && nomePesquisa != null) {
			nomePesquisa = "%" + nomePesquisa.toUpperCase() + "%";
			parametrosPesquisa.put("nome", nomePesquisa);
		}
		if (!cargoPesquisa.trim().isEmpty() && cargoPesquisa != null) {
			cargoPesquisa = "%" + cargoPesquisa.toUpperCase() + "%";
			parametrosPesquisa.put("cargo", cargoPesquisa);
		}
		
		salarioPesquisaDouble = Double.parseDouble(salarioPesquisa);
		
		if (parametrosPesquisa.containsKey("nome") && parametrosPesquisa.containsKey("cargo")) {
			modelAndView.addObject("funcionarios", funcionarios.findFuncionarioByNome(salarioPesquisaDouble, parametrosPesquisa.get("nome"), parametrosPesquisa.get("cargo")));
		}
		else {
			if (parametrosPesquisa.containsKey("nome")) {
				modelAndView.addObject("funcionarios", funcionarios.findFuncionarioByNome(salarioPesquisaDouble, parametrosPesquisa.get("nome")));
			}
			else if (parametrosPesquisa.containsKey("cargo")){
				modelAndView.addObject("funcionarios", funcionarios.findFuncionarioByCargo(salarioPesquisaDouble, parametrosPesquisa.get("cargo")));
			}
			else {
				modelAndView.addObject("funcionarios", funcionarios.findFuncionarioBySalario(salarioPesquisaDouble));
			}
		}
		return modelAndView;
	}
}
