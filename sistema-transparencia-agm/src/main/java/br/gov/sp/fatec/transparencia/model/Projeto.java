package br.gov.sp.fatec.transparencia.model;

import java.util.Date;
import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import br.gov.sp.fatec.transparencia.model.enums.StatusProjeto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Projeto {

	@GeneratedValue
	private Integer id;
	private Integer numero;
	private Integer ano;
	private Funcionario autor;
	private String assunto;
	private HashMap<Date, StatusProjeto> status = new HashMap<Date, StatusProjeto>();
	private String lei;
}
