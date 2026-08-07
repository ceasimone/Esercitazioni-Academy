package com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.dto;

import jakarta.validation.constraints.NotNull;

public record SeggioDto(
		@NotNull
		Integer codiceUnivocoSeggio,
		String sede,
		String citta,
		String provincia,
		String regione
		) {

}