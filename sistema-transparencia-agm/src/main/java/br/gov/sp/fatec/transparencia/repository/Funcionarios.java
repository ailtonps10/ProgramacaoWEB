package br.gov.sp.fatec.transparencia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.transparencia.model.Funcionario;

public interface Funcionarios extends JpaRepository<Funcionario, Long> {
	
	@Query("selet f from funcionario f where f.fnc_nome like %?1%")
	public List<Funcionario> findFuncionarioByName(String nome);
}
