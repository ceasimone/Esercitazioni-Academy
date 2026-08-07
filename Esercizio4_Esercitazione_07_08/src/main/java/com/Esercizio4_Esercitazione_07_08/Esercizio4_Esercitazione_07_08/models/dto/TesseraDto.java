package com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;

public record TesseraDto(
		@NotNull
		Integer codiceUnivocoTessera,
		LocalDate scadenza,
		@NotNull
		Integer idPersona,
		@NotNull
		Integer idSeggio
		) {

}