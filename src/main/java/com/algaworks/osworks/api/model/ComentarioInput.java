package com.algaworks.osworks.api.model;

import javax.validation.constraints.NotNull;

public class ComentarioInput {

	@NotNull
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
