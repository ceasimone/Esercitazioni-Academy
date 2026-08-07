package com.Fumetteria.EsercitazioneFumetteria.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Fumetteria.EsercitazioneFumetteria.models.entities.Fumetteria;

public interface FumetteriaRepo extends JpaRepository<Fumetteria, Integer> {
	
	public List<Fumetteria> findAllByNome(String nome);
	
	public Fumetteria findByNome(String nome);
	
	public Fumetteria findByIndirizzo(String indirizzo);
	
}