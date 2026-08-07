package com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.entities;

import java.util.List;

import jakarta.persistence.Column;
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
@NoArgsConstructor
@ToString
public class Seggio {
	
	@Id
	@Setter(AccessLevel.NONE)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_seggio;
	
	@Column(unique=true,name="codice_univoco_seggio")
	private Integer codiceUnivocoSeggio;
	
	private String sede;
	private String citta;
	private String provincia;
	private String regione;
	
	@OneToMany(mappedBy="seggio")
	List<Tessera> tessere;
	
	public Seggio(Integer codiceUnivocoSeggio, String sede, String citta, String provincia, String regione) {
		super();
		this.codiceUnivocoSeggio = codiceUnivocoSeggio;
		this.sede = sede;
		this.citta = citta;
		this.provincia = provincia;
		this.regione = regione;
	}
	
}