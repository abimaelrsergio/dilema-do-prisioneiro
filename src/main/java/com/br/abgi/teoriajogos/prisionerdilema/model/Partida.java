package com.br.abgi.teoriajogos.prisionerdilema.model;

import org.springframework.stereotype.Service;

import com.br.abgi.teoriajogos.prisionerdilema.enuns.ACAO;
import com.br.abgi.teoriajogos.prisionerdilema.model.interfaces.IRecompensa;

@Service
public class Partida {

	public IRecompensa obterResultado(ACAO individuoI, ACAO individuoJ, IRecompensa recompensa) {
		return recompensa.obterResultado(individuoI, individuoJ);
	}

}
