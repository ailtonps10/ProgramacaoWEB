package br.gov.sp.fatec.transparencia.controller.enums;

public enum SalarioPesquisa {
	
	QUALQUER(0, "Qualquer valor"),
	ACIMA_1000(1000, "Acima de R$1000,00"),
	ACIMA_2000(2000, "Acima de R$1000,00"),
	ACIMA_3000(3000, "Acima de R$1000,00"),
	ACIMA_4000(4000, "Acima de R$1000,00"),
	ACIMA_5000(5000, "Acima de R$1000,00"),
	ACIMA_10000(10000, "Acima de R$1000,00"),
	ACIMA_15000(15000, "Acima de R$1000,00");
	
	private Integer valor;
	private String descricao;
	
	private SalarioPesquisa(int valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}

	public Integer getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static SalarioPesquisa toEnum(Integer valor) {
		if (valor == null) {
			return null;
		}
		for (SalarioPesquisa salarioPesquisa : SalarioPesquisa.values()) {
			if (valor == salarioPesquisa.getValor()) {
				return salarioPesquisa;
			}
		}
		
		throw new IllegalArgumentException("Valor inválido: " + valor);
	}
}
