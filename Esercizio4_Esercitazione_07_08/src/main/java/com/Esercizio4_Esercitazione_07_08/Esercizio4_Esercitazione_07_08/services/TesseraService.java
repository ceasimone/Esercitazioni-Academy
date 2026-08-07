package com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.dto.TesseraDto;
import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.entities.Persona;
import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.entities.Seggio;
import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.entities.Tessera;
import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.repositories.PersonaRepo;
import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.repositories.SeggioRepo;
import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.repositories.TesseraRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TesseraService {

	final TesseraRepo tesseraRepo;
	final PersonaRepo personaRepo;
	final SeggioRepo seggioRepo;
	
	public void salvaTessera(TesseraDto controllo) {
		Tessera t = new Tessera();
		t.setCodiceUnivocoTessera(controllo.codiceUnivocoTessera());
		t.setScadenza(controllo.scadenza());
		
		Persona p = personaRepo.findById(controllo.idPersona())
				.orElseThrow(() -> new RuntimeException("Persona con id " + controllo.idPersona() + " non trovata"));
		t.setPersona(p);
		
		Seggio s = seggioRepo.findById(controllo.idSeggio())
				.orElseThrow(() -> new RuntimeException("Seggio con id " + controllo.idSeggio() + " non trovato"));
		t.setSeggio(s);
		
		tesseraRepo.save(t);
	}
	
	public List<Tessera> cercaTutteTessere() {
		return tesseraRepo.findAll();
	}
	
	public Optional<Tessera> cercaTessera(Integer id_tessera) {
		return tesseraRepo.findById(id_tessera);
	}
	
	public void modificaScadenza(LocalDate data, Integer id_tessera) {
		Optional<Tessera> ot= tesseraRepo.findById(id_tessera);
		if(ot.isPresent()) {
			Tessera t= ot.get();
			t.setScadenza(data);
			tesseraRepo.save(t);
		} else {
			throw new RuntimeException("Tessera con id " + id_tessera + " non trovata");
		}
	}
	
	public void cancellatessera(Integer id_tessera) {
		if(tesseraRepo.findById(id_tessera).isPresent()) {
			tesseraRepo.deleteById(id_tessera);
		} else {
			throw new RuntimeException("Tessera con id " + id_tessera + " non trovata");
		}
	}
}