package br.com.agm.transparencia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Salario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long id;
	
	private String slr_orgao;
	private String slr_rgf;
	private int slr_mes;
	private Double slr_valor;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSlr_orgao() {
		return slr_orgao;
	}
	public void setSlr_orgao(String slr_orgao) {
		this.slr_orgao = slr_orgao;
	}
	public String getSlr_rgf() {
		return slr_rgf;
	}
	public void setSlr_rgf(String slr_rgf) {
		this.slr_rgf = slr_rgf;
	}
	public int getSlr_mes() {
		return slr_mes;
	}
	public void setSlr_mes(int slr_mes) {
		this.slr_mes = slr_mes;
	}
	public Double getSlr_valor() {
		return slr_valor;
	}
	public void setSlr_valor(Double slr_valor) {
		this.slr_valor = slr_valor;
	}
	
}