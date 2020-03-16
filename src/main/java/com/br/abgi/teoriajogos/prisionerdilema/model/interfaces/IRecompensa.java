package com.br.abgi.teoriajogos.prisionerdilema.model.interfaces;

import java.io.Serializable;

import com.br.abgi.teoriajogos.prisionerdilema.enuns.ACAO;
import com.br.abgi.teoriajogos.prisionerdilema.model.RecompensaDilemaPrisioneiro;

public interface IRecompensa extends Serializable {

	RecompensaDilemaPrisioneiro obterResultado(ACAO individuoI, ACAO individuoJ);

	int getIndividuoI();

	int getIndividuoJ();

}
