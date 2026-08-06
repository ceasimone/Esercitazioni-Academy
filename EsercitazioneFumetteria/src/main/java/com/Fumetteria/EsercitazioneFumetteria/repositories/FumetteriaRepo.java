package com.Fumetteria.EsercitazioneFumetteria.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.Fumetteria.EsercitazioneFumetteria.models.entities.Fumetteria;

public interface FumetteriaRepo extends JpaRepository<Fumetteria, Integer> {
	
	public List<Fumetteria>findAllByNome();
	
	public Fumetteria findByNome(String nome);
	
	public Fumetteria findByIndirizzo(String indirizzo);
	
	public void updateNomeById(String nome,Integer id);
	
	@Transactional
    @Modifying
    @Query("UPDATE Fumetteria f SET f.indirizzo = :indirizzo WHERE f.id = :id")
    int updateIndirizzoById(@Param("indirizzo") String indirizzo, @Param("id") Long id);
	
}
