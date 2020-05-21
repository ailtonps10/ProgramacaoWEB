package br.gov.sp.fatec.transparencia.model.enums;

public enum StatusProjeto {
	
	EM_TRAMITE(0, "Em trâmite"),
	APROVADO(1, "Aprovado"),
	RETIRADO_AUTOR(2, "Retirado pelo autor"),
	RETIRADO_SESSAO(3, "Retirado em sessão"),
	REJEITADO(4, "Rejeitado"),
	VETO_TOTAL(5, "Veto total"),
	EM_VIGOR(6, "Em vigor");
	
	private Integer valor;
	private String descricao;
	
	private StatusProjeto(int valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}

	public Integer getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static StatusProjeto toEnum(Integer valor) {
		if (valor == null) {
			return null;
		}
		for (StatusProjeto status : StatusProjeto.values()) {
			if (valor == status.getValor()) {
				return status;
			}
		}		
		throw new IllegalArgumentException("Valor inválido: " + valor);
	}

}
