package br.gov.sp.fatec.transparencia.model;

import br.gov.sp.fatec.transparencia.model.enums.StatusProjeto;

public class Projeto {
	
	private Integer numero;
	private Integer ano;
	private Funcionario autor;
	private String assunto;
	private StatusProjeto status;
	private String lei;
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Funcionario getAutor() {
		return autor;
	}
	public void setAutor(Funcionario autor) {
		this.autor = autor;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public StatusProjeto getStatus() {
		return status;
	}
	public void setStatus(StatusProjeto status) {
		this.status = status;
	}
	public String getLei() {
		return lei;
	}
	public void setLei(String lei) {
		this.lei = lei;
	}
}
