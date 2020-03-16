package com.br.abgi.teoriajogos.prisionerdilema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.abgi.teoriajogos.prisionerdilema.main.Jogo;

@SpringBootApplication
public class PrisionerDilemaApplication implements CommandLineRunner{

	@Autowired
	private Jogo jogo;
	
	public static void main(String[] args) {
		SpringApplication.run(PrisionerDilemaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		jogo.iniciar("DP");
	}

}
