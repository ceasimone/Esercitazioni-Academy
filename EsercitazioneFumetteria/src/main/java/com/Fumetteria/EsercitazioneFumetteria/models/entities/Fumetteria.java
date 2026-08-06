package com.Fumetteria.EsercitazioneFumetteria.models.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table
@Getter
@Setter
@ToString
public class Fumetteria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Setter(AccessLevel.NONE)
	private Integer id_fumetteria;
	
	private String nome;
	private String indirizzo;
	
	@OneToMany (mappedBy = "fumetteria")
	List<Manga> manga;

	public Fumetteria(String nome, String indirizzo) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		manga= new ArrayList<>();
	}

	public Fumetteria() {
	}
	
	

}
