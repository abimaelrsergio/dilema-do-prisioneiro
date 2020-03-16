package com.br.abgi.teoriajogos.prisionerdilema.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.abgi.teoriajogos.prisionerdilema.model.AcaoRandomica;
import com.br.abgi.teoriajogos.prisionerdilema.model.AcaoSempreCooperar;
import com.br.abgi.teoriajogos.prisionerdilema.model.Individuo;
import com.br.abgi.teoriajogos.prisionerdilema.model.Partida;
import com.br.abgi.teoriajogos.prisionerdilema.model.RecompensaDilemaPrisioneiro;
import com.br.abgi.teoriajogos.prisionerdilema.model.interfaces.IRecompensa;

@Service
public class Jogo {

	@Autowired
	private AcaoRandomica acaoRandomica;
	
	@Autowired
	private AcaoSempreCooperar acaoSempreCooperar;
	
	@Autowired
	private Partida partida;

	public void iniciar(String jogo) {

		Individuo individuo1 = new Individuo();
		Individuo individuo2 = new Individuo();

		IRecompensa recompensa = null;

		if (jogo.equals("DP")) {
			recompensa = new RecompensaDilemaPrisioneiro();
		}
		int i = 1;
		while (i <= 100) {
			
			individuo1.setAcao(acaoRandomica.escolherAcao());
			//individuo2.setAcao(acaoRandomica.escolherAcao());
			individuo2.setAcao(acaoSempreCooperar.escolherAcao());

			recompensa = partida.obterResultado(individuo1.getAcao(), individuo2.getAcao(), recompensa);
			
			individuo1.setAptidao(recompensa.getIndividuoI());
			individuo2.setAptidao(recompensa.getIndividuoJ());

			//System.out.println(individuo1.getAcao() + " -> Recompensa Individuo1: " + recompensa.getIndividuoI());
			//System.out.println(individuo2.getAcao() + " -> Recompensa Individuo2: " + recompensa.getIndividuoJ());
			
			i++;
		}
		System.out.println("---------------");
		System.out.println("Aptidao Individuo1: " + individuo1.getAptidao());
		System.out.println("Aptidao Individuo2: " + individuo2.getAptidao());
	}

}
