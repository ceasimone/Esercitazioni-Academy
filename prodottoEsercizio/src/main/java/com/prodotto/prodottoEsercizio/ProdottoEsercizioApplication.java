package com.prodotto.prodottoEsercizio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//http://localhost:8080/params?testo=prova
//http://localhost:8080/params?nomeProdotto=vino
//http://localhost:8080/params?descrizioneProdotto=descrizione_del_prodotto&prezzoProdotto=25.45
//http://localhost:8080/params/Carlo/Carrello?prodotto=vino

//http://localhost:8080/params?prodotto=vino&quantita=25&descrizione=descrizione+del+prodotto&prezzo=25.45

@SpringBootApplication
public class ProdottoEsercizioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdottoEsercizioApplication.class, args);
	}

}
