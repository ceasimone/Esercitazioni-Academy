package com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.dto.SeggioDto;
import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.entities.Seggio;
import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.repositories.SeggioRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SeggioService {
	
	final SeggioRepo seggioRepo;
	
	public void salvaSeggio(SeggioDto controllo) {
		Seggio s = new Seggio();
		s.setCitta(controllo.citta());
		s.setCodiceUnivocoSeggio(controllo.codiceUnivocoSeggio());
		s.setProvincia(controllo.provincia());
		s.setRegione(controllo.regione());
		s.setSede(controllo.sede());
		
		seggioRepo.save(s);
	}
	
	public List<Seggio> cercaTuttiSeggi() {
		return seggioRepo.findAll();
	}
	
	public Optional<Seggio> cercaSeggio(Integer id_seggio) {
		return seggioRepo.findById(id_seggio);
	}
	
	public void modificaSede(String nome,Integer id_seggio) {
		Optional<Seggio> op = seggioRepo.findById(id_seggio);
		if(op.isPresent()) {
			Seggio p = op.get();
			p.setSede(nome);
			seggioRepo.save(p);
		} else {
			throw new RuntimeException("Seggio con id " + id_seggio + " non trovato");
		}
	}
	
	public void modificaCitta(String nome,Integer id_seggio) {
		Optional<Seggio> op = seggioRepo.findById(id_seggio);
		if(op.isPresent()) {
			Seggio p = op.get();
			p.setCitta(nome);
			seggioRepo.save(p);
		} else {
			throw new RuntimeException("Seggio con id " + id_seggio + " non trovato");
		}
	}
	
	public void modificaProvincia(String nome,Integer id_seggio) {
		Optional<Seggio> op = seggioRepo.findById(id_seggio);
		if(op.isPresent()) {
			Seggio p = op.get();
			p.setProvincia(nome);
			seggioRepo.save(p);
		} else {
			throw new RuntimeException("Seggio con id " + id_seggio + " non trovato");
		}
	}
	
	public void modificaRegione(String nome,Integer id_seggio) {
		Optional<Seggio> op = seggioRepo.findById(id_seggio);
		if(op.isPresent()) {
			Seggio p = op.get();
			p.setRegione(nome);
			seggioRepo.save(p);
		} else {
			throw new RuntimeException("Seggio con id " + id_seggio + " non trovato");
		}
	}
	
	public void cancellaSeggio(Integer id_seggio) {
		if(seggioRepo.findById(id_seggio).isPresent()) {
			seggioRepo.deleteById(id_seggio);
		} else {
			throw new RuntimeException("Seggio con id " + id_seggio + " non trovato");
		}
	}
	
}