package com.Fumetteria.EsercitazioneFumetteria.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Fumetteria.EsercitazioneFumetteria.models.entities.Manga;

public interface MangaRepo extends JpaRepository<Manga, Integer>{
	
	public List<Manga> findAllByGenere();
	
	public Manga findByNome(String nome);
	
	public String findDescrizioneById(Integer id);
	
	public int findCapitoliById(Integer id);
	
	public double findValutazioneById(Integer id);
	
	public double findPrezzoById(Integer id);
	
	public void updateCapitoliById(int capitoli,Integer id);

	public void updatePrezzoById(double prezzo,Integer id);
	
	public void updateDescrizioneById(String descrizione,Integer id);
	
	public void updateValutazioneById(double valutazione,Integer id);
	
	public void updateNomeById(String nome,Integer id);
	
	
}
