package com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Tessera {
	
	@Id
	@Setter(AccessLevel.NONE)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_tessera;
	
	@Column(unique=true, name="codice_univoco_tessera")
	private Integer codiceUnivocoTessera;
	
	private LocalDate scadenza;
	
    @OneToOne
    @JoinColumn(name="id_persona")
    private Persona persona;
    
    @ManyToOne
    @JoinColumn(name="id_seggio")
    private Seggio seggio;
    
	public Tessera(Integer codiceUnivocoTessera, LocalDate scadenza) {
		super();
		this.codiceUnivocoTessera = codiceUnivocoTessera;
		this.scadenza = scadenza;
	}
	
	

}
