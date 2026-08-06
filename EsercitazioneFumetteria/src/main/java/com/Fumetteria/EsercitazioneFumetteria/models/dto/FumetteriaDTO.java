package com.Fumetteria.EsercitazioneFumetteria.models.dto;

import jakarta.validation.constraints.NotBlank;

public record FumetteriaDTO(
		@NotBlank
		String nome,
		@NotBlank
		String indirizzo
		) {
	
	

}
