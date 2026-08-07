package com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.entities.Persona;

public interface PersonaRepo extends JpaRepository<Persona, Integer> {
	
	public Persona findByCodiceFiscale(String codiceFiscale);
}
