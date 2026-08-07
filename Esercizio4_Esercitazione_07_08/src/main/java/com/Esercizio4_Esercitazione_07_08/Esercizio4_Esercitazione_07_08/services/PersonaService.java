package com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.dto.PersonaDto;
import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.entities.Persona;
import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.repositories.PersonaRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonaService {
	
	final PersonaRepo personaRepo;
	
	public void salvaPersona(PersonaDto controllo) {
		Persona p= new Persona();
		p.setCodiceFiscale(controllo.codiceFiscale());
		p.setNome(controllo.nome());
		p.setCognome(controllo.cognome());
		personaRepo.save(p);
	}
	
	public List<Persona> cercaTuttePersone() {
		return personaRepo.findAll();
	}
	
	public Optional<Persona> cercaPersona(Integer id_persona) {
		return personaRepo.findById(id_persona);
	}
	
	public Persona cercaPersonaDalCf(String codiceFiscale) {
		return personaRepo.findByCodiceFiscale(codiceFiscale);
	}
	
	public void modificaNomePersona(String nome,Integer id_persona) {
		Optional<Persona> op = personaRepo.findById(id_persona);
		if(op.isPresent()) {
			Persona p = op.get();
			p.setNome(nome);
			personaRepo.save(p);
		} else {
			throw new RuntimeException("Persona con id " + id_persona + " non trovata");
		}
	}
	
	public void modificaCognomePersona(String cognome,Integer id_persona) {
		Optional<Persona> op = personaRepo.findById(id_persona);
		if(op.isPresent()) {
			Persona p = op.get();
			p.setCognome(cognome);
			personaRepo.save(p);
		} else {
			throw new RuntimeException("Persona con id " + id_persona + " non trovata");
		}
	}
	
	public void modificaCfPersona(String codiceFiscale,Integer id_persona) {
		Optional<Persona> op = personaRepo.findById(id_persona);
		if(op.isPresent()) {
			Persona p = op.get();
			p.setCodiceFiscale(codiceFiscale);
			personaRepo.save(p);
		} else {
			throw new RuntimeException("Persona con id " + id_persona + " non trovata");
		}
	}
	
	public void cancellaPersona(Integer id_persona) {
		personaRepo.deleteById(id_persona);
	}

}