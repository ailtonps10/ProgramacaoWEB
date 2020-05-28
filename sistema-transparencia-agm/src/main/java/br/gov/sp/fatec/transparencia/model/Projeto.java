package br.gov.sp.fatec.transparencia.model;

import java.util.Date;
import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

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

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Integer id;
	private Integer numero;
	private Integer ano;
	@ManyToOne
	@JoinColumn(name = "autor_id")
	private Funcionario autor;
	private String assunto;
	private HashMap<Date, StatusProjeto> status = new HashMap<Date, StatusProjeto>();
	private String lei;
}
