package com.Fumetteria.EsercitazioneFumetteria.services;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Fumetteria.EsercitazioneFumetteria.models.dto.FumetteriaDTO;
import com.Fumetteria.EsercitazioneFumetteria.models.entities.Fumetteria;
import com.Fumetteria.EsercitazioneFumetteria.repositories.FumetteriaRepo;

@Service
public class FumetteriaService {
	
	@Autowired
	FumetteriaRepo fumetteriaRepo;

	
	public void salvaFumetteria(FumetteriaDTO fumetteria) {
		Fumetteria f1 = new Fumetteria();
		
		f1.setNome(fumetteria.nome());
		f1.setIndirizzo(fumetteria.indirizzo());
		
		
		fumetteriaRepo.save(f1);
	}
	
	public void salvaFumetterie(List<FumetteriaDTO> listaFumetterie) {
		List<Fumetteria> array = new ArrayList<>();
		for(FumetteriaDTO i: listaFumetterie) {
			Fumetteria f= new Fumetteria();
			f.setNome(i.nome());
			f.setIndirizzo(i.indirizzo());
			array.add(f);
		}
		fumetteriaRepo.saveAll(array);
	}
	
	public Optional<Fumetteria> cercaFumetteria(Integer id) {
		return fumetteriaRepo.findById(id);
	}
	
	public Fumetteria cercaFumetteriaDalNome(String nome) {
		return fumetteriaRepo.findByNome(nome);
		
	}
	
	public Fumetteria cercaFumetteriaDaIndirizzo(String indirizzo) {
		return fumetteriaRepo.findByIndirizzo(indirizzo);
	}
	
	public void modificaNomeFumetteria(String nome,Integer id) {
		fumetteriaRepo.updateNomeById(nome, id);
	}
	
//	public void modificaIndirizzoFumetteria(String indirizzo,Integer id) {
//		fumetteriaRepo.updateIndirizzoById(indirizzo, id);
//	}
	
	public void cancellaFumetteria(Integer id) {
		fumetteriaRepo.deleteById(id);
	}

}
