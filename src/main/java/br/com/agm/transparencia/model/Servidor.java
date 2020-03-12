package br.com.agm.transparencia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Servidor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long srv_id;
	
	private String srv_orgao;
	private int srv_rgf;
	private String srv_nome;
	private String srv_cargo;
	private Double srv_remuneracao;
	
	public Long getSrv_id() {
		return srv_id;
	}
	public String getOrgao() {
		return srv_orgao;
	}
	public void setOrgao(String orgao) {
		this.srv_orgao = orgao;
	}
	public void setSrv_id(Long srv_id) {
		this.srv_id = srv_id;
	}
	public int getSrv_rgf() {
		return srv_rgf;
	}
	public void setSrv_rgf(int srv_rgf) {
		this.srv_rgf = srv_rgf;
	}
	public String getSrv_nome() {
		return srv_nome;
	}
	public void setSrv_nome(String srv_nome) {
		this.srv_nome = srv_nome;
	}
	public String getSrv_cargo() {
		return srv_cargo;
	}
	public void setSrv_cargo(String srv_cargo) {
		this.srv_cargo = srv_cargo;
	}
	public Double getSrv_remuneracao() {
		return srv_remuneracao;
	}
	public void setSrv_remuneracao(Double srv_remuneracao) {
		this.srv_remuneracao = srv_remuneracao;
	}

}