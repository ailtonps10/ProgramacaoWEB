package br.com.agm.transparencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agm.transparencia.model.Salario;

public interface Salarios extends JpaRepository<Salario, Long>{

}