package br.com.agm.transparencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agm.transparencia.model.Servidor;

public interface Servidores extends JpaRepository<Servidor, Long> {

}