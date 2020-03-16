package com.br.abgi.teoriajogos.prisionerdilema.model;

import com.br.abgi.teoriajogos.prisionerdilema.enuns.ACAO;
import com.br.abgi.teoriajogos.prisionerdilema.model.interfaces.IRecompensa;

public class RecompensaDilemaPrisioneiro implements IRecompensa {

	private static final long serialVersionUID = 1L;

	private int individuoI;
	private int individuoJ;

	public int getIndividuoI() {
		return individuoI;
	}

	public int getIndividuoJ() {
		return individuoJ;
	}

	public RecompensaDilemaPrisioneiro obterResultado(ACAO acaoIndividuoI, ACAO acaoIndividuoJ) {
		if (acaoIndividuoI == ACAO.COOPERAR && acaoIndividuoJ == ACAO.COOPERAR) {
			individuoI = 4;
			individuoJ = 4;
		}

		if (acaoIndividuoI == ACAO.COOPERAR && acaoIndividuoJ == ACAO.TRAIR) {
			individuoI = 0;
			individuoJ = 5;
		}

		if (acaoIndividuoI == ACAO.TRAIR && acaoIndividuoJ == ACAO.TRAIR) {
			individuoI = 1;
			individuoJ = 1;
		}

		if (acaoIndividuoI == ACAO.TRAIR && acaoIndividuoJ == ACAO.COOPERAR) {
			individuoI = 5;
			individuoJ = 0;
		}
		return this;
	}
}
