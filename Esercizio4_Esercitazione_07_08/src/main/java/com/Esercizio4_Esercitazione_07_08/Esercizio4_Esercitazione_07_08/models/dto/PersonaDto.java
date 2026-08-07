package com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.dto;

import jakarta.validation.constraints.NotBlank;

public record PersonaDto(
		@NotBlank
		String codiceFiscale,
		String nome,
		String cognome
		) {

}
