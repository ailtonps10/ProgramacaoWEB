package br.gov.sp.fatec.transparencia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long fnc_id;
	
	private String fnc_nome;
	private String fnc_cargo;
	private Double fnc_salario;
	
	public Long getId() {
		return fnc_id;
	}
	public void setId(Long id) {
		this.fnc_id = id;
	}
	public String getFnc_nome() {
		return fnc_nome;
	}
	public void setFnc_nome(String fnc_nome) {
		this.fnc_nome = fnc_nome;
	}
	public String getFnc_cargo() {
		return fnc_cargo;
	}
	public void setFnc_cargo(String fnc_cargo) {
		this.fnc_cargo = fnc_cargo;
	}
	public Double getFnc_salario() {
		return fnc_salario;
	}
	public void setFnc_salario(Double fnc_salario) {
		this.fnc_salario = fnc_salario;
	}

}
