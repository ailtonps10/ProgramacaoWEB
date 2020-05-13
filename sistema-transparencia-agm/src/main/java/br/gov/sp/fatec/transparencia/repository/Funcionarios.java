package br.gov.sp.fatec.transparencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.transparencia.model.Funcionario;

public interface Funcionarios extends JpaRepository<Funcionario, Long> {

}
