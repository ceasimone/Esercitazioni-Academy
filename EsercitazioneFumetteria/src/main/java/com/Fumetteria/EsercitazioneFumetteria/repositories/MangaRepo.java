package com.Fumetteria.EsercitazioneFumetteria.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Fumetteria.EsercitazioneFumetteria.models.entities.Manga;
import com.Fumetteria.EsercitazioneFumetteria.models.enums.Genere;

public interface MangaRepo extends JpaRepository<Manga, Integer>{
	
	public List<Manga> findAllByGenere(Genere genere);
	
	public Manga findByNome(String nome);
	
	public String findDescrizioneById(Integer id);
	
	public int findCapitoliById(Integer id);
	
	public double findValutazioneById(Integer id);
	
	public double findPrezzoById(Integer id);
	
}
