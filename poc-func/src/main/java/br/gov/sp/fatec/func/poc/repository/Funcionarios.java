package br.gov.sp.fatec.func.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.func.poc.model.Funcionario;

public interface Funcionarios extends JpaRepository<Funcionario, Long> {

}
