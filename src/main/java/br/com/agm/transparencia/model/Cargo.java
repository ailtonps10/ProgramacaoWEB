package br.com.agm.transparencia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cargo implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long crg_id;
	
	private String crg_orgao;
	private String crg_cargo;
	private String crg_padrao;
	private String crg_salario;
	
	public long getCrg_id() {
		return crg_id;
	}
	public void setCrg_id(long crg_id) {
		this.crg_id = crg_id;
	}
	public String getCrg_orgao() {
		return crg_orgao;
	}
	public void setCrg_orgao(String crg_orgao) {
		this.crg_orgao = crg_orgao;
	}
	public String getCrg_cargo() {
		return crg_cargo;
	}
	public void setCrg_cargo(String crg_cargo) {
		this.crg_cargo = crg_cargo;
	}
	public String getCrg_padrao() {
		return crg_padrao;
	}
	public void setCrg_padrao(String crg_padrao) {
		this.crg_padrao = crg_padrao;
	}
	public String getCrg_salario() {
		return crg_salario;
	}
	public void setCrg_salario(String crg_salario) {
		this.crg_salario = crg_salario;
	}
	
}