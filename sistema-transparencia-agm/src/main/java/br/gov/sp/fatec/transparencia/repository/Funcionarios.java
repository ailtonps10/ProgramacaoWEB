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
	
	@Query("select f from Funcionario f where f.fnc_salario >= ?1 and f.fnc_nome like ?2 and f.fnc_cargo like ?3")
	public List<Funcionario> findFuncionarioByNome(Double salario, String nome, String cargo);
	
	@Query("select f from Funcionario f where f.fnc_salario >= ?1 and f.fnc_nome like ?2")
	public List<Funcionario> findFuncionarioByNome(Double salario, String nome);
	
	@Query("select f from Funcionario f where f.fnc_salario >= ?1 and f.fnc_cargo like ?2")
	public List<Funcionario> findFuncionarioByCargo(Double salario, String cargo);
	
	@Query("select f from Funcionario f where f.fnc_salario >= ?1")
	public List<Funcionario> findFuncionarioBySalario(Double salario);
	
	//List<Funcionario> findByFnc_salarioGreaterThanOrEqual(Double salario);
}
