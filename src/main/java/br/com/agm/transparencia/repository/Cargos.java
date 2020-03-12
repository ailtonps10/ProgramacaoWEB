package br.com.agm.transparencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agm.transparencia.model.Cargo;

public interface Cargos extends JpaRepository<Cargo, Long>{

}
