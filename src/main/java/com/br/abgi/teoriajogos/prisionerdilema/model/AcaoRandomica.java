package com.br.abgi.teoriajogos.prisionerdilema.model;

import org.springframework.stereotype.Service;

import com.br.abgi.teoriajogos.prisionerdilema.enuns.ACAO;
import com.br.abgi.teoriajogos.prisionerdilema.model.interfaces.IJogador;

@Service
public class AcaoRandomica implements IJogador {

	@Override
	public ACAO escolherAcao() {
		
		if (Math.random() < 0.5)
			return ACAO.TRAIR;
		else
			return ACAO.COOPERAR;
	}

	
	
}
