package com.Fumetteria.EsercitazioneFumetteria.models.dto;

import com.Fumetteria.EsercitazioneFumetteria.models.enums.Genere;

import jakarta.validation.constraints.NotBlank;

public record MangaDTO(
		
		@NotBlank(message="Inserisci il nome")
		String nome,
		String descrizione,
		Genere genere,
		int capitoli,
		double valutazione,
		@NotBlank(message="Inserisci il prezzo")
		double prezzo
		) {

}
