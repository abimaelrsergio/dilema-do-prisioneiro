package com.br.abgi.teoriajogos.prisionerdilema.model;

import org.springframework.stereotype.Service;

import com.br.abgi.teoriajogos.prisionerdilema.enuns.ACAO;
import com.br.abgi.teoriajogos.prisionerdilema.model.interfaces.IJogador;

@Service
public class AcaoSempreCooperar implements IJogador {

	@Override
	public ACAO escolherAcao() {

		return ACAO.COOPERAR;
	}

}
