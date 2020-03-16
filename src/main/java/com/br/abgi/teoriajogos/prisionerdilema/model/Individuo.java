package com.br.abgi.teoriajogos.prisionerdilema.model;

import com.br.abgi.teoriajogos.prisionerdilema.enuns.ACAO;

public class Individuo {

	private ACAO acao;
	private int aptidao;

	public ACAO getAcao() {
		return acao;
	}

	public void setAcao(ACAO acao) {
		this.acao = acao;
	}

	public int getAptidao() {
		return aptidao;
	}

	public void setAptidao(int recompensa) {
		this.aptidao += recompensa;
	}
}
