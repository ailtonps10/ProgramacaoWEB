package br.com.agm.transparencia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Setor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id 
	@GeneratedValue
	private Long str_id;
	
	private String str_nome;

	public Long getStr_id() {
		return str_id;
	}

	public void setStr_id(Long str_id) {
		this.str_id = str_id;
	}

	public String getStr_nome() {
		return str_nome;
	}

	public void setStr_nome(String str_nome) {
		this.str_nome = str_nome;
	}

}