package com.Fumetteria.EsercitazioneFumetteria.models.entities;

import com.Fumetteria.EsercitazioneFumetteria.models.enums.Genere;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
import lombok.*;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Manga {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Setter(AccessLevel.NONE)
	private Integer id;
	
	private String nome;
	private String descrizione;
	private Genere genere;
	private int capitoli;
	private double valutazione;
	private double prezzo;
	
	@ManyToOne
	@JoinColumn(name="id_fumetteria")
	private Fumetteria fumetteria;


	public Manga(String nome, String descrizione, Genere genere, int capitoli, double valutazione, double prezzo) {
		super();
		this.nome = nome;
		this.descrizione = descrizione;
		this.genere = genere;
		this.capitoli = capitoli;
		this.valutazione = valutazione;
		this.prezzo=prezzo;
	}
	
	
	
	

}
