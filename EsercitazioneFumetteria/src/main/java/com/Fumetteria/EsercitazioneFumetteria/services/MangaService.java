package com.Fumetteria.EsercitazioneFumetteria.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Fumetteria.EsercitazioneFumetteria.models.dto.FumetteriaDTO;
import com.Fumetteria.EsercitazioneFumetteria.models.dto.MangaDTO;
import com.Fumetteria.EsercitazioneFumetteria.models.entities.Fumetteria;
import com.Fumetteria.EsercitazioneFumetteria.models.entities.Manga;
import com.Fumetteria.EsercitazioneFumetteria.repositories.MangaRepo;

@Service
public class MangaService {
	
	@Autowired
	MangaRepo mangaRepo;
	
	public void salvaManga(MangaDTO manga) {
		Manga m1= new Manga(manga.nome(),manga.descrizione(),manga.genere(),manga.capitoli(),manga.valutazione(),manga.prezzo());
		mangaRepo.save(m1);
	}
	
	public void salvaTuttiManga(List<MangaDTO> listaManga) {
		
		List<Manga> array = new ArrayList<>();
		for(MangaDTO i: listaManga) {
			Manga m= new Manga(i.nome(),i.descrizione(),i.genere(),i.capitoli(),i.valutazione(),i.prezzo());
			array.add(m);
		}
		mangaRepo.saveAll(array);
	}
	
	public Optional<Manga> cercaManga(Integer id) {
		return mangaRepo.findById(id);
	}
	
	public Manga cercaMangaDalNome(String nome) {
		return mangaRepo.findByNome(nome);
	}
	
	public String cercaDescrizione(Integer id) {
		return mangaRepo.findDescrizioneById(id);
	}
	
	public int cercaCapitoli(Integer id) {
		return mangaRepo.findCapitoliById(id);
	}
	
	public double cercaPrezzo(Integer id) {
		return mangaRepo.findPrezzoById(id);
	}
	
	public double cercaValutazione(Integer id) {
		return mangaRepo.findValutazioneById(id);
	}
	
	private Manga trovaMangaOrThrow(Integer id) {
		Optional<Manga> optM = mangaRepo.findById(id);
		if(optM.isPresent()) {
			return optM.get();
		} else {
			throw new RuntimeException("Manga con id " + id + " non trovato");
		}
	}
	
	public void modificaNome(String nome, Integer id) {
		Manga m = trovaMangaOrThrow(id);
		m.setNome(nome);
		mangaRepo.save(m);
	}
	
	public void modificaDescrizione(String descrizione, Integer id) {
		Manga m = trovaMangaOrThrow(id);
		m.setDescrizione(descrizione);
		mangaRepo.save(m);
	}
	
	public void modificaCapitoli(int capitoli, Integer id) {
		Manga m = trovaMangaOrThrow(id);
		m.setCapitoli(capitoli);
		mangaRepo.save(m);
	}
	
	public void modificaValutazione(double valutazione, Integer id) {
		Manga m = trovaMangaOrThrow(id);
		m.setValutazione(valutazione);
		mangaRepo.save(m);
	}
	
	public void modificaPrezzo(double prezzo, Integer id) {
		Manga m = trovaMangaOrThrow(id);
		m.setPrezzo(prezzo);
		mangaRepo.save(m);
	}
	
	public void cancellaManga(Integer id) {
		mangaRepo.deleteById(id);
	}
	
	public List<Manga> cercaTuttiManga() {
		return mangaRepo.findAll();
	}

}
