package br.gov.sp.fatec.transparencia.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.gov.sp.fatec.transparencia.model.Projeto;

@Repository
@Transactional
public interface Projetos extends JpaRepository<Projeto, Long> {

	public Projeto findById(Integer id);

	public List<Projeto> findByNumero(Integer numero);

	public List<Projeto> findByAno(Integer ano);

	public List<Projeto> findByAutorContaining(String autor);

	public List<Projeto> findByAssuntoContaining(String assunto);

	//public List<Projeto> findByLeiContaing(String lei);
}
