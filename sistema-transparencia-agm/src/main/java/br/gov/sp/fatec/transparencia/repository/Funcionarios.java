package br.gov.sp.fatec.transparencia.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.sp.fatec.transparencia.model.Funcionario;

@Repository
@Transactional
public interface Funcionarios extends JpaRepository<Funcionario, Long> {
	
	@Query("select f from Funcionario f where f.fnc_nome like ?1 and f.fnc_cargo like ?2")
	List<Funcionario> findFuncionarioByName(String nome, String cargo);
}
