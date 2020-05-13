package br.gov.sp.fatec.transparencia.service;

import br.gov.sp.fatec.transparencia.repository.Funcionarios;
import br.gov.sp.fatec.transparencia.model.Funcionario;

import org.springframework.beans.factory.annotation.Autowired;

public class FuncionariosService {
	
	@Autowired
	private Funcionarios repository;
	
	public Funcionario save(Funcionario Funcionario) {
		return repository.save(Funcionario);
	}

}